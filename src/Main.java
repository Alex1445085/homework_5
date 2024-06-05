public class Main {
    public static void main(String[] args) {

  // 1
        System.out.println("1.");
        byte clientOS = 0;
        switch (clientOS) {
            case 0: {
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            }
            case 1: {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
            default: {
                break;
            }
        }

  // 2
        System.out.println("2.");
        clientOS = 0;
        int clientDeviceYear = 2017;
        switch (clientOS) {
            case 0: {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            }
            case 1: {
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            }
            default: {
                break;
            }
        }

  // 3
        System.out.println("3.");
        int year = 2196;
        boolean leapYear = false;
        if (year > 1584) {
            if (year % 4 == 0) {
                leapYear = true;
            }
            if (year % 100 == 0) {
                leapYear = false;
            }
            if (year % 400 == 0) {
                leapYear = true;
            }
        }
        if (leapYear) {
            System.out.println(year + " - год високосный.");
        }
        else {
            System.out.println(year + " - год не високосный.");
        }
    }
}