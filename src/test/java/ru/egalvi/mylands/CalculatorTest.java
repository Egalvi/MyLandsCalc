package ru.egalvi.mylands;

import org.junit.Assert;

/**
 */
public class CalculatorTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void givenEmptyArmies_defenderShouldWin() throws Exception {
        BattleResult battleResult = Calculator.calculate(new BattleSet(new Army(), new Army()));
        Assert.assertTrue(battleResult.defenseWin);
    }
}