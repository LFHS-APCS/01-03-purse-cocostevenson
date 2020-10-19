
/**
 * Introduction to money
 */
public class MoneyIntro
{
    /**
     * return how many dollars in total, for example 34.56-->34
     */
    public int getDollarsFromMoney(double money)
    {
        return (int)money;
    }

    /**
     * return how many cents in total, for example 34.56-->56
     */
    public int getCentsFromMoney(double money)
    {
       money = money - getDollarsFromMoney(money);
        money = money * 100;
        money = Math.round(money);
        return (int)money;
    }
}
