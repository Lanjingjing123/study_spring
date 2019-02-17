<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.csii.ljj.listener.Person" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    // 1. 获取application域对象获取IOC容器
    ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
    // 2. 从IOC容器获取bean
    Person person = (Person) ctx.getBean("person");

    // 3.使用bean
    person.hello();
%>
</body>
</html>
