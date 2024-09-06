import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        int year = 2001;
        checkLeapYear(year);


        int clientOS = 0;
        int clientDeviceYear = 2011;
        indicateVersion(clientOS, clientDeviceYear);


        int deliveryDistance = 95;
        System.out.println(calculateDaysDelivery(deliveryDistance));
    }

    public static void checkLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void indicateVersion(int clientOS, int clientDeviceYear) {
        if (clientOS < 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS < 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDaysDelivery(int deliveryDistance) {
        int dayDelivery = 0;
        if (deliveryDistance < 20) {
            dayDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            dayDelivery = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayDelivery = 3;
        }
        return dayDelivery;
    }
}


