package Linkedlist;
// methods to delete a node from the start, middle, last, or any specific position in a singly linked list

class Node{
    int data;
    Node next;


    //constructor
Node(int data){
    this.data = data;
    this.next = null;
}

}

public class deletion {

   Node head;
   Node tail;

//method 1 to add node at the end 
    public void addAtEnd(int data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
   }

//method 2 to delete a node from the begining of the list 
    public void deleteFromStart(){
    if(head == null){
        System.out.println("This is empty, Nothing to delete");
        return;
        }
    head = head.next; // move the head to the next

    if(head ==null){ // if this list becomes empty after deltion, update tail to null
        tail = null;
        }
    }

// method 3 to delete a node from the end of the list 
    public void dleteFromEnd(){
    if (head == null){
        System.out.println("The list is empty. Nothng to delete");
        return;
    }
    if(head.next == null){ // if there is only one element inn the list
        head = null;
        tail = null;
        return;
    }

    Node currentNode = head;
    while(currentNode.next !=tail) {
        //traverse to the second last node
        currentNode = currentNode.next;
    }
    currentNode.next = null;// remove the last node 
    tail = currentNode; // update the tail to the new last node
    }

    //method 4 to delete a node from aspecific position in the list
    public void deleteFromPostion( int position){
        if(head ==null){
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }
        if (position == 0){
            deleteFromStart();
            return;
        }

        Node currentNode = head;
        for( int i = 0; i < position -1 && currentNode !=null; i++){
            currentNode = currentNode.next;
        }
        if (currentNode == null || currentNode.next == null){
            System.out.println("Position out of bond ");
            return;
        }

        if(currentNode.next == tail){
            //if the node to delete is the last node
            tail = currentNode;
        }
        currentNode.next = currentNode.next.next; //bypass the node to delete
    }

    //Method to print the list
    public void printList(){
        Node curentNode = head;

        while(curentNode != null){
            System.out.print(curentNode.data + "->");
            curentNode = curentNode.next;
        }
        System.out.println("null");
    }

    //Main method

    public static void main(String[] args){
        deletion list = new deletion();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtEnd(60);
        list.addAtEnd(70);

        System.out.println("Initial list:");
        list.printList();

        list.deleteFromStart();
        System.out.println("After deleting from start:");
        list.printList();

        list.dleteFromEnd();
        System.out.println("After deleting from end:");
        list.printList();

        list.deleteFromPostion(1);
        System.out.println("After deleting from position 1");
        list.printList();

        list.deleteFromPostion(4);
        System.out.println("After deleting from position 4");
        list.printList();

        list.deleteFromPostion(10);
    }
    
}
