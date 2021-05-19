package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int target = 4;
        ArrayList<Integer> numeros = new ArrayList<>();
        combineSum(target, numeros, 2 );
    }

    public static void combineSum(int target, ArrayList<Integer> nums, int sum){
        if (sum == target){
            System.out.println(nums);
        }else{
            for(int i = 1; i<target; i++){
                sum+=i;
                if (sum<=target){
                    nums.add(i);
                    combineSum(target, nums, sum);
                    nums.remove(nums.indexOf(i));
                }
                sum -=i;
            }
        }
    }
}
