package ru.ylab.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Notification {
    private long id;
    private long userId;
    private String title;
    private String content;
    private Date date;
}
