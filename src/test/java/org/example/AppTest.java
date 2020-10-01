package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.matrix.Matrix;
import org.matrix.SquareMatrix;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Проверка расчета сумм гл. диагонали матрицы
     */
    @Test
    public void shouldCalculateMainDiagonalSum()
    {

        // TODO: запретить самостоятельное создание конкретного типа матрицы
        // TODO: добавить фабрику, которая будет создавать квадратную либо прямоугольную матрицу в зависимости от кол-ва инициированных строк и столбцов
        Matrix squareMatrix = new SquareMatrix();

        assertEquals(3, squareMatrix.getMainDiagonalSum().intValue());
    }

    /**
     * Проверка расчета сумм побочной диагонали матрицы
     */
    @Test
    public void shouldCalculateOtherDiagonalSum()
    {

        Matrix squareMatrix = new SquareMatrix();

        assertEquals(4, squareMatrix.getOtherDiagonalSum().intValue());
    }
}
