package kr.or.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		// 내PC에 저장된 텍스트메모장파일 읽어들이고, 출력하기 구현
		//내부변수 선언
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		//오브젝트, 실행가능한 클래스형 변수 생성, 인스턴스(실행)
		try {
			fileInputStream = new FileInputStream("C:\\egov\\workspace\\yukyungmin\\manifest.yml");
			//fileOutputStream = new FileOutputStream("");//신규파일에 저장하는 클래스명령어 집합
			//지금까지 반복문으로 for(시작;끝;증가)만 사용, for 대신에 while(~조건동안){구현을반복}
			int byte_content;
			while( (byte_content = fileInputStream.read()) != -1) {//-1은 문서끝을 읽어들일때까지
				System.out.println("바이트형 문자 읽어 들이기 " + (char)byte_content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("경로에서 파일을 찾을수 없습니다. " + e.toString());
			e.printStackTrace();
		}
	}

}
