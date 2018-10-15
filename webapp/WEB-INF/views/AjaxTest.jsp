<%--
  Created by IntelliJ IDEA.
  User: dainy33
  Date: 10/15/18
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajax</title>
    <script type="text/javascript">
        $.document.ready(function () {
            initData();
        });

        //加载初始化数据
        function initData() {
            $.ajax({
                type: 'GET',
                dataType: "json",
                url: "../user/center",
                /*data:{
                 email:$("#email").val(),
                 password:$("#password").val()
                 },*/
                success: function (res) {
                    alert("加载数据");
                    if (res.code == "0") {
                        console.log(res);
                        alert(res.msg);
                        var info = res.data;

                        $("#name").attr("value", info.name);
                        $("#email").attr("value", info.email);
                        $("#password").attr("value", info.password);
                        $("#phone").attr("value", info.phone);
                        $("#address").attr("value", info.address);
                        $("#birthday").attr("value", info.birthday);
                        $("#picture").attr("src", info.icon);
                    } else {
                        alert("用户信息不合法，或邮箱已被占用");
                    }
                },
                error: function () {
//            $("#test").html("发生错误:"+jqXHR.status);
                    alert("发生错误");
                }
            });
        }
    </script>
</head>
<body>
<form id="ajaxsubmit" method="post" class="form-search">
    <input type="text" value="姓名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '姓名';}"
           required="" id="name" name="name" style="margin-top:10px;" placeholder="姓名">
    <input type="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}"
           required="" id="email" name="email" style="margin-top:10px;" placeholder="Email">
    <div class="col-md-12" style="border:1px solid gainsboro;margin-top:10px;">
        <input type="password" value="123456" onfocus="this.value = '';"
               onblur="if (this.value == '') {this.value = '密码';}" required="" id="password" name="password"
               style="border:none;height:40px;width:80%;background-color: white" placeholder="123456" disabled="true"
               class="col-md-10 input-small">
        <input type="button" value="修改" id="btn" class="col-md-2 btn" style="width:20%;margin-top:2px;">
    </div>

    <input type="text" value="联系电话" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '联系电话';}"
           required="" id="phone" name="phone" style="margin-top:10px;" placeholder="联系电话">
    <input type="text" value="家庭住址" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '家庭住址';}"
           required="" id="address" name="address" style="margin-top:10px;" placeholder="家庭住址">

    <div style="margin-top:10px;border:1px solid lightgrey;height:40px;background-color: #f5f5f5;line-height:40px;"
         class="col-md-12">
        <span class="col-md-3" style="padding-left:0;">出生年月：</span>
        <input type="date" id="birthday"/>
    </div>
    <div id="box-01">
        <input type="submit" value="完善成功" id="submit" style="margin-top:30px;">
    </div>

</form>
</body>
</html>
