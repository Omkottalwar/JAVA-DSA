public class InverseCount {
    public static int invCount(int arr[]){
        int count=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid;
        int k=0;
        int invCount=0;
        int temp[]=new int[ei-si+1];
        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                 k++;
                i++;
               
                

            }else{
                temp[k]=arr[j];
                invCount+=(mid-i);
                 k++;
                j++;
               
            }
            
        }
        while(i<mid){
            temp[k++]=arr[i++];
        }
         while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;i<=ei;i++,k++){
            arr[i]=temp[k];

        }
        return invCount;
    }
    public static int mergeSort(int arr[], int si,int ei){
        int invCount=0;
        if(si<ei){
            int mid=si+(ei-si)/2;
            invCount=mergeSort(arr, si, mid);
            invCount+=mergeSort(arr, mid+1, ei);
            invCount+=merge(arr,si,mid+1,ei);
        }
 return invCount;
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        System.out.print(mergeSort(arr,0,arr.length-1));
        
    }
    
}
