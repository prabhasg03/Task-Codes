<?php
session_start(); // store session data 
$_SESSION["name"]="Sanju"; 
$_SESSION["favcolor"]="blue"; 
//retrieve session data 
echo "My name is =". $_SESSION["name"]; 
echo "My favourite color is=".$_SESSION["favcolor"];
?>
<?php //delete session data
if(isset($_SESSION["name"])) 
{
unset($_SESSION["name"]); 
}
print_r($_SESSION);
session_destroy();
?>