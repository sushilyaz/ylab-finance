package ru.ylab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.ylab.entity.enums.TransactionType;

import java.time.Instant;

@Getter
@Setter
@ToString
public class Transaction {
    private long id;
    private long userId;
    private TransactionType transactionType;
    private double amount;
    private Instant createdAt;
}
