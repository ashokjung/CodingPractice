package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args){

        LinkedListCode linkedList = new LinkedListCode();
       linkedList.head = new LinkedList.LinkedListCode.Node(85);
       linkedList.head.next = new LinkedList.LinkedListCode.Node(86);
       linkedList.head.next.next = new LinkedList.LinkedListCode.Node(87);
       linkedList.head.next.next.next = new LinkedList.LinkedListCode.Node(88);
       linkedList.head.next.next.next.next = new LinkedList.LinkedListCode.Node(89);

       
       linkedList.reverse(linkedList.head);


    }
    
}

    class LinkedListCode{
        public static Node head;

        public static class Node{
            int data;
            Node next;
        

        Node (int _data){
            data =_data;
            next=null;
        }

    }

        public Node reverse(Node node){

        Node previous = null;
        Node current = node;
        Node next = null;
        while(current !=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current= next;

        }
        node =previous;

        return node;
    }
    
        public void printLinkedList(Node node){

            while(node!=null){
                System.out.println(node.data +" ");
                node = node.next;
            }
        }

    }
