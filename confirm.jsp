<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Order Confirmation</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h1>Order Confirmation</h1>
  <h3>Shipping Details:</h3>
  <p>First Name: ${param.firstName}</p>
  <p>Last Name: ${param.lastName}</p>
  <p>Address: ${param.address}</p>
  <h3>Order Summary:</h3>
  <table>
    <tr>
      <th>Product ID</th>
      <th>Product Name</th>
      <th>Price</th>
    </tr>
    <% for (Product product : cart.getProducts()) { %>
      <tr>
        <td>${product.getId()}</td>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
      </tr>
    <% } %>
    <tr>
      <td colspan="2"><b>Total Price:</b></td>
      <td>${param.totalPrice}</td>
    </tr>
  </table>
</body>
</html>
