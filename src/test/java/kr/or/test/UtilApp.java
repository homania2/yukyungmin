package kr.or.test;

public class UtilApp {

	public static void main(String[] args) {
		// 클래스의 실행 진입점
		// java.lang Math클래스를 사용해서 랜덤하게 숫자를 뽑아봅니다.
		System.out.println("1부터 30까지 랜덤한 숫자 출력하기="
		+ (int)(Math.random() * 30)//+1을 하면 1부터, +1없으면 0부터 이게 됩니다.
		//결과가 float(실수)로 나오기때문에, 정수형(int)으로 형변환해서 출력
		//아이디 자동생성기 만들때, 매스클래스의 랜덤매서드 사용하게 됩니다.
		//기본형을 객체로 표현했다는 int(Not null) -> Integer(null허용),
		//float -> Float, double -> D
		);
	}

}
