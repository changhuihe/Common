// 页面加载时初始化
$(function() {
	$(".register_box").hide();
});

// 注册按钮点击事件
function registerOnclick() {

	$(".login_box").hide();// 隐藏登录box
	$("#logname,#logemail,#logpass,#logpass2").val("");// 清空标签值
	$(".register_box").show();
}

// 返回按钮点击事件
function backOnclick() {
	$(".login_box").show();// 隐藏登录box
	$("#name,#password").val("");// 清空标签值
	$(".register_box").hide();
}

// 注册提交数据验证
function confirmOnclick() {
	var name = $("#logname").val();
	var email = $("#logemail").val();
	var password = $("#logpass").val();
	var password2 = $("#logpass2").val();
	if ((name == null || "" == name) && (email == null || "" == email)) {
		layer.open({
			title : '提示',
			content : '请输入用户名或邮箱!',
			skin : 'layui-layer-molv',
			icon : 5
		});
		return false;
	}
	if (password == null || "" == password || password2 == null
			|| "" == password2) {
		layer.open({
			title : '提示',
			content : '请输入用户密码!',
			skin : 'layui-layer-molv',
			icon : 5
		});
		return false;
	}
	if (password != password2) {
		layer.open({
			title : '提示',
			content : '请确定两次输入密码相同!',
			skin : 'layui-layer-molv',
			icon : 5
		});
		return false;
	}
	showLoad();// 显示加载loading
	register();

}
// 注册
function register() {
	var name = $("#logname").val();
	var email = $("#logemail").val();
	var password = $("#logpass").val();
	$.ajax({
		"url" : "/personalSpace/loginController/register",
		"type" : "post",
		"dataType" : "json",
		"data" : {
			"name" : name,
			"email" : email,
			"password" : password
		},
		"success" : function(data) {
			hideLoad();// 隐藏加载loading
			var flag = 5;
			if (data.flag) {
				flag = 6;
			}
			layer.open({
				title : '提示',
				content : data.message,
				skin : 'layui-layer-molv',
				icon : flag,
				yes : function(index, layero) {
					layer.close(index);
					if (data.flag) {
						backOnclick();
					}
				},
				cancel : function(index, layero) {
					if (data.flag) {
						backOnclick();
					}
				}
			});
		}
	});
}

// 注册时输入的字符字段检查
function maxCheck() {
	var name = $("#logname").val();
	var email = $("#logemail").val();// 邮箱检查待定
	var password = $("#logpass").val();
	var pasword2 = $("#logpass2").val();
	if (name.length == 20) {
		layer.open({
			title : '提示',
			content : '用户名最大长度为20',
			skin : 'layui-layer-molv',
			icon : 0
		});
		return false;
	}
	if (password.length == 12 || pasword2.length == 12) {
		layer.open({
			title : '提示',
			content : '密码最大长度为12',
			skin : 'layui-layer-molv',
			icon : 0
		});
	}
}

// 切换时检查最小输入长度
function minCheck() {
	var name = $("#logname").val();
	var email = $("#logemail").val();// 邮箱检查待定
	var password = $("#logpass").val();
	var password2 = $("#logpass2").val();
	if (name.length < 3 && name.length > 0) {
		layer.open({
			title : '提示',
			content : '用户名最小长度为3',
			skin : 'layui-layer-molv',
			icon : 0
		});
		return false;
	}
	if ((password.length < 6 && password.length > 0)
			|| (password2.length < 6 && password2.length > 0)) {
		layer.open({
			title : '提示',
			content : '密码最小长度为6',
			skin : 'layui-layer-molv',
			icon : 0
		});
	}
}

// 登录按钮点击
function loginOnclick() {
	var nameOremail = $("#nameOremail").val();
	var password = $("#password").val();
	if (nameOremail == null || "" == nameOremail) {
		layer.open({
			title : '提示',
			content : '请输入用户名或邮箱!',
			skin : 'layui-layer-molv',
			icon : 5
		});
		return false;
	}
	if (password == null || "" == password) {
		layer.open({
			title : '提示',
			content : '请输入用户密码!',
			skin : 'layui-layer-molv',
			icon : 5
		});
		return false;
	}
	showLoad();// 显示加载loading
	$.ajax({
		"url" : "",
		"type" : "post",
		"dataType" : "json",
		"data" : {
			"nameOremail" : nameOremail,
			"password" : password
		},
		"success" : function(data) {
			hideLoad();// 显示加载loading
			var time = 0;
			if (data.flag) {
				time = 3000;
			}
			layer.open({
				title : '提示',
				content : data.message,
				skin : 'layui-layer-molv',
				time : time
			});
			if (data.flag) {
				$("form").submit();
			}

		}
	});

}