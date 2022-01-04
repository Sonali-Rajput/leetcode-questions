import java.lang.Math;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1, temp1 = l2;

        int l1sum = 0;
        int l2sum = 0;
        int sum=0;
        int power = 0;
        while (temp != null) {

            l1sum += Math.pow(10, power) * temp.val;
            power += 1;
            temp = temp.next;
        }
        power = 0;
        while (temp1 != null) {

            l2sum += Math.pow(10, power) * temp1.val;
            power += 1;
            temp1 = temp1.next;
        }
        
        sum=l1sum+l2sum;
        while (sum>0) {
            ListNode abc = ListNode(sum/10);
    }


    }
    public static void main(String[] args){

    }
    
}