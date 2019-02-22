/*Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]*/

package com.stackroute.five;

import java.util.ArrayList;

public class UpdateElement {
    public ArrayList<String> arrayUpdate(ArrayList<String> list, String[] string, String[] keys)
    {
        for(int i=0;i<string.length;i++)
        {
            list.set(list.indexOf(string[i]),keys[i]);
        }
        return list;
    }
}
