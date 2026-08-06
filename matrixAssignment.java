public class matrixAssignment {
    public static int repeated(int array[][],int num){
        int count=0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]== num){
                    count +=1;
                }
            }
        }
        return count;
    }
    public static int row2Sum(int array[][]){
        int row=1;
        int sum=0;
        for(int i=0; i<array[0].length; i++){
            sum += array[row][i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void printMatrix(int matrix[][]){
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               System.out.print( matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int array1[][]={{4,7,8},
                       {8,7,7}};
        int num=7;
        repeated(array1, num);
        int array2[][]={{1,4,9},
                       {11,4,3},
                       {2,2,3}
                     };
      row2Sum(array2);
    int matrix[][]={{2,3,7},
                    {5,6,7}};
    int row=2;
    int col=3;
    printMatrix(matrix);
    int transpose[][]= new int[col][row];
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            transpose[j][i]=matrix[i][j];
            
        }
    }
   printMatrix(transpose);


    }
    
    
}
