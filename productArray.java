import java.util.Arrays;

public class productArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        
    }
    public static int[] productExceptSelf(int[] nums){
        int[] ans = new int[nums.length];
        int product = 1;
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = product; //for above ans arr will look like {1,1,2,6,24} 
            product *= nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) { //going reverse now
            ans[i] *= product; //ans arr will look like {24,12,8,6}
            product *= nums[i];
        }
        return ans;
    }

    }
    
