
public class basicQueue {

    static class Queue{

       static int arr[] ;
       static int size ;
       static int rear;
       
        Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
       }

       public static boolean isEmpty(){
        return rear==-1;
       }

       public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return ;
        }

        rear = rear + 1;
        arr[rear] = data;
       }

       public static int remove(){
        if(rear==-1){
            System.out.println("Queue is empty");
            return -1;
        }

        int front = 0;
        int f = arr[front];
        front++;

        for(int i =0;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        return f;

       }

       public static int peek(){
        if(rear==-1){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[0];
       }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(50);
        q.add(20);
        q.add(30);
        System.out.println(q.remove());
        System.out.println(q.peek());
        


        
    }
}
