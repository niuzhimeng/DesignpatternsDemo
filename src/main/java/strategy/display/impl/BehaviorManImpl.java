package strategy.display.impl;

import strategy.display.ISexBehavior;

public class BehaviorManImpl implements ISexBehavior {

    @Override
    public void sex() {
        System.out.println("男");
    }
}
