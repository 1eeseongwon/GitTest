package pack06_game;

import java.util.Scanner;

public class feed { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int kor,eng,mat;

		while(true) {

			System.out.println("���������� �Է��ϼ���");

			 kor=Integer.parseInt(sc.nextLine());

			if(kor>100||kor<0) {

				System.out.println("�ٽ� �Է��ϼ���");

				continue;

			}break;

		}

		while(true) {

			System.out.println("���������� �Է��ϼ���");

			 eng=Integer.parseInt(sc.nextLine());

			if(eng>100||eng<0) {

				System.out.println("�ٽ� �Է��ϼ���");

				continue;

			}break;

		}

		while(true) {

			System.out.println("���������� �Է��ϼ���");

			 mat=Integer.parseInt(sc.nextLine());

			if(mat>100||mat<0) {

				System.out.println("�ٽ��Է��ϼ���");

				continue;

			}break;

			

			

		}
		System.out.println("������"+(kor+mat+eng));

		System.out.println("�����"+((kor+mat+eng)/3));

		

	}




	}


