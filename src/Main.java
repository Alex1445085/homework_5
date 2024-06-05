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
    }
}