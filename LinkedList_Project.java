package linkedlist_project;

import linkedlist.LinkedList;

/**
 *
 * @author Alhaj Musa
 */
public class LinkedList_Project {

    public static void main(String[] args) {
        // create a Linked list object 
        LinkedList list = new LinkedList();
        //Insert elements into the list
        list.insert(10);
        list.insert(15);
        list.addFirst("Joe");
        //Insert an element at index 0 (first element)
        list.insertAt(0, 20);
        //Delete element at index 2 from list
        list.deleteAt(2);
        //Print element of the list
        list.printAll();
    }

}
