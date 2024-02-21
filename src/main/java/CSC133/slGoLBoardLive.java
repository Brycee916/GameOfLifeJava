package csc133;

public class slGoLBoardLive extends slGoLBoard{
    int max_rows;
    int max_columns;

    public slGoLBoardLive(int numRows, int numCols) {
        super(numRows, numCols);
        max_rows = numRows;
        max_columns = numCols;
    }
    public slGoLBoardLive(int numRows, int numCols, int numAlive){
        super(numRows, numCols, numAlive);
        max_rows = numRows;
        max_columns = numCols;
    }

    @Override
    public boolean[][] getLiveCellArray(){
        return super.getLiveCellArray();
    }

    @Override
    public boolean[][] getNextCellArray() {
        return super.getNextCellArray();
    }
    @Override
    public void setCellAlive(int row, int col){
        super.setCellAlive(row, col);
    }
    @Override
    public void setCellDead(int row, int col){
        super.setCellDead(row, col);
    }
    @Override
    public void setAllCells(boolean value) {
        super.setAllCells(value);
    }  //  void setAllCells()
    @Override
    public void copyLiveToNext(){
        super.copyLiveToNext();
    }
    @Override
    public void printGoLBoard(){
        super.printGoLBoard();
    }

    /*Counts the number of Live 2 degree neighbors*/
    protected int countLiveTwoDegreeNeighbors(int row, int col){
        int my_count = 0;   //count of live 2 degree neighbors
        int my_row = row; //row of val
        int my_col = col; //col of val
        int prev_row =  row-1, prev_col = col-1;
        int next_row = row+1, next_col = col+1;
        if(prev_row < 0 && prev_col < 0){//top left corner
            if(liveCellArray[max_rows-1][max_columns-1] == true){
                my_count ++;
            }
            if(liveCellArray[max_rows-1][col] == true){
                my_count++;
            }
            if(liveCellArray[max_rows-1][col+1] == true){
                my_count++;
            }
            if(liveCellArray[row][max_columns-1] == true){
                my_count++;
            }
            if(liveCellArray[row+1][max_columns-1] == true){
                my_count++;
            }
        }
        else if(prev_row < 0 && next_col >= max_columns){//top right corner

        }
        else if(prev_col < 0 && next_row >= max_rows){//bottom left corner

        }
        else if(next_row >= max_rows && next_col >= max_columns){//bottom right corner

        }
        else if(prev_row < 0){//left edge

        }
        else if(prev_col < 0){//upper edge

        }
        else if(next_row >= max_rows){//bottom edge

        }
        else if(next_col >= max_columns){//right edge

        }
        else{//interior cells
            for(int i = row-1; i <= row+1; i++){
                for(int j = col-1; j <= col+1; j++){
                    if(liveCellArray[i][j] == true){
                        if(i == row && j == col) {
                            continue;
                        }
                        my_count += 1;
                    }
                }
            }
        }
        return my_count;
    }
    protected int updateNextCellArray(){
        return super.updateNextCellArray();
    }
}
