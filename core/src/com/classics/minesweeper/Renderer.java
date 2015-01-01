package com.classics.minesweeper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Connor
 */
public class Renderer {
    private SpriteBatch batcher;
    private final MineLogic g;
    
    public Renderer(SpriteBatch batcher, MineLogic g) {
       this.batcher = batcher;
       this.g = g;
    }
    
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }
    
    
    public void renderField(MineBox[] boxes) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batcher.begin();
        for (MineBox box : boxes) {
            batcher.draw(g.getAssets().getSquare(), box.getX(), box.getY());
        }
        batcher.end();
    }
    
    
    
}
