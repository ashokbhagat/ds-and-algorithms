package ds.onedarray;
//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/the-magical-mountain/

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class MagicalMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); //get numbers of mountains
        int[] height = new int[len];
        for (int i = 0; i < len; i++) height[i] = sc.nextInt();

        int value=height[len-1];
        SortedMap<Integer, Integer> map =  new TreeMap<>();

        for (int i = len-1; i > 0; i--) {
            if(value < height[i]){
                map.put(height[i],i);
                value = height[i];
            }
        }

        int counter=0;
        if(map.size()%2==0) counter=1;
        Integer key=0;

        Iterator iterator = map.keySet().iterator();

        while(iterator.hasNext()) {
            if(counter>(map.size()/2))
                break;
            counter++;
            key   = (Integer) iterator.next();
        }

        System.out.println(map.get(key));
    }
}
