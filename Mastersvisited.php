<?php 
session_start();
?>
<html>
    <body>
    <?php 
    $txtname2 = $_SESSION['usrname'];
    $visited = "Masters";
    include_once("connect.php");

    $sql = "INSERT INTO user_visited VALUES('$txtname2', '$visited')";
    mysqli_query($conn, $sql);
    header("Location:Mastershomepage.html");
?>
    </body>
</html>