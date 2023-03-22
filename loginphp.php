<?php
  session_start();
  
  $dbname = '3017499';
  $dbhost = 'localhost';
  $dbpass = '';
  $dbuser = 'root';

  //database connection:
  $db = new mysqli($dbhost, $dbuser, $dbpass, $dbname);

  if($db->connect_error) {
      die("Database Connection!" . $conn->connect_error);
  }

 
  if(isset($_POST)){
    //login Request fired

    $email = mysqli_real_escape_string($db, $_POST['email']);
    $password = mysqli_real_escape_string($db, $_POST['password']);

    //encrpt the password to match the one on the database;
    $password = base64_encode(strrev(md5($password)));

    //we check if the email exist in the server / Database

    $sql = "SELECT * FROM register WHERE email = '$email' AND password = '$password' ";
    $result = mysqli_query($db, $sql);

    if(mysqli_num_rows($result) > 0){
      //then the email and password are correct,
      $row = mysqli_fetch_assoc($result);
      
      $fullName = $row['fullName'];
      $_SESSION['name'] = $fullName;      
      $_SESSION['id_user'] = $row['id'];         
      header("Location: welcome.php");      
      exit();
      
      
    }else {     
        header("Location: login.php");        
        exit();      
    }

  } else {
    //login Request not fired;
    header("Location: login.php");
    exit();
  }
 ?>