<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jsp: JavaServerPage 자바서버용페이지 -->
<!--  jsp에서 자바프로그램을 사용할때 쓰는 태그 꺽쇠% -->

<!-- HomeController.java 에서 index.jsp로 매칭 시킨 결과가 나오는 페이지.<br>
왜 /resources/sample/index.html 이렇게 접근하지 않고,<br>
홈컨트롤러자바를 거쳐서index.jsp 를 접근하는 이유는 보안때문이다.<br>
그래서, 은행, 관공서, 대학에서 대부분 사용. (스프링을 배우는 목적)<br>
다른 예로, php는 위에 있는 html처럼 파일에 바로 접근이 가능합니다. (그래서 일반 소규모 중소기업 홈페이지에 사용)<br>
org.edu.controller 패키지명: 자바클래스가 있는 폴더 경로를 말한다.<br>
패키지를 사용하는 이유 : 자바클래스를 기능별로 묶어놓기 위해서 명시적으로 만든 묶음.<br> -->

<%@ include file="./include/header.jsp" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>

      <section><!-- division 디비전이라는 영역표시 태그 -->
      <!-- 본문슬라이드 영역 시작 -->
      <!-- 이미지를 불러오는 태그 img -->
      <!-- 경로:상대(./img/...), 절대경로(/resources/sample/img/...) -->
      <!-- 태그 안쪽에 지정한 스타일을 인라인스타일 -->
<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/resources/sample/img/seoul.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/sample/img/ghmun.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/resources/sample/img/flag.png" class="d-block w-100" alt="...">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
      <!-- 본문슬라이드 영역 끝 -->
      </section>
      
<%@ include file="./include/footer.jsp" %>