import java.util.Arrays;
public class main{
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 26; //example target / nums

       int[] resultado = Solution.twoSum(nums, target); 
    
    }
}


class Solution {
    public static int[] twoSum(int[] nums, int target) { 
        for (int i = 0; i < nums.length; i++){
           
            
        for (int j = i + 1; j < nums.length; j++){
            

            if(nums[i] + nums[j] == target){
                System.out.println("The sum of "+nums[i]+" and "+nums[i+1]+" is iqual to "+target);
                
                return new int[]{i, j};

                
            }
        }
        }

        return new int[]{};
    }
}
}