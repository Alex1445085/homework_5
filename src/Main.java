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
    }
}