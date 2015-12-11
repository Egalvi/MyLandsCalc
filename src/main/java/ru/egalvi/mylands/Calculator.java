package ru.egalvi.mylands;

/**
 */
public class Calculator {
    public static BattleResult calculate(BattleSet battleSet) {
        return new BattleResult(battleSet.attack, battleSet.defense, battleSet.attack.isEmpty());
    }
}
