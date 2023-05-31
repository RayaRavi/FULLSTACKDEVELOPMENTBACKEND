<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Shopping Cart</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h1>Shopping Cart</h1>
  <table>
    <tr>
      <th>Product</th>
      <th>Price</th>
      <th>Quantity</th>
      <th>Subtotal</th>
    </tr>
    <c:forEach items="${cartItems}" var="item">
      <tr>
        <td>${item.productName}</td>
        <td>${item.price}</td>
        <td>${item.quantity}</td>
        <td>${item.subtotal}</td>
      </tr>
    </c:forEach>
  </table>
  <div class="total">
    <h2>Total: <span id="totalAmount">${totalAmount}</span></h2>
    <a href="checkout.jsp">Proceed to Checkout</a>
  </div>
</body>
</html>
