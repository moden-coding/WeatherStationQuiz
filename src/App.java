/**
* The problem
*    A weather sensor records the temperature several times a day and stores the readings in an array. 
*    To save space, we only want to keep a quick snapshot of each day: the first reading, the middle reading, and the last reading.   
*    
*    Write the method public static int[] snapshot(int[] readings) so that it returns a new array of length 3 containing:   
*    index 0: the first reading 
*    index 1: the middle reading
*    index 2: the last reading  
*    You can assume readings always has an odd length of 1 or more, so there is always exactly one middle element.  
* Rules  
*    Your method must work for an array of any odd length, not just the ones in Main. Don't hard-code index numbers like readings[2] 
*       for the middle or last element.
*    No loops needed. If you find yourself writing one, step back and think about .length.  
*    Don't change main or printArray.   

 * 
 * 
 */
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int[] monday = {12, 15, 19, 22, 18};
        int[] tuesday = {3, 9, 4};
        int[] wednesday = {7};
        int[] thursday = {40, 41, 43, 45, 44, 42, 38};
        
        printArray(snapshot(monday));
        printArray(snapshot(tuesday));
        printArray(snapshot(wednesday));
        printArray(snapshot(thursday));

    }

    public static int[] snapshot(int[] readings) {
        return null;
    }


    // Provided: prints an array as comma-separated values. Do not change.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println();
    }



}
