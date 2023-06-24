package com.notes.note.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    private String gethomepage(){
        System.out.println("enter in the controller");
        return "baseTemplate";
    }
}
