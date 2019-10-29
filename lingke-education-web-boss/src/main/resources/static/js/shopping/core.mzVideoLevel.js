/*
 *  閫夋嫨鍒嗙被
 */
(function($){
    $.fn.mzVideoLevel = function(settings,callback){
        if(this.length<1){return;};
        // 榛樿鍊�
        var defaults ={
            selectCount:1,
            isadmin:true//鏄惁鏄悗鍙�
        };
        settings=$.extend({},defaults,settings);
        var obj  = this;
        var fun  = {};
        var _fun  = {};
        settings.myhiddenfileid = $(obj).attr('id')+'hidden';

        var _myhiddenfile = obj.after('<input id="'+settings.myhiddenfileid+'" name="'+settings.myhiddenfileid+'" type="hidden" value="0" />');

        //鍒涘缓鐖剁骇鐨凥TML
        fun.createParenHtml = function(){
            if(!settings.parentLevelAll){
                ui.error('椤剁骇鍒嗙被娌℃湁鏁版嵁');return;
            }
            if(settings.isadmin){
                if(settings.defaultids){
                    var dealDefault = function(){

                    }
                    var _defaultids = settings.defaultids.split(',');
                    $.each(_defaultids,function(i,k){
                        if(i == 0){
                            var html = fun.createSelect(settings.parentLevelAll,'mzTopLevel mzLevel',k);
                            obj.after(html);
                        }else{
                            //鎵惧埌鏈€鍚庝竴涓�
                            fun.mzSelectChange(obj.parent().find('.mzLevel:last')[0],k);
                        }
                    });
                    fun.setMyItem();
                }else{
                    var html = fun.createSelect(settings.parentLevelAll,'mzTopLevel mzLevel');
                    obj.after(html);
                }
            }else{
                //鍓嶅彴



            }

        };
        //鍒涘缓閫夋嫨妗嗙殑HTML
        fun.createSelect = function($data,_class,$default){
            var $default = $default || 0;
            settings.selectCount ++;
            var _s = 'selected="true"';
            var _val = settings.table+'_id';
            //鍚庡彴
            var html  = '<select data-level="'+settings.selectCount+'" name="mzLevelSelect'+settings.selectCount+'" class="'+_class+'" id="'+settings.table+'">';
            if(typeof(qingxuanze) != 'undefined'){
                html += '<option value="0">'+qingxuanze+'</option>';
            }else{
                html += '<option value="0">璇烽€夋嫨</option>';
            }

            $.each($data,function(i,k){
                html += '<option value="'+k[_val]+'" '+(($default==k[_val])?_s:'')+'>'+k.title+'</option>';
            });
            html += '</select>';
            return html;
        }


        //鍙栧緱鐖剁骇鐨�
        fun.getParentLevelAll = function(){
            var url = U('widget/CategoryLevel/getParentLevelAll');
            $.ajax({
                type: "POST",
                url: url,
                data: "table="+settings.table,
                async: false,
                dataType: "JSON",
                success: function(data){
                    try{
                        var data = eval('('+data+')');
                        settings.parentLevelAll = data;
                    }catch($e){
                        settings.parentLevelAll = data;
                    }
                }
            });

        }
        //鍙栧緱瀛愮骇鐨�
        fun.getChildren = function(_pid){
            var url = U('widget/CategoryLevel/getChildrenAll');
            $.ajax({
                type: "POST",
                url: url,
                data: "pid="+_pid+"&table="+settings.table,
                async: false,
                dataType: "JSON",
                success: function(data){
                    try{
                        var data = eval('('+data+')');
                        settings.childrenLevelAll = data;
                    }catch($e){
                        settings.childrenLevelAll = data;
                    }
                }
            });

        }
        fun.setMyItem = function(){
            var _myItem = [];
            //鎶婄洰鍓嶉€変腑鐨勯」鎵惧嚭鏉�
            $('.mzLevel[id="'+settings.table+'"]').each(function(index, element) {
                _myItem.push($(element).val());
            });
            settings._myItem = _myItem.join(',');
            $('#'+settings.myhiddenfileid).val(settings._myItem);
        }
        //閫夋嫨妗嗙殑閫夋嫨浜嬩欢
        fun.mzSelectChange = function(_this,$default){
            var $default = $default || 0;
            var dataLevel = $(_this).attr('data-level');
            //鎶婁笅闈㈢殑鍏ㄩ儴鍘绘帀
            $(_this).parent().find('select').each(function(index, element) {
                var _dataLevel = $(element).attr('data-level');
                if(parseInt(_dataLevel) > parseInt(dataLevel)){
                    $(element).remove();
                }
            });

            fun.setMyItem();

            if(parseInt(_this.value) <= 0){
                return;
            }
            //鍙栦粬鑷繁鐨勫瓙闆�
            fun.getChildren(_this.value);
            if(!settings.childrenLevelAll){
                return;
            }
            //鎷兼帴鎴恏tml
            var html = fun.createSelect(settings.childrenLevelAll,'mzLevel',$default);
            //鍔犺浇瀹冪殑鍚庨潰
            $(_this).after(html);
        }

        //鍙栧緱鐖剁骇鐨�
        fun.getParentLevelAll();
        //鍒涘缓鐖剁骇鐨刪tml
        fun.createParenHtml();


        $('#'+settings.table).live('change',function(){
            fun.mzSelectChange(this);
        });

        //澶栭儴鍏佽璋冪敤鐨�
        _fun.getData = function(){
            return settings._myItem;
        };


        //杩斿洖鏈ず渚�
        if(typeof callback != 'undefined' && callback instanceof Function){
            callback(_fun);
        }

        return false;
    };
})(jQuery);