package day03;

public class Phone {
	// 属性（特征）
	private String name;
	private int price;
	private String brand;
	Phone(String name,String brand,int price) {
		this.name=name;
		this.brand=brand;
		this.price=price;
		
	}
	// 行为（方法）
	// void 方法的返回类型
	// call方法名
	void call() {
		System.out.println("打电话.....");
	}
	void method() {
		System.out.println("发短信......");
	}
	public static void main(String[] args){
		Phone phone=new Phone("note3","爆米花",3000);
		phone.call();
		phone.method();
	}

}
