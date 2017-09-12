package net.mateusgabi.SchollarPoints;

import org.apache.pdfbox.pdfparser.PDFParser;

import java.net.URLConnection;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 12/09/2017.
 */
public class SchollarPoints {

    private PDFParserFacade pdfParser;

    public SchollarPoints() {
        pdfParser = new PDFParserFacade();
    }
}
