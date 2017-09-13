package net.mateusgabi.SchollarPoints.Test;

import net.mateusgabi.SchollarPoints.Courses;
import net.mateusgabi.SchollarPoints.SchollarPoints;

import net.mateusgabi.SchollarPoints.Semestry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;

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

    @Test
    public void should_return_courses_of_first_semestry() {

        Collection<Courses> courses = new ArrayList<Courses>();

        courses.add(new Courses("ALGORITMOS E PROGRAMAÇÃO ORIENTADA A OBJETOS I"));
        courses.add(new Courses("CÁLCULO I"));
        courses.add(new Courses("INTRODUÇÃO À ADMINISTRAÇÃO"));
        courses.add(new Courses("INTRODUÇÃO À ENGENHARIA DE SOFTWARE"));
        courses.add(new Courses("INTRODUÇÃO A SISTEMAS DIGITAIS"));

        Semestry semestry = new Semestry("2015.1");

        Assert.assertEquals(courses, mock.getCourses(semestry));

    }

}
