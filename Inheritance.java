package inheritance;
class Basic
{
	int work_time;
	long work_pay;
	protected void day_pay()
	{
		System.out.println("�� �޿�����="+(work_time*work_pay));
	}
}
class Night extends Basic
{
	long danger=50000;
	long special=17000;
	public void work()
	{
		super.day_pay();
		System.out.println("�߰� �� �� �޿���="+(danger*special));
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Night a=new Night();
		a.work_time=7;
		a.work_pay=13000;
		a.work();

	}

}
