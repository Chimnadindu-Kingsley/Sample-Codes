
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style1.css">
    <title>Production</title>
</head>

<body class="bottom">
<!--Start up of the header-->
<header class="container-fluid list">
    <!--Holds the nav-->
    <!--nav bar properties-->
    <nav class="navbar navbar-expand-lg navbar-dark color col" id="head">
        <a class="navbar-brand" href="index.php">Annie Trends</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
        <!--Nav bar item-->
        <section class="collapse navbar-collapse" id="navbarSupportedContent">
            <!--A tag ul-->
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="welcome.php">I'm New <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about.php">About Us</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="welcome.php" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Explore
                          </a>
                    <!--Explore drop down menu-->
                    <section class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="form.php">Create Account</a>
                        <a class="dropdown-item" href="login.php">Login</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="catalog.php">View Catalog</a>
                    </section>
                </li>
            </ul>
            <!--Nav bar search form-->
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <a class="btn btn-primary text-white color btn-outline-primary my-2 my-sm-0" href="https://www.google.com/" role="button">Search</a>
            </form>
        </section>
    </nav>
</header>
    
    <section class="container">
        <h1 class="h2 text-capitalize text-center py-3">Welcome to Annies backend!</h1>
        <!--A form Tag-->
        <form method="POST" action="process.php" enctype="multipart/form-data">
            <!--This row hold the name and input-->
            <section class="form-group">
                <label for="name" class="font-weight-bold lead">Name:</label>
                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Name of the Picture." name="name">
                <small id="emailHelp" class="form-text text-muted">Name of the Picture.</small>
            </section>
            <!--This row hold the price and its input-->
            <section class="form-group">
                <label for="exampleInputPassword1" class="font-weight-bold lead">Price</label>
                <input type="number" class="form-control" id="exampleInputPassword1" placeholder="Price" name="price">
                <small id="numberHelp" class="form-text">Price should be in Pounds</small>
            </section>
            <!--This row hold the image-->
            <section class="form-group">
                <label for="exampleFormControlFile1">Example file input</label>
                <input type="file" class="form-control-file" id="exampleFormControlFile1" name="image">
            </section>
            <section>
            <label for="sales">On Sales:</label>
            </section>
            <!--This row displays the radio button-->
            <section class="form-check">
                <input class="form-check-input" type="radio" name="sales" id="exampleRadios1" value="no" checked>                
                <label class="form-check-label" for="exampleRadios1">No</label>
            </section>
            <section class="form-check">
                <input class="form-check-input" type="radio" name="sales" id="exampleRadios2" value="yes">
                <label class="form-check-label" for="exampleRadios2">Yes</label>
            </section>            
            <button type="submit" class="btn btn-primary mt-4" name="submit">Submit</button>
        </form>
    </section>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>