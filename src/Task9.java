import java.util.Scanner;

public class Task9 {

    //�������� ��� �������-��������...

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer weight = scanner.nextInt();

        if (weight < 60){
            System.out.println("������ ���");
        }
        else if (weight < 75){
            System.out.println("������� ���");
        }
        else if (weight < 91){
            System.out.println("������� ���");
        }
        else {
            System.out.println("������������ ���");
        }
    }
}
