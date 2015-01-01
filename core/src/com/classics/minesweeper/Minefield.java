package com.classics.minesweeper;

/**
 *
 * @author Connor
 */
public class Minefield {
    
    public MineBox[] boxes;
    
    private final int BOX_HEIGHT = 100;
    private final int BOX_WIDTH = 100;
    
    private int[] box_y = new int[] { 500, 300 };
    private int[] box_x = new int[] { 100, 300 };
    
    private int rowLength = 2;
    private int colLength = 2;
    
    private int size = 2;
    
    private int curRow = 0;
    private int curCol = 0;
    private int curSize = 0;
    
    public Minefield() {
        createMinefield();
    }
    
    public MineBox[] getBoxes() {
        return boxes;
    }
    
    private void createMinefield() {
        boxes = new MineBox[4];
        for (int i = 0; i < 4; i++) {
            boxes[i] = new MineBox(getBoxX(), getBoxY(), BOX_HEIGHT, BOX_WIDTH);
            nextBox();
        }
    }
    
    private int getBoxX() {
        return box_x[curRow];
    }
    
    private int getBoxY() {
        return box_y[curCol];
    }
    
    private void nextBox() {
        if (curRow == rowLength - 1) {
            curRow = 0;
        } else {
            curRow++;
        }
        
        if (curCol == colLength - 1) {
            curCol = 0;
        }  else {
            curCol++;
        }
    }
}
