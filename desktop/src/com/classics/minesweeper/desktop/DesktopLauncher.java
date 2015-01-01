package com.classics.minesweeper.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.classics.minesweeper.MineLogic;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Minesweeper";
                config.width = 480;
                config.height = 800;
		new LwjglApplication(new MineLogic(), config);
	}
}
