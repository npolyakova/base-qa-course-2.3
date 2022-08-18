import java.util.Scanner;

public class Task6 {

    //»звестны площади круга и квадрата. ќпределить:
    //- уместитс€ ли круг в квадрате?
    //- уместитс€ ли квадрат в круге?
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите площадь круга");
        int circleSq = sc.nextInt(); //pi*r*r
        System.out.println("¬ведите площадь квадрата");
        int squareSq = sc.nextInt(); //a*a
        sc.close();

        double r = Math.sqrt(circleSq / Math.PI);
        double d = 2*r;
        double a = Math.sqrt(squareSq);

        boolean cInQ = d <= a;
        boolean qInC = a <= d;

        System.out.printf(" руг помещаетс€ в квадрат = %b \n", cInQ );
        System.out.printf(" вадрат помещаетс€ в круг = %b", qInC);
    }
}
