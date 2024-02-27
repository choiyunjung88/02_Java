package edu.kh.attendance.model.dao;

import java.util.List;

import edu.kh.attendance.model.dto.Attendance;

public interface AttendanceDAO {

	List<Attendance> attendanceFullView();
}
