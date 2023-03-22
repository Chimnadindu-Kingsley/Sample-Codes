<!DOCTYPE html>
<html>

<head>
    <!--Used to define the character set the browser will utilize -->
    <meta charset="UTF-8">
    <!--Assigns a title-->
    <title>Buy1</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Links the css style sheet to the html page -->
    <link rel="stylesheet" href="css/style.css">
</head>

<body>
    <header>
        <!--First column to hold the nav bar-->
        <section class="col container-fluid" id="head">
            <!--nav bar properties-->
            <nav class="navbar navbar-expand-lg navbar-dark color">
                <a class="navbar-brand" href="index.php">Annie Trends</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                      <span class="navbar-toggler-icon"></span>
                    </button>
                <!--Nav bar item-->
                <section class="collapse navbar-collapse" id="navbarSupportedContent">
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
        </section>
        <br/>
    </header>
    <main>
        <!-- main tag houses the main content of the page. -->
        <section class="container" id="checkout">
            <h1>Checkout</h1>
            <!-- below is the form to collect vital details to make important decision -->
            <form action="checkout.php">
                <!-- the fieldset tag is used to differentiate the kind of information we are getting from the form, it creats the border line around the form.  -->
                <!-- the first fieldset helps the user know, we are looking at getting the dellivery information and the second fieldset tells the user we are consentrating on the payment information; -->
                <fieldset>
                    <legend>Delivery Information</legend>
                    <!-- legend tag us used alongside fieldset to define what the field is all about. -->
                    <label for="delivery_date">Delivery date</label>
                    <input type="date" name="date" value="" id="delivery_date">

                    <label for="firstname">Recipient Firstname</label>
                    <input type="text" name="firstname" value="" id="firstname">
                    <label for="lastname">Recipient Lastname</label>
                    <input type="text" name="lastname" value="" id="lastname">
                    <label for="address1">Address 1</label>
                    <input type="text" name="address1" value="" id="address1">
                    <label for="address2">Address 2</label>
                    <input type="text" name="address2" value="" id="address2">
                    <label for="town">Town/City</label>
                    <input type="text" name="town" value="" id="town">
                    <label for="country">Country</label>
                    <input type="text" name="country" value="" id="country">
                    <label for="eircode">Eircode</label>
                    <input type="text" name="eircode" value="" id="eircode">
                    <label for="delivery_instruction">Special Delivery Instructions</label>
                    <textarea name="delivery_instruction" id="delivery_instruction" rows="7" cols="70"></textarea>
                </fieldset>
                <fieldset>
                    <legend>Payment Information</legend>
                    <label>Card Name</label>
                    <input type="text" name="cardname" value="" id="cardname">
                    <label>Card Number</label>
                    <input type="text" name="cardnum" value="" id="cardnum">
                    <label>Expiry month</label>
                    <!-- the select tag is used to create a dropdown menu to select from -->
                    <div class="">
                        <!-- this div tag is used to ensure both select element are inline with each other, and align properly. -->
                        <select id="month" name="month">
							<!-- the above select tag will display the months. each option has a value which can be gotten using Javascript or PHP etc -->
							<option value="1">01 - January</option>
							<option value="2">02 - February</option>
							<option value="3">03 - March</option>
							<option value="4">04 - April</option>
							<option value="5">05 - May</option>
							<option value="6">06 - June</option>
							<option value="7">07 - July</option>
							<option value="8">08 - August</option>
							<option value="9">09 - September</option>
							<option value="10">10 - October</option>
							<option value="11">11 - November</option>
							<option value="12">12 - December</option>
                        </select>
                    </div>
                    <div class="clear"></div>
                    <label>Expiry year</label>
                    <!-- the select tag is used to create a dropdown menu to select from -->
                    <div class="">
                        <!-- this div tag is used to ensure both select element are inline with each other, and align properly. -->
                        <select id="year" name="year">
							<!-- the above select tag will display the year. each option has a value which can be gotten using Javascript or PHP etc -->
							<!-- <option value="">Year</option> -->
							<option value="2018">2018</option>
							<option value="2019">2019</option>
							<option value="2020">2020</option>
							<option value="2021">2021</option>
							<option value="2022">2022</option>
							<option value="2023">2023</option>
							<option value="2024">2024</option>
							<option value="2025">2025</option>
						</select>
                    </div>
                    <div class="clear"></div>
                    <label>Credit Card Type</label>
                    <div id="card">
                        <input type="radio" name="creditcard" value="visa"> Visa
                        <input type="radio" name="creditcard" value="master card"> Master Card
                    </div>
                </fieldset>
            </form>
            <div class="clear"></div>
            <input class="btn color text-white btn-primary btn-outline-primary" type="submit" name="submit" value="Place Order">
        </section>
    </main>
    <footer class="section container-fluid footer-classic context-dark bg-primary">
        <section class="row row-40">
            <section class="pr-xl-4 col-md-4 col-xl-5">
                <a class="brand" href="index.html"><img class="brand-logo-light" src="images/logo.jpg" alt="" width="140" height="100" srcset="images/agency/logo-retina-inverse-280x74.png 2x"></a>
                <p>We are an award-winning creative fashion designers, dedicated to give the best result African designs</p>
                <!-- Rights-->
                <p class="rights"><span>©  </span><span class="copyright-year">2020</span><span> </span><span>Company</span><span> - </span><span>All Rights Reserved.</span></p>
            </section>
            <section class="col-md-4">
                <h4 class="font-italic">Contacts</h4>
                <dl class="contact-list">
                    <dt>Address:</dt>
                    <dd>Dublin city center Ireland</dd>
                </dl>
                <dl class="contact-list">
                    <dt>email:</dt>
                    <dd><a href="mailto:#">nckh117@email.com</a></dd>
                </dl>
                <dl class="contact-list">
                    <dt>phones:</dt>
                    <dd><a href="tel:#">08754852454</a> <span>or</span> <a href="tel:#">08145659875</a>
                    </dd>
                </dl>
            </section>
            <section class="col-md-4 col-xl-3">
                <h4 class="font-italic">Links</h4>
                <ul class="nav-list">
                    <li><a href="about.php">About</a></li>
                    <li><a href="#">Catalog</a></li>
                    <li><a href="#">Blog</a></li>
                    <li><a href="#">Contacts</a></li>
                    <li><a href="#">On Sales</a></li>
                </ul>
            </section>
        </section>
        <section class="row no-gutters social-container">
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-facebook"></span><span>Facebook</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-instagram"></span><span>Instagram</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-twitter"></span><span>Twitter</span></a></section>
            <section class="col"><a class="social-inner" href="#"><span class="icon mdi mdi-youtube-play"></span><span>Youtube</span></a></section>
        </section>
    </footer>
</body>

</html>