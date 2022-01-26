<html>
<body>
<?php
include_once("connect.php");
$txtEmail = $_POST['email'];
$txtname = $_POST['Username'];
$txtpass = $_POST['Password'];
try
{
    $sql="INSERT INTO profile (Email, Username, Authenticate) 
    VALUES ('$txtEmail', '$txtname', '$txtpass')";
    $rs=mysqli_query($conn,$sql);
    if($rs)
    {
        $var = "Profile created\nHead to the login page to access the profile\n";
        echo $var;
    }
}
catch(Exception $e)
{
    $e->getMessage();
    echo $e;
}
?>
<br>Click here for <a href="login.html">login page.</a>
</body>
</html>
