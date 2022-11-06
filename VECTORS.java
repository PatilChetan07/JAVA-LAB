/* Vector is like the dynamic array which can grow or shrink its size. 
Unlike array, we can store n-number of elements in it as there is no size limit. 
It is found in the java.util package and implements the List interface, 
so we can use all the methods of List interface here. */

import java.util.*;
public class Main{
    public static void main (String[] args) {
        Vector <String> vec = new Vector <String>();
        
         //Adding elements using add() method of List  
        vec.add("tiger");
        vec.add("lion");
        vec.add("dog");
        vec.add("elephant");
        System.out.println("elements in the list are : "+vec);
        
        //Adding elements using addElement() method of Vector 
        vec.addElement("rat");
        vec.addElement("monkey");
        System.out.println("elements in the list are : "+vec);
        
        vec.insertElementAt("cat",1);
        System.out.println("elements in the list are : "+vec);
        
        vec.remove("cat");
        System.out.println("elements in the list are : "+vec);
        
        vec.removeAll(vec);
        System.out.println("elements in the list are : "+vec);
    }
}
