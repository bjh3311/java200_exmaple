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
		print(mm);//�迭�� �ǰ�
		int a=1,b=6,c=16;
		print(a);//1��¥���� �ǰ�
		print(b);//2��¥���� �ǰ�
		print(c);//3��¥���� �ǰ�
		

	}

}
