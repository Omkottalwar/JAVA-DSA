public class MultipleInheritance {
    public static void main(String[] args) {
        Bear s =new Bear();
        s.eatnonveg();
        s.eatveg();
        
    }
    
}
interface Omivore{
    void eatveg();

}
interface Carnivore{
    void eatnonveg();
    
}
class Bear implements Omivore,Carnivore{
    public void eatveg(){
        System.out.print("Eats everything veg");
    }
    public void eatnonveg(){
        System.out.print("Eats everything nonveg");
    }
}