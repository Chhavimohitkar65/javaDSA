package Linkedlist;

class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// creation
public class instertAtPosition {

    Node head;
    Node tail;

    // method to add node at end of the list
    public void addAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // METHOD TO ADD AT SPECIFIC POSITION IN THE LIST
    public void addAtPosition(int data, int position) {

        Node newNode = new Node(data); // create a new node
//if it was at the start
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }
// if it was not start we start to traversal
        Node currentNode = head;
        for (int i = 0; i < position - 1 && currentNode != null; i++) {
            currentNode = currentNode.next;
        }
//for out of bond positions
        if (currentNode != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }
        } else {
            System.out.println("Position out of bond");
        }
    }

    //method to print the list
    public void printlist(){
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

//main method 
    public static void main(String[] args){
        instertAtPosition list = new instertAtPosition ();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);

        list.printlist();

        //printing at a position 
        list.addAtPosition(15,1);
        list.printlist();

        list.addAtPosition(5,0);
        list.printlist();

        //printing for out of bond
        list.addAtPosition(3,50);

    }

}
