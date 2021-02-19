import junit.framework.TestCase;

public class BoardTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testinRange() {
		Board cut= new Board(4,4);
		assertEquals(true,(cut.inRange(0,0)));
		assertEquals(false,(cut.inRange(-4, -4)));
		assertEquals(false,(cut.inRange(5,5)));
		assertEquals(false,(cut.inRange(5, 4)));
		assertEquals(false,(cut.inRange(4, 5)));
		
		

	
	}

		
	}
		
	
		
	
	


