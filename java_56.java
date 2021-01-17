package java_56;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class java_56 {
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		List<Integer> ilist=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			ilist.add(scan.nextInt());
		}
		for(int i=0;i<ilist.size();i++)
		{
			System.out.printf("%d\t",ilist.get(i));
		}
		System.out.println();
		scan.close();
		
	}

}
