





<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<html>
<head>
<title>게시판</title>
	<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 
 <style type="text/css">
 	table th{ 
 		border: 1px solid black;
 	}
 	table td{ 
 		border: 1px solid black;
 	}
 	var str = "바보";
 </style>
</head>
<script type="text/javascript">
</script>
<body>
<h1>게시글상세</h1>
<table style="width: 100%;border: 1px solid black;border-collapse: collapse;" >
	<thead>
		<tr> 
			<th>${boardDto.no }</th>
			<th>${boardDto.title } </th>
			<th>${boardDto.contents }</th>
		</tr>
	</thead>
	<tbody>
	</tbody>
</table>
</body>
</html>