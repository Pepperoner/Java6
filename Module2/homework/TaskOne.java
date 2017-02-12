package Module2.homework;

import java.util.Formatter;
import java.util.Calendar;
import java.util.Locale;

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
            System.out.format("%.2f",doubleArray[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Result sum of integers = " + Utility.sum(intArray));
        System.out.print("Result sum of doubles = " );
        System.out.format("%.2f%n",Utility.sum(doubleArray));
        System.out.println("Min value in int array = " + Utility.min(intArray));
        System.out.print("Min value in double array = ");
        System.out.format("%.2f%n",Utility.min(doubleArray));
        System.out.println("Max value in int array = " + Utility.max(intArray));
        System.out.print("Max value in double array = ");
        System.out.format("%.2f%n",Utility.max(doubleArray));
        System.out.println("Max positive of int array = " + Utility.maxPositive(intArray));
        System.out.print("Max positive of double array = ");
        System.out.format("%.2f%n",Utility.maxPositive(doubleArray));
        System.out.println("Multiplication of int array = " + Utility.multiplication(intArray));
        System.out.print("Multiplication of double array = ");
        System.out.format("%.2f%n",Utility.multiplication(doubleArray));
        System.out.println("Modulus of first element = " + Utility.modulusOfFirstElement(intArray));
        System.out.print("Modulus of first element = ");
        System.out.format("%.2f%n",Utility.modulusOfFirstElement(doubleArray));
        System.out.println("Modulus of last element = " + Utility.modulusOfLastElement(intArray));
        System.out.print("Modulus of last element = ");
        System.out.format("%.2f%n",Utility.modulusOfLastElement(doubleArray));
        System.out.println("Second largest value in array of integers = " + Utility.secondLargest(intArray));
        System.out.print("Second largest value in array of doubles = ");
        System.out.format("%.2f%n",Utility.secondLargest(doubleArray));
    }

}


