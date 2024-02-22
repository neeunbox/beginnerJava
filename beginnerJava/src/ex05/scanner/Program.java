package ex05.scanner;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
				
		Scanner scan = new Scanner(System.in);
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		// 성적 출력 부분 
		System.out.printf("┌────────────────────────────────┐");
		System.out.printf("│          성적 입력                │");
		System.out.printf("└────────────────────────────────┘");
		
		
		// 성적 출력 부분 
		System.out.printf("┌────────────────────────────────┐");
		System.out.printf("│          성적 출력                │");
		System.out.printf("└────────────────────────────────┘");
		
		total = kor1 + kor2 + kor3;
		avg = total / 3;

		System.out.printf("국어1 : 0");
		System.out.printf("국어2 : 0");
		System.out.printf("국어3 : 0");
		System.out.printf("총점 : 0");
		System.out.printf("평균 : 0.00");

	}

}
