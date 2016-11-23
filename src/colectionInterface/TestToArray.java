package colectionInterface;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/13/2016.
 */
public class TestToArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("cao");
        list.add("xuan");
        list.add("Quy");

        //Use Object[] version:
        Object[] strArray1 = list.toArray();
        System.out.println(Arrays.toString(strArray1));

        //Use Generics version:
        String[] strArray2 = list.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray2));
        String[] strArray3 = new String[]{"a", "b", "c", "d", "e", "f"};
        String[] strArray4 = list.toArray(strArray3);
        System.out.println(Arrays.toString(strArray4));
        strArray4[0] = "abcdef";
        System.out.println(Arrays.toString(strArray4));
        System.out.println(list);
    }
}
