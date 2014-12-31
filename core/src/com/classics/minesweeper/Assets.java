package com.classics.minesweeper;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Connor
 */
public class Assets {
    
    private SpriteBatch batcher;
    private Texture square;
    
    public Assets(SpriteBatch batcher) {
        this.batcher = batcher;
        initAssets();
    }
    
    private void initAssets() {
        square = new Texture("square.png");
    }
}
