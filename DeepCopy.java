public class DeepCopy {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="om";
        s1.rollno=18;
        s1.pass="ok";
        s1.marks[0]=10;
         s1.marks[1]=20;
          s1.marks[2]=30;
        Student s2=new Student(s1);
        s1.marks[2]=50;
        for(int i=0; i<s2.marks.length; i++){
            System.out.println(s2.marks[i]);

        }
        s1.marks[0]=100;
        
    }
    
}
class Student{
    String name;
    int rollno;
    String pass;
    int marks[];
   Student(){
     marks = new int[3];
    System.out.println("Constructor is called ");
   }
    Student(Student s1){
        marks = new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
          for(int i=0; i<3; i++){
            marks[i]=s1.marks[i];
            

        }

    }
}

    

