package net.mateusgabi.SchollarPoints;

import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 12/09/2017.
 */
public class PDFParserFacade {

    private File PDFFile;

    /**
     * Set and return a boolean that represents if a file was found or not.
     *
     * @param src
     * @return
     */
    public boolean setPDFFileSource(String src) {

        try {
            this.PDFFile = new File(src);
        }
        catch (NullPointerException ex){
            return false;
        }


        return this.PDFFile.exists();

    }

    public boolean isPDFFile() {

        String fileName = this.PDFFile.getName();

        return fileName.matches("/(.pdf)/ig");
    }

    public String getContent() {

        PDDocument pdfDocument = null;

        try {
            PDFParser parser = new PDFParser(new RandomAccessFile(PDFFile, "r"));
            parser.parse();

            pdfDocument = parser.getPDDocument();
            PDFTextStripper stripper = new PDFTextStripper();


            return stripper.getText(pdfDocument);

        } catch (IOException e) {

            return null;

        } catch (Throwable e) {

            return null;

        } finally {
            if (pdfDocument != null) {
                try {
                    pdfDocument.close();
                } catch (IOException e) {

                    return null;
                }
            }
        }

    }

    /**
     * Write PDF content in a temp output file
     *
     * @return
     */
    public boolean writeContent() {

        String pdfContent = this.getContent();


        try {

            FileWriter temp = new FileWriter("temp.txt");
            temp.write(pdfContent);
            temp.close();

        } catch (Exception ex) {

            return false;

        }

        return true;


    }
}
