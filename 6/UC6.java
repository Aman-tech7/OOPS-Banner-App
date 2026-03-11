public class UC6 {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                " PPPP ",
                " P   P",
                " PPPP ",
                " P    ",
                " P    "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                " SSSS ",
                " S    ",
                " SSSS ",
                "    S ",
                " SSSS "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "   " + oPattern[i] + "   " + pPattern[i] + "   " + sPattern[i]);
        }
    }
}