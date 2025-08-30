package Arrays;

public class Sudoku {

    public static void main(String[] args){

        int[][] board={ {5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}};

        helper(0,0,board);
        printBoard(board);
    }


    private static void printBoard(int[][] board){
        for(int i=0;i<9;i++){

            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }


    }

    private static boolean isValid(int row,int col,int digit,int[][] board){

        //Row Check
        for(int j=0;j<9;j++){
            if(board[row][j]==digit)return false;
        }

        //Column Check

        for(int i=0;i<9;i++){
            if(board[i][col]==digit)return false;
        }

        //Grid Check
        int stRow=(row/3)*3;
        int stCol=(col/3)*3;

        for(int i=stRow;i<stRow+3;i++){
            for(int j=stCol;j<stCol+3;j++){
                if(board[i][j]==digit)return false;

            }
        }


      return true;
    }


    private static boolean helper(int row,int col,int[][] board){

        //Base Cases
        if(row==9)return true;
        if(col==9)return helper(row+1,0,board);
        if(board[row][col]!=0)return helper(row,col+1,board);//This means we need to look for next empty cell

        for(int i=1;i<=9;i++){

            if(isValid(row,col,i,board)){
                //Place digit
                board[row][col]=i;

                if(helper(row,col+1,board))return true;
                board[row][col]=0;
            }

        }
        return false;
    }

}
