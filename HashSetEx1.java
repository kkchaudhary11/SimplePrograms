import java.util.HashSet;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class HashSetEx1 {

    public static void main(String[] args) {

        HashSet<Price> mydata = new HashSet<Price>();
        mydata.add(new Price("item1",101));
        mydata.add(new Price("item2",202));
        mydata.add(new Price("item3",303));
        mydata.add(new Price("item4",404));

        for(Price p : mydata){
            System.out.println(p);
        }
    }
}

class Price{
    private String item;
    private int price;

    public Price(String item, int price){
        this.item = item;
        this.price = price;
    }

    public void setItem(String item){
        this.item = item;
    }

    public String getItem(){
        return item;
    }


    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
     return "item : "+item+", Price : "+price;
    }
}
