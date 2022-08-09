//import java.util.Arrays;
//
//
//
//public class InterfaceDemo5 {
//public static void main(String[] args) {
//	Product[]	array=new Product[3];
//	array[0]= new Product("Ballpen",200,"모나미");
//	array[1]= new Product("Notebook",250000,"애플");
//	array[2]= new Product("Keyboard",2000,"로지텍");
//	
//Arrays.sort(array);  
//System.out.println(Arrays.toString(array));
//
//
//}
//}
//
//
//class Product implements Comparable<Product>{
//	private String name;
//	private  int price;
//	private String maker;
//	
//	@Override
//	public int compareTo(Product obj) {	
////		return obj.name.compareTo(this.name);
//		return this.name.compareTo(obj.maker);
//		
//		
//		
//	}
//	public Product(String name, int price, String maker) {
//	
//		this.name = name;
//		this.price = price;
//		this.maker = maker;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", price=" + price + ", maker=" + maker + "]";
//	}
//
//
//	
//
//
//	}
