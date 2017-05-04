package module7.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test for 1000 Integers: ");
        System.out.println();
        ArrayList<Integer> integerArrayList = currentList(1000);
        LinkedList<Integer> integerLinkedList = new LinkedList<>(integerArrayList);

        testAdd(integerArrayList);
        testAdd(integerLinkedList);

        testSet(integerArrayList);
        testSet(integerLinkedList);

        testGet(integerArrayList);
        testGet(integerLinkedList);

        testRemove(integerArrayList);
        testRemove(integerLinkedList);

        System.out.println();
        System.out.println("Test for 10000 Integers: ");
        System.out.println();
        integerArrayList = currentList(10000);
        integerLinkedList = new LinkedList<>(integerArrayList);

        testAdd(integerArrayList);
        testAdd(integerLinkedList);

        testSet(integerArrayList);
        testSet(integerLinkedList);

        testGet(integerArrayList);
        testGet(integerLinkedList);

        testRemove(integerArrayList);
        testRemove(integerLinkedList);

        System.out.println();
        System.out.println("Test for 1000 Strings: ");
        System.out.println();
        ArrayList<String> stringArrayList = currentList(1000);
        LinkedList<String> stringLinkedList = new LinkedList<>(stringArrayList);

        testAdd(stringArrayList);
        testAdd(stringLinkedList);

        testSet(stringArrayList);
        testSet(stringLinkedList);

        testGet(stringArrayList);
        testGet(stringLinkedList);

        testRemove(stringArrayList);
        testRemove(stringLinkedList);

        System.out.println();
        System.out.println("Test for 10000 Strings: ");
        System.out.println();
        stringArrayList = currentList(10000);
        stringLinkedList = new LinkedList<>(stringArrayList);

        testAdd(stringArrayList);
        testAdd(stringLinkedList);

        testSet(stringArrayList);
        testSet(stringLinkedList);

        testGet(stringArrayList);
        testGet(stringLinkedList);

        testRemove(stringArrayList);
        testRemove(stringLinkedList);
    }

    private static ArrayList currentList(int lenght){

        ArrayList returnList = new ArrayList();
        for (int i = 0; i < lenght; i++) {
            returnList.add(i,i);
        }
        return returnList;
    }

    private static long getTime(){
        return System.nanoTime();
    }

    private static void testAdd(List innerList){
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList add");
        }
        if(innerList instanceof LinkedList){
            System.out.println("LinkedList add");
        }
        long start = getTime();
        innerList.add(500);
        long finish = getTime();
        System.out.println(finish - start);
    }

    private static void testSet(List innerList){
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList set");
        }
        if(innerList instanceof LinkedList){
            System.out.println("LinkedList set");
        }
        long start = getTime();
        innerList.set(500,500);
        long finish = getTime();
        System.out.println(finish - start);
    }

    private static void testGet(List innerList){
        if(innerList == null){
            return;
        }
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList get");
        }
        if(innerList instanceof LinkedList){
            System.out.println("LinkedList get");
        }
        long start = getTime();
        innerList.get(500);
        long finish = getTime();
        System.out.println(finish - start);
    }

    private static void testRemove(List innerList){
        if(innerList == null){
            return;
        }
        if(innerList instanceof ArrayList){
            System.out.println("ArrayList remove");
        }
        if(innerList instanceof LinkedList){
            System.out.println("LinkedList remove");
        }
        long start = getTime();
        innerList.remove(500);
        long finish = getTime();
        System.out.println(finish - start);
    }
}
