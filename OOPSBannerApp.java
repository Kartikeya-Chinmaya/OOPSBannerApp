/**
 * OOPSBannerApp - Displays OOPS banner using static helper methods
 * @author Kartikeya-Chinmaya
 * @version 6.0
 */
public class OOPSBannerApp {

    static String[] getO() {
        return new String[] {
            String.join("", " *** "),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", " *** ")
        };
    }

    static String[] getP() {
        return new String[] {
            String.join("", "**** "),
            String.join("", "*   *"),
            String.join("", "*   *"),
            String.join("", "**** "),
            String.join("", "*    "),
            String.join("", "*    "),
            String.join("", "*    ")
        };
    }

    static String[] getS() {
        return new String[] {
            String.join("", " *** "),
            String.join("", "*    "),
            String.join("", "*    "),
            String.join("", " *** "),
            String.join("", "    *"),
            String.join("", "    *"),
            String.join("", " *** ")
        };
    }

    public static void main(String[] args) {
        String[] O1 = getO();
        String[] O2 = getO();
        String[] P  = getP();
        String[] S  = getS();

        for (int i = 0; i < 7; i++) {
            System.out.println(O1[i] + "  " + O2[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}