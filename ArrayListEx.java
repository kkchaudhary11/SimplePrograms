
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class ArrayListEx {
    ArrayList<Book> bookArrayList = new ArrayList<>();


    void add(){
        Book book = new Book("first",500);
        Book book2 = new Book("second",600);
        Book book3 = new Book("third",300);
        bookArrayList.add(book);
        bookArrayList.add(book2);
        bookArrayList.add(book3);
    }

    void display()
    {
        System.out.println("toString:");
        System.out.println(bookArrayList);

        System.out.println("for loop:");
        for(Book b : bookArrayList){
            System.out.println("Book Name" + b.BookName);
            System.out.println("Price: " + b.Price);
        }

        System.out.println("Iterator:");
        ListIterator itr = bookArrayList.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    public static void main(String[] args) {

        ArrayListEx arrayListEx = new ArrayListEx();
        arrayListEx.add();
        arrayListEx.display();
    }

    public class Book{
        private String BookName;
        private int Price;

        public Book(String bookName, int price) {
            BookName = bookName;
            Price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "BookName='" + BookName + '\'' +
                    ", Price=" + Price +
                    '}';
        }
    }
}
