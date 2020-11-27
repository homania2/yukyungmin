<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="./include/header.jsp" %>

<section class="contact-section"><!-- division 디비전이라는 영역표시 태그 -->
         <h1>CONTACT</h1>
         <div class="container">
         <form name="message_form" action="/contact" method="post">
         <!-- 스프링에서는 action으로 폼데이터를 전송할 위치를 지정할때, contact.html직접X / contact처럼 컨트롤러를 통해OK -->
         <!-- 필드셋은 폼이 DB테이블의 필드와 1:1매칭되는 관계 -->
         <fieldset>
         <legend>현재폼의타이틀영역입니다.</legend>
         <div class="input-class">
            <label for="name">이름</label>
            <input name="name" id="name" type="text" placeholder="이름을 입력">
            <label for="phone">연락처</label>
            <input name="phone" id="phone" type="text" placeholder="연락처를 입력">
            <label for="email">이메일</label>
            <input name="email" id="email" type="email" placeholder="email을 입력">
         </div>
         <div class="textarea-class">
            <label for="message">메세지</label>
            <textarea name="message" id="message" placeholder="내용을 입력"></textarea>
         </div>
         </fieldset>
         <div class="submit-btn">
         <button type="submit">메세지보내기</button>
         </div>
         </form>
         </div>
      </section>

<%@ include file="./include/footer.jsp" %>