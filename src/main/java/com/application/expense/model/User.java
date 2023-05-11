package com.application.expense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity
@Data
public class User {

    @jakarta.persistence.Id
    private  Long Id;

    private String name;

    private String email;

    @OneToMany
    private Set<Category> category;
}
