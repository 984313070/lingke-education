//澶勭悊璧勮f
admin.setZixun = function(_id, action, title, type) {
    var id = ("undefined" == typeof(_id) || _id == '') ? admin.getChecked() : _id;
    $.post(U('news/AdminTopic/' + action), {
        id: id
    }, function(msg) {
        admin.ajaxReload(msg);
    }, 'json');
};
/**
 * 鍒犻櫎璧勮
 * @Author   Martinsun<syh@sunyonghong.com>
 * @DateTime 2018-05-25
 * @param    {[type]}                       id [description]
 * @return   {[type]}                          [description]
 */
admin.delZixun = function(id) {
    var id = id ? id : admin.getChecked();
    id = ("undefined" == typeof(id) || id == '') ? admin.getChecked() : id;
    if (id == '') {
        ui.error("璇烽€夋嫨瑕佸垹闄ょ殑璧勮");
        return false;
    }
    ui.confirm("纭畾瑕佽繘琛屾鎿嶄綔鍚楋紵", {
        yes: function() {
            $.post(U('news/AdminTopic/delTopics'), {
                id: id
            }, function(msg) {
                admin.ajaxReload(msg);
            }, 'json');
        }
    });
};

admin.SubmitCheck = function(){
    var title = $("input[name='title']").val();
    var text  = $("input[name='text']").val();
    if ( '' == title || '' == text ){
        ui.error('璇疯緭鍏ユ爣棰樺拰鍐呭');
        return false;
    }
}