public class MergeSortToStr {
      public static void print(String arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void mergSort(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
        
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            for(int idx=0; idx<=arr[i].length(); idx++)
            if(arr[i].charAt(idx)<arr[j].charAt(idx)){
                temp[k]=arr[i];
                idx++;
                i++;
                
               
            }
            
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

        
    }
    public static void main(String[] args) {
        String arr[]={"sun", "earth", "mars", "mercury"};
        mergSort(arr, 0,arr.length-1);
        print(arr);
        
    }
    
}
