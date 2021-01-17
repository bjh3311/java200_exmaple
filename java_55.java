package java_55;

public class java_55 {
	public static void print(int ... mm)
	{
		for(int m:mm)
		{
			System.out.printf(m+"\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mm= {5,1,3,6};
		print(mm);//배열도 되고
		int a=1,b=6,c=16;
		print(a);//1개짜리도 되고
		print(b);//2개짜리도 되고
		print(c);//3개짜리도 되고
		

	}

}
