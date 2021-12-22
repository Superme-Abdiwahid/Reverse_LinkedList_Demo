/* @Author- Abdiwahid Bishar Hajir */
public class ReverseLinkList extends LinkedIntList{
   private ListNode front;
   public static void main(String[] args){
   
   
   }
   /* Minuplate a listNode for example 
   sample input = front => [0] => [1] => [2] => /;
   into a ListNode aftercalling your method to front =>[2] => [0] =>[1] =>/;
   You dont have to worry about input being more
   than 3 ListNode. Assume you will always be given a
   ListNode with 3 listNode to change*/ 
   public void reverseLinkedList(){
   if(front == null){
      return;
   }
   ListNode current = front;// current => [0] => [1] => [2] =>/
   front = front.next.next;// front => [2] =>/
   front.next = current;// front => [2] => [0] => [1] => [2] .....(infinty)
   front.next.next.next = null; //front => [2] => [0] => [1] =>/
   
   
   
   }
   
   private static class ListNode {
        public final int data;
        public ListNode next;

        // post: Constructs a node with data 0 and null link
        public ListNode() {
            this(0, null);
        }

        // post: Constructs a node with given data and null link
        public ListNode(int data) {
            this(data, null);
        }

        // post: Constructs a node with given data and given link
        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }



}
