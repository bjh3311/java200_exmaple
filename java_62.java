package java_62;

public class java_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sNum="123";
		String nNum="h";
		try {
			int a=Integer.parseInt(sNum);
			int[] arr=new int[10];
			System.out.println(arr[10]);
		}catch(NumberFormatException ee) {
			System.out.println("int���� Ȯ���� ��!!");
			System.err.println(ee.getMessage());
		}catch(Exception ee)
		{
			System.out.println("�� ���� �־�");//NumberFormatException�� �ƴ� ���ܿ��� ����
		}finally {
			System.out.println("�� �ݵ�� ����Ǿ�߸� ��!!");//������ ����
		}
			

	}

}
