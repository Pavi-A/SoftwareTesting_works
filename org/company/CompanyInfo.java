package org.company;

public class CompanyInfo {
	private void CompanyName(String name, int Id) {
		System.out.println("My comany name is:"+ name);
		System.out.println("My Id number is:"+ Id);
}
	 private void CompanyName(String city, long number) {
		System.out.println("My city is:"+ city);
        System.out.println("My mobile Number is:"+ number);
	}
     private void CompanyName(String address,float salary) {
		System.out.println("My company address is:"+ address);
		System.out.println("My salary is :"+ salary);

	}
     public static void main(String[] args) {
		CompanyInfo m = new CompanyInfo();
		m.CompanyName("pavithra", 1234);
		m.CompanyName("karaikudi", 8825981612l);
		m.CompanyName("Kochin", 12000f);
	}
}
