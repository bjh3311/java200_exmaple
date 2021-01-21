package java_50j;

public class java_50 {
	public static String Shifts(int a)
	{
		String s="";
		for(int i=0;i<=31;i++)
		{
			int aa=a%2;
			s=(aa>=0)?aa+s:(-aa)+s;
			a>>=1;
		}
		return s;
	}


	public static void main(String[] args) {
	          int Num1=123;
	          int Num2=-123;
	          System.out.printf("%d : %s%n", Num1,Shifts(Num1));
	          System.out.printf("%d : %s%n", Num2,Shifts(Num2));

	}
	
}
