package com.epam.functional.programming.lambdas;

import com.epam.functional.programming.basic.NotificationAPI;

public class NotificationService {

    public void triggerEmailNotification(NotificationAPI notificationAPI){
        notificationAPI.sendNotification();
    }

    public NotificationAPI triggerEmailNotification(){
        return () -> {
            System.out.println("notification sent to your email");
        };
    }

}
