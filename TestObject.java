package com.isaak.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by zope on 27.11.2017.
 */

public class TestObject extends GameObject {

    Texture texture;
    String s;
    public TestObject(float x,float y,String s){
        this.s=s;
        texture = new Texture(s);
        this.x = x;
        this.y = y;
    }

    @Override
    public void update() {
        Gdx.app.log("TestObject","Update");
    }

    @Override
    public void draw(SpriteBatch batch) {
        batch.draw(texture,x,y);
        Gdx.app.log("TestObject","Draw");
    }

    @Override
    public void collide(GameObject another) {
        if(another.tag == "Player"){

        }
    }
}
