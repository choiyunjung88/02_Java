package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAImpl;
import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dto.Todo;

public class TodoListServiceImpl implements TodoListService {

	// 필드
	private TodoListDAO dao= null;
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException{
		// TodoListServiceImpl 
		dao = new TodoListDAImpl();
	}
	
	
	//todoListFullView
	@Override
	public Map<String, Object> todoListFullView() {
		// 1. 할 일 목록 DAO에서 얻어오기
		List<Todo> todoList = dao.todoListFullView();
		
		// 2. 할일 목록에서 완료(complete 필드 값이 true)인 요소가 몇개인지 카운트
		int completeCount = 0;
		
		for(Todo todo : todoList) { // TodoList 순차접근
			if(todo.isComplete()) { // true인 경우
				completeCount++;
				
			}
		}
		
		// 3. todoList, completeCount를 저장할 Map 생성
		// -> 메서드는 반환을 하나밖에 못해서
		//    여러개를 반환해야 하는 경우 Map같은 컬렉션에 묶어서 반환
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		// 4. map 반환
		return map;

		
	
	}


	@Override
	public String dateFormat(LocalDateTime regDate) {
		// 날짜 형태 변환
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		// regDate에 저장되어있는 날짜 데이터를
		// formatter에 지정된 형식으로 변경
		String formattedDateTime = regDate.format(formatter);

		return formattedDateTime;
	}
}
