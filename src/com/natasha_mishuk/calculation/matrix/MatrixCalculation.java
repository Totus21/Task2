package com.natasha_mishuk.calculation.matrix;

public class MatrixCalculation {

   public void calculateMatrixSum(MatrixParameters localMatrix)
   {
       int localSum=0;

       for (int i=0; i<localMatrix.getMatrixCapacity();i++)
       {
           int local=localMatrix.getInitialMatrix()[i];
           if (localMatrix.getInitialMatrix()[i] - localMatrix.getMatrixDivisor()*((int)(localMatrix.getInitialMatrix()[i]/localMatrix.getMatrixDivisor()))==0){
               localSum=localSum+localMatrix.getInitialMatrix()[i];
           }
       }
       localMatrix.setResultSum(localSum);
   }
}
