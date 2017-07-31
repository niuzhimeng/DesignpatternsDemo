package strategy.defend.impl;

import strategy.defend.IDefendBehavior;

public class DefendJzImpl implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("金钟罩");
    }
}
