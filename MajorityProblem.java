import java.util.Arrays;
public class MajorityProblem {
    public static void solution1(int arr[],int indx,int temp[]){
    if(indx==arr.length){
        return ;
    }
    temp[arr[indx]]++;
    solution1(arr, indx+1, temp);

    }
public static int print1(int temp[],int arr[]){
    for(int i=0; i<temp.length;i++){
        if (temp[i]>arr.length/2) {
            System.out.println(i);
            return i;
            
        }
    }
    return -1;
}
public static int solution2(int arr[]){
    int majority=arr.length/2;
    for(int i=0; i<arr.length; i++){
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count+=1;

            }
        }
      return arr[i];
    }
    return -1;
}
public static int countInRange(int arr[],int num,int lo,int hi){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            count++;

        }
    }
    return count;


}
public static int MajorityElement(int arr[],int lo,int hi){
    if(lo==hi){
        return arr[lo];
    }
    int mid=lo+(hi-lo)/2;
    int left=MajorityElement(arr,lo,mid);
    int right=MajorityElement(arr,mid+1,hi);
    if(left==right){
        return left;
    }
int leftCount=countInRange(arr, left, lo, hi);
int rightCount=countInRange(arr, right, lo, hi);

return leftCount >rightCount?left:right;
}
    public static void main(String[] args) {
        int arr[]={2,2,1,1,2,2};  
        System.out.println(MajorityElement(arr,0,arr.length-1));
        
    }
    
}
