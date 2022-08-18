import java.util.Scanner;

public class Task5 {

    //Äàíî òğåõçíà÷íîå ÷èñëî. Íàéòè:
    //- ÷èñëî åäèíèö â íåì;
    //- ÷èñëî äåñÿòêîâ â íåì;
    //- ñóììó åãî öèôğ;
    //- ïğîèçâåäåíèå åãî öèôğ.

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

            System.out.println("Åäèíèöû - " + units);
            System.out.println("Äåñÿòêè - " + decimals);
            System.out.println("Ñóììà - " + (units + decimals + hundreds));
            System.out.println("Ïğîèçâåäåíèå - " + (units * decimals * hundreds));
        } else {
            System.out.println("Ââåäåííîå ÷èñëî íå òğåõçíà÷íîå");
        }

    }
}
