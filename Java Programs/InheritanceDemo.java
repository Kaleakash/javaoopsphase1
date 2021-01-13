class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Black");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Gray");
	}	
}
class InheritanceDemo {
	public static void main(String args[]) {
	Pulsar pu = new Pulsar();
	pu.speed();	pu.color();
	Honda hh = new Honda();
	hh.speed();		hh.color();
	}
}