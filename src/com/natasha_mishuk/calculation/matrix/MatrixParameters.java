package com.natasha_mishuk.calculation.matrix;

/**
 * Created by Natasha_Mishuk on 2/15/2017.
 */
public class MatrixParameters {
    private int[] initialMatrix;
    private int matrixCapacity;
    private int matrixDivisor;
    private int resultSum;

    public void setInitialMatrix(int[] enteredMatrix) {
        this.initialMatrix = enteredMatrix;
    }

    public void setMatrixCapacity(int matrixCapacity) {
        this.matrixCapacity = matrixCapacity;
    }

    public void setMatrixDivisor(int matrixDivisor) {
        this.matrixDivisor = matrixDivisor;
    }

    public void setResultSum(int resultSum) {
        this.resultSum = resultSum;
    }



    public int[] getInitialMatrix() {
        return initialMatrix;
    }

    public int getMatrixCapacity() {
        return matrixCapacity;
    }

    public int getMatrixDivisor() {
        return matrixDivisor;
    }

    public int getResultSum() {
        return resultSum;
    }
}
