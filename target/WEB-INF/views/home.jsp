html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" integrity="sha256-MfvZlkHCEqatNoGiOXveE8FIwMzZg4W85qfrfIFBfYc= sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
<link href="resources/cascade.css" rel="stylesheet">
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */
   body{ background: #6699FF;}
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    .carousel{
   /*  background: #2f4357; */
    margin-top: 20px;
}
    .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }
  
  #img
    {
    	height: 75px;
    	width: 100px;
    	margin-top:-11    }
  </style>
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
      <a class="navbar-brand" href="#">
       <!-- <img id="img" alt="abc" src="resources/logoo.JPG"></a> -->
       
       <img id="img" alt="abc" src="resources/images/logoo.JPG"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="aboutus">About</a></li>
        <li><a href="datatable">Products</a></li>
        <li><a href="contactus">Contact</a></li>
        <li><a href="stock"> Stock</a></li>
       
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="registration"><span class="glyphicon glyphicon-user"></span> Sign up</a></li>
      </ul>
    </div>
  </div>
</nav>

<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
      <img src="resources/images/ethnic.jpg" alt="image zero" />
        
   
      </div>

      <div class="item">
        <img src="resources/images/ethnic.jpg" alt="image one">
      </div>
      
      <div class="item">
        <img src="resources/images/vero.jpg">
      </div>
      
      <div class="item">
        <img src="resources/images/winter.png">
      </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
 <div class="row">
<div class="col-md-6"></div>

<iframe align="right" style="padding-top:20px" width="300" height="300" src="https://www.youtube.com/embed/jkertd85MZw" frameborder="0" allowfullscreen></iframe></div>
</div>
 
 
 <nav class ="navbar navbar-inverse navbar-fixed-bottom">
  <div class="container">
  <p class = "navbar-text">&copy2016 www.com. All rights reserved.</p>
  <p class="txt-railway"> </p>
    <p class="pull-right">
 
   				
                <a href="https://www.facebook.com/bootsnipp"><i id="social-fb" style="padding-right:10px" class="fa fa-facebook-square fa-2x social"></i></a>
	            <a href="https://twitter.com/bootsnipp"><i id="social-tw"style="padding-right:10px" class="fa fa-twitter-square fa-2x social"></i></a>
	            <a href="https://plus.google.com/+Bootsnipp-page"><i id="social-gp" style="padding-right:10px" class="fa fa-google-plus-square fa-2x social"></i></a>
	            <a href="mailto:bootsnipp@gmail.com"><i id="social-em" class="fa fa-envelope-square fa-2x social"></i></a></p>
</div>
</nav>


