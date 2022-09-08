public class QueueLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Queue{
        Node head=null;
        Node tail=null;

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        //Enqueue
        public void add(int data){
            Node newNode =new Node(data);
            if(head == null||tail == null){
                head=tail=newNode;
            }
            tail.next=newNode;
           tail=newNode;
        }

        //Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front =head.data;
            if(head == tail){
                tail =null;
            }
            head=head.next;
            return front;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;

        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
