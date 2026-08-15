public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(10,10));
        System.out.println(c1.sum((float)10.5,(float)10.5));
        System.out.println(c1.sum(10,10,30));

        
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
