import java.util.Scanner;

public class Task7 {

    //Дано натуральное число. Определить: 
    //1. является ли оно четным; 
    //2. оканчивается ли оно цифрой 7


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;

        if ((lastDigit % 2) == 0){
            System.out.println("Число четное");
        }
        else if (lastDigit == 7){
            System.out.println("Число оканчивается на 7");
        }
        else {
            System.out.println("Ни одно условие не выполнилось");
        }
    }
}
