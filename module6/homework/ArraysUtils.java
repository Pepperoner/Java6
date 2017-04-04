package module6.homework;


public final class ArraysUtils {

    private ArraysUtils(){

    }
    public static int sum(int array[]) {
        int sum = 0;
        for (int anArray : array) {
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
    public static int max(int array[]) {
        int max = array[0];
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
    public static int multiplication(int array[]) {
        int multiplication = 1;
        for (int anArray : array) {
            if (anArray != 0) {
                multiplication *= Math.abs(anArray);
            }
        }
        return multiplication;
    }
    public static int[] modulusOfElements(int array[]) {
        int[] Modulus = new int[2];
        Modulus[0] = Math.abs(array[0]);
        Modulus[1] = Math.abs(array[array.length-1]);
        return Modulus;
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
    public static int[] reverse (int[]array){
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[(array.length-i)-1] = array[i];
        }
        return tempArray;
    }
    public static int[] findEvenElements(int[]array){
        int[] tempArray = new int[array.length];
        int i = 0;
        for (int element : array) {
            if(element%2 == 0){
                tempArray[i] = element;
                i++;
            }
        }
        return tempArray;
    }
}
