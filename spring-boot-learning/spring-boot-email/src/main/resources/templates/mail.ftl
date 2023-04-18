<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>邮件信息</h1>
<table>
    <tr>
        <td>序号</td>
        <td>标题</td>
        <td>创建时间</td>
    </tr>
    <#list articles as article>
        <tr>
            <td>#{article.id}</td>
            <td>${article.title}</td>
            <td></td>
            <td>${article.createTime?string("yyyy-MM-dd HH:mm:ss")}</td>
        </tr>
    </#list>
</table>
</body>
</html>