import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
public class StudentTest {
Student hasGrades;
Student noGrades;

    @Before
    public void setUp() {
        hasGrades = new Student(1, "Matt");

    }

    @Test
    public void TestAddMethod() {
        hasGrades.addGrade(90);
        assertEquals(90, hasGrades.getGradeAverage(), 0.1);
    }

    }



