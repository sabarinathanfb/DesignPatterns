package DesignPattern.Factory.FactoryForObjects;

import DesignPattern.Factory.Objects.EmailNotification;
import DesignPattern.Factory.Objects.Notification;

public class EmailNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
