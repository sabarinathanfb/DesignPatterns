package DesignPattern.Factory;

import DesignPattern.Factory.FactoryForObjects.EmailNotificationFactory;
import DesignPattern.Factory.FactoryForObjects.NotificationFactory;
import DesignPattern.Factory.Objects.Notification;

public class Client {
    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.notifyUser();

    }
}
