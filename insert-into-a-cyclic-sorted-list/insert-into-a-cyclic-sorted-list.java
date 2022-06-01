/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
         if(head == null){
                head = new Node(insertVal, null);
                head.next = head;
                return head;
            }

            Node cur = head;
            while(true){
                if(cur.val < cur.next.val){
                    if(cur.val<=insertVal && insertVal<=cur.next.val){
                        cur.next = new Node(insertVal, cur.next);
                        break;
                    }
                }else if(cur.val > cur.next.val){
                    if(cur.val<=insertVal || insertVal<=cur.next.val){
                        cur.next = new Node(insertVal, cur.next);
                        break;
                    }
                }else{
                    if(cur.next == head){
                        cur.next = new Node(insertVal, head);
                        break;
                    }
                }

                cur = cur.next;
            }

            return head;
    }
}