package edu.kh.attendance.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.kh.attendance.model.dao.AttendanceDAO;
import edu.kh.attendance.model.dao.AttendanceDAOImpl;
import edu.kh.attendance.model.dto.Attendance;

public class AttendanceServiceImpl implements AttendanceService {

	private AttendanceDAO dao = null;
	private Set<Attendance> attSet = new HashSet<Attendance>();
	public AttendanceServiceImpl() throws FileNotFoundException, ClassNotFoundException, IOException {
		dao = new AttendanceDAOImpl();
	}

	@Override
	public List<Attendance> attendanceFullView() {
		List<Attendance> att = dao.attendanceFullView();
		return att;
	}


	@Override
	public int addAttendance(String name, int age, char gender, int grade, char assignment) throws Exception {
		Attendance a = new Attendance(name, age, gender,grade,assignment);
		int index = dao.addAttendance(a);
	
		return index;
		
	}

	@Override
	public boolean updatAttendance(String name, int age, char gender, int grade, char assignment) throws Exception {
		Attendance a = new Attendance(name, age, gender,grade,assignment);
		boolean index = dao.updatAttendance(a);
	
		return index;
	}

	@Override
	public void deleteAttendance(String name) throws Exception {
		Attendance a = dao.deleteAttendance(name);
		if (a != null) {
			System.out.println("장난감이 삭제되었습니다.");
		} else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
			}		
	}

	@Override
	public void sortByAge() throws Exception {
		dao.sortByAge();
	}


	@Override
	public int showAssignment() {
		return dao.showAssignment();
	}
	
	
}
