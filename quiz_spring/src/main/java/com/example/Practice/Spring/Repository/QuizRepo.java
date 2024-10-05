package com.example.Practice.Spring.Repository;

import com.example.Practice.Spring.Model.QuizQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends JpaRepository<QuizQuestions,Integer> {
 List<QuizQuestions> findBycategery(String cat);
}
