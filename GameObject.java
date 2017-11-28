package com.isaak.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.List;

/**
 * Created by zope on 27.11.2017.
 */

public abstract class GameObject {

    public float x, y;
    public float width,height;

    public Vector2 direction;
    public float speed;

    public String name;
    public String tag;
    public int layer;

    public List<GameObject> collidable;

    public void update(){
        moveX();
        //Проверяем на столкновения
        //Получаем список столкнувшихся
        //Отталкиваем если нужно

        moveY();
        //Проверяем на столкновения
        //Получаем список столкнувшихся
        //Отталкиваем если нужно


        //collidable это все с чем столкнулся обьект
    }

    public void moveX(){

    }


    public void moveY(){

    }

    public List<GameObject> collision(){
        return null;
    }

    public abstract void draw(SpriteBatch batch);

    public abstract void collide(GameObject another);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Vector2 getDirection() {
        return direction;
    }

    public float getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public int getLayer() {
        return layer;
    }

    public List<GameObject> getCollidable() {
        return collidable;
    }
}
