<html>
<body>
<?php
include_once("connect.php");
$txtname = $_POST['username'];
$txtpass = $_POST['password'];
$flag = false;
$sql = "SELECT Username, Authenticate FROM profile";
$users = mysqli_query($conn, $sql);
mysqli_fetch_all($users, MYSQLI_ASSOC);
foreach($users as $user)
{
    if(($user['Username'] == $txtname) && ($user['Authenticate'] == $txtpass))
    {
        echo "Successfully logged in.Head to the homepage";
        $flag = true;
        break;
    }
}
if (($flag == false))
    {
        echo "Wrong username or password. Try again";
        die();
    }
?>
<br>Click for the <a href="Homepage.html">Home Page.</a>
</body>
</html>
