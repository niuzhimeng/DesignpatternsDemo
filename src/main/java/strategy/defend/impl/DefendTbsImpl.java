package strategy.defend.impl;

import strategy.defend.IDefendBehavior;

public class DefendTbsImpl implements IDefendBehavior {
    @Override
    public void defend() {
        System.out.println("铁布衫");
    }
}
