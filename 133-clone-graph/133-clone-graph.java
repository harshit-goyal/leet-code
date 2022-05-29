/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        // assumption : this is a undirected connected graph
        LinkedList<Node> q = new LinkedList<Node>();
        //map contains only copied nodes
        HashMap<Integer, Node> map = new HashMap<Integer, Node>();
        q.add(node); // in q original nodes
        map.put(node.val, new Node(node.val));
        while (q.size() > 0) {
            Node now = q.pollFirst();
            Node copied = map.get(now.val);
            copied.neighbors = new ArrayList<Node>();
            for (Node n : now.neighbors) {
                if (!map.containsKey(n.val)) {
                    q.add(n);
                    map.put(n.val, new Node(n.val));
                }
                copied.neighbors.add(map.get(n.val));
            }
        } //while
        return map.get(node.val);
    }
}
