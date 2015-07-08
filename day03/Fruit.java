package day03;

public class Fruit {
	private String name,addr;
	private int price;
	Fruit(String name,int price,String addr) {
		this.name=name;
		this.price=price;
		this.addr=addr;
	}
		void sell(){
			System.out.println("卖出"+name+price+"元/斤");
	}

	public static void main(String[] args) {
		Fruit fruit=new Fruit("香蕉", 5, "北京");
		fruit.sell();
	}

}
