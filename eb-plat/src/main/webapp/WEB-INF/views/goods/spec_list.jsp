<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge;chrome=1" />
    
    <title>管理后台</title>
    <link href="${pageContext.request.contextPath}/static/ui-v2/css/skin_0.css" rel="stylesheet" type="text/css" id="cssfile" />

    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.validation.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/admincp.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.cookie.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/common.js"></script>
    
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-ui/ui/jquery-ui.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-ui/themes/ui-lightness/jquery-ui.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/ui-v2/jquery.edit.js" />

	<script type="text/javascript">
	        var APP_BASE = '${pageContext.request.contextPath}';
	        LOADING_IMAGE = "${pageContext.request.contextPath}/res/images/loading.gif";
	</script>
	    
	<script type="text/javascript">
	    $(function(){
	        $('#ncsubmit').click(function(){
	            $('#formSearch').submit();
	        });
	    });
	    function delSpec(){
	        var items = $("input[name='ids']:checked").length;
	        if (items==0) {
	            alert("请至少选择一个要删除的项目");
	        }else{
	            if(confirm('您确定要删除吗?')){
	                $('#form_list').submit();
	            }
	        }
	    }
	    function delRow(id){
	        if(confirm('您确定要删除吗?')) {
	        	$("#id").val(id);
	            $('#form_list').submit();
	        }
	    }
	</script>
</head>
<body>
<div id="append_parent"></div>
<div id="ajaxwaitid"></div>
<div class="page">
    <div class="fixed-bar">
        <div class="item-title">
            <h3>规格管理</h3>
            <ul class="tab-base">
                <li><a class="current" href="JavaScript:void(0);"><span>管理</span></a></li>
                <li><a href="${pageContext.request.contextPath}/spec/form"><span>新增</span></a></li>
            </ul>
        </div>
    </div>
    <div class="fixed-empty"></div>
    <form method="get" name="formSearch" id="formSearch" action="${pageContext.request.contextPath}/spec">
        <input type="hidden" name="page" value="${page }">
    </form>
    <table id="prompt" class="table tb-type2">
        <tbody>
        <tr class="space odd" style="background: rgb(255, 255, 255);">
            <th colspan="12" class="nobg"> <div class="title">
                <h5>操作提示</h5>
                <span class="arrow"></span> </div>
            </th>
        </tr>
        <tr class="odd" style="display: none;">
            <td><ul>
                <li>规格将会对应到商品发布的规格，规格值由店铺自己添加。</li>
                <li>默认安装中会添加一个默认颜色规格，请不要删除，只有这个颜色规格才能在商品详细页显示为图片。</li>
            </ul></td>
        </tr>
        </tbody>
    </table>
    <form id="form_list" method="get" action="${pageContext.request.contextPath}/spec/delete">
    	<input type="hidden" name="id" id="id">
        <table class="table tb-type2">
            <thead>
            <tr class="thead">
                <th>排序</th>
                <th>规格</th>
                <th class="align-center">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${specList }" var="spec">
            <tr class="hover edit" style="background: rgb(255, 255, 255);">
                <td class="w48 sort">
                    <span class=" editable" maxvalue="255" title="可编辑" datatype="pint" fieldid="${spec.id }" fieldname="spSort" modurl="${pageContext.request.contextPath}/spec/modifySort" nc_type="inline_edit">1</span>
              	</td>
                <td class=""><span>${spec.title }</span></td>
                <td class="w96 align-center"><a href="${pageContext.request.contextPath}/spec/form?id=${spec.id }">编辑</a> | <a href="javascript:void(0)" onclick="delRow('${spec.id }')">删除</a> </td>
            </tr>
            </c:forEach>
            <tr class="hover edit">
                <td class="w48 sort">
                    <span class=" " maxvalue="255">0</span>
              	</td>
                <td class=""><span>颜色</span></td>
                <td class="w96 align-center"><a href="http://b2b2c.leimingtech.com/leimingtech-admin/goods/spec/forward?id=1">编辑</a>  </td>
            </tr>
            </tbody>
            <tfoot>
            <tr>
                <td colspan="3">
				<div class="pagination">
				    <ul><li></li>
				    	<li><span>首页</span></li>
				        <li><span class="currentpage">1</span></li>
				        <li><a class="demo" href="javascript:void(0);" onclick="turnOverPage(2)"><span>2</span></a></li>
				        <li><a class="demo" href="javascript:void(0);" onclick="turnOverPage(2)"><span>下一页</span></a></li>
				        <li><a class="demo" href="javascript:void(0);" onclick="turnOverPage(2)"><span>末页</span></a></li>
				        <script language="javascript">
				            function turnOverPage(no) {
				                var queryForm = document.formSearch;
				                if (no >2) {
				                    no =2;
				                }
				                if (no < 1) {
				                    no = 1;
				                }
				                queryForm.page.value=no;
				                queryForm.submit();
				            }
				        </script>
				    </ul>
				</div>
                </td>
            </tr>
            <tr></tr>
            </tfoot>
        </table>
    </form>
</div>


</body>
</html>