package my.learning.test;

public class CreatingEmpoyeesTest {

	public static void main(String[]args){
		
		Employee v1 = new Employee();
		
		v1.setFirstName("Virat");
		v1.setLastName("Kholi");
		
		
		OfficeAddress viratAddress= new OfficeAddress();
		
		viratAddress.setSteetName("123 Street");
		viratAddress.setCityName("Ashburn");
		viratAddress.setState("Virginia");
		viratAddress.setZipCode(12345);
		
		v1.setOfficeAddress(viratAddress);
		
		Employee v2= new Employee();
		v2.setFirstName("Dhoni");
		v2.setLastName("Mahi");
		
		OfficeAddress dhoniAddress= new OfficeAddress();
		
		dhoniAddress.setCityName("43256 New Street");
		dhoniAddress.setCityName("Ashburn");
		dhoniAddress.setState("Virginia");
		dhoniAddress.setZipCode(22150);
		
		v2.setOfficeAddress(dhoniAddress);
		
		
		System.out.println(v1.getFirstName()+ " "+ v1.getLastName()+ " "+v1.getOfficeAddress().getSteetName());
		
		
		
		
	}
	
	
	
	
	
	
}
