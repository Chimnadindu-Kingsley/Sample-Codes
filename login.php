<!DOCTYPE html>
<html>

<head>
    <!--Used to define the character set the browser will utilize -->
    <meta charset="UTF-8">
    <!--Assigns a title-->
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Links the css style sheet to the html page -->
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header class="list">
        <!--Holds the nav-->
        <!--nav bar properties-->
        <nav class="navbar navbar-expand-lg navbar-dark color col" id="head">
            <a class="navbar-brand" href="index.php">Annie Trends</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <!--Nav bar item-->
            <section class="collapse navbar-collapse" id="navbarSupportedContent">
                <!--A ul tag-->
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="about.php">I'm New <span class="sr-only">(current)</span></a>
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
                            <a class="dropdown-item" href="register.php">Create Account</a>
                            <a class="dropdown-item" href="login.php">Login</a>
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
    <main class="ground spacing">
        <!-- main tag houses the main content of the page. -->
        <section class="container spacing ground">
            <form class="container-fluid row justify-content-md-center col-md-auto" action="loginphp.php" method="POST">
                <!--Creates a field set to hold the login form-->
                <fieldset>
                    <legend>Login</legend>
                    <!-- legend tag us used alongside fieldset to define what the field is all about. -->
                    <!--Holds the email and its input-->
                    <section class="list">
                        <label>Email: </label>
                        <input type="text" name="email">
                    </section>
                    <!--Holds the password and its input-->
                    <section class="list">
                        <label>Password: </label>
                        <input type="data" name="password">
                    </section>
                    <!--Holds the submit button-->
                    <section class="row justify-content-md-center col-md-auto">
                        <button class="btn color text-white btn-outline-primary" type="submit" name="submit" value="login">Submit
                    </button>
                    </section>
                    <a class="float-right text-primary text-italic" href="https://www.google.com/" role="button">Forgot password</a>
                </fieldset>
            </form>
        </section>
    </main>
    <footer class="section container-fluid footer-classic context-dark bg-primary">
        <section class="row row-40">
            <!--Holds the first column-->
            <section class="pr-xl-4 col-md-4 col-xl-5">
                <!--Hold the logo with its dimension-->
                <a class="brand" href="index.html"><img class="brand-logo-light" src="images/logo.jpg" alt="" width="140" height="100" srcset="images/agency/logo-retina-inverse-280x74.png 2x"></a>
                <!--Holds the write up-->
                <p>We are an award-winning creative fashion designers, dedicated to give the best result African designs</p>
                <!-- Rights-->
                <p class="rights"><span>©  </span><span class="copyright-year">2020</span><span> </span><span>Company</span><span> - </span><span>All Rights Reserved.</span></p>
            </section>
            <!--Hold the second column-->
            <section class="col-md-4">
                <!--Hold the second column header-->
                <h4 class="font-italic">Contacts</h4>
                <!--Holds the discription list-->
                <dl class="contact-list">
                    <dt>Address:</dt>
                    <dd>Dublin city center Ireland</dd>
                </dl>
                <!--Holds the description list-->
                <dl class="contact-list">
                    <dt>email:</dt>
                    <dd><a href="mailto:#">nckh117@email.com</a></dd>
                </dl>
                <!--Hold the description list-->
                <dl class="contact-list">
                    <dt>phones:</dt>
                    <dd><a href="tel:#">08754852454</a> <span>or</span> <a href="tel:#">08145659875</a>
                    </dd>
                </dl>
            </section>
            <!--Holds the third column-->
            <section class="col-md-4 col-xl-3">
                <h4 class="font-italic">Links</h4>
                <!--A ul list-->
                <ul class="nav-list">
                    <li><a href="about.php">About</a></li>
                    <li><a href="#">Catalog</a></li>
                    <li><a href="#">Blog</a></li>
                    <li><a href="#">Contacts</a></li>
                    <li><a href="#">On Sales</a></li>
                </ul>
            </section>
        </section>
        <!--Holds the social media access-->
        <section class="row no-gutters social-container">
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-facebook"></span><span>Facebook</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-instagram"></span><span>Instagram</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-twitter"></span><span>Twitter</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-youtube-play"></span><span>Youtube</span></a></section>
        </section>
    </footer>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js " integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n " crossorigin="anonymous "></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js " integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo " crossorigin="anonymous "></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js " integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6 " crossorigin="anonymous "></script>
</body>

</html>