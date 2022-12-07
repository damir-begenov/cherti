package com.example.spring_mongo_db_december_7_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping ("/")
        public String sex(){
        return "chert";
        }
}
