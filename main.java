public class main{
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] resultado = sol.twoSum(nums, target);
    }
}


class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++){
            System.out.println("I'm loking at the number"+ nums[i]);
            
        for (int j = i + 1; j < nums.length; j++){
            

            if(nums[i] + nums[j] == target){
                return new int[]{i, j};
            }
        }
        }

        return new int[]{};
    }
}