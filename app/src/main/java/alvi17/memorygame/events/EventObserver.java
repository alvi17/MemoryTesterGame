package alvi17.memorygame.events;

import alvi17.memorygame.events.engine.FlipDownCardsEvent;
import alvi17.memorygame.events.engine.GameWonEvent;
import alvi17.memorygame.events.engine.HidePairCardsEvent;
import alvi17.memorygame.events.ui.BackGameEvent;
import alvi17.memorygame.events.ui.DifficultySelectedEvent;
import alvi17.memorygame.events.ui.FlipCardEvent;
import alvi17.memorygame.events.ui.NextGameEvent;
import alvi17.memorygame.events.ui.ResetBackgroundEvent;
import alvi17.memorygame.events.ui.StartEvent;
import alvi17.memorygame.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
