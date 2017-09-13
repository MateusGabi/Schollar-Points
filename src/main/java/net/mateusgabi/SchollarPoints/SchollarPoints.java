package net.mateusgabi.SchollarPoints;

import org.apache.pdfbox.pdfparser.PDFParser;

import java.net.URLConnection;
import java.util.Collection;
import java.util.Map;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 12/09/2017.
 */
public class SchollarPoints {

    private PDFParserFacade pdfParser;

    private Map<Semestry, Collection<Courses>> semestries;

    public SchollarPoints() {
        pdfParser = new PDFParserFacade();
    }

    public Collection<Courses> getCourses(Semestry semestry) {

        return this.semestries.get(semestry);

    }
}
