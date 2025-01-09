package com.epam.functional.programming.lambdas;

import com.epam.functional.programming.basic.NotificationAPI;

public class NotificationSystem {
    public static void main(String[] args) {
        // Passing Lambda Function as a parameter
        NotificationAPI emailNotification = () -> {
                System.out.println("notification sent to your email");
        };

        NotificationService notificationService = new NotificationService();
        notificationService.triggerEmailNotification(emailNotification);

        // Getting Lambda function from another class method
        NotificationService notificationService2 = new NotificationService();
        NotificationAPI emailNotificationAPI = notificationService2.triggerEmailNotification();
        emailNotificationAPI.sendNotification();
    }
}