import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args){
        
    int[] nums = {3,2,2,3};
    System.out.println(Arrays.toString(nums));
    
    int val = 2;
    int i = 0;
    int k = 0;

    while (i < nums.length) {  
        if (nums[i] != val) {
            nums[k] = nums[i];
            k++;
        }
        i++;
    }

    int clean = k;

    while(clean < nums.length){
        nums[clean] = 0;
    clean++;
    }

    System.out.println("-----");
    System.out.println(Arrays.toString(nums));

 }
}
