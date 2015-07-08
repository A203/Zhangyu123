package day03;

public class Student {
	private String name,id,ad;
	Student(String name,String id,String ad){
		this.name=name;
		this.id=id;
		this.ad=ad;
	}
	void  self_introduce(){
		System.out.println("My name is "+name+"\n"+"adress:"+ad+"\n"+"id:"+id);
	}
	public static void main(String[] args){
		Student student=new Student("zhangyu", "2012214300", "gaobo");
		student.self_introduce();
	}

}
