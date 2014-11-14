package be.tdev.dungeonUtils.diceroller;

import be.tdev.dungeonUtils.diceroller.DiceRoller;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by delskev on 13/11/2014.
 */


@Ignore
public class DiceRollerTest {

    @Test
    public void simpleRollingTest() {
        System.out.println("Simple rolling test");
        DiceRoller roller = new DiceRoller("1d6");

        roller.ParseExpression();

        int result = roller.getResult();
        System.out.println("Result: " + result);
        Assert.assertTrue("Result is less than 1 result: " + result,  result >= 1);
        Assert.assertTrue("Result is greater than 6 result: " + result, result <= 6);
    }

    @Test
    public void simpleDiceWithBonus() {
        System.out.println("Simple rolling test");
        DiceRoller roller = new DiceRoller("1d6+15-1d20");

        roller.ParseExpression();

        int result = roller.getResult();
        System.out.println("Result: " + result);
        Assert.assertTrue("Result is less than 1 result: " + result,  result >= 1);
        Assert.assertTrue("Result is greater than 6 result: " + result, result <= 6);
    }

    @Test
    public void multipleDice() {
        System.out.println("Multiple dice test");
        DiceRoller roller = new DiceRoller("1d6+1d6");
        roller.ParseExpression();

        int result = roller.getResult();
        System.out.println("Result: " + result);
        Assert.assertTrue("Result is less than 1 result: " + result,  result >= 2);
        Assert.assertTrue("Result is greater than 6 result: " + result, result <= 12);
    }

    @Test
    public void mediumRolling() {
        System.out.println("medium rolling test");
        DiceRoller roller = new DiceRoller("1d6+4+1d6");
        roller.ParseExpression();

        int result = roller.getResult();
        System.out.println("Result: " + result);
        Assert.assertTrue("Result is less than 1 result: " + result,  result >= 6);
        Assert.assertTrue("Result is greater than 6 result: " + result, result <= 16);
    }

    @Test
    public void ComplexRolling() {
        System.out.println("Complex rolling test");
        DiceRoller roller = new DiceRoller("3d6+1d8+5+5d20");
        roller.ParseExpression();

        int result = roller.getResult();
        System.out.println("Result: " + result);
        Assert.assertTrue("Result is less than 1 result: " + result,  result >= 14);
        Assert.assertTrue("Result is greater than 6 result: " + result, result <= 119);
    }

}
