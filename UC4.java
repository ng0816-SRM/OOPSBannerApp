public class UC4 {

    public static void main(String[] args) {

        // Letter O (9 width, 7 lines)
        String[] O = {
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
        };

        // Letter P
        String[] P = {
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        };

        // Letter S
        String[] S = {
            "  ****** ",
            " *       ",
            "*        ",
            "  *****  ",
            "        *",
            "       * ",
            " ******  "
        };

        // Step 1: Create String array to store banner lines
        String[] banner = new String[7];

        // Step 2: Populate array using String.join()
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", O[i], O[i], P[i], S[i]);
        }

        // Step 3: Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}