
import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// 작성자 : 김영문
// 내용 : 과제 피드백
//int i = 0; => 변수이름은 의미있는것을 쓰면 좋음.
// continue 와 break부분을 잘 이해하신것같습니다.
// 고생하셨습니다.
public class 이성원 {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);

		int i = 0;

		while (true) {

			i++;

			System.out.print("1부터 100사이의 정수를 입력하세요 ▶");
			int userNum = Integer.parseInt(sc.nextLine());

			if (random == userNum) {

				System.out.println("숫자를 맞혔습니다!");

				System.out.println("시도 횟수는 " + i + "번입니다");

				break;

			} else if (random < userNum) {

				System.out.println("더 작은 수를 입력하세요");

			} else {

				System.out.println("더 큰 수를 입력하세요");

			}

		}

		int kor, eng, mat;

		while (true) {

			System.out.println("국어점수를 입력하세요");

			kor = Integer.parseInt(sc.nextLine());

			if (kor > 100 || kor < 0) {

				System.out.println("다시 입력하세요");

				continue;

			}
			break;

		}

		while (true) {

			System.out.println("영어점수를 입력하세요");

			eng = Integer.parseInt(sc.nextLine());

			if (eng > 100 || eng < 0) {

				System.out.println("다시 입력하세요");

				continue;

			}
			break;

		}

		while (true) {

			System.out.println("수학점수를 입력하세요");

			mat = Integer.parseInt(sc.nextLine());

			if (mat > 100 || mat < 0) {

				System.out.println("다시입력하세요");

				continue;

			}
			break;

		}
		System.out.println("총점은" + (kor + mat + eng));

		System.out.println("평균은" + ((kor + mat + eng) / 3));

	}

}
