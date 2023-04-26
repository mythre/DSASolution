package Arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
class TwoSum{

    public int[] findTwoSum(int[] nums,int target){
        Map<Integer,Integer> mapIndices = new HashMap<>();
        for (int i =0;i< nums.length;i++){
            if (mapIndices.containsKey(nums[i])){
                return new int[]{i,mapIndices.get(nums[i])};
            }
            mapIndices.put(target-nums[i],i);
        }
       return null;
    }

}