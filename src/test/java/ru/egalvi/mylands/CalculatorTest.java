package ru.egalvi.mylands;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class CalculatorTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void givenEmptyArmies_defenderShouldWin() throws Exception {
        BattleResult battleResult = Calculator.calculate(new BattleSet(getEmptyArmy(), getEmptyArmy()));
        Assert.assertTrue(battleResult.defenseWin);
    }

    @Test
    public void givenEmptyDefenderAndAttackerWithOneUnit_attackerShouldWin() throws Exception {
        Army attacker = new Army.Builder().withCarrier(1, 1L).build();
        BattleResult battleResult = Calculator.calculate(new BattleSet(attacker, getEmptyArmy()));
        Assert.assertFalse(battleResult.defenseWin);
    }

    private Army getEmptyArmy() {
        return new Army.Builder().build();
    }
}