package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Layout;
import com.sun.javafx.property.adapter.PropertyDescriptor;
import com.sun.javafx.stage.ScreenHelper;

public class Test extends Game {
	SpriteBatch batch;
	Texture img;
	int i = -256;
	int j = 0;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("gamepad2.jpg");
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(img, j, i);
		i=i+10;
		if (i >= Gdx.graphics.getHeight()){
			i=-256;
			j=j+img.getWidth();
			if (j >= Gdx.graphics.getWidth()){
				j=0;
			}
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
