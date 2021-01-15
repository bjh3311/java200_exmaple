package study;
import java.util.Scanner;

public class Java_25 {

	public static void main(String[] args) {
		     Scanner scann=new Scanner(System.in);
	         System.out.println("정수를 입력하세요.");
	         int choice=scann.nextInt();
	         System.out.println(choice);
	         
	         System.out.println("실수를 입력하세요.");
	         double rchoice=scann.nextDouble();
	         System.out.println(rchoice);
	         
	         System.out.println("문자열을 입력하세요.");
	         String schoice=scann.next();
	         System.out.println(schoice);

	}

}
