package day02;

//输出所有质数
public class Zhishu {
	public static void main(String[] args)
	{
		int num=0;
		for(int i=2;i<1000;i++){
			boolean flag=true;
			int j=(int) Math.sqrt(i)+1;
			for(int k=2;k<j;k++){
				if(i%k==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				System.out.print(i+"\t");
				num++;
			}
		}
		System.out.println();
		System.out.println("num="+num);
	}
}
