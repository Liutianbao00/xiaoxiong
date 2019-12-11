package 算法;

import java.util.*;

class Solution {

    int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target) list.add(nums[i]);
        }
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
