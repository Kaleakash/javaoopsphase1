abstract class Orders {
	abstract void payment();
}
class Paytm extends Orders {
	void payment() {
		System.out.println("Payment happend through PayTM");
	}	
}
class GooglePay extends Orders{
	void payment() {
		System.out.println("Payment happend through Google Pay");
	}
}
class PhonePay extends Orders{
	void payment() {
		System.out.println("Payment happend through Phone Pay");
	}
}
class MethodOverriding {
	public static void main(String args[]) {
	
	}
}



