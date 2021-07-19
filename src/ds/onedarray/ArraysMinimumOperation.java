package ds.onedarray;

import java.util.Arrays;
import java.util.Scanner;

/*
Problem
You are given an array  of length  and can perform the following operation on the array:

Select a subarray from array  having the same value of elements and decrease the value of all the elements in that subarray by any positive integer .
Find the minimum number of operations required to make all the elements of array  equal to zero.

Input format

The first line contains an integer  denoting the number of elements in the array.
The next line contains space-separated integers denoting the elements of array .
Output format

Print the minimum number of operations required to make all the elements of array  equal to zero.
 */
public class ArraysMinimumOperation {

    public static void main(String a[]){
        Scanner s = new Scanner(System.in);
        int len = Integer.parseInt(s.nextLine());

        //Get the array
        String[] nums = s.nextLine().split(" ");

        //Sorting
        Arrays.sort(nums);
        //1 1 2 3 4 4 5 5 6 6 6 7
        int count=1;
        for (int i = 1; i < len; i++) {
            if(Integer.parseInt(nums[i-1])!=Integer.parseInt(nums[i])){
                count++;
            }
        }

        System.out.println(count);
    }
}
