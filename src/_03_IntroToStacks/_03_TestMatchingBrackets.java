package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
	Stack<String> brackets = new Stack<>();

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET

	private boolean doBracketsMatch(String b) {
		int openbracketAmount = 0;
		boolean completed = false;

		// adding them to the stack

		for (int i = 0; i < b.length(); i++) {
			if((brackets.pop() + "").equals("{")) {
				brackets.push("{");
			}
			else if()
		}

		// Checking if they're completed
		
		for (int i = 0; i < b.length(); i++) {
			if (brackets.pop().equals("{")) {
				openbracketAmount++;
			}

			else if (brackets.pop().equals("}") && openbracketAmount != 0) {
				openbracketAmount--;
		
			} else if ((brackets.search(i) + "").equals("}") && openbracketAmount == 0) {
				completed = false;
			}

		}
		for (int i = 0; i < brackets.size(); i++) {
			System.out.println(brackets.get(i));
		}
		return completed;
	}

}