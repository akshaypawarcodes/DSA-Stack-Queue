public class CircularQueueArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front=-1;

        public Queue(int n){
            size=n;
            arr=new int[n];

        }
        //check if queue is empty
        public boolean isEmpty(){
            return rear == -1||front == -1;
        }

        //check if queue is full
        public boolean isFull(){
            return (rear+1)%size == front;
        }

        //Enqueue
        public  void add(int data){
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }
            //if no element present
           if(front == -1){
               front =0;
           }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //Dequeue
        public  int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];

            //if only one element present
            if(rear == front){
                return rear=front=-1;
            }else {
                front=(front+1)%size;
            }
            return result;
        }

        //peek
        public  int peek(){
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);

        System.out.println(q.remove());
        q.add(7);

        System.out.println(q.remove());
        q.add(9);

        //must try this one
        //q.add(12);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
