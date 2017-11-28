package com.isaak.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zope on 27.11.2017.
 */

public class Room {

    public ArrayList<ArrayList<TestObject>> objects = new ArrayList<ArrayList<TestObject>>();

    private GameScreen gameScreen;

    public Room(GameScreen gameScreen){
        this.gameScreen = gameScreen;
    }

    public void generate(int seed){
        gameScreen.generate(seed);
    }
}
