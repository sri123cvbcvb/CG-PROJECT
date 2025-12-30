package com.cg.oopsbanner.renderer;

public class OOPSBannerRenderer {

    private static final int HEIGHT = 9;

    public static void render(String message) {

        for (int row = 0; row < HEIGHT; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                switch (ch) {
                    case 'O':
                        drawO(row, line);
                        break;
                    case 'P':
                        drawP(row, line);
                        break;
                    case 'S':
                        drawS(row, line);
                        break;
                    default:
                        line.append("       ");
                }
                line.append("  "); // spacing between letters
            }

            System.out.println(line);
        }
    }

    /* ================= LETTER LOGIC ================= */

    private static void drawO(int row, StringBuilder sb) {
        if (row == 0 || row == HEIGHT - 1) {
            sb.append(" *** ");
        } else {
            sb.append("** **");
        }
    }

    private static void drawP(int row, StringBuilder sb) {
        if (row == 0 || row == 4) {
            sb.append("*******");
        } else if (row == 2) {
            sb.append("**     **");

        } else if (row < 4) {
            sb.append("**    **");
        } else {
            sb.append("**");
            sb.append("       ");
        }
    }

    private static void drawS(int row, StringBuilder sb) {
        if (row == 0) {
            sb.append("     ****** ");

        } else if (row == 1 || row == 3) {
            sb.append("  **      ");
        }
    else if (row == 2) {
        sb.append("**      ");
    }

        else if (row == 4) {
            sb.append("     *****  ");
        } else if (row == HEIGHT - 1) {
            sb.append("   ****** ");
        }  else if(row == 5 || row == 7){
            sb.append("        **");
        }else if(row == 6){
            sb.append("         **");
        }
    }
}
