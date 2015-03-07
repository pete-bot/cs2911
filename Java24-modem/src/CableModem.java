
public class CableModem extends Modem{
	String connMethod = "cable connection";
	
	// print out the method in use
	public void getMethod(){
		System.out.println("Connection method: " + connMethod);
	}
	
	public void connect(){
		System.out.println("Connecting to the internet...");
		System.out.println("Using a " + connMethod);
	}
	
}
