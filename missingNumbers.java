
public class missingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1,5,7,8,6};
        System.out.println(missingNumber(arr));
        
    }
    static int missingNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length&&nums[i]!=nums[correctIndex]){ //in the Nth index case the first condition will be false so it will move to else one.
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        //search for the first missing number.
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
}
static void swap(int[] arr,int first,int last){ // for swapping the ele with it's correct index/position.
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
