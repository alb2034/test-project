package org.matrix;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Базовый класс для квадратной и прямоугольной матриц
 */
public abstract class Matrix {

    /**
     * строки
     */
    protected List<List<Integer>> rows = new ArrayList<>();

    /**
     * Добавить новую строку
     * TODO: перенести в фабрику,
     * TODO: так как конкретный тип матрицы по разному может пополняться новыми строками
     */
    public void put(List<Integer> row) {
        rows.add(row);
    }

    /**
     * Получить элементы главной диагонали
     * TODO: добавить поле в класс для кэширования
     */
    protected abstract List<Integer> getMainDiagonal();

    /**
     * Получить элементы побочной диагонали
     * TODO: добавить поле в класс для кэширования
     */
    protected abstract List<Integer> getOtherDiagonal();

    /**
     * TODO: getMainDiagonalSum и getOtherDiagonalSum имеют повторный код
     * TODO: перенести в DiagonalCalculator или оставить один метод getDiagonalSum, принимающий параметр с типом диагонали
     */
    public Integer getMainDiagonalSum() {

        Integer result = getMainDiagonal().stream()
                .mapToInt(Integer::intValue)
                .sum();
        return result;
    }

    /**
     * TODO: перенести в DiagonalCalculator
     */
    public Integer getOtherDiagonalSum() {
        Integer result = getOtherDiagonal().stream()
                .mapToInt(Integer::intValue)
                .sum();
        return result;
    }

}
