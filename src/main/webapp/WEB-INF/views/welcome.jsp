<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>
<h2>Welcome to the tennis player database!</h2>
<form action="/player.do" method="POST">
    <b>Player name:</b>
    <input type="text" name="name"/>
    <input type="submit" value="Enter"/>
</form>
<h3>Player name: <i>${name}</i></h3>
</body>
</html>