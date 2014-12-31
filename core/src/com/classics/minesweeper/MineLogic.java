package com.classics.minesweeper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *
 * @author Connor
 */
public class MineLogic extends Game {
    
    private SpriteBatch batcher;
    private Assets assets;
    private Renderer render;
    private BitmapFont font;

    @Override
    public void create() {
        batcher = new SpriteBatch();
        assets = new Assets(batcher);
        render = new Renderer(batcher);
        font = new BitmapFont();    
    }
    
    @Override
    public void render() {
        super.render();   
        render.render();
    }
    
    @Override
    public void dispose() {
        batcher.dispose();
        font.dispose();
    }
    
}
