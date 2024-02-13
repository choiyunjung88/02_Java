package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {
	
	// 속성 (필드)
	private Scanner sc = new Scanner(System.in);
	private Member memberInfo =null; //가입한 회원의 정보를 저장할 변수
	private Member loginMember = null;
	// 기능 생성자, 메서드
	// 메뉴 화면 출력 기능
	public void displayMenu () {
		int menuNum = 0; 
		do {
			System.out.println("=====회원정보 관리 프로그램=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴입력 :");
			menuNum = sc.nextInt(); // 입력 버퍼에 남은 개행문자 제거용
			
			switch(menuNum) {
			case 1 : System.out.println(signUp());break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못입력하셨습니다 메뉴에있는번호만입력해주세요");
			}
		}while(menuNum != 0);
	}
	


	public String signUp() {
		// 반환형
		// 해당 메서드는 끝나고 호출한 곳으로 돌아갈 때
		// 스트링 자료형 값을 가지고 돌아간다
		
		System.out.println("\n******회원가임*******");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		if(memberPw.equals(memberPw2)) {
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			return "회원가입성공";
		}else { //일치하지 않는 경우
			return "회원가입 실패!! (비밀번호 불일치)";
		}
	}
	//로그인기능
	public String login() {
		System.out.println("\n*****로그인*****");
		if(memberInfo == null) {
			return "회원가입부터 진행해주세요";
		}
		//회원가입했다면, 로그인 기능 수행

		System.out.print("아이디 입력 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 입력 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) &&
				memberPw.equals(memberInfo.getMemberPw())) {
			loginMember = memberInfo;
			return loginMember.getMemberName() + "님 환영합니다.";
		}
		
		return null;
	}
	
	
	// 회원정보 조회 기능
	public String selectMember() {
		
		// 1) 로그인 여부 확인
		// 로그인 안했을 때 로그인후 이용해주세요 리턴
		
		// 2) 로그인이 되어있는 경우
		// 회원 정보를 출력할 문자열을 만들어서 반환(return)
		// 단, 비밀번호는 제외
		
		// 이름 : 홍길동
		// 아이디 : user01
		// 나이 : 25세
		
		
		if (memberInfo == null) {
			return "로그인 후 이용해주세요";
		}else { return "이름 : " + memberInfo.getMemberName()+"\n아이디 : " + memberInfo.getMemberId()+ "\n나이 : "+memberInfo.getMemberAge()	;	}
		
		
	}
	
	public String updateMember() {
		System.err.println("회원 정보 수정");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		if(memberId.equals(memberInfo.getMemberId()) &&
				memberPw.equals(memberInfo.getMemberPw())) {
			loginMember = memberInfo;
			return loginMember.getMemberName() + "님 회원 정보수정이완료되었습니다";
		}
		return (String) null;
	}
}
