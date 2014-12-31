package com.classics.minesweeper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Connor
 */
public class Renderer {
    private SpriteBatch batcher;
    
    public Renderer(SpriteBatch batcher) {
       this.batcher = batcher;
    }
    
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batcher.begin();
        Texture img = new Texture("square.png");
        batcher.draw(img, 0, 0);
        batcher.end();
    }
    
    
    
}
