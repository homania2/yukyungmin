package org.edu.vo;

import java.util.Date;

/**
 * 회원정보관리용 클래스
 * @author 유경민 2020-12-04 생성
 *
 */
public class MemberVO {
	//멤버변수 선언(클래스 전역변수)
	private String user_id;//프라이빗: 클래스 내부에서만 사용가능, 보안상의 이유
	private String user_pw;
	private String user_name;
	private String email;
	private Integer point;
	private Boolean enabled;//불린형은 true,false 2개의 값중 1개만 갖는다
	private String levels;//오라클에선 level이 예약어라 에러남
	private Date reg_date;
	private Date update_date;//회원정보 수정일필드
	//get,set 매서드가 필요한 이유는 jsp<-겟셋매서드->컨트롤러<-겟셋매서드->DB
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getLevels() {
		return levels;
	}
	public void setLevels(String levels) {
		this.levels = levels;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	@Override
	public String toString() {
		return "디버그 MemberVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", email=" + email
				+ ", point=" + point + ", enabled=" + enabled + ", levels=" + levels + ", reg_date=" + reg_date
				+ ", update_date=" + update_date + "]";
	}
	
}
