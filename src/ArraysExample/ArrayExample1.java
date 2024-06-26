package ArraysExample;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
//        How to Declare an Array in Java
        int[] testArray;
        //Declare an array with size

        int[] intArray = {1,0,3,3,3};
        int[] intArraynew = new int[]{1,2,3,4,5,6,7,8,8};
        System.out.println(Arrays.stream(intArraynew).summaryStatistics());

        int[] numbers = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(numbers, 3);
System.out.println("Index of 3: " + index);
    }
}
