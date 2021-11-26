package practiceProblem;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class TestStatesCensus {
	@Test
	public void testMoodAnalyzer_Sad() throws FileNotFoundException {
		StatesCensus rv = new StatesCensus();
		List<List<String>> result = rv.statesCensus();
		assertEquals(8, result.size());
	}
}
