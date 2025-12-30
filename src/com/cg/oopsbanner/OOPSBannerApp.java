package com.cg.oopsbanner;

import com.cg.oopsbanner.renderer.OOPSBannerRenderer;

/**
 * OOPSBannerApp UC2 – OOPS Banner Display Application
 *
 * This class demonstrates the creation of an ASCII art banner using
 * Object-Oriented Programming principles.
 *
 * It extends the basic banner concept by displaying the word "OOPS"
 * in a visual format using asterisks (*) and spaces to form each letter.
 *
 * @author Developer
 * @version 2.0
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define the message to be displayed as a banner
        String message = "OOPS";

        // Call the banner render logic to display the message
        OOPSBannerRenderer.render(message);
    }
}
