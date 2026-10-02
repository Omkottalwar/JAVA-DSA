import java.util.*;
public class ArrayListClass {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp=list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
   public static void main(String[] args) {
    ArrayList <ArrayList<Integer>> mainList= new ArrayList<>();
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    for(int i=1; i<=5; i++){
        list1.add(1*i);
        list2.add(2*i);
        list3.add(3*i);
    }
    mainList.add(list1);
     mainList.add(list2);
      mainList.add(list3);
      

System.out.println(mainList);
for(int i=0; i<mainList.size(); i++){
    ArrayList<Integer> currList=mainList.get(i);
    for(int j=0; j<currList.size(); j++){
        System.out.print(currList.get(j)+" ");
    }
    System.out.println();
}
 
   }
    
}
