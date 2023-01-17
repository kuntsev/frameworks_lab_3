
package ua.edu.sumdu;

/**
 *
 * @author kuntsev
 */
public class StatsCalculator {

private static StatsCalculator instance;//to perform Sigleton

private static double meanages;
private static double maxages;
private static double minages;
private static String popularMail;
private static double sumduMails;

    public static double getMeanAge() {
        return meanages;
    }

    public static void setMeanAge(double meanages) {
        StatsCalculator.meanages = meanages;
    }

    public static double getMaxAge() {
        return maxages;
    }

    public static void setMaxAge(double maxages) {
        StatsCalculator.maxages = maxages;
    }

    public static double getMinAge() {
                return minages;
    }

    public static void setMinAge(double minages) {
        StatsCalculator.minages = minages;
    }

    public static String getPopularMail() {
        return popularMail;
    }

    public static void setPopularMail(String popularMail) {
        StatsCalculator.popularMail = popularMail;
    }

    public static double getSumduMails() {
        return sumduMails;
    }

    public static void setSumduMails(double sumduMails) {
        StatsCalculator.sumduMails = sumduMails;
    }


private StatsCalculator() {//to perform Singleton
}

public static StatsCalculator getInstance() {
if (instance==null) { instance=new StatsCalculator();}
return instance;
    
}
}
