public class matrixSearch {
    public static boolean search(int matrix[][], int key){
        int row=matrix.length-1;
        int col=0;
        while(row > 0 && col < matrix[0].length-1){
            if(matrix[row][col] == key){
                System.out.println("Key found at" +"("+ row +','+ col+ ")");
                return true;
            }
            else if (matrix[row][col] < key) {
                col++;
                
            }else{
                row--;
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40,},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        search(matrix, key);
    }
    
    
    
}
