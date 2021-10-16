package Com.bridgelabs;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam";
        String revFront = "";
        String revRear = "";
        DequeImplementedUsingLinkedList<Character> deque = new DequeImplementedUsingLinkedList<Character>();
        // inserting element in deque
        for (int i = 0; i < str.length(); i++) {
            deque.insertRear(str.charAt(i));
        }

        // removing element from rear and getting the rear values
        for (int i = 0; i < str.length(); i++) {
            revRear += deque.getRear();
            deque.removeRear();
        }
        // inserting element again in deque
        for (int i = 0; i < str.length(); i++) {
            deque.insertRear(str.charAt(i));
        }
        // removing element from front and getting the front values
        for (int i = 0; i < str.length(); i++) {
            revFront += deque.getFront();
            deque.removeFront();
        }
        // System.out.println("Front delete : " + revFront);
        System.out.println("Rear delete : " + revRear);
        System.out.println("Front delete : " + revFront);
        if (revRear.equals(revFront)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

}
