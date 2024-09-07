package DesignPattern.Factory.PracticalFactory;

import DesignPattern.Factory.Objects.EmailNotification;
import DesignPattern.Factory.Objects.Notification;
import DesignPattern.Factory.Objects.PushNotification;
import DesignPattern.Factory.Objects.SMSNotification;

public class NotificationFactory {

    public static Notification createNotification(String type){
        if (type == null || type.isEmpty()) {
            return null;
        }
        if("email".equalsIgnoreCase(type)){
            return new EmailNotification();
        }else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotification();
        } else if ("PUSH".equalsIgnoreCase(type)) {
            return new PushNotification();
        }
        return null;
    }
}
