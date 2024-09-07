package DesignPattern.Factory.PracticalFactory;

import DesignPattern.Factory.Objects.Notification;

public class Client {
    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser();

        Notification notification2 = NotificationFactory.createNotification("SMS");
        notification2.notifyUser();

        Notification notification3 = NotificationFactory.createNotification("PUSH");
        notification3.notifyUser();
    }
}
