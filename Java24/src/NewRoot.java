
public class NewRoot {
	public static void main(String[] args){
		int number = 100;
		
		// check to see if there was user input
		if(args.length > 0){
			// .parseInt() takes a string and converts it to the appropriate Int value. 
			// ex: "25" -> 25
			number = Integer.parseInt(args[0]);
		}
		
		System.out.println("the square root of number "+number+" is:"+(float)Math.sqrt(number));	
	}
}
