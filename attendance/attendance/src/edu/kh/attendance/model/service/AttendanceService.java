package edu.kh.attendance.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.attendance.model.dto.Attendance;

public interface AttendanceService {

	public abstract List<Attendance> attendanceFullView();
	public abstract int assigncount();
	public abstract void sortByAge() throws Exception;
	public abstract int showAssignment();
	int addAttendance(String name, int age, char gender, int grade, char assignment) throws Exception;
	boolean updatAttendance(String name, int age, char gender, int grade, char assignment) throws Exception;
	void deleteAttendance(String name) throws Exception;

}
