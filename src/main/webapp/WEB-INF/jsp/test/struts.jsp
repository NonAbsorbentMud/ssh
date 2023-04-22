<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>struts</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
    <style type="text/css">

    </style>
</head>
<body>
<div class="flex align-center justify-around">
    <div class="row">
        <h3>Action访问方式：</h3>
        <ol>
            <li>
                <a href="${pageContext.request.contextPath}/test/oneAction!one">
                    <h3>!动态调用</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/twoAction">
                    <h3>常规调用</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/threeAction">
                    <h3>通配符*配置方式调用</h3>
                </a>
            </li>
        </ol>
    </div>
    <div class="row">
        <h3>参数传递：</h3>
        <form method="POST" accept-charset="UTF-8" action="${pageContext.request.contextPath}/test/paramAction">
            <h5>属性驱动：<input type="text" name="fieldParam"/></h5>
            <h5>对象驱动：<input type="text" name="objectParam.field" /></h5>
            <h5>模型驱动：<input type="text" name="fieldModel" /></h5>
            <h5>List集合：<input type="text" name="fieldList" />
                <input type="text" name="fieldList[1]" /></h5>
            <h5>Map集合：<input type="text" name="fieldMap['a']" /></h5>
            <button type="submit">提交</button>
        </form>
    </div>
    <div class="row">
        <h3>Action类的返回类型：</h3>
        <ol>
            <li>
                <a href="${pageContext.request.contextPath}/test/Ret_retStr">
                    <h3>返回类型为String</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/Ret_retVoid">
                    <h3>返回类型为void</h3>
                </a>
            </li>
        </ol>
    </div>
    <div class="row">
        <h3>ActionAPI返回Json数据：</h3>
        <ol>
            <li>
                <a href="${pageContext.request.contextPath}/test/Ret_retJson">
                    <h3>返回的Json数据1</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/Ret_retJsonData">
                    <h3>返回的Json数据2</h3>
                </a>
            </li>
        </ol>
    </div>
    <div class="row">
        <h3>Action的跳转方式：</h3>
        <ol>
            <li>
                <a href="${pageContext.request.contextPath}/test/navigatetoDispatcher">
                    <h3>转发</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/navigatetoRedirect">
                    <h3>重定向</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/navigatetoChain">
                    <h3>转发Action</h3>
                </a>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/test/navigatetoRedirectAct">
                    <h3>重定向Action</h3>
                </a>
            </li>
        </ol>
    </div>
</div>
</body>
</html>
