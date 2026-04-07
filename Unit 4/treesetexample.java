import java.util.TreeSet;

public class treesetexample {
    public static void main(String[] args) {

        TreeSet<Integer> s=new TreeSet<>();
        s.add(50);
        s.add(20);
        s.add(40);
        s.add(10);
         System.out.println(s);
          System.out.println(s.first());
  System.out.println(s.last());
  System.out.println(s.higher(20));
  System.out.println(s.lower(20));
  s.pollFirst();
  s.pollLast();

  System.out.println(s);
//add()

//remove()

//first()

//last()

//higher()
//lower()

//pollFirst()
//pollLast()


        
    }
    
}
