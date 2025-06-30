/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/
/*
    Print elements of a linked list on console
    Head pointer input could be NULL as well for empty list
*/

class Solution {
    // Function to display the elements of a linked list in same line
    void printList(Node head) {
        // add code here.
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}