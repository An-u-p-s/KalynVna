package makemytrip.flights;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Star1 {
	
    public static int numericKeyboardInput(Scanner sc){
    	
    	int input = 0;
    	try {
    	 input = sc.nextInt();
    	} catch(Exception e){
    	   System.out.println("Your Mismatch Input.");
    	}
    	return input;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Star1 star1 = new Star1();
		System.out.println("Enter row size: ");
		int row = Star1.numericKeyboardInput(sc);
		// int row = Integer.parseInt(sc.nextLine());  
                
          
		System.out.println("Enter column size: ");
		int column = Star1.numericKeyboardInput(sc);  
		
		System.out.println("row is: " + row);   
        System.out.println("column is: " + column); 
	
        /* */
        long total_boxes = row * column;
        System.out.println("total_boxes is: " + total_boxes); 
        /* */
        
        sc.close();
	}

}