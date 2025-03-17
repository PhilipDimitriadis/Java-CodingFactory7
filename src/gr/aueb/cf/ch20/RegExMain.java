package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "A8ana Androutsos";
//        System.out.println(isRed(s));
//        System.out.println(isrRedOrgGreen(s));
//        System.out.println(beginsWithOneUpperCaseAndEndsInIng(s));
//        System.out.println(whiteSpaceDigit(s));
//        System.out.println(anySymbolDigit(s));
//        System.out.println(isEmail(s));
//        System.out.println(isDate(s));
//        String[] tokens = doSplit(s);
//        for (String token : tokens) {
//            System.out.println(token);
//        }
//        System.out.println(doReplace(s));
        System.out.println(doReplaceBackreference(s));
    }


    /**
     * Ελέγχει (matches) αν το input string είναι το "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }


    /**
     * Ελέγχει (matches) αν το input string είναι "red" ή "green"
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }


    /**
     * Ελέγχει (matches) αν το input string
     * είναι "red" ή "Red" ή "green" ή "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }


    /**
     * Ελέγχει (matches) αν το input string
     * ξεκινάει με κεφαλαίο και τελειώνει σε -ing
     * @param s
     * @return
     */
    public static boolean beginsWithOneUpperCaseAndEndsInIng(String s) {
        return s.matches("[A-Z]ing");
    }


    /**
     * Ελέγχει (matches) αν το input string
     * ξεκινάει είτε με μικρό είτε με κεφαλαίο και τελειώνει σε -ing
     * @param s
     * @return
     */
    public static boolean isOneLetterAndEndsInIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whiteSpaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    public static boolean anySymbolDigit(String s) {
//        return s.matches(".\\d");
        return s.matches(".[0-9]");
    }


    /**
     * Ελέγχει (matches) αν το input string είναι email
     * @param s
     * @return
     */
    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+"," ");
    }

    public static String doReplaceBackreference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
