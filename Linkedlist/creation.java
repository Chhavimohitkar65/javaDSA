package Linkedlist;
//CREATION USING HEAD 
import arrayssss.print;

class Node{
    int data; //Data to store in the node
    Node next; //pointer to store next node
    
    //constructor to create a new node
    Node(int data){
        this.data = data;
        this.next = null; // initially the next pointer is null
    }
}

//main class for linked list creation 

public class creation {

    Node head; // Head of the list
    
    //Mehod to add a node at the beginning of the list
    public void addAtBeginning(int data){
        Node newNode = new Node(data); //creating a new node
        newNode.next = head; // make the new node point to the current head
        head = newNode; // update the head to the new node
    }

    //Method to print the list
    public void printlist(){
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next; 
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        creation list = new creation();

        list.addAtBeginning(10);
        list.addAtBeginning(20);
        list.addAtBeginning(30);
        list.printlist();
    }
}
