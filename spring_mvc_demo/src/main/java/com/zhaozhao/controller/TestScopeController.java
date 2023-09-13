package com.zhaozhao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author 刘梹晨
 * @Classname TestScopeController
 * @Date 2023/8/13 13:21
 * 向域对象共享数据：
 * 1、通过ModelAndView向请求域共享数据
 * 使用ModelAndView时，可以使用其model功能向请求域中共享数据
 * 使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
 *
 * 2、使用Model
 * 使用Model向请求域共享数据，需要通过ModelAndView的model功能
 *
 * 3、使用ModelMap
 * 使用ModelMap向请求域共享数据，需要通过ModelAndView的modelMap功能
 *
 * 4、使用Map
 * 使用Map向请求域共享数据，需要通过ModelAndView的modelMap功能
 *
 * 5、Model和ModelMap的关系
 * 其实在底层中，这些类型的形参最终通过BindingAwareModelMap创建
 * public class BindingAwareModelMap extends ExtendedModelMap {}
 * public class ExtendedModelMap extends ModelMap implements Model {}
 * public class ModelMap extends LinkedHashMap<String, Object> {}
 *
 */
@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        /**
         * ModelAndView包含model和view的功能
         * Model：向请求域中共享数据
         * View设置逻辑视图实现页面跳转
         *
         */
        ModelAndView mav = new ModelAndView();
        //向请求域中共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        //设置逻辑视图
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        //org.springframework.validation.support.BindingAwareModelMap
        System.out.println(model.getClass().getName());
        model.addAttribute("testRequestScope","hello,Model");
        return "success";
    }
    @RequestMapping("/test/modelMap")
    public String testModelMap(Model modelmap){
        System.out.println(modelmap.getClass().getName());
        modelmap.addAttribute("testRequestScope","hello,ModelMap");
        return "success";
    }

    @RequestMapping("/test/Map")
    public String testMap(Map<String, Object> map){
        System.out.println(map.getClass().getName());
        map.put("testRequestScope","hello,Map");
        return "success";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,Session");
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,Application");
        return "success";
    }


}
