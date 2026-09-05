public class RecurionBasics {

    public static void printDec(int n){
        if(n==1){
            System.out.print(1);
            return;
    }
    System.out.print(n+" ");
    printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
    }    
       int fn=n*factorial(n-1);
       return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
    }    
       int fn=n+sum(n-1);
       return fn;
    }
    public static int fib(int n){
        if( n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;


    }
    public  static  boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return  false;
        }
        return isSorted(arr, i+1);
    }
     public  static  int firstOccurence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);


     }
      public  static  int lastOccurence(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
      }
      int isFound=lastOccurence(arr, key, i+1);
      if(isFound == -1 && arr[i]==key){
        return i;
      }
      return isFound;
      }
      public  static  int power(int n,int m){
        if(m==0){
            return 1;
        }
        return n*power(n, m-1);
      }
      public  static  int OptimizedPower(int n,int m){
        if(m==0){
            return 1;
        }
        int halfPower=OptimizedPower(n, m/2);
        int halfPowerSq=halfPower*halfPower;
        if(m % 2 != 0){
            halfPowerSq=n*halfPowerSq;


        }
        return halfPowerSq;
      }
    public static void main(String args[]){
        int n=5;
        int arr[]={1,5,3,6,5,5,5,5};
        System.out.println(OptimizedPower(2,4));
    }
}


