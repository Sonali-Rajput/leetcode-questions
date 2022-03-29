public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3};
        System.out.println(containsDuplicate(arr));
        
    }
    static boolean containsDuplicate(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correctIndex = nums[i]-1;
                if(nums[i]!=nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
                else{
                    return true;
                }

            }
            else{
                i++;
            }
        }
        return false;

    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
    
}
