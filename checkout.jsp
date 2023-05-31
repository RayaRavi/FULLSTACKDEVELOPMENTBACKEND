<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Checkout</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h1>Checkout</h1>
  <form action="confirm.jsp" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="address">Address:</label>
    <textarea id="address" name="address" required></textarea><br><br>

    <input type="submit" value="Place Order">
  </form>
</body>
</html>
