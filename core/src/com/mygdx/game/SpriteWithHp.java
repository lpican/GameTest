package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Quosmio on 4/7/2017.
 */
public class SpriteWithHp extends Sprite
{
    private int HP;

    //KONSTRUKTOR
    public SpriteWithHp (Texture t)
    {
        //aktivacija konstruktora
        super(t);
        HP=100; //deafult HP
    }

    public int getHP()
    {
        return HP;
    }

    public void setHP (int amount)
    {
        HP = amount;
    }

    public void damage (int amount)
    {
        HP -= amount;
    }

    public void heal (int amount)
    {
        HP += amount;
    }

    public boolean isAlive()
    {
        return (HP > 0);
    }
}
