package Com.bridgelabs;

import java.util.Scanner;

public class CashCounter {

    public static void main(String[] args) {
        QueueImplementedUsingLinkedList<Integer> queue = new QueueImplementedUsingLinkedList<Integer>();
        System.out.println("Enter people size");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();

        System.out.println("Hi! Welcome to bank simulation: ");
        for (int i = 0; i < people; i++) {

            queue.enQueue(i);
            queue.service();
            queue.deQueue();
        }
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
        System.out.println("Bank Closing balance is : " + queue.bankBalance);
        scanner.close();
    }
}
