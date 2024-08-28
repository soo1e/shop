package com.soo1e.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "soo1e!";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String myPage() {
        return "마이페이지입니다.";
    }


}
