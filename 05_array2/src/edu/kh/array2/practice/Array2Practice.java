package edu.kh.array2.practice;

import java.util.Scanner;

public class Array2Practice {
	 /* 실습문제 1
    3행 3열짜리 문자열 배열을 선언 및 할당하고
    인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
    [실행 화면]
    (0, 0)(0, 1)(0, 2)
    (1, 0)(1, 1)(1, 2)
    (2, 0)(2, 1)(2, 2)
     */
    public void practice1(){
        String[][] arr = new String[3][3];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = "(" + i + ", " + j + ")";
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /* 실습문제 2
    4행 4열짜리 정수형 배열을 선언 및 할당하고
    1) 1 ~ 16까지 값을 차례대로 저장하세요.
    2) 저장된 값들을 차례대로 출력하세요.
    [실행 화면]
    1 2 3 4
    5 6 7 8
    9 10 11 12
    13 14 15 16
     */
    public void practice2(){
        int[][] arr = new int[4][4];

        int value = 1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    /* 실습문제 3
    4행 4열짜리 정수형 배열을 선언 및 할당하고
    1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
    2) 저장된 값들을 차례대로 출력하세요.
    [실행 화면]
    16 15 14 13
    12 11 10 9
    8 7 6 5
    4 3 2 1
     */
    public void practice3(){
        int[][] arr = new int[4][4];

        int value = 16;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value--;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    /* 실습문제 4
    4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
    아래의 내용처럼 처리하세요.
    [실행 화면]
    9 3 7 19
    3 6 9 18
    6 10 10 26
    18 19 26 63
     */
    public void practice4(){
        int[][] arr = new int[4][4];

        int rowLastIndex = arr.length-1; // 행의 마지막 인덱스
        int colLastIndex = arr[0].length-1; // 열의 마지막 인덱스

        for(int i=0; i<rowLastIndex; i++) {
            for(int j=0; j<colLastIndex; j++) {
                // 1 ~ 10 사이 난수를 발생시켜 2차원 배열에 대입.
                arr[i][j] = (int)(Math.random() * 10 + 1);

                // 난수 대입과 동시에 해당 행, 열 끝에 값을 누적
                arr[i][3] += arr[i][j]; // 행의 합
                arr[3][j] += arr[i][j]; // 열의 합
            }
        }

        // 2차원 배열 출력 + 총합 계산
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);

                // 2차원 배열에 반복 접근 중
                // 마지막 행 또는 마지막 열에 접근한 경우
                // 총합 누적 진행
                if(i == rowLastIndex || j == colLastIndex) {
                    arr[rowLastIndex][colLastIndex] += arr[i][j];

                    // 마지막 arr[3][3]에서 또 총합 누적이 진행되어
                    // 총합을 넘는 값이  arr[3][3] 저장되겠지만,
                    // 마지막 누적 이전에 이미 총합을 출력하였기 때문에 문제 없음.
                }
            }
            System.out.println(); // 줄바꿈
        }
    }

