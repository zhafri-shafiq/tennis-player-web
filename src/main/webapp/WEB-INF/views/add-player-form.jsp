<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
 <title>Add Player</title>
</head>
<body>
 <h2>Player Form</h2>
 <hr>

 <form:form action = "processPlayerForm" modelAttribute="athlete">
    <br><br>
    Name: <form:input path="lastName"/>

    <br><br>
    Country: <form:select path="country">
        <form:option value="AUT" label="Austria"/>
        <form:option value="FRA" label="France"/>
        <form:option value="SRB" label="Serbia"/>
        <form:option value="SUI" label="Switzerland"/>
        <form:option value="USA" label="United States of America"/>
    </form:select>

    <br><br>
    Handedness:
    Left-Handed <form:radiobutton path="handedness" value="Left-Handed"/>
    Right-Handed <form:radiobutton path="handedness" value="Right-Handed"/>
    Ambidextrous <form:radiobutton path="handedness" value="Ambidextrous"/>

    <br><br>
    Grand Slam Titles Won:
    Australian Open <form:checkbox path="grandSlams" value="Australian Open"/>
    French Open <form:checkbox path="grandSlams" value="French Open"/>
    Wimbledon <form:checkbox path="grandSlams" value="Wimbledon"/>
    US Open <form:checkbox path="grandSlams" value="US Open"/>

    <br><br>
    <input type="submit" value="Add Player"/>

 </form:form>
</body>
</html>