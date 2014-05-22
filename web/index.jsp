<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "autopack.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="index.css" rel="stylesheet" type="text/css" media="screen">
        <title>Auto's</title>
        <%            
            Autooverzicht Aover;
            
            Aover = new Autooverzicht();
            
            Aover.addAuto();
            
        %>
    </head>
    <body>
        <div id="wrapper">
            <div id ="content">
               <%= Aover.maakPagina() %>
            </div>
        </div> 
     
    </body>
</html>
