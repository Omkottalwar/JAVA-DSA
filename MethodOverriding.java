public class MethodOverriding {
    public static void main(String[] args) {
        Deer d1= new Deer();
        d1.eats();
        
    }
    
}
class Animal{
    void eats(){
        System.out.println("Eats");
    }
}
class Deer extends Animal{
      void eats(){
        System.out.println("Eats grass");
    }

}
