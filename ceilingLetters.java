public class ceilingLetters {
    public static void main(String[] args) {
        String s = "cfj";
        char[] c_arr = s.toCharArray();
        String ss = "cfj";
        char[] c = ss.toCharArray();
        char target = c[0];
        System.out.println(nextGreatestLetter(c_arr,target));

        
    }
    public static char nextGreatestLetter(char[] letters, char target){
        int start =0, end = letters.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<letters[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return letters[start%letters.length];
    }
    
}
