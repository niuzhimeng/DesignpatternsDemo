package strategy.display.impl;

import strategy.display.ISexBehavior;

public class BehaviorWomImpl implements ISexBehavior {
    @Override
    public void sex() {
        System.out.println("女");
    }
}
