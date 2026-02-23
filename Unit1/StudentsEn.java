public class StudentsEn {

 //varibale private

 private int rollno;
 private String name;
 private int marks;


 //2 menthod public setter/getter method 

 public void setRollNo(int rollno){

    this.rollno=rollno;
 }
  public void setName(String name){
    this.name=name;
 }
 public void setMarks(int marks){

    if(marks>=0 && marks<=100)
    {  this.marks=marks;}else{
        System.out.println("invalid mrks");

    }
 
 }
//getter


public int getRollNo(){
    return rollno;
}
public String getName(){
    return name; c 
    }
public int getMarks(){
    return marks;
}


    public static void main(String[] args) {

        StudentsEn s=new StudentsEn();
        s.setRollNo(10);
        s.setName("vikas");
        s.setMarks(50);






        
    }
}
