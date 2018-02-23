import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kGenerics {
    public static void main(String[] args) {
        Number[] array = new Integer[]{1};
        array[0] = 1.0; // ArrayStoreException

        List<? extends Number> list = new ArrayList<Integer>();
//        Number number = list.get(0);
//        list.set(0, new Integer(1));

        System.out.println(Arrays.toString(array));
    }
}
