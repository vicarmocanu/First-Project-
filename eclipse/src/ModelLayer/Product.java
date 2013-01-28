package ModelLayer;

public class Product {

	String barCode;
	String location;
	String name;
	String description;
	int buyPrice;
	int salePrice;
	int min;
	int max;
	int quantity;

	public Product(String barCode, String location, String name,
			String description, int buyPrice, int salePrice, int min, int max,
			int quantity) {
		super();
		this.barCode = barCode;
		this.location = location;
		this.name = name;
		this.description = description;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
		this.min = min;
		this.max = max;
		this.quantity = quantity;
		if (quantity < min) {
			throw new IllegalArgumentException("smaller than the minimum");
		}
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void quantityDecrement(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	public void makeProduct(String barCode, String location, String name,
			String description, int buyPrice, int salePrice, int min, int max,
			int quantity) {
		this.barCode = barCode;
		this.location = location;
		this.name = name;
		this.description = description;
		this.buyPrice = buyPrice;
		this.salePrice = salePrice;
		this.min = min;
		this.max = max;
		this.quantity = quantity;
	}

	public String print() {
		String text = "";
		text += "BarCode     : " + barCode + "\n";
		text += "Location    : " + location + "\n";
		text += "Name        : " + name + "\n";
		text += "Description : " + description + "\n";
		text += "Buy Price   : " + buyPrice + "\n";
		if (salePrice != 0) {
			text += "Sale Price  : " + salePrice + "\n";
		} else {
			text += "Sale Price  : " + " Price not set by Manager" + "\n";
		}
		text += "Min         : " + min + "\n";
		text += "Max         : " + max + "\n";
		text += "Quantity    : " + quantity + "\n";
		text += "*****************" + "\n";
		return text;
	}

	
}
