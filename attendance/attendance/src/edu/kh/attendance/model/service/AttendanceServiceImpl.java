package edu.kh.attendance.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import edu.kh.attendance.model.dao.AttendanceDAO;
import edu.kh.attendance.model.dao.AttendanceDAOImpl;
import edu.kh.attendance.model.dto.Attendance;

public class AttendanceServiceImpl implements AttendanceService {

	private AttendanceDAO dao = null;
	
	public AttendanceServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		dao = new AttendanceDAOImpl();
	}

	@Override
	public List<Attendance> attendanceFullView() {
		List<Attendance> att = dao.attendanceFullView();
		return att;
	}

	@Override
	public int assigncount() {
		int count = 0;
		for (Attendance a : dao.attendanceFullView()) {
			if(a.getAssignment() == 'O') count++;
		}
		return count;
	}

	@Override
	public void addAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatAttendance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAttendance() {
		boolean flag = false;
		
		for(Attendance att : attSet) {
			if (att.getName().equals(attName)) {
				attSet.remove(att);
				flag = true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
			}		
	}

	@Override
	public void sortByAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAssignment() {
		// TODO Auto-generated method stub
		
	}
	
	
}
