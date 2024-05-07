public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача №2");
        int clientDeviceYear = 2020;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задача №3");
        int year = 2020;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " Высокосный год");
        } else {
            System.out.println(year + " не высокосный год ");
        }
        System.out.println("Задача №4");
        int deliveryDistance = 100;
        int DeliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки: " + DeliveryTime + " день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется 1 день + " + DeliveryTime + " день доставки");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 2 дня + " + DeliveryTime + " день доставки");
        } else {
            System.out.println("Доставка свыше 100 км не осуществляется");
        }
        System.out.println("Задача №5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Больше двенадцати месяцев не существует =)");
        }

    }
}