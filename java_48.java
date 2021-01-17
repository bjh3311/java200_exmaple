package java_48;

public class java_48 {
	public static int Eachsum(int n)
	{
		int tot=0;
		while(n!=0)
		{
			tot+=n%10;
			n=n/10;
		}
		
		return tot;
	}

	public static void main(String[] args) {
		int a=1234567;
		System.out.println(Eachsum(a));

	}

}
