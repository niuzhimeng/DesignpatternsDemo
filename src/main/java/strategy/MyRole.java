package strategy;

import strategy.attack.IAttackBehavior;
import strategy.defend.IDefendBehavior;
import strategy.display.ISexBehavior;

public abstract class MyRole {

    protected String name;
    /**
     * 进攻
     */
    private IAttackBehavior iAttackBehavior;
    /**
     * 防御
     */
    private IDefendBehavior iDefendBehavior;
    /**
     * 性别
     */
    private ISexBehavior iSexBehavior;

    public void setIAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
    }

    public void setIDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.iDefendBehavior = iDefendBehavior;
    }

    public void setISexBehavior(ISexBehavior iSexBehavior) {
        this.iSexBehavior = iSexBehavior;
    }

    public void attack() {
        iAttackBehavior.attack();
    }

    public void defend() {
        iDefendBehavior.defend();
    }

    public void sex() {
        iSexBehavior.sex();
    }

}
