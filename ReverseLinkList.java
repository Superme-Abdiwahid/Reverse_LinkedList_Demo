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



}
