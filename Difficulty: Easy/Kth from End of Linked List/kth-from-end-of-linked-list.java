/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        ArrayList<Integer> lst = new ArrayList<>();
        while(head != null){
            lst.add(head.data);
            head = head.next;
        }
        if(k > lst.size())return -1;
        return lst.get(lst.size()-k);
    }
}