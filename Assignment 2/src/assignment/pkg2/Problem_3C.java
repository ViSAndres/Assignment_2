/*********************************************************************
 Purpose/Description: This program server to solve assignment question 3.C
 Author’s Panther ID: 5676297
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
 ********************************************************************/ 
package assignment.pkg2;
import java.util.*;
/**
 *
 * @author Carlos Andres Neira
 */
public class Problem_3C {
    
    
    /**
     * This method looks through the max heap to see if it finds the oldKey. if it does, it sets the new key to replace 
     *  the old key. If it doesn't find the old key, it returns a message "  was not found in your Max - Heap" 
     * @param oldKey the key that is being looked for
     * @param newKey the key that will replace the old key if found.
     */
    public void replaceKey(Integer oldKey, Integer newKey) {
        int i;
        int[] array  = {99, 64, 42, 54, 32, 28, 6, 19, 7, 26, 4 };
        for(i =0; i < array.length -1; i++){
            if (array[i] == oldKey)
                break;
        }
        if (i == array.length){
       System.out.println(oldKey + "  was not found in your Max - Heap"); 
       return;
    }
        array[i] = newKey;
        if (i > 1 && array[i] < array[i/2])
        perlocateUp(i);
    
    else
       perlocateDown(i);
    }
}
