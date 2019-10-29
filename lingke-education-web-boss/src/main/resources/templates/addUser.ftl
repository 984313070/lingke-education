<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

<script type="text/javascript" src="/js/jquery-1.9.1.min.js"></script>
</head>
<body>
    <form id="userFormId">
        <input type="hidden" name="id">
        <table align="center">
            <tr>
                <td>用户名</td>
                <td><input type="text" id="name" name="userName"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="passWord"></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>网名</td>
                <td><input type="text" name="nickName"></td>
            </tr>
            <tr>
                <td>注册时间</td>
                <td><input type="date" name="regTime"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="button" onclick="save()" value="新增"></td>
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
                alert("新增成功");
                location.href = "findAll";
            }
        })
    }
</script>
</html>