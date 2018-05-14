/**
 * 
 */
$(function(){
	function operateFormatter(value, row, index) {
        return [
            '<button type="button" class="RoleOfEs btn btn-primary btn-xs" style="margin-right:0px;">评估</button>'           
        ].join('');
    };
	
	window.operateEvents = {
			'click .RoleOfEs': function (e, value, row, index) {
				var uri = 'nav/indexL1View/'+row.fProId;
				window.location.href = uri;
			}
	};
	
	$("#prjViewTable").bootstrapTable({	
		'url' : 'nav/projectView/all',
		'classes' : 'table table-hover table-striped table-no-bordered table-condensed',
		'pagination' : true,
		'paginationLoop':false,
		'sidePagination':'server',		
		'showRefresh' : true,
        'search' : true,
        'idField' : 'fProId',
		'columns' : [
			{'field':'fProId', 'title':'', 'visible':false},
			{'field':'xh', 'align': 'center', 'title':'序号', 'width':'5%', formatter:function (value, row, index) {
                return $('#prjViewTable').bootstrapTable('getPage') + index;
            }},
            {'field':'fProUsename', 'title':'项目名称', 'width' : '45%', 'searchable' : true},
            {'field':'fProTitleuser', 'title':'使用权人', 'width' : '35%', 'searchable' : false},
            {'field':'operate', 'title':'操作', 'align':'center', 'width' : '10%', formatter:operateFormatter, events:operateEvents}    
		],
		'queryParams':function(params){
			return {
				pageSize : params.limit,
				pageIndex : params.offset/params.limit,
				proUseName : params.search
			}
		}
	});
});