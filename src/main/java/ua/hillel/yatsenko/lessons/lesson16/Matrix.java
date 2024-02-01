package ua.hillel.yatsenko.lessons.lesson16;

public class Matrix
{
    public static double average(double[][] matrix)
    {
        if (matrix == null)
        {
            return Double.NaN;
        }
        double sum = 0;
        int count = 0;

        for (double[] row : matrix)
        {
            if (row == null) return Double.NaN;
            for (double element : row)
            {
                sum += element;
            }
            count += row.length;
        }

        return sum / count;
    }

    public static boolean isSquare(double[][] matrix)
    {
        if (matrix == null || matrix.length == 0)
        {
            return false;
        }
        for (double[] row : matrix)
        {
            if (row == null || row.length != matrix.length)
            {
                return false;
            }
        }

        return true;
    }
}
