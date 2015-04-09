/*
http://www.java-examples.com/calculate-circle-perimeter-using-java-example
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCirclePerimeter { 
    
    public static void main(String[] args) {

	int radius = 0;
	System.out.println("Please enter the circle radius...");
	
	try {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    radius = Integer.parseInt(br.readLine());
	} catch (NumberFormatException ne) {
	    System.out.println("Input Format Error:" + ne);
	    System.exit(0);
	} catch (IOException ioe) {
	    System.out.println("IO Exception:" + ioe);
	    System.exit(0);
	}

	double perimeter = 2 * Math.PI * radius;
	System.out.println("The perimeter is " + perimeter);
	
    }

}
