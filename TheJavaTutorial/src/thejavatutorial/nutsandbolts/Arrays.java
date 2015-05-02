/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thejavatutorial.nutsandbolts;
import java.math.*;

/**
 *
 * @author orlan_000
 */
public class Arrays {
    public void printArrays() {
        int [] newAr = new int[5];
        for (int i = 0, n = newAr.length; i < n; i++) {
            newAr[i] = i*((int)(Math.floor(Math.random()*10)));
        }
        
        System.out.println("Array demo");
        System.out.println("newArr length is: " + newAr.length);
        int i = 0;
        for (int x: newAr) {
            System.out.print("newArr[" + i + "]" + ":" + x + " ");
            i++;
        }
        System.out.println("");
    }
    
    public void printArraysCopy() {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
    
    public void printMultiDimArray() {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
