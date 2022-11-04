/*accept a age amd gender from user and display the rate of interest */

package shruti;

import java.util.Scanner;

public class Question_5 {
	public static void main(String[]args) {
		int AGE; char GENDER;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the AGE:- ");
		AGE =sc.nextInt();
		System.out.println("Enter the GENDER:- ");
		GENDER=sc.next().charAt(0);
		    if(AGE>=60) {
		    if(GENDER=='m') {
		    System.out.println("Rate Of Interesrt 7%");
		}
		    
		    else {
		    	System.out.println("Rate Of Interest 7.5");
		    }
		    }
		    else {
		    	System.out.println("Rate Of Interest 5%");
		    }
		     	
	}

}
