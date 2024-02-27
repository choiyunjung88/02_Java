package edu.kh.attendance.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import edu.kh.attendance.model.dto.Attendance;
import edu.kh.attendance.model.service.AttendanceService;
import edu.kh.attendance.model.service.AttendanceServiceImpl;

public class AttendanceView {

	Scanner sc = new Scanner(System.in);
	private Set<Attendance> attSet = new HashSet<Attendance>();
	private BufferedReader br = null;
	private AttendanceService service = null;
	
	public AttendanceView() {
		try {
			service = new AttendanceServiceImpl();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void startView() {
		int input = 0;
		
		do {
			try {
				input = selectMenu();
				switch(input) {
				case 1 : attendanceFullView();break;
				case 2 : addAttendance();break;
				case 3 : updateAttendance();break;
				case 4 : deleteAttendance();break;
				case 5 : sortByAge();break;
				case 6 : sortByScore();break;
				case 7 : showAssignment(); break;
				case 0 : System.out.println("출석부를 닫습니다"); break;
				default : System.out.println("메뉴에 있는 숫자만 입력해주세요");
				}
				
				System.out.println("=========================================");	
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
			} catch(IOException e) {
				System.out.println("입출력 관련 예외 발생");
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}while(input != 0);
	}
	
	public int selectMenu() throws NumberFormatException, IOException {
		System.out.println("\n==========출석부============\n");
		System.out.println("1. 출석부 전체 보기");
		System.out.println("2. 출석부에 학생 추가");
		System.out.println("3. 출석부에 학생 수정");
		System.out.println("4. 출석부에 학생 삭제");
		System.out.println("5. 나이순 정렬");
		System.out.println("6. 성적순 정렬");
		System.out.println("7. 과제 제출자");
		System.out.println("0. 출석부 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		return input;
}	
	
	private void showAssignment() {
		System.out.println("\n==============과제 제출자===============");
	}


	private void sortByScore() {
		System.out.println("\n==============성적순 정렬===============");
		List<Attendance> attByScore = new ArrayList<Attendance>(attSet);
		attByScore.sort(Comparator.comparings(Attendance::get));
		int index = 1;
		for(Attendance att : attByScore) {
			System.out.println(index+". "+att);
			index++;
		}
	}


	private void sortByAge() {
		System.out.println("\n==============나이순 정렬===============");
		List<Attendance> attByAge = new ArrayList<Attendance>(attSet);
		attByAge.sort(Comparator.comparing(Attendance::getAge));
		int index = 1;
		for(Attendance att : attByAge) {
			System.out.println(index+". "+att);
			index++;
		}
	}


	private void deleteAttendance() {
		System.out.println("\n==============출석부에 학생 삭제===============");
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String attName = sc.next();
		

	}


	private void updateAttendance() {
		System.out.println("\n==============출석부에 학생 수정===============");
		System.out.println("수정할 학생의 이름을 입력하세요 : ");
		String attName = sc.next();
		
		boolean flag = false;
		for(Attendance att : attSet) {
			if (att.getName().equals(attName)) {
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("성별 : ");
				char gender = sc.next().charAt(0);
				
				System.out.print("성적 : ");
				int grade = sc.nextInt();
				
				System.out.print("과제제출여부 : ");
				char assignment = sc.next().charAt(0);
				att.setAge(age);
				att.setGender(gender);
				att.setGrade(grade);
				att.setAssignment(assignment);
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("학생 정보가 수정되었습니다.");
		}else {
			System.out.println("해당하는 이름의 학생을 찾을 수 있습니다.");
		}
		
		
	}


	private void addAttendance() {
		System.out.println("\n==============출석부에 학생 추가===============");
		System.out.print("학생 이름 :");
		String name = sc.next();
		for(Attendance a : service.attendanceFullView()) {
			if(a.getName().equals(name)) {
				System.out.println("같은 이름을 가진 학생이 이미 존재합니다.");
				return;
			}
		}
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적 : ");
		int grade = sc.nextInt();
		
		System.out.print("과제제출여부 : ");
		char assignment = sc.next().charAt(0);
		
		Attendance newatt = new Attendance(name, age, gender, grade, assignment);
		
		attSet.add(newatt);
		System.out.println("새로운 장난감이 추가되었습니다!");
	}


	private void attendanceFullView() {
		System.out.println("\n==============출석부 전체 보기===============");
		
		List<Attendance> attendanceList = service.attendanceFullView();
	
		int count = 1;
		for(Attendance at : attendanceList) {
			System.out.printf(count++ + ". 이름 : %3s 나이 : %2d 성별 : %1c 성적 : %3d 과제제출여부 : %1c\n",at.getName(),at.getAge(),at.getGender(),at.getGrade(),at.getAssignment());
		}
	}



	

	
	
	
	
	
	
	
	
}
