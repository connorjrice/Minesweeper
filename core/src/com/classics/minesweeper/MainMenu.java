package com.classics.minesweeper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 *
 * @author Connor
 */
public class MainMenu extends ScreenAdapter {
    
    private MineLogic g;
    
    private OrthographicCamera cam;
    
    public MainMenu(MineLogic g) {
        this.g = g;
        initCamera();
    }
    
    private void initCamera() {
        cam = new OrthographicCamera();
        cam.setToOrtho(false);
    }
    
    @Override
    public void render(float f) {
        
    }
    
    public void draw() {
        GL20 gl = Gdx.gl;
        gl.glClearColor(1, 0, 0, 1);
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        g.getBatcher().begin();
    }

    
}
