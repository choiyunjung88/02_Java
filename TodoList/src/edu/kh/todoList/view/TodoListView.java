package edu.kh.todoList.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dto.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;

// View : 보여지는 부분(내용 출력/ 키보드 입력) 역할
public class TodoListView {

	// 필드
	private BufferedReader br = null; // 키보드 입력 스트림 참조 변수
	private TodoListService service = null; //  서비스 참조 변수
	
	// 기본생성자
	public TodoListView() {
		// 객체 생성 시 발생되는 예외를 여기서 모아서 처리할 예정
		try {
			// 부모 타입 참조변수 = 자식객체 
			service = new TodoListServiceImpl();
			br = new BufferedReader(new InputStreamReader(System.in));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * TodoList 프로그램 시작 화면
	 * 
	 */
	public void startView() {
		int input = 0; // 선택한 메뉴 번호 저장
		
		do {
			
			try {
				//선택한 번호가 반환되어 input에 저장됨
				input = selectMenu();
				
				switch(input) {
				case 1 : todoListFullView(); break;
				case 2 : //todoDetailView(); break;
				case 3 : todoAdd(); break;
				case 4 : todoComplete(); break;
				case 5 : //todoUpdate(); break;
				case 6 : //todoDelete(); break;
				case 0 : System.out.println("@@ 프로그램 종료 @@");break;
				default : System.out.println("###메뉴에 작성된 번호만 입력해 주세요!###");
				
				}
				
				System.out.println("==============================================");
				
			} catch(NumberFormatException e) {
				System.out.println("###숫자만 입력해 주세요###");
				input = -1; // 첫 반복에 종료되는걸 방지
			}catch(IOException e) {
				System.out.println("###입출력 관련 예외 발생 ###");
				e.printStackTrace(); //예외 추적
			}catch(Exception e) {
				e.printStackTrace();
			}
		}while(input != 0);
		
		
		
	}
	
	
	/**메뉴 출력 및 선택
	 * @return 선택한 메뉴 번호 반환
	 */
	public int selectMenu() throws NumberFormatException, IOException {
		
		System.out.println("\n============== Todo List ==============\n");
		System.out.println("1. Todo List Full View");
		System.out.println("2. Todo Detail View");
		System.out.println("3. Todo Add");
		System.out.println("4. Todo Complete");
		System.out.println("5. Todo Update");
		System.out.println("6. Todo Delete");
		System.out.println("0. EXIT");
		
		System.out.println("select menu number >>> ");
		
		int input = Integer.parseInt(br.readLine());
		System.out.println();
		
		return input;
	}
	
	
	
	//=======================================================
	
	/**
	 * 할 일 목록 모두 보기
	 */
	public void todoListFullView() {
		
		System.out.println("\n==========[1. Todo List Full View]==========\n");
		
		// 할일 목록 + 완료된 개수 카운트한 값 얻어오기
		//  List          int
		Map<String, Object> map = service.todoListFullView();
		// 반환 받은 map 요소 해체하기
		List<Todo> todoList = (List<Todo>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
		//출력
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
				, completeCount, todoList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		for(int i=0, len = todoList.size(); i < len; i++) {
		
			String title = todoList.get(i).getTitle();
			
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			
			String regDate = service.dateFormat(todoList.get(i).getRegDate());
			
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}
	}
	

	
	
	
	
	
	/**
	 * 할 일 추가(제목, 상세 내용만 입력받음)
	 */
	public void todoAdd() {
		System.out.println("세부 내용 작성 (입력 종료 시 !wq 작성 후 엔터");
	
		StringBuilder
	
	}
	
	
	//할일 추가 서비스 호출 후 결과 반환 받기
	// 성공 : 추가된 index, 실패 : -1
	int index = service.todoAdd(title, sb.toString());
	
	
	/**할 일 추가 서비스
	 * @param title
	 * @param content
	 * @return
	 */
	public abstract int todoAdd(String title, String content);
	
	
	@Override
	public int todoAdd(String title,String content) {
		// Todo 객체 생성
		return 0;
	}
	
	
	
	
	
	
	
	
	/**
	 * 할일 완료 여부 변경
	 * index 번호 입력 받기//                   
	 */
	public void todoComplete() {
		return  
	}
	
	
	
	public void todoComplete() throws IOException, Exception {
		System.out.println("\n=============todo complete==============");
		
		
		
	}
	
	
	
	// 수정 코드 작성...
	// 수정전 상세 내용 출력
	
	
	public void todoUpdate() throws Exception{
		System.out.println("==========================");
		int index = Integer.parseInt(br.readLine());
		String todoDetail = service.todoDetailView();
		
		System.out.println("@@@@@@@@@@@수정 전@@@@@@@@@@@@");
		System.out.println(todoDetail);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		// 수정 서비스 호출 후 결과 반환 받기
		boolean result = service.todoUpdate();
		
	}
	
	@Override
	public boolean todoUpdate(int index, String title, String content) {
		// 수정된 제목, 내용을 이용해서 Todo 객체 생성
		Todo todo = new Todo(title, content, todoList.get(index).isComplete(), todoList.get(index).getRegDate());
		// index 번째 요소의 complete, regDate 값을 얻어와 todo에 세팅
		
		//List.set(int index, E e) : 
		//  index번째 요소를 매개변수 e로 바꾸고,
		//  이전 요소를 반환 (없으면 null)
		
		if (todoList.set(index, todo) != null) { // 수정 성공
			// 변경된 todo 저장
			saveFile();
			return true;
		}
		return false;
	}
	
	

	/**
	 * 할 일 삭제
	 * - 인덱스 번호를 입력받아서 일치하는 요소 삭제
	 */
	public void todoDelete() throws Exception{
		System.out.println("==================Todo Delete================");
		
		System.out.print("삭제할 인덱스 번호 입력 : ");
		int index = Integer.parseInt(br.readLine());
		// 삭제 서비스 호출 후 결과 반환받기
		// -> 제목 또는 null을 반환
		String result = service.todoDelete(index);
		
		if(result == null) System.out.println("### 인덱스가 존재하지 않습니다 ###");
		else    System.out.println("[%s]가 삭제되었습니다\n", result);
		
		//DAO메서드 호출 후 결과 반환 받기
		// -> 삭제된 Todo 또는 null을 반환받기
		Todo todo = dao.todoDelete(index);
		
		
		
	}
	
	@Override
	public Todo todoDelete(int index) throws Exception{
		// index 범위 검사
		if(index <0|| index >= todoList.size()) return null;
		// todoList에서 index 번째 요소 삭제 후 파일 저장
		Todo todo = todoList.remove(index);
		saveFile(); // 제목 반환
		return null;
	}
	
	
	
	
	
	
	
	
	
}
