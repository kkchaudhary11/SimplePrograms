/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class GerericClassEx {

    //dictionary<String,String> datam = new dictionary<String,String>("Apple","It is a type Fruit");


    public static void main(String[] args) {
        dictionary<String,String> datam = new dictionary<String,String>("Apple","It is a type Fruit");

        datam.printmeaning();

    }

    static class dictionary<W,M>
    {
        private W word;
        private M meaning;

        public dictionary(W word, M meaning) {
            this.word = word;
            this.meaning = meaning;

        }
        private void printmeaning(){
            System.out.println(word);
            System.out.println(meaning);
        }
    }
}
