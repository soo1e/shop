package com.soo1e.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    @GetMapping("/list")
    String list(Model model){
        // 전달할 데이터 이룸, 데이터
        model.addAttribute("name","채수원");
        return "list.html";
    }
}
