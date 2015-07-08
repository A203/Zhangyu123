package day03;

abstract class Fruit01{
	abstract String fruitName();
}
class Apple extends Fruit01{
	String  fruitName(){
		return "苹果";
	}
}
class Balana extends Fruit01{
	String fruitName(){
		return"香蕉";
	}
}
class Orange extends Fruit01{
	String fruitName(){
		return"橘子";
	}
}

public class Juice {
	public static void main(String[] args) {
		Fruit01 fruit01=new Apple();
		zhazhi(fruit01);
	}
public static void zhazhi(Fruit01 name){
	System.out.println("榨"+name.fruitName()+"汁");
}
}
