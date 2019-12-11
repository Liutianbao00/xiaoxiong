package daBaoTest;

import java.util.HashSet;
import java.util.Set;

public class 测试set {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,51,2,3,4,1};
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<a.length;i++){
            boolean s = set.add(a[i]);
            if(s == false){
                System.out.println(a[i]);
            }
        }
    }
}
//反转链表
/**
 * ListNode a = null
 * ListNode b = head;
 * while(b.next!=null){
 *     ListNode c = b.next;
 *     b.next = a;
 *     a = b;
 *     b = c;
 * }
 * return a;
 *
 *      判断链表是否成环
 *      if(head==null || head.next == null)  return false;
 *      ListNode low = head;
 *      ListNode high = head;
 *
 *      while(high.next != null && high.next != null){
 *          low = low.next;
 *          high = high.next.next;
 *          if(low = high){
 *              return true
 *          }
 *      }
 *      return false;
 *
 *
 *
 */
