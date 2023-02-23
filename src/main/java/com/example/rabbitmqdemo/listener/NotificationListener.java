package com.example.rabbitmqdemo.listener;

import com.example.rabbitmqdemo.model.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    public void hadleNotification(Notification notification){
        System.out.println(notification.toString());
    }
}
