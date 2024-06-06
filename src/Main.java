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
        int year = 2000;
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

  // 4
        System.out.println("4.");
        int deliveryDistance = 101;
        int daysToDelivery = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет!");
        }
        else {
            if (deliveryDistance > 20) {
                daysToDelivery++;
            }
            if (deliveryDistance > 60) {
                daysToDelivery++;
            }
            System.out.println("Для доставки потребуется " + daysToDelivery + " день/дня.");
        }



  // 5
        System.out.println("5.");
        byte monthNumber = 12;
        if (monthNumber > 0 && monthNumber <=  12) {
            switch (monthNumber) {
                case 1: case 2: case 12:
                    System.out.println("Месяц " + monthNumber + " - сезон зима");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Месяц " + monthNumber + " - сезон весна");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Месяц " + monthNumber + " - сезон лето");
                    break;
                case 9: case 10: case 11:
                    System.out.println("Месяц " + monthNumber + " - сезон осень");
                    break;
            }
        }
        else {
            System.out.println("Месяц " + monthNumber + " - так не бывает!");
        }


    }
}