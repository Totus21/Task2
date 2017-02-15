package com.natasha_mishuk.task2.matrix;

import java.util.Random;

public class MatrixUtil {

    public void generateMatrix( MatrixParameters initialMatrix)
    {
        Random objectRandom=new Random();
        int [] localInitialMatrix=new int[initialMatrix.getMatrixCapacity()];

        for (int i=0;i<initialMatrix.getMatrixCapacity();i++){
            localInitialMatrix[i]= objectRandom.nextInt(initialMatrix.getMatrixCapacity());

        }

        initialMatrix.setInitialMatrix(localInitialMatrix);

    }
}
