/**
 * @author Yunir Yuliakshin
 */
class Utils {

    public static double getCount(double money, double coefficient) {
        double count;
        count = money/coefficient;
        count = Math.floor(count * 100) / 100; // точность до 2 знаков
        return count;
    }
}
