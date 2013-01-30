package ModelLayer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class EmployeeCollection here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeCollection {

	ArrayList<Employee> listOfEmployees;
	private static EmployeeCollection instance = null;

	private EmployeeCollection() {
		listOfEmployees = new ArrayList<>();
	}

	public static EmployeeCollection getInstance() {
		if (instance == null) {
			instance = new EmployeeCollection();

		}

		return instance;
	}

	public void createEmployee(String name, String id, String address,
			String phoneNumber, String position, int salary) {
		Employee employee = new Employee(name, id, address, phoneNumber,
				position, salary);
		listOfEmployees.add(employee);
		System.out.println("Employee created! ");

	}

	public String listAllEmployees() {
		// if (listOfEmployees.size()!=0){
		// for(Employee i : listOfEmployees)
		// {
		// i.printEmployee();
		// System.out.println("*****************************");
		// }
		// }
		// else System.out.println("No employees registred in the system");

		String text;
		text = "";
		if (listOfEmployees.size() != 0) {
			for (Employee i : listOfEmployees) {
				text += i.print() + "\n";

			}
		} else
			text = "No employees registered in the system";
		return text;
	}

	public String listAllEmployeesWithStatistics() {
		String text = "";
		if (listOfEmployees.size() != 0) {
			for (Employee i : listOfEmployees) {
				text += i.printEmployeeWithStatistics() + "\n";
				text += "*****************************" + "\n";
			}
		} else
			text = "No employees registred in the system" + "\n";
		return text;
	}

	public boolean listEmployeeByName(String name) {
		if (listOfEmployees.size() != 0) {
			for (Employee i : listOfEmployees) {
				if (i.name.equals(name)) {
					i.printEmployee();
					System.out.println("*****************************");
					return true;
				}
			}

		}
		System.out.println("No employee with that name in the system");
		return false;
	}

	public String listEmployeeByNamePrint(String name) {
		// if (listOfEmployees.size()!=0){
		// for(Employee i : listOfEmployees)
		// {
		// if(i.name.equals(name))
		// {
		// i.printEmployee();
		// System.out.println("*****************************");
		// return true;
		// }
		// }
		//
		// }
		// System.out.println("No employee with that name in the system");
		// return false;

		String text;
		text = "";
		if (listOfEmployees.size() != 0) {
			for (Employee i : listOfEmployees) {
				if (i.name.equals(name)) {
					text += i.print() + "\n";
				}

			}

		}else text = "No employees in the system" + "\n";
		if (text.equals("")) text = "No employees in the system with that name" + "\n";
		return text;
	}

	public void deleteEmployee(String name) {
		Iterator<Employee> it = listOfEmployees.iterator();

		while (it.hasNext()) {
			if (it.next().name.equals(name)) {
				it.remove();
				System.out
						.println("Employee successfuly deleted from the system!");
			}
		}
	}

	public void updateEmployeeId(String name, String id) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
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

	public void updateEmployeeAddress(String name, String address) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
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

	public void updateEmployeePhoneNumber(String name, String phoneNumber) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
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

	public void updateEmployeePosition(String name, String position) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setPosition(position);
					System.out.println("Update Successful!");
					found = true;
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateEmployeeSalary(String name, int salary) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {
			for (Employee a : listOfEmployees) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setSalary(salary);
					System.out.println("Update Successful!");
					found = true;
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateEmployeeTotalFromOrders(String name, double total) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setTotalAmountFromOrders(total);
					found = true;
					System.out
							.println("Order successfuly registred to employee's statistics!");
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateEmployeeTotalFromSales(String name, int total) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setTotalAmountFromSales(total);
					found = true;
					System.out
							.println("Order successfuly registred to employee's statistics!");
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}

	public void updateEmployeeTotalFromLeases(String name, int total) {
		ArrayList<Employee> select = new ArrayList<Employee>();
		boolean found = false;
		if (listOfEmployees.size() != 0) {

			for (Employee a : listOfEmployees) {
				if (a.name.equals(name)) {
					select.add(a);
					a.setTotalAmountFromLeases(total);
					found = true;
					System.out
							.println("Lease successfuly registred to employee's statistics!");
				}

			}
			if (!found)
				System.out.println("No employee with that name in the system.");
		} else
			System.out.println("No employee registred in the system");
	}
}
