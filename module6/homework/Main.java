package module6.homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {

        int[] array = intArray(CAPACITY);

        int[] Modulus;

        System.out.println("int array = " + Arrays.toString(array));
        System.out.println(String.format("int sum = %d", ArraysUtils.sum(array)));
        System.out.println(String.format("int min = %d",ArraysUtils.min(array)));
        System.out.println(String.format("int max = %d",ArraysUtils.max(array)));
        System.out.println(String.format("int max positive = %d",ArraysUtils.maxPositive(array)));
        System.out.println(String.format("int multiplication = %d",ArraysUtils.multiplication(array)));

        Modulus = ArraysUtils.modulusOfElements(array);
        System.out.println(String.format("int modulus of first element = %d",Modulus[0]));
        System.out.println(String.format("int modulus of last element = %d",Modulus[1]));
        System.out.println(String.format("int second largest element = %d",ArraysUtils.secondLargest(array)));
        System.out.println("reverse array = " + Arrays.toString(ArraysUtils.reverse(array)));
        System.out.println("Even elements of array = " + Arrays.toString(ArraysUtils.findEvenElements(array)));

    }
    private static int[] intArray(int size) {
        int[] array = new int[size];
        final Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(50)-25;
        }
        return array;
    }
}
