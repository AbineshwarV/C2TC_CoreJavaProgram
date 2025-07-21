package Day.Entity;

public class CustomerDemo {

	public static void main(String[] args) {
		// using Class and Object
		// Customer 1 
		Customer c1 = new Customer();
		c1.did=101;
		c1.dname="Abineshwar V";
		c1.dcity="Pondicherry";
		System.out.println(c1.did);
		System.out.println(c1.dname);
		System.out.println(c1.dcity);
		System.out.println("------------");
		
		// Customer 2
		Customer c2 = new Customer();
		c2.did=102;
		c2.dname="Tom";
		c2.dcity="Chennnai";
		System.out.println(c2.did);
		System.out.println(c2.dname);
		System.out.println(c2.dcity);
		System.out.println("------------");
		
		
		// Using Setter and Getter method
		// Customer 3
		Customer c3 = new Customer();
		c3.setCid(103);;
		c3.setCname("Tom");
		c3.setCity("Delhi");
		System.out.println(c3.getCid());
		System.out.println(c3.getCname());
		System.out.println(c3.getCity());
		System.out.println("------------");
		
		// Using toString method
		// Customer 3 
		Customer c4 = new Customer();
		c4.setCid(104);
		c4.setCname("Adhi");
		c4.setCity("Bangluru");
		System.out.println(c4);
		System.out.println("------------");
		

	}

}
