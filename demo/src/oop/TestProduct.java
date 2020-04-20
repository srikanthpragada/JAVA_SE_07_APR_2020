package oop;

class Product {
	protected String name;
	protected int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}
}

class DiscountProduct extends Product {
	protected int disrate;

	public DiscountProduct(String name, int price, int disrate) {
		super(name, price);
		this.disrate = disrate;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.disrate);	
    }
	
	public int getSellingPrice() {
		return  this.price - (this.price * this.disrate / 100);
	}
}

class ImportedProduct extends Product {
	protected int duty;

	public ImportedProduct(String name, int price, int duty) {
		super(name, price);
		this.duty = duty;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(this.duty);	
    }
	
	public int getSellingPrice() {
		return  this.price + (this.price * this.duty / 100);
	}
}

public class TestProduct {

	public static void main(String[] args) {
         DiscountProduct dp = new DiscountProduct("Product1", 10000,20);
         dp.print();
         System.out.println(dp.getSellingPrice());
	}
}
