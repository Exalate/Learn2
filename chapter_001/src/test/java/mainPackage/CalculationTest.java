package mainPackage;

import org.junit.Assert;
import org.junit.Test;

public class CalculationTest {

    @Test
    public void calcPlus(){

        int a = 4;
        int b = 6;

        int exp = 10;
        Calculation calc = new Calculation();

        int out = calc.calcPlus(a, b);

        Assert.assertEquals(exp, out);

    }

}
