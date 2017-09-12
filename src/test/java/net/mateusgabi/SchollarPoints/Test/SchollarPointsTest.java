package net.mateusgabi.SchollarPoints.Test;

import net.mateusgabi.SchollarPoints.SchollarPoints;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 12/09/2017.
 */
public class SchollarPointsTest {

    private SchollarPoints mock;

    @Before
    public void create_mock() {
        this.mock = new SchollarPoints();
    }

    @Test
    public void should_create_a_new_SchollarPoints_instance() {

        Assert.assertTrue(mock instanceof SchollarPoints);
    }

}
