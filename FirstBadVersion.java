/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    //   public class FirstBadVersion extends VersionControl {
    //     public int firstBadVersion(int n) {
    //         if(n==1){
    //             return 1;
    //         }
    //         int s = 1 , e = n;
    //         int m = 0;
    //         int pos = 1;
    //         while(s<=e){
    //             m = s + (e-s)/2;
    //             if(isBadVersion(m)){
    //                 pos = m;
    //                 e = m-1;
    //             }else{
    //                 s = m+1;
    //             }
    //         }return pos;
            
    //     }
    // }