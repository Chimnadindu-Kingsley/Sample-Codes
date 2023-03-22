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

  //include_once("register.php"); //include our database connection

  if(isset($_POST['submit'])) {
    // if the person submit the file
    $fullName = mysqli_real_escape_string($db, $_POST['fullName']);
    $email = mysqli_real_escape_string($db, $_POST['email']);
    $gender = mysqli_real_escape_string($db, $_POST['gender']);    
    $password = mysqli_real_escape_string($db, $_POST['password']);     


    //encrypt our Password
    $password = base64_encode(strrev(md5($password)));
    $password = mysqli_real_escape_string($db, $password);
    

    //verify if users exist before we insert into the database
    $sql = "SELECT * FROM register WHERE email = '$email' ";
    $result = mysqli_query($db, $sql);

    if(mysqli_num_rows($result) == 0){
      //email is not in Database

      $insert = "INSERT INTO register (fullName, email, gender, password) VALUES ('$fullName', '$email', '$gender', '$password') ";
      $input = mysqli_query($db, $insert);

      if($input){
        //query done
        $_SESSION['registerComplete'] = "Registration successful";
        $_SESSION['registerComplete'] == TRUE;
        header("Location: index.php");
        exit();
        } else {
        //unable to INSERT
        echo mysqli_error($db);
      }
        } else {
      //email exist error; login
      header("Location: login.php");
      exit();
    }


  } else {
    header("Location: register.php");
    exit();
  }

 ?>