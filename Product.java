import java.math.BigDecimal;



public class Product {

	private String name = "";
	
	private Category category = null;
	
	private BigDecimal price = null;
	
	public Product(Category category, String name, BigDecimal price) {
		
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	
}
