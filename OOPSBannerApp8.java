
import java.util.HashMap;
public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // O pattern
        charMap.put('O', new String[]{
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

        // P pattern
        charMap.put('P', new String[]{
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

        // S pattern
        charMap.put('S', new String[]{
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

        // Space pattern
        charMap.put(' ', new String[]{
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

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}