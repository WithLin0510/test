package example.controller;

import example.models.shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WithLin on 2017/10/10.
 */
@Controller
@RequestMapping("/kfc/brands")
public class JSONController {
    @RequestMapping(value="{name}", method = RequestMethod.GET)
    public @ResponseBody shop  getShopInJson(@PathVariable String name){
        System.out.println("-----请求json数据--------");
        shop shop = new shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

        return shop;
    }
}
