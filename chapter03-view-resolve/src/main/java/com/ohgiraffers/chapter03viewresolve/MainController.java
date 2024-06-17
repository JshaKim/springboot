package com.ohgiraffers.chapter03viewresolve;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = { "/"})
    public String main1() {

        return "main";
    }

    /*
    * RequestToViewNameTranslator(interface)
    * spring은 반환 타입이 void인 경우 요청 url 기반으로 vue를 해석하려고 하는데
    * RequestToViewNameTranslator를 사용하여 url을 vue 이름으로 채책하여 변환
    *
    * */

    @RequestMapping(value = { "/main1"})
    public void mainpage() {

    }
}
