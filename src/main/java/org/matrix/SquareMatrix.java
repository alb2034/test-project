package org.matrix;

import java.util.Arrays;
import java.util.List;

public class SquareMatrix extends Matrix {
    public SquareMatrix() {
        rows.add(Arrays.asList(1, 2));
        rows.add(Arrays.asList(2, 2));
    }

    /**
     * TODO: tbd
     */
    @Override
    protected List<Integer> getMainDiagonal() {
        return Arrays.asList(1, 2);
    }

    /**
     * TODO: tbd
     */
    @Override
    protected List<Integer> getOtherDiagonal() {
        return Arrays.asList(2, 2);
    }
}
