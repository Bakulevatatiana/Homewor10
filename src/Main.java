
class Homewor10 {


    public static void main(String[] args) {

        isLeapYear (2003);
        printSeason (0,2013);
        getDelivery (100);




    }

    public static void isLeapYear (int year) {


             if (year%4==0&&year%400==0){
                 System.out.println("год является високосным");}
             else System.out.println("год не является високосным");
        }




    public static void printSeason(int os,int year) {
        if (os == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            return;}
        if (os == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            return;}
        if (os == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            return;}
         if (os == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        return;}}
    public static void getDelivery (int deliveryDistance) {
            double d=(deliveryDistance-20)/40+1;
            System.out.println(Math.ceil(d));
                return;
            }






     }