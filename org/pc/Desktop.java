package org.pc;

public class Desktop implements Software, Hardware {

	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources: Input/ Output Port");
		 
	}

	@Override
	public void Softwareresources() {
		System.out.println("Software Resources: Logical concept");
		
	}
	public static void main(String[] args) {
		Desktop m = new Desktop();
		m.hardwareResources();
		m.Softwareresources();
	}

}
