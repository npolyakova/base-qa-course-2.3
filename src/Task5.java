import java.util.Scanner;

public class Task5 {

    //Дано трехзначное число. Найти:
    //- число единиц в нем;
    //- число десятков в нем;
    //- сумму его цифр;
    //- произведение его цифр.


    //234

    public static void main(String[] args) {

        System.out.println("Ââåäèòå ÷èñëî ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.close();

        if (number >= 100 && number < 1000) {
            int units = number % 10;
            int decimals = (number / 10) % 10;
            int hundreds = number / 100;

            System.out.println("Единицы - " + units);
            System.out.println("Десятки - " + decimals);
            System.out.println("Сотни - " + (units + decimals + hundreds));
            System.out.println("Произведение - " + (units * decimals * hundreds));
        } else {
            System.out.println("Введите трехзначное число");
        }

    }
}
