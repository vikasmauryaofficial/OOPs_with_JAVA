//overloading 
public class studentc {
    int id;
    String name;
//constructor
studentc() {
    id=0;
    name="abc";
}
studentc(int i, String n) {
    id=i;
    name=n;
}
void display(){
        System.out.println(id+""+name);
 }
    public static void main(String[] args) {
        studentc s1=new studentc(100,"vikas");
        s1.display();
        s1.display();
    }
}