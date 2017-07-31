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

    public MyRole setIAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
        return this;
    }

    public MyRole setIDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.iDefendBehavior = iDefendBehavior;
        return this;
    }

    public MyRole setISexBehavior(ISexBehavior iSexBehavior) {
        this.iSexBehavior = iSexBehavior;
        return this;
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
