package colectionInterface;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by Anonymous11100001 on 7/11/2016.
 */
public class ArrayListPreJDK1_5 {
     public static void main(String[] args){
         List list = new ArrayList();
         list.add("cao");
         list.add("xuan");
         list.add("quy");
         // Try add a Object Integer to List:
         Integer num = 88; // Auto boxing
         // or intialized explexit:
         Integer num2 = new Integer(100);
         list.add(num2); // when extarct this element at run tim. this Object has been dowcasted. at that point
         // Error just shown up......
         System.out.println(list);
         List linkedList = new LinkedList();
         List stack = new Stack();
         List vector = new Vector();

         Iterator iterator = list.iterator();
         while(iterator.hasNext()){
             // Object element = iterator.next();
             // Or you can downcasting explecit Objext to String:
             //String element = (String)iterator.next();
             Object element = iterator.next();
             System.out.print(element + " ");
         }
     }
}
