import java.util.Scanner;

public class Task8 {

    //Составить программу, которая уменьшает первое введенное число в два раза,
    // если оно больше второго введенного числа по абсолютной величине.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.close();

        if (number1 > Math.abs(number2)) {
            number1 /= 2; //number1 = number1 / 2
        }

        System.out.println(number1);
    }
}
