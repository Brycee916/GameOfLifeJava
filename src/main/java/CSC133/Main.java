package csc133;


public class Main {
    private static slGoLBoard my_board;
    private static final int ROWS = 20, COLS = 18;
    public static void main(String[] args) {
        //my_board;
        //my_board = new slGoLBoardLive(9,9);
        //my_board.printGoLBoard();
        //System.out.println(my_board.countLiveTwoDegreeNeighbors(3,8));
        //System.out.println(my_board.updateNextCellArray());
        //test_1();
        //test_2();
        //test_3();
        //test_4();
        //test_5();
        test_6();
    }

    // print TwoDegreeNeighbors(0,0)
    private static void test_1() {
        slGoLBoard my_board;
        my_board = new slGoLBoardLive(9,9);
        my_board.printGoLBoard();
        return;
    }

    // print TwoDegreeNeighbors(ROWS-1, COLS-1)
    private static void test_2() {
        my_board = new slGoLBoardLive(ROWS, COLS);
        my_board.printGoLBoard();
        int my_row = ROWS-1, my_col = COLS-1;
        System.out.println("TwoDegreeNeighbors(" + my_row +", " + my_col + ") --> " +
                my_board.countLiveTwoDegreeNeighbors(ROWS-1, COLS-1));
        System.out.println();
        return;
    }

    // print TwoDegreeNeighbors((int)(ROWS/2), (int)(ROWS/2))
    private static void test_3() {
        my_board = new slGoLBoardLive((int)(ROWS/2), (int)(ROWS/2));
        my_board.printGoLBoard();
        return;
    }

    // print TwoDegreeNeighbors(0, (int)(ROWS/2))
    private static void test_4() {
        my_board = new slGoLBoardLive(0, (int)(ROWS/2));
        my_board.printGoLBoard();
        return;
    }

    // print the board and the updated board
    private static void test_5() {
        slGoLBoard my_board;
        my_board = new slGoLBoardLive(9,9);
        System.out.println("GoL Board");
        my_board.copyNextToLive();
        my_board.printGoLBoard();
        my_board.updateNextCellArray();
        System.out.println("\nUpdated Board");
        my_board.printGoLBoard();
        return;
    }

    //print the board and updated board
    private static void test_6() {
        slGoLBoard my_board;
        my_board = new slGoLBoardLive(ROWS, COLS);
        System.out.println("GoL Board 20x18");
        my_board.printGoLBoard();

        System.out.println("\n\nLive cell array will now be next cell array & next will now be live");
        System.out.println("Printing the updated live array when updateNextCellArray is called");
        my_board.updateNextCellArray();
        my_board.printGoLBoard();

        System.out.println("\n\nCopying to next array to live array");
        System.out.println("Printing the original live cell array");
        my_board.copyNextToLive();
        my_board.printGoLBoard();
    }
}








