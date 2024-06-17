package com.ohgiraffers.chapter01requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/*
* 클래스 레벨에 @RequestMapping 어노테이션 사용 가능
* 클래스 레벨에 url을 공통 부분으로 설정하고나면 매번 핸들러 메서드에 url의 중복되는 내용은 생략
* 이 때 와일드카드를 이용해서 조금 더 포괄적인 url 패턴을 설정 가능함
* */
@Controller
@RequestMapping("/orders/*")
public class ClassMappingTestController { // <-- 스프링 빈 이름

    // 클래스 레벨 매핑
    @GetMapping ("/regist")
    public String registOrder(Model model) {
        model.addAttribute("message","get 방식의 주문 등록용 핸들러 메서들르 호출함");
        return "mappingResult";
    }

    @PostMapping("regist")
    public String registOrderPost(Model model) {
        model.addAttribute("message", "rmsid");
        return "mappingResult";
    }

    // 다수 패턴 매핑
    // value 속성에 중괄호를 이용해 매칭할 url 입력
    @RequestMapping(value = {"modify", "delete"}, method = RequestMethod.POST)
    public String modifyAndDelete(Model model){
        model.addAttribute("message","post 방식의 주문 정보 수정과 주문 정보 삭제 공통 처리용 핸들러 메소드 호출함");
        return "mappingResult";
    }

    /*
    * path variable
    * @PathVariable 어노테이션을 이용해 요청 path로부터 변수를 받아올 수 있음
    * path variable로 전달되는 {변수명} 값은 반드시 매개변수 명과 동일해야 함
    * 동일하지 않으면 @PathVariable("이름")설정 필요
    * 이는 Rest형 웹서비스 설계할 때 사용됨
    * */

    @GetMapping("/detail/{orderNo}")
    public String selectOrderDetail(Model model,@PathVariable("orderNo") int orderNo) {
        model.addAttribute("message", orderNo + "ZR");
        return "mappingResult";

    }

    @GetMapping("/")
    public String registOrders(Model model, @RequestParam String rest, @RequestParam String value) {
        model.addAttribute("message", rest + "ZR" + value);
        return "mappingResult";
    }

    /*
    *  기타 요청
    * @RequestMapping 어노테이션에 아무런 url을 설정하지 않으면 요청 처리에 대한 핸들러 메서드가
    * 준비되지 않았을 때 해당 메서드 호출
    *
    * */

    @RequestMapping
    public String OtherRequest(Model model) {
        model.addAttribute("message", "뭐야 이거");
        return "orderError";
    }

}
