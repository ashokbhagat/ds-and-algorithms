package ds.queue;

public class QueueImpl{

    private static int[] q = new int[6];
    private static int front=0;
    private static int rear=0;

    public static void main(String[] args) {


        for(int i=0;i<q.length+6;i++){
            enQ(i);
            System.out.println("Main front:"+front);
            System.out.println("Main rear:"+rear);
        }

        System.out.println("################################");

        for(int i=0;i<q.length+6;i++){
            deQ();
            System.out.println("Main front:"+front);
            System.out.println("Main rear:"+rear);
        }



    }


    private static void enQ(int value){
        if(rear==q.length){
            System.out.println("Queue is full");
            return;
        }

        q[rear] = value;
        rear++;
    }


    private static int deQ(){
        if(front==rear){
            System.out.println("Queue is empty");
            return -1;
        }

        int value = q[front];
        front++;
        System.out.println("deQ value"+value);
        return value;
    }

}