package kr.or.test;

public class LoopApp {

	public static void main(String[] args) {
		// 반복문중에 for문
		// 메서드에서 사용하는 변수 아래2줄
		int[] numbers = {11,21,31,41,51,61,71,81,91,101};//배열변수 선언
		int cnt;//반복횟수 카운트하는 역할
		for(cnt=0;cnt<10;cnt++) {//cnt++ => cnt=cnt+1; 의미 1씩 증가하는 의미
			System.out.println("현재 카운터는" + numbers[cnt]);
			//println 함수는 한번 출력후 newline 엔터치는 역할.
			//10번반복, numbers 1부터 10까지 출력
		}
		
		
		String[] names = {"사용자1","사용자2","사용자3","사용자4","사용자5"};
		for(String name:names) {
			System.out.println("등록된 사용자 이름은" + name);
		}
		
		String[][] members = {
				{"admin","관리자","admin@abc.com","true","2020-12-04","ROLE_ADMIN"},
				{"user","사용자1","user@abc.com","false","2020-12-04","ROLE_USER"}
		};
		System.out.println("=======회원리스트 입니다.=======");
		System.out.println("user_id   user_name   email   use   regdate   levels");
		for(String[] member:members) {
			System.out.println(member[0]+" "+member[1]+" "+member[2]+" "+
					member[3]+" "+member[4]+" "+member[5]);
		}
	}

}
