<%--
  Created by IntelliJ IDEA.
  User: 高贵的ASusi
  Date: 2018/10/15
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>${response}</h1>
<input id="input1">
<input type="button" value="点死我！" onclick="test()"/>
<div>
    <table>
        <tbody id="tbodyID"></tbody>
    </table>
</div>
</body>
<script src="assets/js/jquery-1.8.3.min.js"></script>
<script>
    function test() {
        var data = $("#input1").val();
        alert("aaaw");
        $.post("test.jsp", data, function (list) {
            alert("data:"+data);
            alert("list:"+list);
            alert("list:"+result);
            var tbody = $("#tbodyID")
            tbody.empty();
            var tr = $("<tr></tr>");
            var tds =
                "<td>" + list.localid + "</td>" +
                "<td>" + list.localname + "</td>" +
                "<td>" + list.locallevel + "</td>" +
                "<td>" + list.lcoalbelong + "</td>";
            tr.append(tds);
            tbody.append(tr);
        });
    }
</script>
</html>
