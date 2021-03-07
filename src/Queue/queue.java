package Queue;


import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("James");
        queue.add("John");
        queue.add("Amir");
        queue.add("Charlie");

        System.out.println(queue.element());

        }
    }
