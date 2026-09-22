public class RatMaze {
    public static void findways(int maze[][],int row,int col){
        if(row==maze.length-1 && col==maze.length-1){
            System.out.println("---------");
            print(maze);
            return ;
        }else if(row < 0 ||
row >= maze.length ||
col < 0 ||
col >= maze.length){
            return ;
        }

        if(maze[row][col] == 0 || maze[row][col] == 2){
            return;

        }
        maze[row][col]=2;
        findways(maze,row-1,col);
        findways(maze,row+1,col);
        findways(maze,row,col-1);
        findways(maze,row,col+1);
        maze[row][col]=1;


    }
    public static void print(int maze[][]){
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze.length; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][]={ 
                       { 1, 0, 0, 0 },
                       { 1, 1, 0, 1 },
                       { 0, 1, 1, 0 },
                       { 1, 1, 1, 1 } 
                    };
                    
        findways(maze, 0, 0);
    }
    
}