    /* 실습문제 5
    2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
    “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
    크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
    (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
    [실행 화면]
    행 크기 : 5
    열 크기 : 4
    T P M B
    U I H S
    Q M B H
    H B I X
    G F X I
     */
    public void practice5(){
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("행 크기 : ");
            int row = sc.nextInt();
            System.out.print("열 크기 : ");
            int col = sc.nextInt();

            if((row < 1 || row >10) || (col < 1 || col >10)) {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");

            }else{
                char[][] arr = new char[row][col];

                for(int i=0; i<arr.length; i++) {
                    for(int j=0; j<arr[i].length; j++) {
                        arr[i][j] = (char)((int)(Math.random() * 26 + 65));
                    }
                }

                for(int i=0; i<arr.length; i++) {
                    for(int j=0; j<arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
    }

    /* 실습문제 6
    사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
    문자형 가변 배열을 선언 및 할당하세요.
    그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
    [실행 화면]
    행의 크기 : 4
    0열의 크기 : 2
    1열의 크기 : 6
    2열의 크기 : 3
    3열의 크기 : 5
    a b
    c d e f g h
    i j k
    l m n o p
     */
    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("행의 크기 : ");
        int row = sc.nextInt();

        char[][] arr = new char[row][];

        for(int i=0; i<arr.length; i++) {
            System.out.print(i + "행의 크기 : ");
            int col = sc.nextInt();

            arr[i] = new char[col];
        }

        // 값 초기화
        char value = 'a';
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        // 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /* 실습문제 7
    1차원 문자열 배열에 학생 이름 초기화되어 있다.
    3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
    학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
    (첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)

    [실행 화면]
    == 1분단 ==
    강건강 남나나
    도대담 류라라
    문미미 박보배
    == 2분단 ==
    송성실 윤예의
    진재주 차천축
    피풍표 홍하하
     */
    public void practice7(){
        String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

        String[][] arr1 = new String[3][2];
        String[][] arr2 = new String[3][2];

        int index = 0; // students 배열에서 0 부터 1씩 증가하며 학생들을 선택하는 용도의 변수

        System.out.println("== 1분단 ==");
        for(int row=0 ; row<arr1.length ; row++) {
            for(int col=0 ; col<arr1[row].length ; col++) {

                arr1[row][col] = students[index];
                // students배열 index 번째 학생을 arr1[row][col]에 대입

                index++;

                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();// 줄바꿈
        }

        System.out.println("== 2분단 ==");
        for(int row=0 ; row<arr2.length ; row++) {
            for(int col=0 ; col<arr2[row].length ; col++) {

                arr2[row][col] = students[index];
                // students배열 index 번째 학생을 arr2[row][col]에 대입

                index++;

                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();// 줄바꿈
        }
    }

    /* 실습문제 8
    위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
    해당 학생이 어느 자리에 앉았는지 출력하세요.
    [실행 화면]
    == 1분단 ==
    강건강 남나나
    도대담 류라라
    문미미 박보배
    == 2분단 ==
    송성실 윤예의
    진재주 차천축
    피풍표 홍하하
    ============================
    검색할 학생 이름을 입력하세요 : 차천축
    검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
     */
    public void practice8(){
        Scanner sc = new Scanner(System.in);
        String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

        String[][] seat1 = new String[3][2];
        String[][] seat2 = new String[3][2];

        int index = 0;
        // 1분단이 끝나고 2분단이 시작될 때도 이어서 들어가야하기 때문에
        // 학생을 이어서 셀 수 있도록 index 변수 생성

        // 1분단 학생 대입
        System.out.println("== 1분단 ==");
        for (int i = 0; i < seat1.length; i++) {

            for (int j = 0; j < seat1[i].length; j++) {

                seat1[i][j] = students[index++];
                System.out.print(seat1[i][j] + " ");
            }
            System.out.println();
        }

        // 2분단 학생 대입
        System.out.println("== 2분단 ==");
        for (int i = 0; i < seat2.length; i++) {

            for (int j = 0; j < seat2[i].length; j++) {

                seat2[i][j] = students[index++];
                System.out.print(seat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("============================");

        System.out.print("검색할 학생 이름을 입력하세요 : ");
        String searchName = sc.next();


        // 검색된 분단, 줄, 좌우 방향을 지정할 변수 선언
        int seat = 0;
        int row = 0;
        String direction = null;

        for(int i=0; i<seat1.length ; i++) {

            for(int j=0; j<seat1[i].length ; j++) {

                if(seat1[i][j].equals(searchName)) {
                    // 1분단에 일치하는 이름이 있을 경우
                    seat = 1;
                    row = i+1;
                    direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자

                }else if(seat2[i][j].equals(searchName)) {
                    // 2분단에 일치하는 이름이 있을 경우
                    seat = 2;
                    row = i+1;
                    direction = j == 0 ? "왼쪽" : "오른쪽"; // 삼항 연산자
                }
            }
        }


        if(seat != 0) { // 검색 결과가 있을 경우
            System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.\n",
                    searchName, seat, row, direction);
        }else {
            System.out.println("검색한 학생이 존재하지 않습니다.");
        }
    }

    /* 실습문제 9
    String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
    그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.
    [실행 화면]
    행 인덱스 입력 : 4
    열 인덱스 입력 : 2
      0 1 2 3 4
    0
    1
    2
    3
    4 X

     */
    public void practice9(){
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[6][6]; // String 6행 6열 2차원 배열 생성

        // 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
        for (int i = 0; i < board.length-1; i++) {
            board[0][i+1] = i + "";
            board[i+1][0] = i + "";

            // '0' == 60번
        }


        int rowIndex = 0;
        int colIndex = 0;

        while(true) {
            System.out.print("행 인덱스 입력 : ");
            rowIndex = sc.nextInt();

            if(rowIndex < 0 || rowIndex > 4) {
                System.out.println("0~4사이 인덱스를 입력해주세요.");
                continue;
            }

            break;
        }


        while(true) {
            System.out.print("열 인덱스 입력 : ");
            colIndex = sc.nextInt();

            if(colIndex < 0 || colIndex > 4) {
                System.out.println("0~4사이 인덱스를 입력해주세요.");
                continue;
            }

            break;
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
                    board[i + 1][j + 1] = "X";
                    // 실제 2차원 배열의 인덱스에 1을 추가한 값이 화면에 표시된 인덱스
                }

                if(board[i][j] == null){
                    board[i][j] = " ";
                }

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /* 실습문제 10
    실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
     */
    public void practice10(){
        Scanner sc = new Scanner(System.in);
        String[][] board = new String[6][6]; // String 6행 6열 2차원 배열 생성

        // 행과 열의 인덱스를 표시하는 부분에 인덱스 대입
        for (int i = 0; i < board.length-1; i++) {
            board[0][i+1] = i + "";
            board[i+1][0] = i + "";

            // '0' == 60번
        }


        int rowIndex = 0;
        int colIndex = 0;

        while(true) {
            while (true) {
                System.out.print("행 인덱스 입력 : ");
                rowIndex = sc.nextInt();

                if(rowIndex == 99){
                    break;
                }

                if (rowIndex < 0 || rowIndex > 4) {
                    System.out.println("0~4사이 인덱스를 입력해주세요.");
                    continue;
                }

                break;
            }

            if(rowIndex == 99){
                System.out.println("프로그램 종료");
                break;
            }

            while (true) {
                System.out.print("열 인덱스 입력 : ");
                colIndex = sc.nextInt();

                if (colIndex < 0 || colIndex > 4) {
                    System.out.println("0~4사이 인덱스를 입력해주세요.");
                    continue;
                }

                break;
            }


            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {

                    if (i == rowIndex && j == colIndex) { // 사용자가 입력한 행과 열의 인덱스 값이 같을 때
                        board[i + 1][j + 1] = "X";
                        // 실제 2차원 배열의 인덱스에 1을 추가한 값이 화면에 표시된 인덱스
                    }

                    if (board[i][j] == null) {
                        board[i][j] = " ";
                    }

                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
