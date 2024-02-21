package csc133;

public class slGoLBoardLive extends slGoLBoard{
    private int max_rows;
    private int max_columns;

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
    public void copyNextToLive(){
        super.copyNextToLive();
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
            for(int i = row; i <= row+1; i++){
                for(int j = col; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
        }
        else if(prev_row < 0 && next_col >= max_columns){//top right corner
            if(liveCellArray[max_rows-1][0] == true){
                my_count++;
            }
            if(liveCellArray[max_rows-1][col-1] == true){
                my_count++;
            }
            if(liveCellArray[max_rows-1][col] == true){
                my_count++;
            }
            if(liveCellArray[row][0] == true){
                my_count++;
            }
            if(liveCellArray[row+1][0] == true){
                my_count++;
            }
            for(int i = row; i <= row+1; i++){
                for(int j = col-1; j <= col; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
        }
        else if(prev_col < 0 && next_row >= max_rows){//bottom left corner
            if(liveCellArray[0][max_columns-1] == true){
                my_count++;
            }
            if(liveCellArray[0][col] == true){
                my_count++;
            }
            if(liveCellArray[0][col+1] == true){
                my_count++;
            }
            if(liveCellArray[row-1][max_columns-1] == true){
                my_count++;
            }
            if(liveCellArray[row][max_columns-1] == true){
                my_count++;
            }
            for(int i = row-1; i <= row; i++){
                for(int j = col; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
        }
        else if(next_row >= max_rows && next_col >= max_columns){//bottom right corner
            if(liveCellArray[0][0] == true){
                my_count++;
            }
            if(liveCellArray[0][col-1] == true){
                my_count++;
            }
            if(liveCellArray[0][col] == true){
                my_count++;
            }
            if(liveCellArray[row-1][0] == true){
                my_count++;
            }
            if(liveCellArray[row][0] == true){
                my_count++;
            }
            for(int i = row-1; i <= row; i++){
                for(int j = col-1; j <= col; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
        }
        else if(prev_row < 0){//upper edge
            for(int i = row; i <= row+1; i++){
                for(int j = col-1; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
            //check the very top 3 - other side bottom 3
            if(liveCellArray[max_rows-1][col-1] == true){
                my_count++;
            }
            if(liveCellArray[max_rows-1][col] == true){
                my_count++;
            }
            if(liveCellArray[max_rows-1][col+1] == true){
                my_count++;
            }
        }
        else if(prev_col < 0){//left
            for(int i = row-1; i <= row+1; i++){
                for(int j = col; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
            //3 on very left side - on other side
            if(liveCellArray[row-1][max_columns-1] == true){
                my_count++;
            }
            if(liveCellArray[row][max_columns-1] == true){
                my_count++;
            }
            if(liveCellArray[row+1][max_columns-1] == true){
                my_count++;
            }
        }
        else if(next_row >= max_rows){//bottom edge
            for(int i = row-1; i <= row; i++){
                for(int j = col-1; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
            //3 on very bottom - top side
            if(liveCellArray[0][col-1] == true){
                my_count++;
            }
            if(liveCellArray[0][col] == true){
                my_count++;
            }
            if(liveCellArray[0][col+1] == true){
                my_count++;
            }
        }
        else if(next_col >= max_columns){//right edge
            for(int i = row-1; i <= row+1; i++){
                for(int j = col-1; j <= col; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count++;
                    }
                }
            }
            //check the very rightmost 3 - other side
            if(liveCellArray[row-1][0] == true){
                my_count++;
            }
            if(liveCellArray[row][0] == true){
                my_count++;
            }
            if(liveCellArray[row+1][0] == true){
                my_count++;
            }
        }
        else{//interior cells
            for(int i = row-1; i <= row+1; i++){
                for(int j = col-1; j <= col+1; j++){
                    if(i == row && j == col){
                        continue;
                    }
                    if(liveCellArray[i][j] == true){
                        my_count += 1;
                    }
                }
            }
        }
        return my_count;
    }
    protected int updateNextCellArray(){
        int retVal = 0;

        int nln = 0;  // Number Live Neighbors
        boolean ccs = true; // Current Cell Status
        for (int row = 0; row < max_rows; ++row){
            for (int col = 0; col < max_columns; ++col) {
                ccs = liveCellArray[row][col];
                nln = countLiveTwoDegreeNeighbors(row, col);
                if (!ccs && nln == 3) {
                    nextCellArray[row][col] = true;
                    ++retVal;
                } else {
                    // Current Cell Status is true
                    if (nln < 2 || nln > 3) {
                        nextCellArray[row][col] = false;
                    } else {
                        // nln == 2 || nln == 3
                        nextCellArray[row][col] = true;
                        ++retVal;
                    }
                }
            }  // for (int row = 0; ...)
        }  //  for (int col = 0; ...)

        boolean[][] tmp = liveCellArray;
        liveCellArray = nextCellArray;
        nextCellArray = tmp;

        return retVal;
    }
}
