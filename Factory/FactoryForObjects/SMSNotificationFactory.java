package DesignPattern.Factory.FactoryForObjects;

import DesignPattern.Factory.Objects.Notification;
import DesignPattern.Factory.Objects.SMSNotification;

public class SMSNotificationFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
