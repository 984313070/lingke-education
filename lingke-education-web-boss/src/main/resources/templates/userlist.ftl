<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>

</head>
<body>
<input type="button" onclick="addUser()" value="新增">
<table border="1">
    <tr>
        <td>主键</td>
        <td>用户名</td>
        <td>密码</td>
        <td>邮箱</td>
        <td>网名</td>
        <td>注册时间</td>
        <td>操作</td>
    </tr>

    <#list page.userList as user>
        <tr >
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.passWord}</td>
            <td>${user.email}</td>
            <td>${user.nickName}</td>
            <td>${user.regTime}</td>
            <td>
               <a href="javaScript:deleteUserById(${user.id})">删除</a>
               <a href="javaScript:updateUserById(${user.id})">修改</a>
            </td>
        </tr>
    </#list>

</table>

<#if page.totalCount !=0>
    <a href="
        <#if page.current != 1>
           /findAll?page=${page.current-1}
        <#else>
            #
        </#if>
        ">上一页</a>
    <#assign start = 1>
    <!--尾页数<=5-->
    <#if page.end lte 5>
        <#list start..page.end as p>
            <a class="<#if page.current == p>current</#if>" href="/items/page/${p}">${p}</a>
        </#list>
    <#else>
        <#assign start = 1 + 4 * ((page.current/4)?ceiling - 1)>
        <#if page.end - start gt 4>
            <#list start..*5 as p>
                <a class="<#if page.current == p>current</#if>" href="/items/page/${p}">${p}</a>
            </#list>
            <a href="#">...</a>
            <a href="/items/page/${page.end}">${page.end}</a>
        <#else>
            <a href="#">...</a>
            <#list start..page.end as p>
                <a class="<#if page.current == p>current</#if>" href="/items/page/${p}">${p}</a>
            </#list>
        </#if>
    </#if>
    <a href="
        <#if page.current != page.end>
            /findAll?page=${page.current+1}
        <#else>
            #
        </#if>
    ">下一页</a>
</#if>
</body>
<script>
    function deleteUserById(id) {
        location.href="deleteUserById?id="+id;
    }
    function updateUserById(id) {
        location.href="findUserById?id="+id;
    }
    function addUser() {
        location.href = "addUser"
    }
</script>
</html>