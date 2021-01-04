var controller = {
    init : function(){
        this.bindEvent();
    },
    bindEvent : function(){
        //用户登录
        $("#login").bind("click",function () {
            var obj = {};
            obj.username = $("#username").val();
            obj.password = $("#password").val();
            $.ajax({
                type: "post",
                url: "http://127.0.0.1:9001/user/login",
                async: true,
                contentType: 'application/json',
                dataType: 'JSON',
                crossDomain: true, //允许跨域
                data: JSON.stringify(obj),//将对象转为json字符串
                success: function(obj) {
                    alert("登录成功。");
                }
            });
        });

        //用户注册
        $("#regist").bind("click",function () {
            var obj = {};
            obj.username = $("#username").val();
            obj.password = $("#password").val();
            $.ajax({
                type: "post",
                url: "http://127.0.0.1:9001/user/regist",
                async: true,
                contentType: 'application/json',
                dataType: 'JSON',
                crossDomain: true, //允许跨域
                data: JSON.stringify(obj),//将对象转为json字符串
                success: function(obj) {
                    alert("注册成功。");
                }
            });
        });
    }
};

controller.init();