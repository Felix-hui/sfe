/**
 * 
 */
$(function(){
	function operateFormatter(value, row, index) {
        return [
            '<button type="button" class="RoleOfDel btn btn-primary btn-xs" style="margin-right:0px;">删除</button>'           
        ].join('');
    };  	
	
	function indexFormatter(value, row, index){
    	if (!!!value){
    		return '<button id="btnes_'+this.id+'" type="button" class="RoleOfEs btn btn-primary btn-xs" style="margin-right:0px;">评估</button>' ;
    	} else {
    		return '<button id="btnes_'+this.id+'" type="button" class="RoleOfEs btn btn-link btn-xs" style="margin-right:0px;">'+value+'</button>' ;
    	}
    };
	
    window.operateEvents = {
			'click .RoleOfDel': function (e, value, row, index) {
				var keyId = row["fAssessmentId"];
				$.ajax({
					"url" : "nav/indexL1View/del/"+keyId
				}).then(function(data){
					if (data["msg"] === "success"){
						// 刷新列表
						$("#indexL1ViewTable").bootstrapTable('refresh');
					}			
				});
			},
			'click .RoleOfEs': function (e, value, row, index) {
				var id = e.target.id.split('_')[1];
				var params = '?fProId='+row["fProId"]+'&fAssessmentId='+row["fAssessmentId"]+'&code='+id;
				var uri = 'nav/indexL2View'+params;
				window.location.href = uri;
			}
	};
    
	var fproId = $('#fProId').val();
	$("#indexL1ViewTable").bootstrapTable({	
		'url' : 'nav/indexL1View/all',
		'queryParams':function(params){
			return {
				"id" : fproId
			}
		},
		'classes' : 'table table-hover table-striped table-condensed',
		'toolbar' : '#toolbar',
		'pagination' : false,
		'paginationLoop':false,
		'sidePagination':'client',		
		'showRefresh' : true,
        'search' : false,
        'idField' : 'fAssessmentId',
		'columns' : [
			{'field':'fAssessmentId', 'title':'', 'visible':false},
			{'field':'fProId', 'title':'', 'visible':false},
			{'field':'xh', 'align': 'center', 'title':'序号', 'width':'5%', formatter:function (value, row, index) {
                return  index + 1;
            }},
            {'field':'e000000', 'align': 'center', 'title':'综合评分', 'width' : '10%', 'searchable' : false},
            {'field':'e010000', 'align': 'center', 'title':'生态用海情况', 'width' : '10%', formatter:indexFormatter.bind({"id":"e010000"}), events:operateEvents, 'searchable' : false},
            {'field':'e020000', 'align': 'center', 'title':'环境影响情况', 'width' : '10%', formatter:indexFormatter.bind({"id":"e020000"}), events:operateEvents, 'searchable' : false},
            {'field':'e030000', 'align': 'center', 'title':'海域开发利用效率', 'width' : '10%', formatter:indexFormatter.bind({"id":"e030000"}), events:operateEvents, 'searchable' : false},
            {'field':'e040000', 'align': 'center', 'title':'海域使用经济效益', 'width' : '10%', formatter:indexFormatter.bind({"id":"e040000"}), events:operateEvents, 'searchable' : false},
            {'field':'e050000', 'align': 'center', 'title':'海域使用社会效益', 'width' : '10%', formatter:indexFormatter.bind({"id":"e050000"}), events:operateEvents, 'searchable' : false},
            {'field':'e060000', 'align': 'center', 'title':'管理措施实施效率', 'width' : '10%', formatter:indexFormatter.bind({"id":"e060000"}), events:operateEvents, 'searchable' : false},
            {'field':'fAssessmentDate', 'title':'评估日期', 'align': 'center', 'width' : '10%', 'searchable' : false},          
            {'field':'operate', 'title':'操作', 'align':'center', 'width' : '10%', formatter:operateFormatter, events:operateEvents}    
		]
	});
	
	$('#btnAddEs').on('click', function(e){
		$.ajax({
			"url" : "nav/indexL1View/add/"+fproId
		}).then(function(data){
			if (data["msg"] === "success"){
				// 刷新列表
				$("#indexL1ViewTable").bootstrapTable('refresh');
			} else if (data["msg"] === "hasUndoneEs") {
				alert('当前项目正在进行评估中，请在完成评估后再进行新增评估！');
			}			
		});
	});

	$('#btnBackToProjectView').on('click', function(e){
		window.location.href = 'nav/projectView';
	});
});