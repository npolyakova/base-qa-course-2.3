import java.util.Scanner;

public class Task5 {

    //���� ����������� �����. �����:
    //- ����� ������ � ���;
    //- ����� �������� � ���;
    //- ����� ��� ����;
    //- ������������ ��� ����.

    //234

    public static void main(String[] args) {

        System.out.println("������� ����� ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.close();

        if (number >= 100 && number < 1000) {
            int units = number % 10;
            int decimals = (number / 10) % 10;
            int hundreds = number / 100;

            System.out.println("������� - " + units);
            System.out.println("������� - " + decimals);
            System.out.println("����� - " + (units + decimals + hundreds));
            System.out.println("������������ - " + (units * decimals * hundreds));
        } else {
            System.out.println("��������� ����� �� �����������");
        }

    }
}
