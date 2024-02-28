package edu.kh.attendance.model.dao;

import java.util.List;

import edu.kh.attendance.model.dto.Attendance;

public interface AttendanceDAO {

	public abstract List<Attendance> attendanceFullView();
	public abstract int assigncount();
	public abstract void saveFile() throws Exception;
	public abstract int addAttendance(Attendance a) throws Exception;
	public abstract Attendance deleteAttendance(String name) throws Exception;
	public abstract void sortByAge() throws Exception;
	public abstract int showAssignment();
	boolean updatAttendance(Attendance a) throws Exception;
}
