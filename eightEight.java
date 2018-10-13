import java.util.*;

public class eightEight {

	public static ArrayDeque<Integer> s1 = new ArrayDeque<>();
	public static ArrayDeque<Integer> s2 = new ArrayDeque<>();

	public static void enqueue(int val) {
		s1.push(val);
	}

	public static int dequeue() {

		if (s2.isEmpty() && !s1.isEmpty()){
			while(!s1.isEmpty()) {
				s2.push(s1.poll());
			}
		}

		if (s2.isEmpty() && s2.isEmpty()) {
				throw new NoSuchElementException("The dequeue is empty.\n");
		}
		
		return s2.poll();
	}

	public static void main(String[] args) {

		enqueue(1);
		enqueue(2);
		enqueue(3);
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		dequeue();

	}
}