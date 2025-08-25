import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {
    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(100);
        Assert.assertEquals("$100.00", money);
    }

    @Test
    public void negativemoneyTest(){
        String money = MoneyUtil.format(-100);
        Assert.assertEquals("-$100.00", money);
    }

    @Test
    public void euromoneyTest(){
        String money = MoneyUtil.format(-100, "€");
        Assert.assertEquals("-€100.00", money);
    }

    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionmoneyTest(){
         MoneyUtil.format(-100, null);

    }
}
