package com.jk.education.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;
import com.jk.education.shopping.common.utils.ExportExcel;
import com.jk.education.shopping.service.BykShoppingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @类名: BykShoppingAddressController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-24 20:10
 **/
@RequestMapping("address")
@Controller
public class BykShoppingAddressController {

    @Autowired
    private BykShoppingAddressService shoppingAddressService;

    @RequestMapping("updateShoppingAddress")
    @ResponseBody
    public Result updateShoppingAddress(BykShoppingAddress address){
        return shoppingAddressService.updateShoppingAddress(address);
    }

    @RequestMapping("findShoppingAddressById")
    @ResponseBody
    public BykShoppingAddress findShoppingAddressById(int id){
        return shoppingAddressService.findShoppingAddressById(id);
    }

    @RequestMapping("saveShoppingAddress")
    @ResponseBody
    public Result saveShoppingAddress(BykShoppingAddress address){
        return shoppingAddressService.saveShoppingAddress(address);
    }

    @RequestMapping("findAreaList")
    @ResponseBody
    public List<BykArea> findAreaList(int pid){
        return shoppingAddressService.findAreaList(pid);
    }

    @RequestMapping("deleteShoppingAddressById")
    @ResponseBody
    public Result deleteShoppingAddressById(int id){
        return shoppingAddressService.deleteShoppingAddressById(id);
    }

    @RequestMapping("updateShoppingAddressStatus")
    @ResponseBody
    public Result updateShoppingAddressStatus(BykShoppingAddress address){
        return shoppingAddressService.updateShoppingAddressStatus(address);
    }

    @RequestMapping("deleteShoppingAddress")
    @ResponseBody
    public Result deleteShoppingAddress(Integer[] ids){
        return shoppingAddressService.deleteShoppingAddress(ids);
    }

    @RequestMapping("findShoppingAddressCount")
    @ResponseBody
    public Long findShoppingAddressCount(BykShoppingAddress address){
        return shoppingAddressService.findShoppingAddressCount(address);
    }

    @RequestMapping("findShoppingAddressList")
    @ResponseBody
    public List<BykShoppingAddress> findShoppingAddressList(int page,int rows,BykShoppingAddress address){
        return shoppingAddressService.findShoppingAddressList(page,rows,address);
    }

    @RequestMapping("exportShoppingAddressList")
    public void exportResumeImgList(HttpServletResponse response){
        //获得数据信息
        List<BykShoppingAddress> addressList = shoppingAddressService.findShoppingAddress();
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"id","用户UID","地区","地址","姓名","电话","是否启用","默认地址"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;

        for (int i = 0; i < addressList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = addressList.get(i).getId();
            obj[1] = addressList.get(i).getUid();
            obj[2] = addressList.get(i).getProvince()+" "+addressList.get(i).getCity()+""+addressList.get(i).getCounty();
            obj[3] = addressList.get(i).getAddress();
            obj[4] = addressList.get(i).getName();
            obj[5] = addressList.get(i).getPhoto();
            obj[6] = addressList.get(i).getStatus();
            obj[7] = addressList.get(i).getDefaultAddress();

            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}