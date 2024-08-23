package com.todo.model;

import com.todo.validation.ValidStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotEmpty;
@Setter
@Getter
@Entity

public class Task {
    //getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    @NotEmpty(message = "Title cannot be empty")
    private String description;
    @ValidStatus
    @NotEmpty(message = "Status cannot be empty")
    private String status;


}