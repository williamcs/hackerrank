package hackerrank.ThirtyDays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by will on 6/26/17.
 */
public class Day18_QueuesStacks {

    private Stack<Character> stack;
    private Queue<Character> queue;

    public Day18_QueuesStacks() {
        stack = new Stack<>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char c) {
        stack.push(c);
    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters
        char[] s = input.toCharArray();

        // Create a Day18_QueuesStacks object
        Day18_QueuesStacks p = new Day18_QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c: s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at head of both data structures and compare them
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
