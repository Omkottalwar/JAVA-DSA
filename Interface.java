public  class Interface {
    public static void main(String[] args) {
        king k = new king();
        k.moves();
        
    }
    
}
interface ChessPlayer{
    void moves();

}
class king implements ChessPlayer{
  public void moves(){
    System.out.print("top bottom left right diagonal (by 1 step)");

  }
      
  }
class queen implements ChessPlayer{
  public void moves(){
    System.out.print("top bottom left right diagonal (in all directions )");

  }
      
  }