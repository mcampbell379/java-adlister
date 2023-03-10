<%--
  Created by IntelliJ IDEA.
  User: emicampbell
  Date: 3/9/23
  Time: 1:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="pizzaOrder.jsp" method="post">
<label for="crust">Choose a crust:</label>
    <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="thick">Thick</option>
    </select>
    <hr>
    <h4>Toppings: </h4>
    <input type="checkbox" id="topping1" name="topping1" value="pepperoni">
    <label for="topping1">Pepperoni</label><br>

    <input type="checkbox" id="topping2" name="topping2" value="mushroom">
    <label for="topping2">Mushroom</label><br>

    <hr>
    <label for="address">Address: </label><br>
    <input type="text" id="address" name="address"><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
