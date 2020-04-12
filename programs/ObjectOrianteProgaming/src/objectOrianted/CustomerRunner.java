package objectOrianted;

public class CustomerRunner {

	public static void main(String[] args) {
		Address address = new Address("3 p d","allahabad","211001");
		Customer customer = new Customer("rajan", address);
		System.out.println(customer);
		Address address1 = new Address("3/53","bangalore","56421");
		customer.setWorkAddress(address1);
		System.out.println(customer);
	}
}
