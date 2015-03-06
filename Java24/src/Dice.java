// peter kydd
// A program to represent the rolling of dice

// we are using the import function to give us access to the java.util package
// with this we can use the Random class without having to reference
// java.ustils.Random() each time. We can instead just call Random
import java.util.*;

public class Dice {
	public static void main (String[] args){
		
		int sides = 6;
		
		// new operation here creates a new variable of class Random
		// this is a general operation that can be applied to any class
		Random numGen = new Random();
		
		int value = 1 + numGen.nextInt(sides -1);
		System.out.println("Dice rolled: "+ value);
		
	}
}
