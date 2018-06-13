/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        for(i =0; i < array.lenght -1; i++){
            if (array[i].equals(oldKey))
                break;
        }
        if (i == array.length){
       System.out.println(oldKey + "  was not found in your Max - Heap"); 
       return;
    }
        array[i] = newKey;
        if (i>1 && array[i].compareTo(array[i/2])<0)
       heapUp(i);
   else
       heapDown(i);
    }
}
