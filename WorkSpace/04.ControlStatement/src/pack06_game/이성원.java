
import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// �ۼ��� : �迵��
// ���� : ���� �ǵ��
//int i = 0; => �����̸��� �ǹ��ִ°��� ���� ����.
// continue �� break�κ��� �� �����ϽŰͰ����ϴ�.
// ����ϼ̽��ϴ�.
public class �̼��� {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);

		int i = 0;

		while (true) {

			i++;

			System.out.print("1���� 100������ ������ �Է��ϼ��� ��");
			int userNum = Integer.parseInt(sc.nextLine());

			if (random == userNum) {

				System.out.println("���ڸ� �������ϴ�!");

				System.out.println("�õ� Ƚ���� " + i + "���Դϴ�");

				break;

			} else if (random < userNum) {

				System.out.println("�� ���� ���� �Է��ϼ���");

			} else {

				System.out.println("�� ū ���� �Է��ϼ���");

			}

		}

		int kor, eng, mat;

		while (true) {

			System.out.println("���������� �Է��ϼ���");

			kor = Integer.parseInt(sc.nextLine());

			if (kor > 100 || kor < 0) {

				System.out.println("�ٽ� �Է��ϼ���");

				continue;

			}
			break;

		}

		while (true) {

			System.out.println("���������� �Է��ϼ���");

			eng = Integer.parseInt(sc.nextLine());

			if (eng > 100 || eng < 0) {

				System.out.println("�ٽ� �Է��ϼ���");

				continue;

			}
			break;

		}

		while (true) {

			System.out.println("���������� �Է��ϼ���");

			mat = Integer.parseInt(sc.nextLine());

			if (mat > 100 || mat < 0) {

				System.out.println("�ٽ��Է��ϼ���");

				continue;

			}
			break;

		}
		System.out.println("������" + (kor + mat + eng));

		System.out.println("�����" + ((kor + mat + eng) / 3));

	}

}
