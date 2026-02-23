//static method

class Test1{
int add(int a, int b){
    return a+b;

}
int add(int a, int b, int c){
    return a+b+c;
}
    public static void main(String[] args) {
        Test1 s1=new Test1();//object create 
        System.out.println(s1.add(10,20));
        System.out.println(s1.add(10,20, 30));
        
    }
}