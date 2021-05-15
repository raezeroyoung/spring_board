<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>수정</title>
	<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 
 <style type="text/css">
 </style>
</head>
<script type="text/javascript">
	function updateOk() {
		var frm = $("#frm");
		frm.form.submit();  
	}

</script>
<body>
<form action="updateOK" method="post" id="frm">
	<div>제목<input type="text" name="title" value="${boardDto.title} "><br></div>
	<div>내용<textarea rows="30" cols="30" name="contents" >${boardDto.contents}</textarea><br></div>
	<div>이름<input type="text" name="userId" value="${boardDto.userId}"></div>
	<button onclick="updateOk()">글수정</button>
	 <input type="hidden" name="_method" value="PUT"/>
	 <input type="hidden" name="no" value="${boardDto.no }"/>
</form>

</body>
</html>