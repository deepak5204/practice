public class LL{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node addFirst(int data, Node head){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void addLast(int data, Node head){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    public static Node removeFirst(Node head){
        if(head == null){
            return null;
        }
        return head = head.next;
    }

    public static void removeLast(Node head){
        Node temp = head;
        if(head == null){
            return;
        }

        while(head.next != null && head.next.next != null){
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
        head = null;
    }

    public static void printLL(Node head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void addInMiddle(int data, Node head, int place){
        for(int i = 0; i < place-2; i++){
            head = head.next;
        }
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public static void main(String[] args){

        int a = 10;

        // int b = ++a + ++a + a++;

        System.out.println( ++a + ++a + a++);

        // System.out.println(b);

        // Node head = new Node(1);
        // head = addFirst(2, head);
        // head = addFirst(3, head);
        // head = addFirst(4, head);
        // head = addFirst(5, head);
        // head = addFirst(6, head);
        // head = addFirst(7, head);

        // // head = removeFirst(head);
        // // removeLast(head);
        // addInMiddle(10, head, 3);
        // printLL(head);

       
    }


}


