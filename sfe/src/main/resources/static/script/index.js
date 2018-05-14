/**
 * 
 */
$(function () {
    App.setbasePath('');
    App.setGlobalImgPath("ui/AdminLTE/dist/img/");

    addTabs({
        id: '10008',
        title: '首页',
        close: false,
        url: '/welcome',
        urlType: "relative"
    });

    App.fixIframeCotent();

    $.ajax({
    	"url" : "json/menu.json"
    }).then(function(menus){
    	$('.sidebar-menu').sidebarMenu({data: menus});
    });
});