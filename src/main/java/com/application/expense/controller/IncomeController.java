package com.application.expense.controller;

import com.application.expense.model.Category;
import com.application.expense.model.Income;
import com.application.expense.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IncomeController {

    @Autowired
    private IncomeRepository incomeRepository;

    @GetMapping("/income")
    List<Income> getIncome(){
        return incomeRepository.findAll();
    }

    @DeleteMapping("/income/{id}")
    ResponseEntity<?> deleteIncome(@PathVariable Long id){
        incomeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/income")
    ResponseEntity<Income> createIncome( @RequestBody Income income) throws URISyntaxException {
        Income result= incomeRepository.save(income);
        return ResponseEntity.created(new URI("/api/income" + result.getId())).body(result);
    }

    @PutMapping("/income/{id}")
    ResponseEntity<Income> updateIncome(@RequestBody Income income){
        Income result= incomeRepository.save(income);
        return ResponseEntity.ok().body(result);
    }
}
