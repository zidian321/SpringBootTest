<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="UTF-8">
<script src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" />  
<meta charset="UTF-8">
<title>Insert title here</title>
<style> 
.div-a{ float:left;width:49%;border:1px solid #F00} 
.div-b{ float:left;width:49%;border:1px solid #000} 
</style> 
</head>
</head>
<body>
<h1>IMS service test website</h1>

<form action="/hello" id="imsrequest">
<div id = "app" class="form-group" style="margin-left:15px">
<h3>EndPoint</h3>
<input  type="text" name="url" class="form-control" value="http://mvss.mul.ie.ibm.com/IMSService/GenericIMSConnectorImpl">
</div>
<div id = "app2" class="form-group" style="margin-left:15px">
<h3>Transaction Name</h3>
<input  type="text" name="transactionID" class="form-control" placeholder="请输入Transaction ID 例如WLMT776">
</div>
<div>
<div id = "app3" class="form-group" style="margin-left:15px;float:left;width:49%" >
<h3>IMS request</h3>
<textarea name="requestbody"  class="form-control" style="width:500px; height:500px" placeholder="请输入Transaction request xml">${requestbody}</textarea> 
</div>
<div id = "app4" class="form-group" style="margin-left:15px;float:left;width:49%">
<h3>IMS response</h3>
<textarea name="responsebody"  class="form-control" style="width:500px; height:500px" placeholder="请输入Transaction request xml">${requestbody}</textarea> 
</div>
</div>
<p>
<div>
<button type="submit" class="btn btn-primary" style="margin-left:15px">提交查询</button>
</div>
<p>
</form>
${message}

<script>
</script>
</body>
</html>