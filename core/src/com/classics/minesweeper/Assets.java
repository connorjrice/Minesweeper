package com.classics.minesweeper;

import com.badlogic.gdx.graphics.Texture;

/**
 *
 * @author Connor
 */
public class Assets {
    
    private Texture square;
    
    public Assets() {
        initAssets();
    }
    
    private void initAssets() {
        square = new Texture("square.png");
    }
    
    public Texture getSquare() {
        return square;
    }
}
