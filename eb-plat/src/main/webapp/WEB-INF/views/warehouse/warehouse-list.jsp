<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商城仓库列表</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
</head>


<body>
<div class="easyui-layout" fit="true" border="false">
	<div data-options="region:'north',title:'平台订单查询'" style="height: 100px; background: #F4F4F4;">
		<form id="searchForm">
			<table>
			  <tr>
	              <th>卖家名称：</th>
	              <td><input id="title" name="title" value=""/></td>
	              <th>订单状态：</th>
	              <td>
	              	<select id="state" name="state">
	              		<option value="">----- 请选择-----</option>
	              		<option value="1">启用</option>
	              		<option value="0">禁用</option>
	              	</select>
	              </td>
	          	  <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
	          </tr>                     
			</table>
		</form>                                    
	</div>            
	<div data-options="region:'center',split:false">
		<table id="list_data" cellspacing="0" cellpadding="0">
	</table>
	</div>
</div>
<div id="dd"></div>
	<script type="text/javascript">
		var basepath= "${pageContext.request.contextPath}";
		$('#list_data').datagrid({
			title : '商城订单列表列表',
			height : 'auto',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			fit : true,//自动大小 
			loadMsg : '数据加载中请稍后……',
			url : basepath+'/order/datagrid',
			remoteSort : false,
			fitColums : true,
			checkOnSelect : true,
			//singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ],
			columns : [ [ {
				field : 'id',
				title : '订单编号',
				width : 150,
			},{
				field : 'buyer',
				title : '买家',
				width : 150
			},{
				field : 'seller',
				title : '卖家',
				width : 150
			},{
				field : 'totalnum',
				title : '商品总数',
				width : 150
			},{
				field : 'totalfee',
				title : '订单总额',
				width : 150
			},{
				field : 'status',
				title : '订单状态',
				width : 150,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=="WAIT_PAY"){
			    		str = "<font style=''>待支付</font>";
			    	}else if(value=="PAYED"){
			    		str = "<font style=''>已支付</font>";
			    	}else if(value=="SENDED"){
			    		str = "<font style=''>已发货</font>";
			    	}else if(value=="RECEIVED"){
			    		str = "<font style=''>已收货</font>";
			    	}else if(value=="CANCEL"){
			    		str = "<font style=''>取消订单</font>";
			    	}else if(value=="SUCCESSED"){
			    		str = "<font style=''>交易成功</font>";
			    	}
			    	return str;
				}
			}]],
			toolbar : [ {
				text : '修改',
				iconCls : 'icon-edit',
				handler : function() {
					editFun();
				}
			},{
				text : '查看',
				iconCls : 'icon-edit',
				handler : function() {
					viewFun();
				}
			}]
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 10,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
			beforePageText : '第',//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});

		function editFun() {
			$('#dd').dialog({
			    title: '修订订单',
			    width: 600,
			    height:400,
			    closed: false,
			    cache: false,
			    href: '${pageContext.request.contextPath}/brand/create',
			    modal: true,
			    buttons : [ {
					text : '添加',
					handler : function() {
						/* var f = parent.$.modalDialog.handler
								.find('#form'); */
								alert("Form");
						f.submit();
					}
				} ]
			});
		}
		
		
		
	</script>

</body>

</html>
