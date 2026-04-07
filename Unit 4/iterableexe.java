
import java.util.ArrayList;
import java.util.Iterator;
public class iterableexe {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("rahul");
        names.add("ankit");
        names.add("rahul");

        Iterator<String> it=names.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
