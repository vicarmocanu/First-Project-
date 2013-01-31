package ModelLayer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class ContractorCollection here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractorCollection {
	ArrayList<Contractor> listOfContractors;

	private static ContractorCollection instance = null;

	private ContractorCollection() {
		listOfContractors = new ArrayList<>();
	}

	public static ContractorCollection getInstance() {
		if (instance == null) {
			instance = new ContractorCollection();

		}

		return instance;
	}

	public void createContractor(String name, String id, String address,
			String phoneNumber) {
		Contractor contractor = new Contractor(name, id, address, phoneNumber);
		listOfContractors.add(contractor);
	}

	public String listAllContractors() {
		// String text;
		// text = "";
		// if (listOfContractors.size()!=0){
		// for(Contractor i : listOfContractors)
		// {
		// i.printContractor();
		// System.out.println("*****************************");
		// }
		// }
		// else System.out.println("No contractor registred in the system");
		String text;
		text = "";
		if (listOfContractors.size() != 0) {
			for (Contractor i : listOfContractors) {
				text += i.print() + "\n";
				text += "********************" + "\n";
			}
		} else
			text = "No contractor registered in the system";
		return text;
	}

	public boolean listContractorByName(String name) {
		if (listOfContractors.size() != 0) {
			for (Contractor i : listOfContractors) {
				if (i.name.equals(name)) {
					i.printContractor();
					System.out.println("*****************************");
					return true;
				}
			}

		}
		System.out.println("No contractor with that name in the system");
		return false;
	}

	public String listContractorByNamePrint(String name) {
		// if (listOfContractors.size()!=0){
		// for(Contractor i : listOfContractors)
		// {
		// if(i.name.equals(name))
		// {
		// i.printContractor();
		// System.out.println("*****************************");
		// return true;
		// }
		// }
		//
		// }
		// System.out.println("No contractor with that name in the system");
		// return false;

		String text;
		text = "";
		if (listOfContractors.size() != 0) {
			for (Contractor i : listOfContractors) {
				if (i.name.equals(name)) {
					text += i.print() + "\n";
					break;
				}

			}

		} else
			text = "No contractor in the system" + "\n";
		if(text.equals("")) text = "No contractor with that name in the system";
		return text;
	}

	public void deleteContractor(String name) {
		Iterator<Contractor> it = listOfContractors.iterator();
		boolean found = false;
		while (it.hasNext()) {

			if (it.next().name.equals(name)) {
				it.remove();
				System.out
						.println("Contractor successfuly deleted from the system!");
				found = true;
			}
		}
		if (!found)
			System.out
					.println("No customer registred with that name in the system.");
	}

	public void updateContractorId(String name, String id) {
		ArrayList<Contractor> select = new ArrayList<Contractor>();
		boolean found = false;
		if (listOfContractors.size() != 0) {

			for (Contractor a : listOfContractors) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setId(id);
					found = true;
					System.out.println("Update Successful!");
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateContractorAddress(String name, String address) {
		ArrayList<Contractor> select = new ArrayList<Contractor>();
		boolean found = false;
		if (listOfContractors.size() != 0) {

			for (Contractor a : listOfContractors) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setAddress(address);
					System.out.println("Update Successful!");
					found = true;
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateContractorPhoneNumber(String name, String phoneNumber) {
		ArrayList<Contractor> select = new ArrayList<Contractor>();
		boolean found = false;
		if (listOfContractors.size() != 0) {

			for (Contractor a : listOfContractors) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setPhoneNumber(phoneNumber);
					System.out.println("Update Successful!");
					found = true;
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

}
