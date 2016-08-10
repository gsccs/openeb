<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge;chrome=1">
    
    <title>管理后台</title>
    <link href="${pageContext.request.contextPath}/static/ui-v2/css/skin_0.css" rel="stylesheet" type="text/css" id="cssfile" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.validation.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/admincp.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/common.js"></script>
	
	<script type="text/javascript">
		var APP_BASE = '${pageContext.request.contextPath}';
		LOADING_IMAGE = "${pageContext.request.contextPath}/res/images/loading.gif";
	</script>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-ui/ui/jquery-ui.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-ui/themes/ui-lightness/jquery-ui.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.edit.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.seller_menu_class.js"></script>
	<script type="text/javascript">
	var vadate=false;
	function delClass(){
	    var items = $("input[name='ids']:checked").length;
	    if (items==0) {
	        alert("您确定要删除吗?");
	    }else{
	        if(confirm('请至少选择一个要删除的项目')){
	            $('#form_list').submit();
	        }
	    }
	}
	
	function delClassid(classid){
	       //校验菜单底线是否含有子菜单
	       valicountparent(classid);
	       if(vadate){
	           if(confirm('您确定要删除吗?')){
	           var url = "/leimingtech-admin/shopSellerMenu/deleteid";
			   var para = {"classid":classid};
			   $.ajax({
		             type: "post",
		             url: url,
		             data: para,
		             dataType: "json",
					 async:false,
					 success:function(data) {
						if(data.success == "true"){
							 alert(data.result);
						     window.location = '/leimingtech-admin/shopSellerMenu/list'
						}else{
							 alert(data.result);
						}
					}	
		         });
		       }
		     }else{
		         alert("请删除子菜单后再进行删除！");
		     }  
	    }
	function valicountparent(classid){
	   var url = "/leimingtech-admin/shopSellerMenu/validateparentid";
	   var para = {"id":classid};
	   var va=
	   $.ajax({
	             type: "post",
	             url: url,
	             data: para,
	             dataType: "json",
				 async:false,
				 success:function(data) {
					if(data){
					    vadate=true;
					    return true;
					}else{
					    vadate=false;
						return false;
					}
				}	
	         });
	   }  
	</script>
</head>

<body>
<div id="append_parent"></div>
<div id="ajaxwaitid"></div>
<div class="page">
    <div class="fixed-bar">
        <div class="item-title">
            <h3>店铺菜单管理</h3>
            <ul class="tab-base">
                <li><a href="JavaScript:void(0);" class="current"><span>管理</span></a></li>
                <li><a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=0"><span>新增</span></a></li>
            </ul>
        </div>
    </div>
    <div class="fixed-empty"></div>
    <table class="table tb-type2" id="prompt">
        <tbody>
        <tr class="space odd" style="background: rgb(255, 255, 255);">
            <th colspan="12"><div class="title"><h5>操作提示</h5><span class="arrow"></span></div></th>
        </tr>
        <tr class="odd" style="display: none;">
            <td>
                <ul>
                    <li></li>
                </ul>
            </td>
        </tr>
        </tbody>
    </table>
    <form method="post" id="form_list" action="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/delete">
        <table class="table tb-type2">
            <thead>
            <tr class="thead">
	            <th class="w48"></th>
	            <th class="w50pre">菜单管理</th>
	            <th>链接</th>
	            <th>显示</th>
	            <th>权限标识</th>
	            <th>操作</th>
	        </tr>
            </thead>
            <tbody>
	            <tr class="hover edit" style="background: rgb(255, 255, 255);">
	            	<td class="w48"><input type="checkbox" name="mIds" value="18" class="checkitem">
		                    <img fieldid="18" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  商品管理
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=18"><span>新增下级</span></a>
		            </td>
	                <td>
	                	
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=18&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;18&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit" style="background: rgb(255, 255, 255);">
	            	<td class="w48"><input type="checkbox" name="mIds" value="28" class="checkitem">
		                    <img fieldid="28" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  交易管理
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=28"><span>新增下级</span></a>
		            </td>
	                <td>
	                	 
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=28&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;28&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit" style="background: rgb(255, 255, 255);">
	            	<td class="w48"><input type="checkbox" name="mIds" value="35" class="checkitem">
		                    <img fieldid="35" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  促销管理
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=35"><span>新增下级</span></a>
		            </td>
	                <td>
	                	 
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=35&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;35&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit">
	            	<td class="w48"><input type="checkbox" name="mIds" value="38" class="checkitem">
		                    <img fieldid="38" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  店铺设置
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=38"><span>新增下级</span></a>
		            </td>
	                <td>
	                	 
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=38&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;38&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit">
	            	<td class="w48"><input type="checkbox" name="mIds" value="43" class="checkitem">
		                    <img fieldid="43" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  客服管理
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=43"><span>新增下级</span></a>
		            </td>
	                <td>
	                	consult/index
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=43&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;43&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit" style="background: rgb(251, 251, 251);">
	            	<td class="w48"><input type="checkbox" name="mIds" value="46" class="checkitem">
		                    <img fieldid="46" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  统计结算
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=46"><span>新增下级</span></a>
		            </td>
	                <td>
	                	 
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=46&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;46&#39;)">删除</a>
	                </td>
	            </tr>
	            <tr class="hover edit" style="background: rgb(255, 255, 255);">
	            	<td class="w48"><input type="checkbox" name="mIds" value="52" class="checkitem">
		                    <img fieldid="52" status="open" nc_type="flex" level="1" src="./管理后台-店铺菜单_files/tv-expandable.gif">
		            </td>
		            <td class="w50pre name">
		                  账号
		                <a class="btn-add-nofloat marginleft" href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=0&amp;menuParentId=52"><span>新增下级</span></a>
		            </td>
	                <td>
	                	 
	                </td>
	                <td>
	                	1
	                </td>
	                <td>
	                	
	                </td>
	                <td class="w84">
	                    <a href="http://b2b2c.leimingtech.com/leimingtech-admin/shopSellerMenu/forward?menuId=52&amp;menuParentId=0">编辑</a>
	                    &nbsp;|&nbsp;
	                    <a href="javascript:;" onclick="delClassid(&#39;52&#39;)">删除</a>
	                </td>
	            </tr>
            </tbody>
            <tfoot>
	            <tr class="tfoot">
		            <td><input type="checkbox" class="checkall" id="checkallBottom"></td>
		            <td colspan="8">
		            	<label for="checkallBottom">全选</label>
		                &nbsp;&nbsp;
		                <a href="JavaScript:void(0);" class="btn" onclick="delClass()"><span>删除</span></a>
		             </td>
	            </tr>
            </tfoot>
        </table>
    </form>
</div>


</body></html>