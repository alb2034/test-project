package org.example;

import org.matrix.Matrix;
import org.matrix.SquareMatrix;

import java.util.Arrays;
import java.util.List;

/**
 * Главный класс для запуска консольного приложения
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Matrix> matrixs = Arrays.asList(new SquareMatrix(), new SquareMatrix());

        // Вывод на экран значений сумм диагоналей матриц
        matrixs.forEach(matrix ->
                {
                    Integer sum = matrix.getMainDiagonalSum() + matrix.getOtherDiagonalSum();
                    System.out.println(sum);
                }
        );
    }
}
