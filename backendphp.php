  <?php

    session_start();

  // database connection
  $conn = mysqli_connect("localhost", "root", "", "3017499");
    
  if (isset($_POST['submit'])) {

    $name = mysqli_real_escape_string($conn, $_POST['name']);
    $price = mysqli_real_escape_string($conn, $_POST['price']);
    $sales = mysqli_real_escape_string($conn, $_POST['sales']);
    $img_ext = array('images/jpeg', 'images/jpg', 'images/png');
  
	  
  	// Get name of images
  	$Get_image_name = $_FILES['image']['name'];
  	
  	// image Path
  	$image_Path = "images/".basename($Get_image_name);
  
  	$sql = "INSERT INTO arrival (name, price, sales, image) VALUES ('$name',  '$price',  '$sales', '$Get_image_name')";
	// Run SQL query
  	mysqli_query($conn, $sql);

  	if (move_uploaded_file($_FILES['image']['tmp_name'], $image_Path)) {
          $_SESSION['image_error'] = "Successfully Uploaded Image!";
          header('Location: backend.php');
  	}else{
        $_SESSION['image_error'] = "Error";
          header('Location: backend.php');
  	}
  } else {
    header("Location: backend.php");
    exit();
    }      
?>
