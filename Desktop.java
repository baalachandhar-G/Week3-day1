package org.system;

public class Desktop extends Computer {

	
	public void desktopSize() {
		
		System.out.println("This is desktopSize");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop DS= new Desktop();
		
		DS.computerModel();
		DS.desktopSize();
	}

}
