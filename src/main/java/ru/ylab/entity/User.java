package ru.ylab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.ylab.entity.enums.Role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
public class User {
    private long id;
    private String email;
    private String password;
    private String name;
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();
    private List<Goal> goals = new ArrayList<>();
    private Budget budget;
    List<Notification> notifications = new ArrayList<>();
    private Role role;
    private Date createdAt;
    private Date updatedAt;
}
