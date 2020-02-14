import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class StudentTest {
   private ArrayList<Integer> grades;

    @Before
    public void setUp() {
        this.grades = new ArrayList<>();

    }

    @Test
    public void testIfArrayList() {
        int[] expected = {70, 80, 90, 100};
        int[] output = {70, 80, 90, 100};
        assertArrayEquals(expected, output);
    }



}