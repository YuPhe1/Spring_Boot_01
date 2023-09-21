package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReqController {

    @GetMapping("/req1")
    public String req1(@RequestParam("p1") String p1, @RequestParam("p2") int p2){
        System.out.println("p1 = " + p1 + ", p2 = " + p2);
        return "index";
    }

    // /req2/aaa
    @GetMapping("/req2/{p3}")
    public String req2(@PathVariable("p3") String p3){
        System.out.println("p3 = " + p3);
        return "index";
    }

    @PostMapping("/req3")
    public String req3(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("name = " + name + ", age = " + age);
        return "index";
    }

    @GetMapping("/req4")
    public String req4(Model model){
        model.addAttribute("a1", "안녕하세요");
        model.addAttribute("a2", "반갑습니다.");
        return "req4";
    }
}
