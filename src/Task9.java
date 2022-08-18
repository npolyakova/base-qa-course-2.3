import java.util.Scanner;

public class Task9 {

    //Известен вес боксера-любителя...

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer weight = scanner.nextInt();

        if (weight < 60){
            System.out.println("Легкий вес");
        }
        else if (weight < 75){
            System.out.println("Средний вес");
        }
        else if (weight < 91){
            System.out.println("Тяжелый вес");
        }
        else {
            System.out.println("Супертяжелый вес");
        }
    }
}
