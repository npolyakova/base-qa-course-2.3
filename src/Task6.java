import java.util.Scanner;

public class Task6 {

    //�������� ������� ����� � ��������. ����������:
    //- ��������� �� ���� � ��������?
    //- ��������� �� ������� � �����?
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������� �����");
        int circleSq = sc.nextInt(); //pi*r*r
        System.out.println("������� ������� ��������");
        int squareSq = sc.nextInt(); //a*a
        sc.close();

        double r = Math.sqrt(circleSq / Math.PI);
        double d = 2*r;
        double a = Math.sqrt(squareSq);

        boolean cInQ = d <= a;
        boolean qInC = a <= d;

        System.out.printf("���� ���������� � ������� = %b \n", cInQ );
        System.out.printf("������� ���������� � ���� = %b", qInC);
    }
}
