package ModelLayer;

import java.util.ArrayList;

/**
 * Write a description of class ProductCollectionForLease here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductCollectionForLease {
	private static ProductCollectionForLease instance;

	ArrayList<ProductForLease> listOfProductsForLease;

	private ProductCollectionForLease() {
		listOfProductsForLease = new ArrayList();
	}

	public static ProductCollectionForLease getInstance() // singleton of the
															// class;
	{
		if (instance == null) {
			instance = new ProductCollectionForLease();

		}

		return instance;
	}

	public void addProductForLease(ProductForLease product) {
		listOfProductsForLease.add(product);
	}

	public void makeProductForLease(String barCode, String location,
			String name, String description, String status, int pricePerDay) {
		ProductForLease product = new ProductForLease(barCode, location, name,
				description, status, pricePerDay);
		listOfProductsForLease.add(product);
	}

	public String checkStatus(String name) {
		String result = null;
		if (listOfProductsForLease.size() != 0) {
			for (ProductForLease i : listOfProductsForLease) {
				if (i.name.equals(name)) {
					result = i.getStatus();
				}
			}
		} else {
			System.out.println("The list is empty!");
			result = null;
		}
		return result;
	}

	public void changeProductForLeaseStatus(String name) {
		String status = null;
		if (listOfProductsForLease.size() != 0) {
			for (ProductForLease i : listOfProductsForLease) {
				if (i.name.equals(name)) {
					if (i.status.equals("Available")) {
						status = "Unavailable";
					} else if (i.status.equals("Unavailable")) {
						status = "Available";
					}
					i.updateStatus(status);
				}
			}
		} else
			System.out.println("The list is empty!");
	}

	public ProductForLease searchProduct(String name) {
		ProductForLease result = null;
		if (listOfProductsForLease.size() != 0) {
			for (ProductForLease i : listOfProductsForLease) {
				if (i.name.equals(name)) {
					i.print();
					result = i;

				}
			}
		} else
			System.out.println("The list is empty");
		return result;
	}

	public boolean searchExistProduct(String name) {
		ProductForLease result = null;
		if (listOfProductsForLease.size() != 0) {
			for (ProductForLease i : listOfProductsForLease) {
				if (i.name.equals(name)) {
					i.print();
					return true;

				}
			}
		} else
			System.out.println("The list is empty");
		return false;
	}

	public String print() {
		String text = "";
		if (listOfProductsForLease.size() != 0) {
			for (ProductForLease i : listOfProductsForLease) {
				text += i.print();
				text += "******************" + "\n";
			}
		} else
			text = "The list is empty!";
		return text;
	}

}
