package DesignPattern.Factory.FactoryForObjects;

import DesignPattern.Factory.Objects.Notification;
import DesignPattern.Factory.Objects.PushNotification;

public class PushNotificationFactory implements NotificationFactory{


    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
