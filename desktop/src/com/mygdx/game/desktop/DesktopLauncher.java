package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.CheesePlease2;

public class DesktopLauncher {
	public static void main (String[] args) {
		CheesePlease2 myProgram = new CheesePlease2();
		LwjglApplication launcher = new LwjglApplication( myProgram);
	}
}
