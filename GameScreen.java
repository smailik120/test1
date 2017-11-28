package com.isaak.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

/**
 * Created by zope on 27.11.2017.
 */

public class GameScreen implements Screen {

    public static float scale = 1.f;
    public int seed;

    SpriteBatch batch;

    public Room currentRoom;
    public Room map[][];
    ArrayList<TestObject> player=new ArrayList<TestObject>();
    ArrayList<TestObject> enemy=new ArrayList<TestObject>();
    ArrayList<ArrayList<TestObject>> all=new ArrayList<ArrayList<TestObject>>();


    @Override
    public void show() {
        all.add(player);
        all.add(enemy);
        batch = new SpriteBatch();
        currentRoom = new TestRoom(this);
        map = generate(0);
        Gdx.app.log("Screen","Show");
    }

    @Override
    public void render(float delta) {
        Gdx.app.log("Screen","Render");
        update();
        draw();
    }

    public void update(){
       // for(int i = 0;i < currentRoom.objects.size();i++){
          //  currentRoom.objects.get(i).update();
        }

       // for(int i = 0;i < currentRoom.objects.size();i++){
           // for(int j = 0;j < currentRoom.objects.get(i).collidable.size();j++){
              //  currentRoom.objects.get(i).collide(currentRoom.objects.get(i).collidable.get(j));
         //   }
       // }
   // }


    public void draw() {
        Gdx.gl.glClearColor(0, 1, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();

        for (int i = 0; i < currentRoom.objects.size(); i++) {
            for (int j = 0; j < currentRoom.objects.get(i).size(); j++) {
                currentRoom.objects.get(i).get(j).draw(batch);
            }

        }
        batch.end();
    }
    public Room[][] generate(int seed){
        return null;
    }

    @Override
    public void resize(int width, int height) {

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
    public void dispose () {
        batch.dispose();
    }



}
