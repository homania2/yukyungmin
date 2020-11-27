<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html><!-- 현재문서의 형태선언 -->
<html><!-- html문서는 <태그열고 ~태그닫고> -->
<head><!-- 문서내용과는 관계없는 문서정보가 들어있고, 메타정보가 존재 -->
<meta charset="UTF-8"><!-- 문서의 언어 인코딩설정 지금은 유니코드로 됨 -->
<!-- 반응형을 작동하기 위해서 사용하는 메타태그 뷰포트는 모니터, 모바일액정, 프린터 -->
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<title>반응형 홈페이지</title><!-- 문서의 제목을 브라우저상단왼쪽에 표시 -->
<!-- 외부 자바스크립트 불러오는 태그(아래) -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="/resources/sample/js/user.js"></script>
<!-- 외부 css파일 불러오는 태그(아래) -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="/resources/sample/css/reset.css" type="text/css">
<link rel="stylesheet" href="/resources/sample/css/mobile.css" type="text/css">
<link rel="stylesheet" href="/resources/sample/css/tablet.css" type="text/css">
<link rel="stylesheet" href="/resources/sample/css/pc.css" type="text/css">

<!-- span 자리를 차지하지 않는 영역 한뼘, px 픽셀 = 화면에 표시되는 크기의 단위 -->
<!-- :콜론(속성:값, key:Value), ;세미콜론(문장의 끝) -->
<style>

/* 여기까지는 모바일용-아래부터는 태블릿용, pc용 @미디어쿼리사용-메타태그viewport사용필수 */
/* pc용 스타일 시작 */
@media all and (min-width:1132px) {

}

/* pc용 스타일 끝 */
</style>
<script>
/* 자바스크립트 시작 */
$(document).ready(function($) {
   $('.carousel').carousel({
    		  interval: 1000,
    		  pause: false
    	})
    });

/* 자바스크립트 끝 */
</script>
</head>
<body><!-- 문서내용이 들어가는 영역 -->
   <div id="wrap"><!-- 랩핑시킨 영역 -->
      <header class="header">
      <!-- 상단 로고와 햄버거 메뉴영역 시작 -->
         <h1 class="logo">
            <a href="/">LOGO</a>      <!-- a태그는 링크역할, href헤르프 속성값에 URL을 입력해서 이동 -->
         </h1><!-- 제목태그 헤드라인글자를 표시 h1~h6 -->
         <div class="menu-toggle-btn">
            <span></span>
            <span></span>
            <span></span>
         </div>
         <script>
         
         </script>
         <!-- html5 시만텍 웹 = 의미가 있는 태그를 사용하게 해서 AI가 인식하게 됩니다. -->
         <nav class="gnb"> <!-- GNB:글로벌네비게이션 :전체영역 메뉴 -->
         <!-- 리스트를 보여주는 태그 ul(UnOrdered List *.~,*.~) ol(Ordered List 1.~,2.~) -->
            <ul>
               <li><a href="/">HOME</a></li>
               <li><a href="/weare">WE ARE</a></li>
               <li><a href="/work">WORK</a></li>
               <li><a href="/blog">BLOG</a></li>
               <li><a href="/contact">CONTACT US</a></li>
            </ul>
         </nav>
      <!-- 상단 로고와 햄버거 메뉴영역 끝 -->
      </header>