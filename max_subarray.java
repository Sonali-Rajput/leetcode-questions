import java.util.Arrays;

public class max_subarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        
    }
        public static int maxSubArray(int[] nums) {
            
            int l=nums.length;
            int i=0,s=0,max=nums[0]; 
            int[] b = new int[l];
            
            while(i!=l) 
            {
                b[i]=nums[i];
                i++;
            }
            // if(l==1)
            //     return nums[0];
            Arrays.sort(b);
            if(b[l-1]<=0) //checking if all the eements in the array are negative 
                return b[l-1]; //then return the last
            //else do the following ->
            i=0;
            while(i!=l) 
            {
                s+=nums[i]; //adding the next ele in the sum
                if(s<0) //if sum is negative
                {
                    s=0; //the no need to add it as it will decrease the value for the sum.
                }
                else if(s>max) //if sum is greater than max
                    max=s; //initialize max as sum
                //System.out.println(max);
                i++; //increment i 
            }
            //System.out.println(max);
            return max; //returning max 
        }
    }
    
