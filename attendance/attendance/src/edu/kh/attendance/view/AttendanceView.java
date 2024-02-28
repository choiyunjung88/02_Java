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
				case 6 : showAssignment(); break;
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
		System.out.println("6. 과제 제출자");
		System.out.println("0. 출석부 프로그램 종료");
		System.out.println("메뉴 입력 : ");
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		return input;
}	
	
	private void showAssignment() {
		System.out.println("\n==============과제 제출자===============");
		System.out.println("과제 제출자는 " + service.showAssignment()+ "명입니다.");
	}




	private void sortByAge() throws Exception {
		System.out.println("\n==============나이순 정렬===============");
		service.sortByAge();
	}


	private void deleteAttendance() throws Exception {
		System.out.println("\n==============출석부에 학생 삭제===============");
		System.out.print("삭제할 학생의 이름을 입력하세요 : ");
		String attName = sc.next();
		service.deleteAttendance(attName);

	}


	private void updateAttendance() throws Exception {
		System.out.println("\n==============출석부에 학생 수정===============");
		System.out.println("수정할 학생의 이름을 입력하세요 : ");
		String attName = sc.next();
		
		boolean flag = false;

				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("성별 : ");
				char gender = sc.next().charAt(0);
				
				System.out.print("성적 : ");
				int grade = sc.nextInt();
				
				System.out.print("과제제출여부 : ");
				char assignment = sc.next().charAt(0);

				flag = service.updatAttendance(attName, age, gender, grade, assignment);
			
		
		
		if (flag) {
			System.out.println("학생 정보가 수정되었습니다.");
		}else {
			System.out.println("해당하는 이름의 학생을 찾을 수 없습니다.");
		}
		
		
	}


	private void addAttendance() throws Exception {
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
		
		int index = service.addAttendance(name, age, gender, grade, assignment);
		if(index == -1) { // 실패
			System.out.println("### 추가 실패 ###");
			return;
		}
		System.out.println("새로운 학생이 추가되었습니다!");
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
