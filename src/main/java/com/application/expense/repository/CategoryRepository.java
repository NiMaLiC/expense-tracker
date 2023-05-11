package com.application.expense.repository;

import com.application.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    CategoryRepository findByName(String name);
}
