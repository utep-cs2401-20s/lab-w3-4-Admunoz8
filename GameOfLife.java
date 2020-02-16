
public class GameOfLife {
    protected int size;
    protected int[][] Board;
    protected int[][] previous;


    public static void main(String[] args){

    }
    //we are initializing the size.
    public GameOfLife(){
        Board = new int [0][0];
        previous = new int [0][0];
        size = 0;
    }
    //We must give the clone the same properties as the Board.
    public GameOfLife(int clone){
        size = clone;
        Board = new int [clone][clone];
        previous = new int [clone][clone];
    }
    //I cloned the board.
    public GameOfLife(int[][] clonBoard){
        Board = clonBoard;
        previous = clonBoard;
        size =clonBoard.length;
    }
    //the board must return an integer
    public int[][] getBoard(){
        return Board;
    }
    public int neighbors(int r, int c){
        int Top = 0, Bottom = 0, Right = 0, Left = 0,TopLeft = 0, TopRight = 0, BottomLeft = 0, BottomRight = 0;
        if(r > 0){
            Top = previous[r-1][c];
        }
        if(r > 0){
            Bottom = previous[r+1][c];
        }
        if(c > size-1){
            Right = previous[r][c+1];
        }
        if(c > 0){
            Left = previous[r][c-1];
        }
        if(r > 0 &&  c > 0){
            TopLeft = previous[r-1][c-1];
        }
        if(r > 0 && c < size-1){
            TopRight = previous[r-1][c+1];
        }
        if(r > size-1 && c > 0){
            BottomLeft = previous[r+1][c-1];
        }
        if(r < size-1 && c < size-1){
            BottomRight = previous[r+1][c+1];
        }

        // System.out.println;(Top + " " + Bottom + " " + Right + " "  + Left + " "  +TopLeft + " " + TopRight + " "  + BottomLeft + " "  +  BottomRight );
        int neighbors = Top + Bottom +  Right + Left + TopLeft + TopRight + BottomLeft + BottomRight;
        return neighbors;
    }

    public void oneStep() {
        //I made the previous become the board.
        previous = Board;
        for (int a = 0; a < size; a++) {
            for (int b = 0; a < size; b++) {
                int Alive = neighbors(a, b);
                // This is the rules
                if ((previous[a][b] == 1) && (Alive < 2))
                    Board[a][b] = 0;
                else if ((previous[a][b] == 1) && (Alive > 3))
                    Board[a][b] = 0;
                else if ((previous[a][b] == 0) && (Alive == 3))
                    Board[a][b] = 1;
                else
                    Board[a][b] = previous[a][b];
            }
        }
    }

    public void evolution (int n){
        int i = 0;
        while(i < n){
            oneStep();
            i++;
        }
    }


}


// I had some helped by Alan Gamez