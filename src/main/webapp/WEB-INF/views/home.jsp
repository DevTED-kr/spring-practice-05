<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h4>Send Email</h4>
    <form action="mailSending.do" method="post">
      <div>
        <input type="text" name="tomail" size="120"
        style="width: 100%" placeholder="reciver email"
        class="form-control">
      </div>
      <div align="center">
        <!-- 제목 -->
        <input type="text" name="title" size="120"
        style="width: 100%" placeholder="Enter title"
        class="form-control">
      </div>
        <p>
          <div align="center">
          <!-- 내용 -->
            <textarea name="content" cols="120" rows="12"
            style="width: 100%; resize: none" placeholder="content"
            class="form-control"></textarea>
          </div>
        <p>
      <div align="center">
        <input type="submit" value="send" class="btn btn-warning">
      </div>
    </form>
</body>
</html>
