package alvi17.memorygame;

import android.app.Application;

import alvi17.memorygame.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
