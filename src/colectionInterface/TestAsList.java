package colectionInterface;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by Anonymous11100001 on 7/13/2016.
 */
public class TestAsList {
    public static void main(String[] args){
        String[] str = new String[]{"cao", "xuan", "quy"};
        System.out.println(Arrays.toString(str));

        List<String> list = Arrays.asList(str);
        System.out.println(list);

        str[0] += "88";
        System.out.println(Arrays.toString(str));
        System.out.println(list);
        list.set(1, "xuan99");
        System.out.println(Arrays.toString(str));
        System.out.println(list);

        Integer[] arrayInteger = new Integer[] {1,2,3,4};
        List<Integer> listInteger1 = Arrays.asList(arrayInteger);
        List<Integer> listInteger2 = Arrays.asList(1,2,3,4);
        System.out.println(listInteger1.equals(listInteger2));
    }
}
