package com.example.swagger_jenkins.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EnterController {
    @ApiOperation(value = "웰컴페이지", notes = "시작페이지")
    @ApiResponses({
            @ApiResponse(code = 200, message = "정상이동"),
            @ApiResponse(code = 404, message = "주소오류")})
    @GetMapping("/")
    public ModelAndView firstPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("welcome");
        return mav;
    }

    @GetMapping("/hello")
    public ModelAndView secondPage() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("num", 1);
        mav.setViewName("hello");
        return mav;
    }

}
