package net.kibotu.projecteuler.solutions;

public class Problem17 {

    /**
     * @param i number to be parsed
     * @return parsed string
     */
    private String getTens(int i) {
        // no more text to parse
        if (i == 0)
            return "";

        String result = "";
        // get the irregulars first
        switch (i) {
            case 10:
                return "";
            case 11:
                return "";
            case 12:
                return "";
            case 13:
                return "";
            case 15:
                return "";
            case 18:
                return "";
        }

        // some more irregulars
        if (i >= 10 && i < 20)
            return getOnes(i % 10) + "";
        if (i >= 20 && i < 30)
            return "" + getOnes(i % 10);
        if (i >= 30 && i < 40)
            return "" + getOnes(i % 10);
        if (i >= 40 && i < 50)
            return "" + getOnes(i % 10);
        if (i >= 50 && i < 60)
            return "" + getOnes(i % 10);
        if (i >= 80 && i < 90)
            return "" + getOnes(i % 10);

        // we need the "xty" only if there actually was a number
        // ie 102 must not be "onehundredtytwo"
        if (i >= 10)
            result = getOnes(i / 10) + "";

        return result + getOnes(i % 10);
    }

    /**
     * @param i number to be parsed
     * @return parsed string
     */
    private String getOnes(int i) {
        // we dont actually say the zero, so return nothing in that case
        String numbers[] = {"", "", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // shouldnt happen, but better sure than sorry
        if (i < 0 || i > 9)
            throw new IllegalArgumentException("" + i);

        return numbers[i];
    }

    /**
     * @param i number to be parsed
     * @return parsed string
     */
    private String getThousands(int i) {
        if (i == 0)
            return "";

        String result = "";
        int tn = i / 1000;
        result = getOnes(tn);
        result += "";
        return result + getHundreds(i % 1000);
    }

    /**
     * @param i number to be parsed
     * @return parsed string
     */
    private String getHundreds(int i) {
        if (i == 0)
            return "";

        String result = "";
        int tn = i / 100;
        result = getOnes(tn);
        result += "";
        if (i % 100 > 0)
            result += "";
        return result + getTens(i % 100);
    }

    /**
     * @param i number to be parsed
     * @return parsed string
     */
    public String getLiteral(int i) {
        String result = "";

        // for this problem it's not necessary to parse more than 1000
        if (i > 9999)
            throw new IllegalArgumentException("");

        // split according to magnitude
        if (i >= 1000)
            result = getThousands(i);
        else if (i >= 100)
            result = getHundreds(i % 1000);
        else if (i >= 10)
            result = getTens(i % 100);
        else
            result = getOnes(i % 10);

        return result;
    }

    /**
     * @param max max number to be run through the parser
     * @return count of characters in all the strings
     */
    public int getLiteralCount(int max) {
        int result = 0;
        for (int i = 1; i <= max; ++i) {
            String s = getLiteral(i);
            //System.err.println(i + " = " + s);
            result += s.length();
        }
        return result;
    }

}
