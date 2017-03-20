package alvi17.memorygame.fragments;

import android.support.v4.app.Fragment;

import alvi17.memorygame.events.EventObserver;
import alvi17.memorygame.events.engine.FlipDownCardsEvent;
import alvi17.memorygame.events.engine.GameWonEvent;
import alvi17.memorygame.events.engine.HidePairCardsEvent;
import alvi17.memorygame.events.ui.BackGameEvent;
import alvi17.memorygame.events.ui.FlipCardEvent;
import alvi17.memorygame.events.ui.NextGameEvent;
import alvi17.memorygame.events.ui.ResetBackgroundEvent;
import alvi17.memorygame.events.ui.ThemeSelectedEvent;
import alvi17.memorygame.events.ui.DifficultySelectedEvent;
import alvi17.memorygame.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
