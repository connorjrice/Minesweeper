package com.classics.minesweeper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 *
 * @author Connor
 */
public class MainMenu implements Screen {
    
    private final Game g;
    
    private OrthographicCamera cam;
    
    public MainMenu(final Game g) {
        this.g = g;
        initAssets();
    }
    
    private void initAssets() {
        cam = new OrthographicCamera();
        cam.setToOrtho(false);
    }

    @Override
    public void show() {
        
    }

    @Override
    public void render(float f) {
        
    }

    @Override
    public void resize(int i, int i1) {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void resume() {
        
    }

    @Override
    public void hide() {
        
    }

    @Override
    public void dispose() {
        
    }
    
}
