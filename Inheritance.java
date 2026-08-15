public class Inheritance {
    public static void main(String args[]){
        Fish f1=new Fish();
        f1.eat();

    }
    
}
class Animal{
    void eat(){
        System.out.println("Eats...");
    }
    void braeth(){
         System.out.println("breaths...");

    }
}
class Fish extends Animal{
    int fins;
    void swim(){
         System.out.println("Swims..");
    }
}