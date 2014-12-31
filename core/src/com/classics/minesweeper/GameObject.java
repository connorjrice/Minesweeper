package com.classics.minesweeper;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author Connor
 */
public class GameObject {
    
    private Vector2 position;
    private Rectangle bounds;
    
    public GameObject(float x, float y, float width, float height) {
        this.position = new Vector2(x, y);
        this.bounds = new Rectangle(x - width / 2, y - height / 2, width, height);
    }
    
    public Vector2 getPosition() {
        return position;
    }
    
    public Rectangle getBounds() {
        return bounds;
    }
    
}
