
public class InterfaceDemo6 {
	public static void main(String[] args) {
		Product ballpen = new Product("ballpen", 200, "모나미");
		// Product another= ballpen; //주소복사

		Product another = (Product) (ballpen.copy());
		
		System.out.println("Befor change");
		System.out.println(ballpen);
		System.out.println(another);
		System.out.println("After change");
		ballpen.setPrice(50000);
		System.out.println(ballpen);
		System.out.println(another);
		
	}
}
