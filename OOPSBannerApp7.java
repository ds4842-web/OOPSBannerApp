

class OOPSBannerApp7 {

    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // O (9 lines)
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        // P (9 lines)
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       ",
                "**       ",
                "**       "
        });

        // S (9 lines)
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                " *****  ",
                "**      ",
                "**      ",
                " ****   ",
                "    **  ",
                "    **  ",
                "    **  ",
                "    **  ",
                "*****   "
        });

        // Space (9 lines)
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        ",
                "        "
        });

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If not found, return space pattern (no infinite recursion)
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[9];
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 9; // 9 lines for each character

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < message.length(); j++) {
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}