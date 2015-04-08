/*
Source: http://www.java-examples.com/calculate-circle-area-using-java-example
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleArea {

    public static void main(String[] args) {
    
	int radius = 0;

	System.out.println("Please enter the circle radius...");

	try {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    radius = Integer.parseInt(bf.readLine());
	} catch (NumberFormatException ne) {
	    System.out.println("Invalid radius value: " + ne);
	    System.exit(0);
	} catch (IOException ioe) {
	    System.out.println("IO Error: " + ioe);
	    System.exit(0);
	}

	double area = Math.PI * radius * radius;

	System.out.println("The area is " + area);

    }

}




