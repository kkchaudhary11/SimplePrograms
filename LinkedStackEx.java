import java.util.LinkedList;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class LinkedStackEx {

    public static void main(String[] args) {
        LinkedList<String> mydata = new LinkedList<String>();
        mydata.add("first");
        mydata.add("second");
        mydata.add("third");

        System.out.println("Elements in LinkedList Before Push:");
        System.out.println(mydata);


        mydata.push("push element");
        System.out.println("Elements in LinkedList After PUSH:");
        System.out.println(mydata);


        mydata.pop();
        System.out.println("Elements in LinkedList After POP:");
        System.out.println(mydata);

        System.out.println("Peek Elements in LinkedList :");
        System.out.println(mydata.peek());

    }
}
