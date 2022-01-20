package com.codegym.vn.controller;

import com.codegym.vn.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    IProductService productService;

    @GetMapping("/home")
    public ModelAndView show(){
       ModelAndView modelAndView = new ModelAndView("/product/show");
       modelAndView.addObject("products", productService.findAll());
       return modelAndView;
    }
}
