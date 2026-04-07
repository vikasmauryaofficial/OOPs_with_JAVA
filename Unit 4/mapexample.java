
import java.util.*;

public class mapexample {
    public static void main(String[] args) {
        Map<Integer, String> map=new  HashMap<>();
//put(),  ,get()  , remove(), containsKeys(), containsValue(), keySet(), values()
//entrySet() ,// size(), clear()

map.put(1,"a");
map.put(2,"b"); 
map.put(3,"c");

System.out.println(map.get(2));
System.out.println(map.containsKey(2));
System.out.println(map.containsValue("b"));
System.out.println(map.size());

//entryset()

for(Map.Entry<Integer,String> e:map.entrySet()){
System.out.println(e.getKey()+"->"+e.getValue());
}

    }
    
}
