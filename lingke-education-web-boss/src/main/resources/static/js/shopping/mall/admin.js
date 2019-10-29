var MY_JS_PATH = SITE_URL + '/apps/' + APPNAME + '/_static/';
//褰诲簳鍒犻櫎鐢ㄦ埛绉垎鍙婂叾鍏宠仈娴佹按
admin.delUserGreditAFlow = function(ids) {
    var ids = ids ? ids : admin.getChecked();
    ids = ("undefined" == typeof(ids) || ids == '') ? admin.getChecked() : ids;
    if (ids == '') {
        ui.error("璇烽€夋嫨瑕佸垹闄ょ殑璁板綍");
        return false;
    }
    ui.confirm("纭畾瑕佽繘琛屾鎿嶄綔鍚楋紵", {
        yes: function() {
            $.post(U('mall/AdminGlobal/delUserGreditAFlow'), {
                ids: ids
            }, function(msg) {
                admin.ajaxReload(msg);
            }, 'json');
        }
    });
};
//瀵煎叆鍚庡彴鍏敤鐨凧S
document.write(unescape('%3Cscript src="' + MY_JS_PATH + 'js/admin.goods.js"%3E%3C/script%3E'));