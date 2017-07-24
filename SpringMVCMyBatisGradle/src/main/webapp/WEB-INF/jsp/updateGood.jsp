<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>书籍列表</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="./themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="./themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
</head>


<body style="background:#e5edef;">
	
	<h1 >修改</h1>
	
	<form action="${pageContext.request.contextPath }/updateGood" method="post" enctype="multipart/form-data">
	<input type="hidden" name=id value="${requestScope.good.id }">
	<table width="100%" height="90%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
	  <!-- 数据展示区 -->
	  <tr valign="top">
	    <td height="20">
		  <table width="100%" border="1" cellpadding="5" cellspacing="0" style="border:#c2c6cc 1px solid; border-collapse:collapse;">
		    <tr class="main_trbg_tit" align="center">
		    	 <td>图片</td>	
			  <td>书名</td>
			  <td>价格</td>
			  <td>数量</td>
			  <td>出版社</td>
			  <td></td>
			</tr>
			<tr>
				<td>
					<c:if test="${requestScope.good.image!=null }">
						<img src="./images/${requestScope.good.image}" width=100 height=60/>
						<br/>
					</c:if>
					<input type="file"  name="pictureFile"/> 
				</td>
			  <td><input type="text" name="name" value="${requestScope.good.name }"></td>
			  <td><input type="text" name="price" value="${requestScope.good.price }"></td>
			  <td><input type="text" name="count" value="${requestScope.good.count}"></td>
			  <td><input type="text" name="factory" value="${requestScope.good.factory}"></td>
			  <td><input type="submit" value="更新"></td>
			</tr>
		  </table>
		</td>
	  </tr>
	</table>
</form>
</body>
</html>
