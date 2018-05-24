package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class CheesePlease1 extends Game {
	private SpriteBatch batch;

	private Texture mouseyTexture;
	private float mouseyX;
	private float mouseyY;

	private Texture cheeseTexture;
	private float cheeseX;
	private float cheeseY;

	private Texture floorTexture;
	private Sprite floorSprite;
	private Texture winMessage;

	private boolean win;

	public void create()
	{
		batch = new SpriteBatch();
		mouseyTexture = new Texture("mouse.png");
		mouseyX = 20;
		mouseyY = 20;

		cheeseTexture = new Texture("cheese.png");
		cheeseX = 400;
		cheeseY = 300;

		floorTexture = new Texture("tiles.jpg");
		floorSprite = new Sprite(floorTexture);
		winMessage = new Texture("you-win.png");

		win = false;
	}

	public void render()
	{
		// PROVJERA USER INPUT
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
			mouseyX--;
			if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
			mouseyX++;
		if (Gdx.input.isKeyPressed(Input.Keys.UP))
			mouseyY++;
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
			mouseyY--;

		// PROVJERA WIN CONDITION
		if ( (mouseyX>cheeseX)
				&& (mouseyX + mouseyTexture.getWidth() < cheeseX + cheeseTexture.getWidth())
				&& (mouseyY>cheeseY)
				&& (mouseyY + mouseyTexture.getWidth() < cheeseY + cheeseTexture.getWidth()))
					win=true;

		//clear screen and draw graphic
		Gdx.gl.glClearColor(0.8f, 0.8f, 1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

			batch.begin();
			batch.draw(floorTexture, 0,0);
			floorSprite.setSize(1f, 1f * floorSprite.getHeight() / floorSprite.getWidth());
			batch.draw(cheeseTexture, cheeseX, cheeseY, 150f, 150f);
			batch.draw(mouseyTexture, mouseyX, mouseyY, 200f, 200f);
			if (win)
				batch.draw( winMessage, 170, 60);
			batch.end();

	}
}


