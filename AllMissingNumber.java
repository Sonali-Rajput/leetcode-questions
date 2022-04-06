// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// public class AllMissingNumber {
//     public static void main(String[] args) {
//         List<Integer> nums = new ArrayList<>();
//         nums.add(4);
//         nums.add(3);
//         nums.add(2);
//         nums.add(7);
//         nums.add(8);
//         nums.add(2);
//         nums.add(3);
//         nums.add(1);
//         //String[] array = nums.toArray(new String[nums.size()]);
//         System.out.println(findDisappearedNumbers());
        
//     }
//     public static List<Integer> findDisappearedNumbers(int[] nums){
//         int i = 0;
//         while(i<nums.length){
//             int correctIndex = nums[i]-1;
//             //we'll ignore the largest ele which will come at last cuz we don't have extra space to add it
//             //for ex : [4,0,2,1] (length = 4) and it's for N=4(so len should be 5) it should be [0,1,2,3,4] (length =5)
//             //we'll ignore it and will search for missing ele .
//             if(nums[i]!=nums[correctIndex]){ //in the Nth index case the first condition will be false so it will move to else one.
//                 swap(nums,i,correctIndex);
//             }
//             else{
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for(int index=0;index<nums.length;index++){
//             if(nums[index]!=index+1){
//                 ans.add(index+1);
//             }
//         }
//         return ans;
//     }
//     static void swap(int[] arr,int first,int last){ // for swapping the ele with it's correct index/position.
//         int temp = arr[first];
//         arr[first]=arr[last];
//         arr[last]=temp;
//     }
    
// }
