package net.mateusgabi.SchollarPoints.Test;

import net.mateusgabi.SchollarPoints.PDFParserFacade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 12/09/2017.
 */
public class PDFParserFacadeTest {


    private PDFParserFacade mock;

    @Before
    public void create_mock() {
        this.mock = new PDFParserFacade();
    }


    @Test
    public void should_create_a_new_SchollarPoints_instance() {

        Assert.assertTrue(mock instanceof PDFParserFacade);
    }

    @Test
    public void should_found_a_file() {

        Assert.assertTrue(mock.setPDFFileSource("src\\test\\resources\\foo.txt"));
    }

    @Test
    public void should_not_found_a_file() {

        Assert.assertFalse(mock.setPDFFileSource(null));
    }

    @Test
    public void should_except_not_exist_a_file() {

        Assert.assertFalse(mock.setPDFFileSource("src\\test\\resources\\notExists.pdf"));

    }

    @Test
    public void should_not_accept_this_file_type() {

        mock.setPDFFileSource("src\\test\\resources\\foo.txt");

        Assert.assertFalse(mock.isPDFFile());

    }

    @Test
    public void should_not_match_content() {

        mock.setPDFFileSource("src\\test\\resources\\foo.txt");

        Assert.assertNotEquals("coneúdo", mock.getContent());

    }

    @Test
    public void should_different_of_null() {

        mock.setPDFFileSource("src\\test\\resources\\documento.pdf");


        Assert.assertNotNull(mock.getContent());
    }

    @Test
    public void should_write_a_output_file() {

        mock.setPDFFileSource("src\\test\\resources\\documento.pdf");

        Assert.assertTrue(mock.writeContent());
    }

}