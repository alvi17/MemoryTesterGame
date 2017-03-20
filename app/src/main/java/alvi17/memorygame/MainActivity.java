package alvi17.memorygame;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import alvi17.memorygame.common.Shared;
import alvi17.memorygame.engine.Engine;
import alvi17.memorygame.engine.ScreenController;
import alvi17.memorygame.engine.ScreenController.Screen;
import alvi17.memorygame.events.EventBus;
import alvi17.memorygame.events.ui.BackGameEvent;
import alvi17.memorygame.ui.PopupManager;
import alvi17.memorygame.utils.Utils;

public class MainActivity extends FragmentActivity {

	private ImageView mBackgroundImage;
	private LinearLayout ads;
	AdView adView;
	AdRequest adRequest;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Shared.context = getApplicationContext();
		Shared.engine = Engine.getInstance();
		Shared.eventBus = EventBus.getInstance();

		setContentView(R.layout.activity_main);
		mBackgroundImage = (ImageView) findViewById(R.id.background_image);

		Shared.activity = this;
		Shared.engine.start();
		Shared.engine.setBackgroundImageView(mBackgroundImage);

		// set background
		setBackgroundImage();

		// set menu
		ScreenController.getInstance().openScreen(Screen.MENU);

		ads=(LinearLayout)findViewById(R.id.adLayout);
		adView=new AdView(this);
		adRequest=new AdRequest.Builder().build();
		adView.setAdSize(AdSize.BANNER);
		adView.setAdUnitId("ca-app-pub-6508526601344465/4115437630");
		adView.loadAd(adRequest);
		ads.addView(adView);
	}

	@Override
	protected void onDestroy() {
		Shared.engine.stop();
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		if (PopupManager.isShown()) {
			PopupManager.closePopup();
			if (ScreenController.getLastScreen() == Screen.GAME) {
				Shared.eventBus.notify(new BackGameEvent());
			}
		} else if (ScreenController.getInstance().onBack()) {
			super.onBackPressed();
		}
	}

	private void setBackgroundImage() {
		Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
		bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
		bitmap = Utils.downscaleBitmap(bitmap, 2);
		mBackgroundImage.setImageBitmap(bitmap);
	}
}
