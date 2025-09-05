// DSA Practice Java + DSA 

import java.util.Scanner;

public class ArraysCC {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestFind(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int smallestFind(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void printPairs(int numbers[]) {
        int totalPair = 0;
        for(int i=0;i<numbers.length;i++) {
            int curr = numbers[i];  // 2 4 6 8 10
            for (int j=i+1;j<numbers.length;j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair is :- " + totalPair);
    }

    public static void printSubArrays(int numbers[]) {
        for(int i=0;i<numbers.length;i++) {
            int start = i;
            for (int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++) {//Print
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = {1,2,3,4,5,6};
        // System.out.println(marks[1]);
        // System.out.println(marks.length);
        //---->
        // int marks[] = new int[100];  //100 size array create 
        // marks[0] = sc.nextInt();  //input 
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy: " +marks[0]);  //output
        // System.out.println("chem:" +marks[1]);
        // System.out.println("math: "+marks[2]);
        // marks[2] += 1;  //update array
        // System.out.println("math :" +marks[2]);
        // System.out.println("array length is : " + marks.length);
        //Linear Search---------->
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // System.out.println("Enter Key");
        // int key = sc.nextInt();
        // int Index = linearSearch(numbers, key);
        // if(Index == -1) {
        //     System.out.println("Not found");
        // }else {
        //     System.out.println("key is at index :" + Index);
        // }
        //largest value find------>
        // int numbers[] = {2, 3, 62, 26, 27, 63, 26, 29};
        // int result = largestFind(numbers);
        // int Result = smallestFind(numbers);
        // System.out.println("largest value in numbers[] : " + result);
        // System.out.println("Smallest value in numbers[] : " + Result);
        //Binary Search ------>
        // int numbers[] = {12, 22, 33, 44, 55, 66, 77};
        // System.out.println("Enter Key");
        // int key = sc.nextInt();
        // int index = binarySearch(numbers, key);
        // if(index == -1) {
        //     System.out.println("Key not Exist");
        // }else {
        //     System.out.println("Key is at Index : " + index);
        // }
        //Reverse an Array-------->
        // int numbers[] = {2, 4, 6, 8, 10};
        // reverse(numbers);
        // for (int i=0 ;i<numbers.length;i++) {
        //     System.out.print(numbers[i] + " ");
        // }
        //Pairs in array-------->
        // int numbers[] = {2,4,6,8,10};
        // printPairs(numbers);
        //Print Subarrays ------------>
        // int numbers[] = {2,4,6,8,10};
        // printSubArrays(numbers);
    }

}
