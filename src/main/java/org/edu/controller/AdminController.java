package org.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@RequestMapping(value="admin/board/board_list", method = RequestMethod.GET)
	public String board_list() throws Exception {
		return "admin/board/board_list";
	}
	
	//매서드 오버로딩(예, 동영상 로딩중..., 로딩된 매개변수가 다르면, 매서드이름을 중복가능합니다.)
	@RequestMapping(value="admin/member/member_write", method = RequestMethod.POST)
	public String member_write(@RequestParam("user_name") String user_name) throws Exception {
		return "redirect:/admin/member/member_list";
	}
	
	@RequestMapping(value="admin/member/member_write", method = RequestMethod.GET)
	public String member_write() throws Exception {
		return "admin/member/member_write";
	}
	
	
	//jsp에서 데이터를 수신하는 역할 @Requestparam("키이름") 리퀘스트파라미터 클래스 사용
	//현재 컨트롤러 클래스에서 jsp로 데이터를 보내는 역할 Model 클래스 사용.
	//멤버리스트 -> @RequestParam("user_id")수신, model송신-> member_view.jsp
	@RequestMapping(value="/admin/member/member_view", method = RequestMethod.GET)
	public String member_view(@RequestParam("user_id") String user_id, Model model ) throws Exception {
		//이제 위에서 수신한 user_id를 member_view.jsp로 보냅니다.
		model.addAttribute(/*멤버뷰로 보냄*/"user_id2", user_id + "<script>alert('메롱');</script> 님");
		return "admin/member/member_view";
	}
	
	@RequestMapping(value="/admin/member/member_list", method = RequestMethod.GET)
	public String memver_list(Model model) throws Exception {
		String[][] members = {
				{"admin","관리자","admin@abc.com","true","2020-12-04","ROLE_ADMIN"},
				{"user","사용자1","user@abc.com","false","2020-12-04","ROLE_USER"}
		};
		model.addAttribute("members", members);
		return "admin/member/member_list";
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin() throws Exception {
		return "admin/home";
	}
	
}
