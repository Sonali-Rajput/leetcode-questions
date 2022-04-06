public class Binary_search_recursive{
    public static void main(String[] args) {
        int nums[] = {5,6,8,22,44,50};
        int target = 440;
        System.out.println(search(nums, 0, nums.length-1, target));

        
    }
    static int search(int[] nums,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(target>nums[m]){
            return search(nums, m+1, e, target);
        }else{
            return search(nums, s, m-1, target);
        }
    }
}
