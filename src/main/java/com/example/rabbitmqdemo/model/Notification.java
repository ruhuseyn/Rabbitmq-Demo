package com.example.rabbitmqdemo.model;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

@Data
public class Notification implements Serializable {


    private String notificationId;
    private Date createdAt;
    private boolean seen;
    private String message;
}
