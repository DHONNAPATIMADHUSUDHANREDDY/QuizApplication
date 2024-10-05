package com.example.Practice.Spring.Controller;

import com.example.Practice.Spring.Model.QuizQuestions;
import com.example.Practice.Spring.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuizController {
    @Autowired
    QuizService serv;

    @RequestMapping("/allQuestions")
    public List<QuizQuestions> allQuestion(){
        return serv.allQuestions();
    }
    @GetMapping("category/{cat}")
    public List<QuizQuestions>getbyCategory(@PathVariable String cat){
        return serv.getbyCategory(cat);
    }
    @PostMapping("/addQuestion")
     public String addData(@RequestBody QuizQuestions Ques){
        return serv.addData(Ques);
     }

}
