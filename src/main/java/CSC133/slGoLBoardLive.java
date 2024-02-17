package csc133;

public class slGoLBoardLive extends slGoLBoard{

    public slGoLBoardLive(int numRows, int numCols) {
        super(numRows, numCols);
    }
    public slGoLBoardLive(int numRows, int numCols, int numAlive){
        super(numRows, numCols, numAlive);
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
    protected int countLiveTwoDegreeNeighbors(int row, int col){
        return super.countLiveTwoDegreeNeighbors(row, col);
    }
    protected int updateNextCellArray(){
        return super.updateNextCellArray();
    }
}
