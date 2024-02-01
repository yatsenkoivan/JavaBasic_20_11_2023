package ua.hillel.yatsenko.lessons.lesson16;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class TestMatrix
{
    static double[][] matrix;

    @Test
    public void testNullMatrixAverage1()
    {
        matrix = null;
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testNullMatrixAverage2()
    {
        matrix = new double[][]
                {
                        null, null, null
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testNullMatrixAverage3()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}, null, {7, 8, 9}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testEmptyMatrixAverage1()
    {
        matrix = new double[][]{};
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testEmptyMatrixAverage2()
    {
        matrix = new double[][]
                {
                        {}, {}, {}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testMatrixAverage1()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(5.0, res);
    }

    @Test
    public void testMatrixAverage2()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5}, {6, 7, 8, 9}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(5.0, res);
    }

    @Test
    public void testMatrixAverage3()
    {
        matrix = new double[][]
                {
                        {5.32, 2.99, 3.001}, {0.445123}, {10, 20, 30, 40}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(13.969515375, res);
    }

    @Test
    public void testMatrixAverage4()
    {
        matrix = new double[5000][5000];
        for (double[] arr : matrix)
        {
            Arrays.fill(arr, 1.0);
        }
        double res = Matrix.average(matrix);
        Assertions.assertEquals(1.0, res);
    }

    @Test
    public void testMatrixAverage5()
    {
        matrix = new double[55][55];
        for (double[] arr : matrix)
        {
            Arrays.fill(arr, -1.0);
        }
        double res = Matrix.average(matrix);
        Assertions.assertEquals(-1.0, res);
    }

    @Test
    public void testMatrixAverage6()
    {
        matrix = new double[][]
                {
                        {2, 4, 4}, {}, {}, {}, {}
                };

        double res = Matrix.average(matrix);
        Assertions.assertEquals(10.0 / 3, res);
    }

    @Test
    public void testMatrixAverage7()
    {
        matrix = new double[2][100];
        Arrays.fill(matrix[0], 1.0);
        Arrays.fill(matrix[1], -1.0);
        double res = Matrix.average(matrix);
        Assertions.assertEquals(0.0, res);
    }

    @Test
    public void testMatrixAverage8()
    {
        matrix = new double[][]
                {
                        {Double.NaN}, {1}, {2}, {3,4}, {5,6,7,8,9}
                };
        double res = Matrix.average(matrix);
        Assertions.assertEquals(Double.NaN, res);
    }

    @Test
    public void testNullMatrixIsSquare1()
    {
        matrix = null;
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testNullMatrixIsSquare2()
    {
        matrix = new double[][]
                {
                        null, null, null
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testNullMatrixIsSquare3()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}, null, {7, 8, 9}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testEmptyMatrixIsSquare1()
    {
        matrix = new double[][]{};
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testEmptyMatrixIsSquare2()
    {
        matrix = new double[][]
                {
                        {}, {}, {}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testMatrixIsSquare1()
    {
        matrix = new double[][]
                {
                        {1, 2}, {3, 4}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertTrue(res);
    }

    @Test
    public void testMatrixIsSquare2()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertTrue(res);
    }

    @Test
    public void testMatrixIsSquare3()
    {
        matrix = new double[][]
                {
                        {1}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertTrue(res);
    }

    @Test
    public void testMatrixIsSquare4()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testMatrixIsSquare5()
    {
        matrix = new double[][]
                {
                        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}
                };
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }

    @Test
    public void testMatrixIsSquare6()
    {
        matrix = new double[150][150];
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertTrue(res);
    }

    @Test
    public void testMatrixIsSquare7()
    {
        matrix = new double[15000][15000];
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertTrue(res);
    }

    @Test
    public void testMatrixIsSquare8()
    {
        matrix = new double[7500][7500];
        matrix[7499] = new double[7499];
        boolean res = Matrix.isSquare(matrix);
        Assertions.assertFalse(res);
    }
}
