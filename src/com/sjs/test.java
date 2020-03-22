package com.sjs;

import java.util.Collection;

/**
 * @outhor sjs
 * @create 2019-10-16-下午1:50
 */
public class test extends Thread {


    public static void main(String[] args) {
        int[] nums={10,9,8,9,7,6,5,4,3,2,1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j]>nums[j+1]){
                    int num=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=num;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
