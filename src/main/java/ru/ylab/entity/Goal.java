package ru.ylab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Goal {
    private long id;
    private long userId;
    private double targetAmount;
    private double currentAmount;
    private String description;
    private Date date;
}
