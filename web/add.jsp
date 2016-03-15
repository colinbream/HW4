<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Player</title>
        <link rel="stylesheet" type="text/css" href="stylesheet.css"/> 

    </head>
    <body>
        <div class="wrap"> 

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">
                <h1>Add A New Player</h1>

                <div class="add">
                    <form name="addForm" action="addPlayer" method="get">

                        <label>Player Name:</label>
                        <input type="text" name="name" value=""/>
                        <br>
                        <label>Age:</label>
                        <input type="text" name="age" value=""/>
                        <br>
                        <label>Position:</label>
                        <input type="text" name="position" value=""/>
                        <br>
                        <label>Team:</label>
                        <input type="text" name="team" value=""/>
                        <br>
                        <label>College:</label>
                        <input type="text" name="college" value=""/>
                        <br>
                        <br>
                        <input type="submit" name="submit" value="Submit"/>
                    </form>
                </div>
            </div>  <!--close main div-->

            <%@ include file="includes/footer.jsp" %>

        </div>  <!--close wrap div-->   
    </body>
</html>
