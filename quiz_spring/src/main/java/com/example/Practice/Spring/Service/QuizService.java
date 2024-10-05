package com.example.Practice.Spring.Service;

import com.example.Practice.Spring.Model.QuizQuestions;
import com.example.Practice.Spring.Repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizRepo repo;

    public List<QuizQuestions> allQuestions(){
        return repo.findAll();
    }

    public List<QuizQuestions> getbyCategory(String cat){
        return repo.findBycategery(cat);
    }
    public String addData(QuizQuestions ques){
        repo.save(ques);
        return "Sucess";
    }

}
