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
	
	
}
