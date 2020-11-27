package org.edu.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/contact", method = RequestMethod.POST)
	public String contact_send() {
		//데이터 전송후에 다른 페이지이동이 필요. 새로고침을 방지하기 위해, 게시판테러 방지
		return "redirect:/blog";
	}
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String contact() {
		return "sample/contact";
	}
	@RequestMapping(value="/blog", method = RequestMethod.GET)
	public String blog() {
		return "sample/blog";
	}
	@RequestMapping(value="/work", method = RequestMethod.GET)
	public String work() {
		return "sample/work";
	}
	@RequestMapping(value="/weare", method = RequestMethod.GET)
	public String weare() {
		//외부에서 /weare 경로로 접근했을떄, sample/weare.jsp와 매칭시키라는 의미
		return "sample/weare";
	}
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		//상단 리퀘스트매핑에서 지정한 경로로 접근을 하게되면, 아래에 있는 index()매서드를 실행해라.
		//매서드명 제일 앞에있는 public은 접근권한에 대한 키워드, public(공공 - 다른 클래스에서 접근가능)
		//private(내부 - 현재 HomeController클래스 에서만 접근가능)
		//public string index() {} 메서드 기본형태
		// $(document).ready(function(){ }); j쿼리 기본형태
		//리턴 반환값으로 사용한 String 클래스는 문자열을 반환하고, 여기서는 index.jsp 와 매칭되는 문자열을 반환.
		//스프링 MVC프로젝트에서 상대경로의 최상위는 views폴더 최상위 root폴더이다
		// 접두사(prefix), 접미사(suffix) index(접두사-파일명).jsp(접미사-확장자)
		return "sample/index"; //접두사만 반환값으로 넣는다.
	}
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("환영합니다. 현재 여러분 컴퓨터 언어는 {} 입니다.", locale);
	    logger.info("환영합니다. 현재 여러분 컴퓨터 언어는" + locale + " 입니다..");
		System.out.println("위에 Locale클래스를 사용하는 이유는 다국어 지원 때문에 변수로 사용하게 됩니다.");
		System.out.println("함수-C언어나자바스크립트-와 메서드-자바,스프링에서 사용함-는 같은 대상을 가리킵니다.");
		System.out.println("함수-메서드는 함수명('매개변수-입력값'){구현내용}형식이고, 입력값->출력값 구현됩니다.");
		Date date = new Date();//Date 날짜관련 클래스형 변수 date 선언. date변수 매서드를 사용 가능하게됨
		//date 변수 실행가능한 변수 =클래스형변수=Object오브젝트=인스턴스 라고 한다.
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		//DateFormat 클래스형 변수 dateFormat 이 선언되었고, 실행가능한 변수로 되었습니다.
		String formattedDate = dateFormat.format(date);//변수가 실행됩니다.
		//위 변수가 실행되어서 출력된 결과값이 String 클래스형 변수 formattedDate변수에 담기게 된다.
		model.addAttribute("TomcatserverTime", formattedDate );//serverTime 변수 값으로 jsp파일로 이동.
		//model이라는 클래스형 변수를 이용해서, serverTime변수값을 아래 home(생략.jsp)로 전송해 줌.
		System.out.println("현재 서버의 시간은" + formattedDate + " 입니다. ");
		return "home";//결과적으로 return 출력값이 home(생략.jsp)에 연동됨.
		//스프링에서 뷰단으로 데이터 이동(전송)에 대해 살펴 보았습니다.
	}*/
	
}
