package Module2.homework;


public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Generated array ");
           for (int i = 0; i < array.length; i++) {
               array[i] = (int) (Math.random() * 40 - 20);
               System.out.print(array[i] + " ");
           }
        System.out.println();
        System.out.println("Result sum" + ' ' + Utility.sum(array));
        System.out.println("Min = " + Utility.min(array));
        System.out.println("Max = " + Utility.max(array));
        System.out.println("Max positive = " + Utility.maxPositive(array));
        System.out.println("Multiplication = " + Utility.multiplication(array));
        System.out.println("Modulus of first element = " + Utility.modulusOfFirstElement(array));
        System.out.println("Modulus of last element = " + Utility.modulusOfLastElement(array));
        System.out.println("Second largest = " + Utility.secondLargest(array));
    }

}


