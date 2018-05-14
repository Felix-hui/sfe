/**
 * 
 */

$(function(){	
	var code = $('#code').val();
	var fProId = $('#fProId').val(); 
	var fAssessmentId = $('#fAssessmentId').val(); 
	var $table = $('#indexL2ViewTable_'+code);
	$('.indexL2ViewTableGroup').hide();
	$table.show();	
	
	function operateFormatter(value, row, index) {
        return [
            '<button type="button" class="RoleOfCalc btn btn-danger btn-xs" style="margin-right:0px;">计算</button>'           
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
    		'click .RoleOfCalc': function (e, value, row, index) {
    			alert('RoleOfCalc');
				/*var id = e.target.id.split('_')[1];
				var params = '?fProId='+row["fProId"]+'&fAssessmentId='+row["fAssessmentId"]+'&code='+id;
				var uri = 'nav/indexL2View'+params;
				window.location.href = uri;*/
			},
			'click .RoleOfEs': function (e, value, row, index) {
				alert('RoleOfEs');
				/*var id = e.target.id.split('_')[1];
				var params = '?fProId='+row["fProId"]+'&fAssessmentId='+row["fAssessmentId"]+'&code='+id;
				var uri = 'nav/indexL2View'+params;
				window.location.href = uri;*/
			}
	};
	
    $('#btnBackToIndexL1View').on('click', function(e){
		window.location.href = 'nav/indexL1View/' + fProId;
	});
    
	switch(code){
		case 'e010000' :			
			$table.bootstrapTable({
				'url' : 'nav/indexL2View/all',
				'queryParams':function(params){
					return {
						"code" : code.replace('e', ''),
						"fProId" : fProId,
						"fAssessmentId" : fAssessmentId
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
		            {'field':'e010100', 'align': 'center', 'title':'生态化平面设计', 'width' : '10%', formatter:indexFormatter.bind({"id":"e010100"}), events:operateEvents, 'searchable' : false},
		            {'field':'e010200', 'align': 'center', 'title':'公众亲海空间设计', 'width' : '10%', formatter:indexFormatter.bind({"id":"e010200"}), events:operateEvents, 'searchable' : false},
		            {'field':'e010300', 'align': 'center', 'title':'生态空间实现率', 'width' : '10%', formatter:indexFormatter.bind({"id":"e010300"}), events:operateEvents, 'searchable' : false},
		            {'field':'e010400', 'align': 'center', 'title':'生态海岸建设', 'width' : '10%', formatter:indexFormatter.bind({"id":"e010400"}), events:operateEvents, 'searchable' : false},		                
		            {'field':'e010000', 'align':'center', 'title':'生态用海情况', 'width' : '10%', formatter:operateFormatter, events:operateEvents}    
				]
			});	
			
			break;
		case 'e020000' :
			$table.bootstrapTable({
				'url' : 'nav/indexL2View/all',
				'queryParams':function(params){
					return {
						"code" : code.replace('e', ''),
						"fProId" : fProId,
						"fAssessmentId" : fAssessmentId
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
		            {'field':'e020100', 'align': 'center', 'title':'生态环境影响指标', 'width' : '10%', formatter:indexFormatter.bind({"id":"e020100"}), events:operateEvents, 'searchable' : false},
		            {'field':'e020200', 'align': 'center', 'title':'污染物排放水平指标', 'width' : '10%', formatter:indexFormatter.bind({"id":"e020200"}), events:operateEvents, 'searchable' : false},
		            {'field':'e020300', 'align': 'center', 'title':'环境保护措施执行率指标', 'width' : '10%', formatter:indexFormatter.bind({"id":"e020300"}), events:operateEvents, 'searchable' : false},
		            {'field':'e020400', 'align': 'center', 'title':'长期监测与评估指标', 'width' : '10%', formatter:indexFormatter.bind({"id":"e020400"}), events:operateEvents, 'searchable' : false},		                
		            {'field':'e020000', 'align':'center', 'title':'环境影响情况', 'width' : '10%', formatter:operateFormatter, events:operateEvents}    
				]
			});
			
			break;
		case 'e030000' :
			break;
		case 'e040000' :
			break;
		case 'e050000' :
			break;
		case 'e060000' :
			break;
	}
	
	
});