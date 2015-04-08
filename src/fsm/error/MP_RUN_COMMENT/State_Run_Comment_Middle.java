package fsm.error.MP_RUN_COMMENT;

import core.State;
import core.keystates.AcceptState;

/**
 * Created by Christina Dunning on 2/16/2015.
 */
public class State_RUN_COMMENT_MIDDLE extends AcceptState {
    private static State state;
    private State_RUN_COMMENT_MIDDLE() {
        state = this;
    }
    // states are singletons
    public static State getState() {
        if(state==null) {
            return new State_RUN_COMMENT_MIDDLE();
        }
        else return state;
    }
    @Override
    public void read(char c) {
        if(c=='}') {
            context.setInvalid();
        }
        else if (c=='\n' || c=='\r') {
            context.changeState(State_RUN_COMMENT_ACCEPT.getState());
        }
    }
}