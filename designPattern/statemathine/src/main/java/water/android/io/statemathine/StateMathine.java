package water.android.io.statemathine;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * State Mathine
 */
public final class StateMathine {
    private final Map statesMap;
    private final Map transitionsMap;

    private State lastState;
    private Transition lastTransition;

    private State currentState;

    public StateMathine() {
        statesMap = new LinkedHashMap();
        transitionsMap = new LinkedHashMap();
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }


    public State getLastState() {
        return lastState;
    }

    public void setLastState(State lastState) {
        this.lastState = lastState;
    }

    public Transition getLastTransition() {
        return lastTransition;
    }

    public void setLastTransition(Transition lastTransition) {
        this.lastTransition = lastTransition;
    }


    public enum State {Solid, Liquid, Gas}

    public enum Transition {OnMelted, OnFroze, OnVaporized, OnCondensed}
}
