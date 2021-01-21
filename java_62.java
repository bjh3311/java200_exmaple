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
			System.out.println("int인지 확인해 봐!!");
			System.err.println(ee.getMessage());
		}catch(Exception ee)
		{
			System.out.println("야 잘좀 넣어");//NumberFormatException이 아닌 예외에서 실행
		}finally {
			System.out.println("난 반드시 수행되어야만 해!!");//무조건 실행
		}
			

	}

}
