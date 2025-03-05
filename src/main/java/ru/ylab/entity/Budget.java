package ru.ylab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Budget {
    private long id;
    private long userId;
    private double monthlyLimit;
    private double currentSpending;
}
