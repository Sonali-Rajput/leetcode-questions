
public class missingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1,5,7,8,6};
        System.out.println(missingNumber(arr));
        
    }
    static int missingNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            //we'll ignore the largest ele which will come at last cuz we don't have extra space to add it
            //for ex : [4,0,2,1] (length = 4) and it's for N=4(so len should be 5) it should be [0,1,2,3,4] (length =5)
            //we'll ignore it and will search for missing ele .
            if(nums[i]<nums.length&&nums[i]!=nums[correctIndex]){ //in the Nth index case the first condition will be false so it will move to else one.
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        //search for the first missing number.
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){ //if the ele is not at it's position we'll return that element's index.
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
