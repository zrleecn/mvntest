package cn.zrlee.controller;

import cn.zrlee.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuServiceImpl ;

    @RequestMapping("abc")
    @ResponseBody
    public String hello(){
       return "abc";
    }

    @RequestMapping("show")
    public String show(Model model){
        model.addAttribute("menu" , menuServiceImpl.show()) ;
        System.out.println(menuServiceImpl.show());
        return "/index.jsp" ;
    }
}
