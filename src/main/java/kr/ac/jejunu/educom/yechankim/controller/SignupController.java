package kr.ac.jejunu.educom.yechankim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {
    @RequestMapping("/signup")
    public void openSignup() { }
}
