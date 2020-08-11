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
		for (int i = 0; i < b.length() - 1; i++) {
			if ((b.charAt(i) + "").equals("{")) {
				openbracketAmount++;
			}

		}
		for (int i = 0; i <= openbracketAmount-1; i++) {
			
		}
		return false;
	}

}