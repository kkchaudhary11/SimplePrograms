import java.util.HashSet;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class HashSetEx {

    public static void main(String[] args) {

        HashSet obj = new HashSet();
        obj.add("sunday");
        obj.add("monday");
        obj.add("tuesday");

        System.out.println(obj);
        System.out.println("size before removing:" + obj.size());

        obj.remove("monday");

        System.out.println(obj);
        System.out.println("size after removing:" + obj.size());


    }
}
