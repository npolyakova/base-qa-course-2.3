import java.util.Scanner;

public class Task7 {

    //���� ����������� �����. ����������:
    //- �������� �� ��� ������;
    //- ������������ �� ��� ������ 7

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;

        if ((lastDigit % 2) == 0){
            System.out.println("����� ������");
        }
        else if (lastDigit == 7){
            System.out.println("����� ������������ �� 7");
        }
        else {
            System.out.println("�� ���� ������� �� �����������");
        }
    }
}
