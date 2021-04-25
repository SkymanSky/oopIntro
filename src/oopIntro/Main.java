package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=15000;
		product1.detail="16 gb ram";
		
		Product product2 = new Product();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=18000;
		product2.detail="32 gb ram";
		
		Product product3 = new Product();
		product3.id=3;
		product3.name="HP 5";
		product3.unitPrice=12000;
		product3.detail="8 gb ram";
		
		Product product4 = new Product(4, "Bardak", 5,"Guzel Bardak");
		
		Product[] products = {product1,product2,product3,product4};
		
		for (Product product : products) {
			
			System.out.println(product.name);
		}
		
		//System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.Name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.Name="Ev Bahçe";
		
		Category category3 = new Category();
		category3.id=3;
		category3.Name="Otomobil";
		
		Category[] categories = {category1,category2,category3};
		
		for (Category category : categories) {
			
			System.out.println(category.Name);
		}
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);
		
	}

}
