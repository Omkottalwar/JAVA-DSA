import java.util.ArrayList;

public class ContainerWithMostWater {
    // public static int Water(ArrayList<Integer> heights ){
    //     int maxWater=0;
    //     for(int i=0; i<heights.size(); i++){
    //         for(int j=i+1; j<heights.size(); j++){
    //             int height=Math.min(heights.get(i), heights.get(j));
    //             int width=j-i;
    //             int totalStorage=height*width;
    //             maxWater=Math.max(maxWater, totalStorage);

    //         }
    //     }
    //     return maxWater;
    // }
    // Two pointers approach
    public static int waterStored(ArrayList<Integer> heights){
        int maxWater=0;
        int lp=0;
        int rp=heights.size()-1;
        while(lp<rp){
            int height=Math.min(heights.get(lp), heights.get(rp));
            int width=rp-lp;
            int water=height*width;
            maxWater=Math.max(maxWater, water);
            if(heights.get(lp)<heights.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList <Integer> heights=new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        
        System.out.println("max Water Container "+ waterStored(heights));
        
    }
    
}
