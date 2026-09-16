public class QuickSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int pIdx=partion(arr,si,ei);
        quickSort(arr, si,pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }
    public static int  partion(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=pivot;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={3,2,5,6,3,7,1};
        quickSort(arr, 0, arr.length-1);
        print(arr);

    }
    
}
