<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Orders</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
  <h1>Orders</h1>
  <table>
    <tr>
      <th>Order ID</th>
      <th>Customer Name</th>
      <th>Shipping Address</th>
      <th>Total Price</th>
      <th>Status</th>
      <th>Action</th>
    </tr>
    <% for (Order order : orders) { %>
      <tr>
        <td>${order.getOrderId()}</td>
        <td>${order.getCustomerName()}</td>
        <td>${order.getShippingAddress()}</td>
        <td>${order.getTotalPrice()}</td>
        <td>${order.getStatus()}</td>
        <td>
          <form action="order" method="POST">
            <input type="hidden" name="orderId" value="${order.getOrderId()}">
            <select name="status">
              <option value="Pending">Pending</option>
              <option value="Shipped">Shipped</option>
              <option value="Delivered">Delivered</option>
            </select>
            <input type="submit" value="Update">
          </form>
        </td>
      </tr>
    <% } %>
  </table>
</body>
</html>
