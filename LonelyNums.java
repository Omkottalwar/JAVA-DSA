import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LonelyNums {
    public static void lonely(ArrayList <Integer> nums){
        ArrayList <Integer> temp =new ArrayList<>();
        
        for(int i=0; i<nums.size(); i++){
            boolean alone=true;
             for(int j=0; j<nums.size(); j++){

                  if (i != j) {
                if(nums.get(i) == nums.get(j) || nums.get(i)+1 == nums.get(j) || nums.get(i)-1 == nums.get(j) ){
                    alone=false;
                }
            }

             }
             if(alone){
                temp.add(nums.get(i));
                
             }

        }
        
            System.out.print(temp);
        
    }
    public static void findLonely(ArrayList <Integer> nums){
        Collections.sort(nums);
        ArrayList <Integer> list=new ArrayList<>();
        for(int i=1; i<nums.size()-1; i++){
            if(nums.get(i-1)+1 < nums.get(i) && nums.get(i)+1< nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1< nums.get(1)){
                list.add(nums.get(0));

            }
            if(nums.get(nums.size()-1)>nums.get(nums.size()-2)+1){
                list.add(nums.get(nums.size()-1));
            }
        }
        System.out.print(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        findLonely(nums);


    }
    
}
