package ds.onedarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Scanner
//5
//        4
//        12
//        7
//        15
//        9
public class ArraysExamples {
    public static void main(String a[]) {
        //readConsoleAndReverse();
        //readConsoleAndFindMostFrequent();
       //readConsoleAndFindMostFrequentUsingHashMap();
    }

    /*
    Method will find out element occurred most frequently using hasmap
     */
    private static void readConsoleAndFindMostFrequentUsingHashMap() {
        int[] nums = {2,2,3,4,1,4,5,1,45,7,2,1,5,7,3,1,61,5,5,4,1,2,4};
        Arrays.sort(nums);

        Map<Integer, Integer> res = new HashMap<>();

        int curCount=0;
        for(int i=0;i<nums.length;i++){
            if(res.containsKey(nums[i])) {
                res.put(nums[i], ++curCount);
            }else {
                curCount=0;
                res.put(nums[i], ++curCount);
            }
        }

       // Collections.sort();
    }

    /*
    Method will find out element occurred most frequently using plain array
     */
    private static void readConsoleAndFindMostFrequent() {

        int[] nums = {2,2,3,4,1,4,5,1,45,7,2,1,5,7,3,1,61,5,5,4,1,2,4};
        Arrays.sort(nums);

        int result=0;
        int curCount=1;
        int maxCount=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                curCount++;
            }else{
                if(curCount>maxCount){
                    maxCount=curCount;
                    result=nums[i-1];
                }
                curCount=1;
            }

        }
        if(curCount>maxCount){
            maxCount=curCount;
            result=nums[nums.length-1];
        }

        System.out.println("result:"+result+" and occurences are"+maxCount);
    }


    //Reading input from the console and reversing the aarya
    private static void readConsoleAndReverse() {
        Scanner s = new Scanner(System.in);
        int len = Integer.parseInt(s.nextLine());
        int nums[] = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(s.nextLine());
        }
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}

