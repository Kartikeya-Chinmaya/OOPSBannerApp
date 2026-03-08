/**
 * OOPSBannerApp - Displays OOPS banner using CharacterPatternMap class
 * @author Kartikeya-Chinmaya
 * @version 7.0
 */
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

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

    public static void main(String[] args) {
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
            " *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
            "**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
            " *** ", "*    ", "*    ", " *** ", "    *", "    *", " *** "
        });

        CharacterPatternMap[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap c : word) {
                line.append(c.getPattern()[i]).append("  ");
            }
            System.out.println(line.toString().stripTrailing());
        }
    }
}