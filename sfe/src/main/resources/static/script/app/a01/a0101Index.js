/**
 * 
 */
$(function(){	
	
	$("#fsTable").bootstrapTable({	
		'url' : 'a01/a0101/queryAll',
		'classes' : 'table table-hover table-striped table-no-bordered table-condensed',
		'pagination' : true,
        'onlyInfoPagination' : false,
        'pageSize' : 10,
        'search' : true,
        'searchText' : "",		
		'columns' : [
			{'field':'fProId', 'title':'', 'visible':false},
			{'field':'xh', 'title':'序号', 'width':'5%', formatter:function (value, row, index) {
                return index+1;
            }},
            {'field':'fProPosition', 'title':'项目位置', 'width' : '20%', 'searchable' : true},
            {'field':'fProUsename', 'title':'项目名称', 'width' : '35%', 'searchable' : true},
            {'field':'fProTitleuser', 'title':'使用权人', 'width' : '35%', 'searchable' : true}
		]
	});

});