/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null)
		return null;
 
	Node p = head;
 
	// copy every node and insert to list
	while (p != null) {
		Node copy = new Node(p.val);
		copy.next = p.next;
		p.next = copy;
		p = copy.next;
	}
 
	// copy random pointer for each new node
	p = head;
	while (p != null) {
		if (p.random != null)
			p.next.random = p.random.next;
		p = p.next.next;
	}
 
	// break list to two
	p = head;
	Node newHead = head.next;
	while (p != null) {
		Node temp = p.next;
		p.next = temp.next;
		if (temp.next != null)
			temp.next = temp.next.next;
		p = p.next;
	}
 
	return newHead;
    }
}