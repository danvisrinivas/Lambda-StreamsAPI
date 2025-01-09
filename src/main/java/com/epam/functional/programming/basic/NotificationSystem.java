package com.epam.functional.programming.basic;

public class NotificationSystem {
    public static void main(String[] args) {
        NotificationAPI emailNotification = new NotificationAPI() {
            @Override
            public void sendNotification() {
                System.out.println("notification sent to your email");
            }
        };
        emailNotification.sendNotification();

        NotificationAPI smsNotification = new NotificationAPI() {
            @Override
            public void sendNotification() {
                System.out.println("notification sent to your mobile");
            }
        };
        smsNotification.sendNotification();

        NotificationAPI whatappNotification = new NotificationAPI() {
            @Override
            public void sendNotification() {
                System.out.println("notification sent to your whatsapp");
            }
        };
        whatappNotification.sendNotification();
    }
}
