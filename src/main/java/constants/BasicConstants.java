package constants;

public class BasicConstants {
    //--------- URL CONSTANTS
    public static final String URL_APLIKACE = "http://czechitas-datestovani-hackathon.cz/en/";

    //--------- XPATH
    public static String xpathClassNamePrefix(String htmlClass) {
        return "contains(concat(' ', normalize-space(@class), ' '), ' " + htmlClass + " ')";
    }
}
