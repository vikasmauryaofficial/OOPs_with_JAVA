
import java.util.SortedSet;
import java.util.TreeSet;


public class sortedsetexample {
    public static void main(String[] args) {
        SortedSet<Integer> s=new TreeSet<>();
        s.add(40);
        s.add(10);
        s.add(30);
        s.add(20);

        System.out.println(s);
 System.out.println(s.first());
  System.out.println(s.last());
  System.out.println(s.headSet(30));
   System.out.println(s.tailSet(30));
    System.out.println(s.subSet(10, 30));





    }
    
}
