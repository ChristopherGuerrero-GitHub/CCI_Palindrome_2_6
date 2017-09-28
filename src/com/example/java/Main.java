package com.example.java;

public class Main {

    public static void main(String[] args) {

        /*
            This program is a solution to CCI book problem 2.6 Palindrome. Created a LinkedListNode chain of a integer
            data types. Then invoke the isPalidrome method and pass the LinkedListNode chain as a parameter and
            create a LinkedListNode reversed object and assign it with the method reverseAndClone with the original
            LinkedListNode chain. Then pass the original LinkedListNode and the returned results for the LinkedListNode
            revered object and compare with the isEqual method with the parameters being the two LinkedListNodes the
            original head chain and the reversed chain.
         */
        LinkedListNode node_1 = new LinkedListNode(0);
        LinkedListNode node_2 = new LinkedListNode(1);
        LinkedListNode node_3 = new LinkedListNode(2);
        LinkedListNode node_4 = new LinkedListNode(1);
        LinkedListNode node_5 = new LinkedListNode(0);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        LinkedListNode curr = node_1;

        System.out.println("Original LinkedList: ");

        while (curr != null){

            System.out.print(curr.data);
            curr = curr.next;
        }


        System.out.println();
        boolean flagResult = isPalidrome(node_1);

        System.out.println(flagResult);



    }

    static boolean isPalidrome(LinkedListNode head){

        LinkedListNode reversed = reverseAndClone(head);
        System.out.print("Is the Linked List a Palindrome: ");
        return isEqual(head, reversed);
    }

    /*The reverseAndClone method has a loop should create a reverse linkedlist ie. node LinkList 1, 2, 3
      The direction of the loop puts the "n" node in front/to the left of the head.
      therefore, the "n" node link list should be 3, 2, 1 where the head ends/pointss at node 3.
    */
    static LinkedListNode reverseAndClone(LinkedListNode node){


        LinkedListNode head = null;
        while (node != null){
            LinkedListNode n = new LinkedListNode(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }

        System.out.println("Printing out the reversed Linked List: ");
        LinkedListNode curr2 = head;

        while (curr2 != null){
            System.out.print(curr2.data);
            curr2 = curr2.next;
        }
        System.out.println();
        return head;

    }

    /*
        The isEqual method accepts two LinkedListNode object chain as parameters. Comparison of each node
        data between the two LinkedListNode throughout the chain and if one is not equal the other then
        a return of false will result else a true will be return.
     */
    static boolean isEqual(LinkedListNode one, LinkedListNode two){

        while (one != null && two != null){
            if (one.data != two.data){
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;

    }
}
