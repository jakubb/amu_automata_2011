package pl.edu.amu.wmi.daut.base;

import java.util.List;

/**
 *
 * @author blazej
 */
public class NaiveDeterministicAutomatonSpecification extends DeterministicAutomatonSpecification {

    private NaiveAutomatonSpecification automatonSpec = new NaiveAutomatonSpecification();

    public List<State> allStates() {
        return automatonSpec.allStates();
    }

    public List<OutgoingTransition> allOutgoingTransitions(State from) {
        return automatonSpec.allOutgoingTransitions(from);
    }

    @Override
    public State targetState(State from, char c) {
        // są warningi ponieważ klasa State nie jest typu public
        for (OutgoingTransition outgoingTransition : allOutgoingTransitions(from)) {
            if (outgoingTransition.getTransitionLabel().canAcceptCharacter(c)) {
                return outgoingTransition.getTargetState();
            }
        }
        return null;
    }

    @Override
    public State addState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addTransition(State from, State to, TransitionLabel transitionLabel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void markAsInitial(State state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void markAsFinal(State state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public State getInitialState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isFinal(State state) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
