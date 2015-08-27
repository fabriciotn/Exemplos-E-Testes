<%-- 
    Document   : index
    Created on : 18/10/2013, 09:07:30
    Author     : 12546446
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String IP = request.getRemoteAddr();
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilocss.css">
        <title>Meu IP - Fundação Hemominas</title>
        <link rel="shortcut icon" href="icone.ico">
    </head>
    <body>
        <div id="tudo">
            <div id="frame">
                <iframe src="banner.jsp" height="100px" width="100%" frameborder="0" scrolling="no"></iframe>
            </div>
            <!Página de Login!>
            <div id="conteudo">
                <h1 style="font-size: 90px; font-family: 'Calibri'">Meu IP: <%out.println(IP);%></h1>
            </div>
        </div>
    </body>
</html>
