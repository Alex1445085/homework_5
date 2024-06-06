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
        int year = 2012;
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
        int daysToDelivery = 0;
        if (deliveryDistance > 0) {
            daysToDelivery++;
        }
        if (deliveryDistance > 20) {
            daysToDelivery++;
        }
        if (deliveryDistance > 60) {
            daysToDelivery++;
        }
        if (deliveryDistance > 100) {
            daysToDelivery = 0;
        }
        if (daysToDelivery == 0) {
            System.out.println("Доставки нет!");
        }
        else {
            System.out.println("Потребуется дней " + daysToDelivery);
        }

  // 5
        System.out.println("5.");
        byte monthNumber = 12;
        byte season = 0;
        if (monthNumber > 0 && monthNumber <=  12) {
            if (monthNumber <= 2 || monthNumber == 12) {
                season = 0;
            }
            if (monthNumber >= 3 && monthNumber <= 5) {
                season = 1;
            }
            if (monthNumber >= 6 && monthNumber <= 8) {
                season = 2;
            }
            if (monthNumber >= 9 && monthNumber <= 11) {
                season = 3;
            }

            switch (season) {
                case 0:
                    System.out.println("Месяц " + monthNumber + " - сезон зима");
                    break;
                case 1:
                    System.out.println("Месяц " + monthNumber + " - сезон весна");
                    break;
                case 2:
                    System.out.println("Месяц " + monthNumber + " - сезон лето");
                    break;
                case 3:
                    System.out.println("Месяц " + monthNumber + " - сезон осень");
                    break;
            }
        }
        else {
            System.out.println("Месяц " + monthNumber + " - так не бывает!");
        }


    }
}