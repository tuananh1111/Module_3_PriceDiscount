<%--
  Created by IntelliJ IDEA.
  User: Pro 2004
  Date: 10/29/2020
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<head>
    <title>Product Discount Calculator</title>
</head>
<br>
<h2>Product Discount Calculator</h2>
<form action="/discount" method="post">
    <label for="describe">Product Description: </label></br>
    <input type="text" name="des" id="describe" placeholder="Miêu tả sản phẩm"></br>
    <label for="list">List price</label></br>
<input type="text" name="price" id="list" placeholder="Giá niêm yết"></br>
<label for="percent">Discount Percent</label></br>
<input type="text" name="discount" id="percent" placeholder="Tỷ lệ chiết khấu"></br>
<input type="submit" id="submit" value="Submit" style="background-color: yellowgreen"/>
</form>
</body>
</html>
