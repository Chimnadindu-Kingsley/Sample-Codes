 <!--Nwafor Chimnadindu Kingsley 3017499 -->
 <?php session_start(); ?>
 <!DOCTYPE html>
<html>

<head>
    <!--Used to define the character set the browser will utilize -->
    <meta charset="UTF-8">
    <!--Assigns a title-->
    <title>Index</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Links the css style sheet to the html page -->
    <link rel="stylesheet" href="css/style1.css">
</head>

<body>
    <!--Start up of the header-->
    <header class="container-fluid list">
        <p>Codes and design are strictly done by Nwafor Kingsley 3017499. Still in progress.............Database access for the images/products are disabled for web view</p>
        <!--Holds the top write-up, centers it-->
        <section class="color text-white text-uppercase jumbotron-fluid row justify-content-md-center sticky-top">
            <!--Create a h3 tag to hold the write-up-->
            <h3>The best African collection in the world</h3>
        </section>
        <!--Holds the logo-->
        <section class="container-fluid row justify-content-md-center col-md-auto">
            <!--Holds the image tag and assigns a fixed dimesion-->
            <img src="images/logo.jpg" alt="..." class="img-thumbnail" width="200px" height="100px">
        </section>
        <!--Holds the nav-->
        <!--nav bar properties-->
        <nav class="navbar navbar-expand-lg navbar-dark color col" id="head">
            <!--Holds the brand name and assign a link to it-->
            <a class="navbar-brand" href="index.php">Annie Trends</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <!--Nav bar item-->
            <section class="collapse navbar-collapse" id="navbarSupportedContent">
                <!--ul that holds the list-->
                <ul class="navbar-nav mr-auto">
                    <!--the list items-->
                    <li class="nav-item active">
                        <a class="nav-link" href="register.php">I'm New <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="about.php">About Us</a>
                    </li>
                    <!--If the login session is created -->
                    <?php
                        // gets the user id
                        if(isset($_SESSION['id_user'])) {
                            ?>
                            <!--The list item to display when session is created-->
                            <li class="nav-item">
                                <a class="nav-link" href="logout.php">Logout</a>
                            </li>
                            
                            <?php 
                            // if the user id is not called
                        } else {
                            ?>
                            <!--The list item to display when the session isn't created-->
                            <li class="nav-item">
                                <a class="nav-link" href="register.php">Register</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="login.php">Login</a>
                            </li>
                            <?php
                        }                    
                    ?>                                                            
                </ul>
                <!--Nav bar search form-->
                <form class="form-inline my-2 my-lg-0">
                    <!--Holds the search bar to take input-->
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <a class="btn btn-primary text-white color btn-outline-primary my-2 my-sm-0" href="https://www.google.com/" role="button">Search</a>
                </form>
            </section>
        </nav>
    </header>

    <main class="bottom container-fluid">
        <!--The main contains 3 column to split its content-->
        <!--Container to hold the first column-->
        <section class="row container-fluid-sm" id="Top">
            <!-- A vertical navbar -->
            <nav class="navbar d-flex flex-column bd-highlight mb-3 col-sm-4 col-md-4 col-lg-1" id="first">
                <!-- Links -->
                <ul class="navbar-nav" >
                    <!--The list item-->
                    <li class="list ">
                        <a class="btn button color text-white btn-primary btn-outline-primary" href="arrival.php">New Arrivals</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="women.php">For Women</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="men.php">For Men</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="sales.php">On Sales</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="wears.php">Swim Wears</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="accessories.php">Accessories</a>
                    </li>
                    <li class="nav-item nav-link list">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="shoes.php">Shoes</a>
                    </li>
                    <li class="nav-item nav-link">
                        <a class="btn color button text-white btn-primary btn-outline-primary" href="bags.php">Bags</a>
                    </li>
                </ul>
            </nav>

            <!--The Second column-->
            <!--Content of the second column-->
            <section id="second" class="carousel slide col-sm-12 col-md-9 col-lg-9" data-ride="carousel">
                <ol class="carousel-indicators">
                    <!-- Creates a carouse caption and slide -->
                    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                </ol>
                <section class="carousel-inner">
                    <!-- Creates the first active carouse item -->
                    <section class="carousel-item active">
                        <img src="images/carou3 (Copy).jpg" class="d-block w-100" alt="img1">
                        <section class="carousel-caption d-none d-md-block">
                            <!--Holds the carousel write up-->
                            <h5>Ankara combination like never before</h5>
                            <p>Buy one of our fabulous designs online</p>
                        </section>
                    </section>
                    <!-- The second carouse item -->
                    <section class="carousel-item">
                        <img src="images/carou4 (Copy).jpg" class="d-block w-100" alt="img2">
                        <!--Holds the carousel write up-->
                        <section class="carousel-caption d-none d-md-block">
                            <h5>Amazing Ankara print arrangement</h5>
                            <p>Decorate your wardrobe with our beautiful collection</p>
                        </section>
                    </section>
                    <!-- The third carouse item -->
                    <section class="carousel-item">
                        <img src="images/carou5 (Copy).jpg" class="d-block w-100" alt="img3">
                        <!--Holds the carousel write up-->
                        <section class="carousel-caption d-none d-md-block">
                            <h5 class="text-dark bg-white">Planning to attend a Wedding</h5>
                            <p class="text-dark bg-white">We are experts in ankara wedding oufits</p>
                        </section>
                    </section>
                </section>
                <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </section>

            <!--The third column-->
            <section class="col-md-6 col-sm-6 col-lg-2" id="third">
                <!--Content of the Third column-->
                <section class="card">
                    <!--Holds the youtube link and its container-->
                    <iframe class="card color responsive-item h-100 w-100" src="https://www.youtube.com/embed/HkBVUHBkVvc"></iframe>
                    <!--Hold the write up below the youtube frame-->
                    <section class="card-body bottom">
                        <h6 class="card-title text-dark">Be the first to view our 2020 designs</h6>
                    </section>
                </section>
                <section class="card">
                    <!--Holds the youtube link and its frame-->
                    <iframe class="color embed-responsive-item h-50" src="https://www.youtube.com/embed/rUSBQGwC4io"></iframe>
                    <section class="card-body bottom">
                        <h6 class="card-title text-dark">An insigth to our amazing collection</h6>
                    </section>
                </section>
                <p class="text-primary list">Anita brand was originated in Nigeria and meant to inspire many into the world of African fashion</p>
            </section>
        </section>
        <hr>

        <!--Container that holds the image of the catalog section-->
        <section class="container">
            <section class="row list container">
                <!--The first column-->
                <!--Content of the first column-->
                <section class="card col-md-4 bottom">
                    <img class="card-img" src="images/s4 (Copy).jpg" alt="Card image">
                    <section class="card-img-overlay">
                        <h4 class="card-title text-white">Annies Trendz</h4>
                        <p class="card-text text-white">Mens Catalog</p>
                        <a href="men.php" class="btn-lg btn-block nav-link btn color text-white btn-primary btn-outline-primary">FOR MEN</a>
                    </section>
                </section>
                <!--The second column-->
                <!--Content of the second column-->
                <section class="card col-md-4 bottom">
                    <img class="card-img" src="images/g2 (Copy).png" alt="Card image">
                    <section class="card-img-overlay">
                        <h4 class="card-title text-white">Annies Trendz</h4>
                        <p class="card-text text-white">Couples Goal</p>
                        <a href="couples.php" class="btn-lg btn-block nav-link btn color text-white btn-primary btn-outline-primary">FOR COUPLES</a>
                    </section>
                </section>
                <!--The third column-->
                <!--Content of the third column-->
                <section class="card col-md-4 bottom">
                    <img class="card-img" src="images/h3 (Copy).jpg" alt="Card image">
                    <section class="card-img-overlay">
                        <h4 class="card-title text-white">Annies Trendz</h4>
                        <p class="card-text text-white">Womens Catalog</p>
                        <a href="women.php" class="btn-lg btn-block nav-link btn color text-white btn-primary btn-outline-primary">FOR WOMEN</a>
                    </section>
                </section>
            </section>
        </section>
        <p class="color text-white"> Fashion Features If You’re Still Having ‘The Ankara Is Ours’ Conversations As An African, This Is For You! Ankara Has Become The Fashion Force Holding Us Together, Appropriation Talks Aside If you’ve ever worn Ankara as a Nigerian/African and
            you join in the conversation of appropriation whenever you see a ‘non-African’ work with or wear the same, now is the time for a bit of reflection! </p>
        <section class="row list container-fluid bottom">
            <!--The first column-->
            <!--Content of the first column-->
            <img src="images/f14.jpg" alt="..." class="img-thumbnail col-sm-3">
            <!--The second column-->
            <!--Content of the second column-->
            <img src="images/f4.jpg" alt="..." class="img-thumbnail col-sm-3">
            <!--The third column-->
            <!--Content of the third column-->
            <img src="images/f3.jpg" alt="..." class="img-thumbnail col-sm-3">
            <!--The forth column-->
            <!--Content of the forth column-->
            <img src="images/f2.jpg" alt="..." class="img-thumbnail col-sm-3">
        </section>

        <p class="text-white color">The most iconic of all fabrics recognised round the whole world, today, is Ankara, with printed skirts in multiple lovely colours and designs inspired by Annie trends</p>

        <section class="row container-fluid bottom list">
            <img src="images/carou1.jpg" class="img-thumbnail img-responsive color col-lg-6">
            <section class="col">
                <!--Creates a header tag for the header-->
                <h1 class="spacing">In Store Collection Available</h1>
                <!--Assigns a class to identify each paragraph for styling-->
                <h5 class="list">See These Latest Ankara Styles That Will Change Your Appearance</h5>
                <p class="list">
                    If you're searching for a new weekend go-to, then stop right here. Our sleeveless high neck African print maxi dress is perfect for all your new season needs. Get ready for any weather with our African print turtleneck dress, either dress it down with
                    some chunky trainers or keep it chic with your favourite pair of heels. Whatever your plans our turtleneck African dress needs a starring role in your wardrobe.</p>
                <p class="text-danger font-weight-bold">Price: €39.99 each</p>
                <!-- the hr tag creates the line seperator -->
                <hr>
                <h4 class="spacing">Choose delivery or pickup</h4>
                <hr>
                <form action="form.php">
                    <!--Creates a drop down selection menu with a label named order type-->
                    <label for="orderType" id="decision">Order Type</label>
                    <select name="delivery" id="orderType">
                    <!--Provides options within the drop down menu-->
					<option value="">Delivery</option>
                    <option value="">Pickup</option>
                    <!--Closing tag for the selection-->
				    </select>
                    <button class="btn color text-white btn-primary btn-outline-primary" type="submit">Order Now</button>
                    <!--Closing tag for the form-->
                </form>
                <!--Closing tag for the entire section-->
            </section>
        </section>
        <!--A ul tag-->
        <ul class="list">
            <p class="font-weight-bold font-italic list">FEATURES</p>
            <li>1. Turtleneck African print maxi length dress </li>
            <li>2. Cut from 100% African wax print cotton which has no stretch </li>
            <li>3. Sleeveless design, length is 60" approx. </li>
            <li>4. Handmade, unlined with side pockets </li>
            <li>5. Invisible side zip closure that can be unzipped to reveal a side slit </li>
            <li>6. Handmade in Nigeria</li>
            <li>7. Models are 5’6” tall and wears a SMALL and a LARGE.</li>
        </ul>
        <!--A ul tag-->
        <ul class="list">
            <p class="font-weight-bold font-italic list">HOW TO CARE FOR AFRICAN FABRICS</p>
            <li>1. Hand wash separately using a mild detergent. </li>
            <li>2. Press on the reverse side with a cool iron. </li>
            <li>3. Do not machine wash. </li>
            <li>4. Do not bleach. </li>
        </ul>

    </main>
    <!--The footer tag-->
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