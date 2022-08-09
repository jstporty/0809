

class Product implements Comparable<Product>,Cloneable{
	private String name;
	private  int price;
	private String maker;
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	Object copy()	{
		Object obj=null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다");
			e.printStackTrace();
		}
		return obj;
	}
	
	@Override
	public int compareTo(Product obj) {	
//		return obj.name.compareTo(this.name);
		return this.name.compareTo(obj.maker);
		
		
		
	}
	public Product(String name, int price, String maker) {
	
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", maker=" + maker + "]";
	}


	


	}
