package edu.kh.attendance.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.attendance.model.dto.Attendance;

public interface AttendanceService {

	public abstract List<Attendance> attendanceFullView();
	public abstract int assigncount();
	public abstract void addAttendance();
	public abstract void updatAttendance();
	public abstract void deleteAttendance();
	public abstract void sortByAge();
	public abstract void sortByScore();
	public abstract void showAssignment();

}
