import java.util.*;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class ChekListDataEx {

    public static void main(String[] args) {
        LinkedList<String> mydata = new LinkedList<String>();

        mydata.add("First");
        mydata.add("Second");
        mydata.add("Third");
        mydata.add("Rendom");

        List<String> listdata = new LinkedList<String>();

        listdata.add("Second");
        listdata.add("Rendom");

        System.out.println("Does list contains all the List Elements ? :" + mydata.containsAll(listdata));

        listdata.add("top");

        System.out.println("Does list contains all the List Elements ? :" + mydata.containsAll(listdata));

    }

}
