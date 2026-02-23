public class UC3 {

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

        // Print 7 lines using String.join()
        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join(" ", O[i], O[i], P[i], S[i])
            );
        }
    }
}