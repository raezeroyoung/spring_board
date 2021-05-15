<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>Home</title>
	<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script type="text/javascript">
	function goLocation(str){
		location.href=str; //   /board
	};
</script> 
</head>
<script type="text/javascript">
</script>
<body>
<h1>안녕하세요 메인화면입니다.</h1>
<button onclick="goLocation('boards')" >게시판</button>
<button onclick="goLocation('signUp')" >회원가입</button>
<button onclick="goLocation('login')" >로그인</button>
</body>
</html>