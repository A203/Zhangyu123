package day01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Exe04 {
	public static ArrayList<String> p = new ArrayList<String>();
	public  static void result()
	{
		System.out.println("学生菜单：");
		Iterator it=p.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"  ");
		}
	}
	public static void show()
	{
		System.out.println("| 1. 增加1个学生 | ");
		System.out.println("| 2. 显示所有学生 |");
		System.out.println("| 3. 退出程序 | ");
		System.out.println("| 请输入选择（1-3）： ");
	}
	public static void main(String[] args)
	{
		show();
		int state=1;
		while(state!=0)
		{
			Scanner in =new Scanner(System.in);
			int select=in.nextInt();
			switch(select)
			{
				case 1:
					Scanner st=new Scanner(System.in);
					String s=st.nextLine();
					p.add(s);
					break;
				case 2:
					result();
					break;
				case 3:
						System.out.println("退出程序");
						state=0;
						return;
				default:
					System.out.println("选择输入错误");
			}
		}
	}
}