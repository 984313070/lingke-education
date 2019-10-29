<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
</head>
<body>
<form id="userFormId">
    <input type="hidden" name="id" value="${user.id}">
    <table align="center">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="userName" value="${user.userName}"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="passWord" value="${user.passWord}"></td>
        </tr>
        <tr>
            <td>邮箱</td>
            <td><input type="text" name="email" value="${user.email}"></td>
        </tr>
        <tr>
            <td>网名</td>
            <td><input type="text" name="nickName" value="${user.nickName}"></td>
        </tr>
        <tr>
            <td>注册时间</td>
            <td><input type="date" name="regTime" value="${user.regTime}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="button" onclick="save()" value="修改"></td>
        </tr>
    </table>
</form>
</body>
<script>
    function save() {
        $.ajax({
            url:'save',
            type:'post',
            data:$("#userFormId").serialize(),
            success:function (){
                alert("修改成功");
                location.href = "findAll";
            }
        })
    }
</script>
</html>