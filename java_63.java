package java_63;
import java.util.Scanner;
public class java_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try 
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("==>0���� ������ Ȯ���غ�!!!");
		}
		finally
		{
			System.out.println("�� ����Ǿ�߸� ��!!");
		}

	}

}
