
public class DSLModem extends Modem{
	String connMethod = "Digital Subscriber Line connection";
	
	// print out the method in use
	public void getMethod(){
		System.out.println("Connection method: " + connMethod);
	}
	
	public void connect(){
		System.out.println("Connecting to the internet...");
		System.out.println("Using a " + connMethod);
	}
	
	
}
