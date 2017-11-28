package com.isaak.game;

import java.util.ArrayList;

/**
 * Created by zope on 27.11.2017.
 */

public class TestRoom extends Room {

    public TestRoom(GameScreen gameScreen){
        super(gameScreen);
        ArrayList<TestObject> player=new ArrayList<TestObject>();
        ArrayList<TestObject> enemy=new ArrayList<TestObject>();
        player.add(new Player(278,3,"room.png"));
        enemy.add(new Enemy(300,300,"red.png"));
        this.objects.add(player);
        this.objects.add(enemy);
    }
}
