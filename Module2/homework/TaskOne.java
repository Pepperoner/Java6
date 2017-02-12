package Module2.homework;

import java.util.Formatter;

public class TaskOne {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("Generated array of integers ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 40 - 20);
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        double[] doubleArray = new double[10];
        System.out.println("Generated array of doubles ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (Math.random() * 40 - 20);
            System.out.print(doubleArray[i] + " ");
        }
        System.out.println();
        System.out.println("Result sum of integers " + Utility.sum(intArray));
        System.out.println("Result sum of doubles " + Utility.sum(doubleArray));
        System.out.println("Min value in int array = " + Utility.min(intArray));
        System.out.println("Min value in double array = " + Utility.min(doubleArray));
        System.out.println("Max value in int array = " + Utility.max(intArray));
        System.out.println("Max value in double array = " + Utility.max(doubleArray));
        System.out.println("Max positive of int array = " + Utility.maxPositive(intArray));
        System.out.println("Max positive of double array = " + Utility.maxPositive(doubleArray));
        System.out.println("Multiplication of int array = " + Utility.multiplication(intArray));
        System.out.println("Multiplication of double array = " + Utility.multiplication(doubleArray));
        System.out.println("Modulus of first element = " + Utility.modulusOfFirstElement(intArray));
        System.out.println("Modulus of first element = " + Utility.modulusOfFirstElement(doubleArray));
        System.out.println("Modulus of last element = " + Utility.modulusOfLastElement(intArray));
        System.out.println("Modulus of last element = " + Utility.modulusOfLastElement(doubleArray));
        System.out.println("Second largest value in array of integers = " + Utility.secondLargest(intArray));
        System.out.println("Second largest value in array of doubles = " + Utility.secondLargest(doubleArray));
    }

}


