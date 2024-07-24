import java.util.Scanner;
import java.util.Arrays;

public class Restroom {

    public static void main(String[] args) {
    	
    	
        Scanner scanning = new Scanner(System.in);
        System.out.print("Enter the number of stalls: ");
        int numberStalls = scanning.nextInt();
        


        boolean[] stalls = new boolean[numberStalls]; // Array to track stall occupancy
        

        while (true) {
        	
        	 int LongestSequenceBeginning = 0, LongestSequence = 0;
             int CheckingSequenceBeginning = 0, CheckingSequence = 0;
        	
             
             // Searching for the longest sequence of unfilled stalls except last sequence
              
             for(int k = 0;k<numberStalls;k++) {
            	 
            	 if(stalls[k] == false) {
            		 CheckingSequence++;
            	 }else {
            		 
            		 if(CheckingSequence>LongestSequence) {
            			 LongestSequenceBeginning = CheckingSequenceBeginning;
            			 LongestSequence = CheckingSequence;
            		 }
            		 
            		 CheckingSequenceBeginning = k+1;
            		 CheckingSequence = 0;
            		 
            	 }
            	 
            	 
             }
             
             // Checking for the last sequence
             
             if(CheckingSequence > LongestSequence) {
            	 LongestSequence = CheckingSequence;
            	 LongestSequenceBeginning = CheckingSequenceBeginning;
             }
             
             //Stop if every stalls are full
             if(LongestSequence == 0 || numberStalls<=0) {
            	 
            	 break;
             }
             
             int midOfLongestSequence = LongestSequenceBeginning + LongestSequence / 2;
             
             
             if(LongestSequence==2) {
            	 
            	 if(LongestSequenceBeginning > (numberStalls/2)) {
            		 stalls[midOfLongestSequence ] = true; 
            	 }else {
            		 stalls[midOfLongestSequence - 1] = true;
            	 }
             }else {
            	 stalls[midOfLongestSequence] = true;
             }
           
             System.out.println(Arrays.toString(stalls).replace("true", "X").replace("false", "-"));    	
            
        }
    }
    
}