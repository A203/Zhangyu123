package day1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Exe04 {
	public static ArrayList<String> p = new ArrayList<String>();
	public  static void result()
	{
		System.out.println("ѧ���˵���");
		Iterator it=p.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"  ");
		}
	}
	public static void show()
	{
		System.out.println("| 1. ����1��ѧ�� | ");
		System.out.println("| 2. ��ʾ����ѧ�� |");
		System.out.println("| 3. �˳����� | ");
		System.out.println("| ������ѡ��1-3���� ");
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
						System.out.println("�˳�����");
						state=0;
						return;
				default:
					System.out.println("ѡ���������");
			}
		}
	}
}