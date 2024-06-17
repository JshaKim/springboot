package com.ohgiraffers.springexam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class MainController {

    @RequestMapping(value = {"/"})
    public String index() {
        return "index";
    }

    @PostMapping("/textpage")
    public ModelAndView textpage(@RequestParam("text1") String text1) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("textpage");
        modelAndView.addObject("text1", text1);
        return modelAndView;
    }


}
