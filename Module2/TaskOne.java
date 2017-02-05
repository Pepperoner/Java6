package Module2;


public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.println("Generated array " + ' ' + array[i]);
        }
        sum(array);
        min(array);
        max(array);
        maxPositive(array);
        multiplication(array);
        modulus(array);
        secondLargest(array);

    }

    public static void sum(int array[]) {
        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        System.out.println("Result sum" + ' ' + sum);
    }

    public static void min(int array[]) {
        int min;
        min = array[0];

        for (int i = 1; i < 10; i++) {
            if (array[i] < min)
                min = array[i];

        }
        System.out.println("Min = " + min);

    }

    public static void max(int array[]) {
        int max;
        max = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
    }

    public static void maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int i = 1; i < 10; i++) {
            if (array[i] > maxPositive) {
                if (array[i] >= 0) {
                    maxPositive = array[i];
                }
            }
        }
        System.out.println("Max positive = " + maxPositive);
    }

    public static void multiplication(int array[]) {
        int multiplication = 1;
        for (int anArray : array) {
            multiplication *= anArray;
        }
        System.out.println("Multiplication = " + multiplication);
    }

    public static void modulus(int array[]) {
        int modulus;
        modulus = array[0] % array[9];
        System.out.println("Modulus = " + modulus);
    }

    public static void secondLargest(int array[]) {
        int max = 0;
        int secondLargest = 0;
        for (int i = 1; i < 10; i++) {
            if (array[i] > max) {
                secondLargest = max;
                max = array[i];

            }
        }
        System.out.println("Second largest = " + secondLargest);
    }
}


