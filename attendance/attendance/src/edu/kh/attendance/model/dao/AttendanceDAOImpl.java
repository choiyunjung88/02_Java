package edu.kh.attendance.model.dao;

import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.kh.attendance.model.dto.Attendance;

public class AttendanceDAOImpl implements AttendanceDAO {

	private final String FILE_PATH = "/io_test/Attendance.dat";
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	private List<Attendance> attendanceList = null;
	
	public AttendanceDAOImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		File file = new File(FILE_PATH);
		if(file.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				attendanceList = (ArrayList<Attendance>)ois.readObject();
				
			}finally {
				if(ois != null) ois.close();
			}
		}else {
			File directory = new File("/io_test");
			if (!directory.exists()) directory.mkdir();
			
			attendanceList = new ArrayList<Attendance>();
			attendanceList.add(new Attendance("차은우", 23, 'M', 100, 'O'));
			attendanceList.add(new Attendance("닝닝", 25, 'F', 50, 'O'));
			attendanceList.add(new Attendance("황민현", 27, 'M', 70, 'X'));
			
			try {
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(attendanceList);
			}finally {
				oos.close();
			}
			System.out.println("*** Attendance.dat 파일 생성 완료 ***");
		}
	}

	@Override
	public List<Attendance> attendanceFullView() {
		// TODO Auto-generated method stub
		return attendanceList;
	}

	@Override
	public void saveFile() throws Exception {
		try {
			// FILE_PATH 경로에 있는 파일과 연결된 객체 출력 스트림 생성
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(attendanceList); 
			
		} finally {
			oos.close();
		}
	}
	
	@Override
	public int assigncount() {

		return 0;
	}

	@Override
	public int addAttendance(Attendance a) throws Exception {
		if( attendanceList.add(a) ) { // 추가성공
					
					// 파일 저장
					saveFile();
					
					// 삽입된 index 반환
					return attendanceList.size() -1;
				}
				
				
				return -1; // 추가 실패		
	}

	@Override
	public boolean updatAttendance(Attendance a) throws Exception {

		int count = 0;
		for (Attendance att : attendanceList) {
			
			if(att.getName().equals(a.getName())) {
				attendanceList.set(count, a);
				saveFile();
				return true;
			}
			count++;
		}	
		return false;
	}

	@Override
	public Attendance deleteAttendance(String name) throws Exception {
		for(Attendance att : attendanceList) {
			if (att.getName().equals(name)) {
				Attendance a = attendanceList.remove(attendanceList.indexOf(att));
				saveFile();
				return a;
			}
			}
		return null;
		
		
	}

	@Override
	public void sortByAge() throws Exception {
		attendanceList.sort(Comparator.comparing(Attendance::getAge));
		saveFile();
		int index = 1;
		for(Attendance att : attendanceList) {
			System.out.printf(index++ + ". 이름 : %3s 나이 : %2d 성별 : %1c 성적 : %3d 과제제출여부 : %1c\n",att.getName(),att.getAge(),att.getGender(),att.getGrade(),att.getAssignment());
			index++;
		}
	}


	@Override
	public int showAssignment() {
		int count = 0;
		for (Attendance a : attendanceList) {
			if(a.getAssignment()==('O')) count++;
		}
		return count;	
	}


	
}
