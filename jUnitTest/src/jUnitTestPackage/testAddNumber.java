package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
		jUnitFunctions add = new jUnitFunctions();
        int result = add.AddNumbers(100, 200);
        assertEquals(300, result); 
	}

}
