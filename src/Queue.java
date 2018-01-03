import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Queue {
    TreeSet<Integer> numbers;

    public static void main(String[] args){
        new Queue().run();
    }

    private void run() {
        numbers = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        for(int i=0;i<k+1;i++)
        {
            priorityQueue.add(input.nextLine());
        }
        Queue.printQ(priorityQueue);

        //System.out.println( k);

        //String[] array = new String[k];

//        input.nextLine();
//        for(int i=0;i<array.length;i++)
//        {
//           array[i]=input.nextLine();
//        }

//        for (int i=0; i<array.length;i++){
//            System.out.println(i + " " + array[i]);
//        }

//        for(int i=0; i<array.length;i++){
////            Object[] ary = numbers.toArray();
////            for(int p=0;p<numbers.size();p++){
////                System.out.println("call: " + i + " element of array: " + p + " "+ ary[p]);
////            }
//
//            String str = array[i];
//            if(str.contains("Insert")){
//                int value = Integer.parseInt(str.replaceAll("[^0-9]+", ""));
//                insert(value);
//            }else{
//                extractMax();
//            }
//        }
        //System.out.println(input.nextLine());
    }

    private void insert(int n){
//        if(n==993){
//            numbers.add(n);
//            System.out.println("yeah + 993");
//
//        }
        numbers.add(n);

    }

    private void extractMax(){
        if(!numbers.isEmpty()){
        int k = numbers.last();
        numbers.pollLast();
        System.out.println(k);}
    }

    public static void printQ(java.util.Queue queue){
        while(queue.peek() != null){
            System.out.println(queue.remove());
        }

    }
}
