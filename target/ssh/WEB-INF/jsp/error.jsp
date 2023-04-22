<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true"%>
<html>
<head>
    <title>异常</title>
</head>
<body>
    <h4>异常描述：</h4><s:property value="exception.message"></s:property>
</body>
</html>
