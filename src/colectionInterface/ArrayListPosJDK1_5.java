package colectionInterface;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/12/2016.
 */
public class ArrayListPosJDK1_5 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("cao");
        list.add("xuan");
        list.add("quy");
        System.out.println(list);
        // !list.add(new Integer(100));
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            //Complier automatic inesrt Downcast operator
            String e = iterator.next();
            System.out.print(e + " ");
        }
        System.out.println();
        //Enhanced in JDk 1.5 for loop:
        for(String s : list){
            System.out.print(s + " ");
        }
    }
}
