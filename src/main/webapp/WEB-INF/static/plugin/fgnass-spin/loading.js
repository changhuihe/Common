var opts = {
	lines : 14, // 花瓣数目
	length : 7, // 花瓣长度
	width : 18, // 花瓣宽度
	radius : 44, // 花瓣距中心半径
	scale : 0.8,// 比例
	corners : 1, // 花瓣圆滑度 (0-1)
	rotate : 19, // 花瓣旋转角度
	fadeColor : 'transparent',// CSS颜色或颜色数组
	direction : 1, // 花瓣旋转方向 1: 顺时针, -1: 逆时针
	opacity : 0.25,// 行的不透明度
	color : '#ffffff', // 花瓣颜色
	speed : 0.9, // 花瓣旋转速度
	trail : 42, // 花瓣旋转时的拖影(百分比)
	fps : 20,// 使用的setTimeout（）作为在IE 9回退时每秒帧
	shadow : false, // 花瓣是否显示阴影
	hwaccel : false, // spinner 是否启用硬件加速及高速旋转
	className : 'spinner', // spinner css 样式名称
	zIndex : 2e9, // spinner的z轴 (默认是2000000000)
	top : '50%', // spinner 相对父容器Top定位 单位 px
	left : '50%'// spinner 相对父容器Left定位 单位 px
};

var spinner = new Spinner(opts);

// 显示loading
function showLoad() {
	// 设置一个div用于生产加载图标和遮罩层
	$("body")
			.append(
					"<div id='parentLoad'><div id='loadDiv'></div><div id='shadow'></div></div>");
	// 设置遮罩层
	$("#shadow").css({
		"display" : "none",
		"height" : "100%",
		"width" : "100%",
		"position" : "fixed",
		"*position" : "absolute",
		"*height" : "1380px",
		"background" : "black",
		"top" : "0",
		"left" : "0",
		"opacity" : "0.6"
	})
	$("#shadow").css("display", "block");// 显示遮罩层
	var target = $("#loadDiv").get(0);
	spinner.spin(target);// 请求时spinner出现
}

// 隐藏loading
function hideLoad() {
	$("#shadow").css("display", "none");// 隐藏遮罩层
	spinner.spin();// 关闭spinner
}