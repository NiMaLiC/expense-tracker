package com.application.expense.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@Table(name="category")
@Entity
@Data
public class Category {

    @Id
    private  Long id;

    /*Travel, Academic,Food*/
    @Nonnull
    private String name;

//
//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private User user;
}
