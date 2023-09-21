package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class DemoController {

    // 생성자 주입
//    private DemoService demoService;
//
//    // Demoservice 객체를 매개변수로 하는 생성자
//    @Autowired
//    public DemoController(DemoService demoService) {
//        this.demoService = demoService;
//    }

    // 생성자 주입을 좀 더 편하게
    private final DemoService demoService;
}
