package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void matrixis() {
        Matrix mat = new Matrix();
        Integer[][] matrix = new Integer[][]{
                {1, 2, 3, 4},
                {5, 6, 7}
        };
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertThat(mat.matrixis(matrix), is(expected));
    }
}