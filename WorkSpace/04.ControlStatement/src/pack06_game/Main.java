package pack06_game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor, eng, mat;
        int sum = 0;
        double avg;

        while (true) {
            System.out.print("���� ������ �Է��ϼ���: ");
            kor = sc.nextInt();

            if (kor < 0 || kor > 100) {
                System.out.println("�߸��� �Է��Դϴ�. 0���� 100������ ���ڸ� �Է��� �ּ���.");
                continue;
            }

            System.out.print("���� ������ �Է��ϼ���: ");
            eng = sc.nextInt();

            if (eng < 0 || eng > 100) {
                System.out.println("�߸��� �Է��Դϴ�. 0���� 100������ ���ڸ� �Է��� �ּ���.");
                continue;
            }

            System.out.print("���� ������ �Է��ϼ���: ");
            mat = sc.nextInt();

            if (mat < 0 || mat > 100) {
                System.out.println("�߸��� �Է��Դϴ�. 0���� 100������ ���ڸ� �Է��� �ּ���.");
                continue;
            }

            sum = kor + eng + mat;
            avg = (double)sum / 3;

            break;
        }

        System.out.println("����: " + sum);
        System.out.println("���: " + avg);
    }
}