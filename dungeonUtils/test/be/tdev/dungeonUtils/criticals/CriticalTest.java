package be.tdev.dungeonUtils.criticals;


import be.tdev.dungeonUtils.diceroller.DiceRoller;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Quentin.Tawry on 13-11-14.
 */
@Ignore
public class CriticalTest {
    private CriticalList crits;
    private CriticalList fumbles;

    public CriticalTest(){
        this.crits = new CriticalList("crits");
        this.fumbles = new CriticalList("Fumbles");
    }

    @Before
    public void init(){
        for (int i = 1; i <= 20; i++) {
            this.crits.addCritical(i, new Critical().setEffect("Positive critical "+i));
            this.fumbles.addCritical(i, new Critical().setEffect("Fumble "+i));
        }
    }
    @Test
    public void critTest(){
        Assert.assertNotNull("Critic 1", this.crits.getCritical(1));
        Assert.assertNotNull("Critic 20", this.crits.getCritical(20));

        Assert.assertNull("Critic 21", this.crits.getCritical(21));
        Assert.assertNull("Critic 0", this.crits.getCritical(0));
    }
    @Test
    public void criticalRoll(){
        DiceRoller roller = new DiceRoller("1d20");
        roller.ParseExpression();
        int result = roller.getResult();

        Assert.assertEquals("Positive critical "+result, this.crits.getCritical(result).getEffect());
    }
}
