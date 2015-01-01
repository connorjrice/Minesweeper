package com.classics.minesweeper;

import com.badlogic.gdx.Game;
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
    private Minefield minefield;

    @Override
    public void create() {
        batcher = new SpriteBatch();
        assets = new Assets();
        render = new Renderer(batcher, this);
        font = new BitmapFont();
        minefield = new Minefield();
        //setScreen(new MainMenu(this));
    }
    
    @Override
    public void render() {
        super.render();  
        render.renderField(minefield.getBoxes());
    }
    
    public SpriteBatch getBatcher() {
        return batcher;
    }
    
    public Assets getAssets() {
        return assets;
    }
    
    @Override
    public void dispose() {
        batcher.dispose();
        font.dispose();
    }
    
}
