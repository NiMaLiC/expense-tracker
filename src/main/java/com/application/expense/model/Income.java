package com.application.expense.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="income")
@Entity
@Data
public class Income {
    @Id
    private Long id;

    private String name;

    private Instant incomeDate;

    private String description;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

}
