import java.util.*;

public class eightThree {

	public static void main(String[] args) {

		String test1 = "({})";
		String test2 = "({)})";

		// DOES NOT WORK FOR []()! 

		System.out.println("....program begun.");
		System.out.println(wellFormed(test1));
		System.out.println(wellFormed(test2));
		System.out.println("....program complete.");
	}

	public static boolean wellFormed(String input) {

		if(input.length() % 2 != 0) {
			System.out.println("....FAIL FIRST.");
			return false;
		}

		ArrayDeque<Character> stringDeque = new ArrayDeque<>();

		for(int i = 0; i < input.length(); i++) {
			stringDeque.push(input.charAt(i));
		}

		if(stringDeque.isEmpty()) {
			System.out.println("....FAIL SECOND.");
			return false;
		}

		int count = 0;

		while(count < stringDeque.size() / 2) {
			if(stringDeque.peekFirst() == ')' && stringDeque.peekLast() == '(') {
				stringDeque.pollFirst();
				stringDeque.pollLast();
			}

			if(stringDeque.isEmpty()) { break; };

			if(stringDeque.peekFirst() == '}' && stringDeque.peekLast() == '{') {
				stringDeque.pollFirst();
				stringDeque.pollLast();
			}
			if(stringDeque.isEmpty()) { break; };

			if(stringDeque.peekFirst() == ']' && stringDeque.peekLast() == '[') {
				stringDeque.pollFirst();
				stringDeque.pollLast();
			}
			if(stringDeque.isEmpty()) { break; };

			count++;
		}

		if (stringDeque.isEmpty()) {
			return true;
		} else {
			System.out.println("....FAIL THIRD.");
			System.out.println(stringDeque.size());
			return false;
		}


	}


}