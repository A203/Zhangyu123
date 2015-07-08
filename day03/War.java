package day03;

//Assaultable 接口，接口类型的默认方法是public
interface Assaultable {
	void attack();
}
// Mobile 接口
interface Mobile {
	void move();
}
// 抽象类实现Assaultable，Mobile，实现接口权限必须大于或等于接口权限
abstract class Weapon implements Mobile, Assaultable {
	public void attack() {
	};

	public void move() {
	};
}

// 定义3个类：Tank,Flighter,WarShip都继承自Weapon
//分别用不同的方式实现 Weapon 类中的抽象方法。
class Tank extends Weapon {
	public void attack() {
		System.out.println("坦克攻击");
	}

	public void move() {
		System.out.println("坦克移动");
	}
}

class Flighter extends Weapon {
	public void attack() {
		System.out.println("飞机攻击");
	}

	public void move() {
		System.out.println("飞机移动");
	}
}

class WarShip extends Weapon {
	public void attack() {
		System.out.println("潜艇攻击");
	}

	public void move() {
		System.out.println("潜艇移动");
	}
}

// 写一个类Army,代表一支军队，这个类有一个属性是Weapon数组w（用来存储该军队所拥有的所有武器）；
// 该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量
// 并用这一大小来初始化数组w。
// 该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中。
// 在这个类中还定义两个方法attackAll()和moveAll()，让w数组中的所有武器攻击和移动。
class Army {
	private Weapon[] w;
	static int size;

	Army(int num) {
		this.w = new Weapon[num];
		size = 0;
	}

	void addWeapon(Weapon wa){
		if(size<w.length)
		w[size++]=wa;
	}

	void attackAll() {
		for (int i = 0; i < size; i++) {
			w[i].attack();
		}
	}

	void moveAll() {
		for(int i=0;i<size;i++){
			w[i].move();
		}
	}
}
//主函数
class War {
	public static void main(String[] args) {
		Army army=new Army(3);
		army.addWeapon(new Tank());
		army.addWeapon(new Flighter());
		army.addWeapon(new WarShip());
		army.attackAll();
		army.moveAll();
	}
}