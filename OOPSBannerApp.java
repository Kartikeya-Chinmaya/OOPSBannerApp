/**
 * OOPSBannerApp - Displays OOPS banner using HashMap
 * @author Kartikeya-Chinmaya
 * @version 8.0
 */
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " *** ", "*   *", "*   *", "*   *", "*   *", "*   *", " *** "
        });

        map.put('P', new String[]{
            "**** ", "*   *", "*   *", "**** ", "*    ", "*    ", "*    "
        });

        map.put('S', new String[]{
            " *** ", "*    ", "*    ", " *** ", "    *", "    *", " *** "
        });

        return map;
    }

    static void renderBanner(String word, Map<Character, String[]> patternMap) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                line.append(patternMap.get(c)[i]).append("  ");
            }
            System.out.println(line.toString().stripTrailing());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        renderBanner("OOPS", patternMap);
    }
}