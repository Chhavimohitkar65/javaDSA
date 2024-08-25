package Linkedlist;
//CREATION USING HEAD AND TAIL 


class Node{
    int data;
    Node next;

    //constructor 
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


// Creation of linked list 
public class singleL1 {
    Node head; // head of list
    Node tail; // tail of list 


    //method to add a node at the end of the list 

    public void addAtEnd(int data){
        Node newNode = new Node(data);  //create a new node

        if(head == null){
        //if the list is empty , head and tail point to the new node
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode; // point the current tail's next to the new node
            tail = newNode; // update the tail to the new node
        }
    }

// method to print the list 
public void printlist(){
    Node currentNode = head;
    while (currentNode != null) {
        System.out.print(currentNode.data +"->");
        currentNode = currentNode.next;
    }
    System.out.println("null");
}

//main method 

public static void main(String[] args){
    singleL1 list = new singleL1();

    list.addAtEnd(10);
    list.addAtEnd(20);
    list.addAtEnd(30);

    list.printlist();

}


}
  