package Module2.homework;

public class Utility {

    public static int sum(int array[]) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        return sum;
    }
    public static double sum(double array[]) {
        double sum = 0;
        for (double anArray : array) {
            sum += anArray;
        }
        return sum;
    }
    public static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static double min(double array[]) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static double max(double array[]) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > maxPositive) && (array[i] >= 0 )) {
                    maxPositive = array[i];
                }
            }
        return maxPositive;
    }
    public static double maxPositive(double array[]) {
        double maxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > maxPositive) && (array[i] >= 0 )) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }
    public static int multiplication(int array[]) {
        int multiplication = 1;
        for (int anArray : array) {
            if (anArray != 0) {
                multiplication *= Math.abs(anArray);
            }
        }
        return multiplication;
    }
    public static double multiplication(double array[]) {
        double multiplication = 1;
        for (double anArray : array) {
            if (anArray != 0) {
                multiplication *= Math.abs(anArray);
            }
        }
        return multiplication;
    }
    public static int modulusOfFirstElement(int array[]) {
        int modulus = Math.abs(array[0]);
        return modulus;
    }
    public static double modulusOfFirstElement(double array[]) {
        double modulus = Math.abs(array[0]);
        return modulus;
    }
    public static int modulusOfLastElement(int array[]) {
        int modulus = Math.abs(array[array.length - 1]);
        return modulus;
    }
    public static double modulusOfLastElement(double array[]) {
        double modulus = Math.abs(array[array.length - 1]);
        return modulus;
    }
    public static int secondLargest(int array[]) {
        int temp;
        int secondLargest;
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < (array.length-i); j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        secondLargest = array[array.length - 2];
        return secondLargest;
    }
    public static double secondLargest(double array[]) {
        double temp;
        double secondLargest;
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < (array.length-i); j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        secondLargest = array[array.length - 2];
        return secondLargest;
    }
}
