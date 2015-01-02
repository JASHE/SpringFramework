<html>
<head>
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css" />
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<title>Login</title>
</head>
<body>
<script>
	$(document).ready(function(){
		$("#loginBtn").click(function(){
			var userName = $("#userName").val();
			var password = $("#password").val();
			if(userName == null || userName == ''){
				alert('Please Enter user name');
			} else if(password == null || password == ''){
				alert('Please Enter Password');
			} else {
				$("#form1").submit();
			}
		});
	});
</script>
<div id="container" style="width:100%;height:100%;">

<div id="header" style="height:15%;width:100%;" class="header">
<h1>WELCOME</h1>
</div>

<div id="body" class="body" style="width:100%;height:85%;">
<section class="container">
    <div>
      <h1>Please Login to Web App</h1>
      <form method="post" action="welcome.php" id="form1">
        <p><input type="text" name="login" value="" placeholder="Username or Email" id="userName"></p>
        <p><input type="password" name="password" value="" placeholder="Password" id="password"></p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="button" name="commit" value="Login" id="loginBtn">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="reset" value="Reset"></p>
      </form>
    </div>
  </section>
</div>

<div id="footer" style="height:5%;width:100%;" class="header">
 Copyright. All Rights Reserved.
</div>

</div>
 </body>
</html>