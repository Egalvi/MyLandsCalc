package ru.egalvi.mylands;

/**
 */
public class BattleResult {
    public Army attack;
    public Army defense;
    boolean defenseWin;

    public BattleResult(Army attack, Army defense, boolean defenseWin) {
        this.attack = attack;
        this.defense = defense;
        this.defenseWin = defenseWin;
    }
}
