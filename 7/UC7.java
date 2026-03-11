public class UC7 {

    // Inner class to store character and its pattern
    public static class CharacterPatternMap {

        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to create pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        };

        String[] P = {
                " PPPP ",
                " P   P",
                " PPPP ",
                " P    ",
                " P    "
        };

        String[] S = {
                " SSSS ",
                " S    ",
                " SSSS ",
                "    S ",
                " SSSS "
        };

        String[] space = {
                "      ",
                "      ",
                "      ",
                "      ",
                "      "
        };

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        charMaps[3] = new CharacterPatternMap(' ', space);

        return charMaps;
    }

    // Method to get pattern of a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return charMaps[3].getPattern(); // return space if not found
    }

    // Method to print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        String[] firstPattern = getCharacterPattern(message.charAt(0), charMaps);

        for (int i = 0; i < firstPattern.length; i++) {

            for (int j = 0; j < message.length(); j++) {

                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}