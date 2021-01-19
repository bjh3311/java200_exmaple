package java_79;

public class java_79 {

	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법1");
		int[][] a=new int[4][3];//4x3 배열
		a[0][0]=1;
		a[0][1]=2;
		println(a);
		
		System.out.println("//2차원 배열방법 2(지그재그도 가능");
		int[][] b=new int[3][];
		b[0]=new int[4];
		b[1]=new int[5];
		b[2]=new int[3];
		println(b);
		
		System.out.println("//2차원 배열 방법3");
		int[][] c=new int[][] {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		println(c);
		
		System.out.println("copy 1");
		int[][] d=new int[c.length][c[0].length];
		for(int i=0;i<c.length;i++)
		{
			System.arraycopy(c[i],0,d[i],0,d[i].length);
		}
		println(d);

	}
	public static void println(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
