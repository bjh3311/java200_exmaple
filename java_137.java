package java_137;

public class java_137 {
	public static class Hanoi 
	{
		int tray=3;
		int bar=3;
		int[][] rings;
		public Hanoi(int tray)
		{
			this.tray=tray;
			rings=new int[tray][bar];
			for(int i=0;i<rings.length;i++)
			{
				int x=2*i+1;
				rings[i][0]=x;
			}
		}
		public int[][] getRings()
		{
			return rings;
		}
		public void moveHanoi(int n,char a,char b,char c)
		{
			if(n==1)
			{
				System.out.println(a+" bar쪽에 있던 링이"+b+" 쪽에 있는 링으로 옮김");
			}
			else
			{
				moveHanoi( n-1, a, c,b);
				System.out.println(a+" bar쪽에 있던 링이"+b+" 쪽에 있는 링으로 옮김");
				moveHanoi(n-1,c,b,a);	
			}
		}	
	}
	public static void main(String[] args)
	{
		int tray=4;
		Hanoi ha=new Hanoi(tray);
		ha.moveHanoi(tray,'a','b','c');
	}
	

}


