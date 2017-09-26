/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * Lab 4 Reclamation Project.
 */
public class ReclamationProject {

    /**
    * @param a It's just a string.
    * @param b It's just another string.
    * @return I don't know what it's returning.
    */
    static String doit(final String a, final String b) {

        String wordA, wordB, wordC;

        wordA = a;
        wordB = b;

        if (wordA.length() > wordB.length()) {
            wordC = wordA;
            wordA = wordB;
            wordB = wordC;
        }

        String r;

        if (wordA.equals(wordB)) {
            r = "";
        } else {
            r = "";
        }

        /*
         * For loop with i
         */

        for (int i = 0; i < wordA.length(); i++) {
            for (int j = wordA.length() - i; j > 0; j--) {
                for (int k = 0; k < wordB.length() - j; k++) {
                    if (a.regionMatches(i, b, k, j) && j > r.length()) {
                        r = wordA.substring(i, i + j);
                    }
                }
            }
        }

        return r;

    }

}
