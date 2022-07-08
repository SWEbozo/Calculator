class SETests {

	static void testAll() {
		testAddtion();
		testAbs();
		testDiv();
		testLog();
		testRoots();
		testTrigonometricFunctions();
		testCompoundExpression();
		testConstants();
		testDivision();
		testMultiply();
		testCompoundExpression();
		testSubtraction();
		testInvalidExpression();
		
	}
	
	static void testAddtion() {

		try {
			// addition with zero
			Double expectedRes = Double.valueOf(20.0);
			
			assertEquals(expectedRes, Double.valueOf(SE.calculation("20+0")));

			// add two positive numbers
			expectedRes = Double.valueOf(2.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("1+1")));

			// add a negative to a positive number, result 0
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-1+1")));

			// add a negative to a positive number, result negative
			expectedRes = Double.valueOf(-7.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-8+1")));

			// add a negative to a positive number, result positive
			expectedRes = Double.valueOf(2.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-8+10")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}

	}

	
	static void testSubtraction() {

		try {
			// subtraction with zero
			double expectedRes = Double.valueOf(20.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("20-0")));

			// subtract result 0
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("20-20")));

			// subtract floating point numbers, result positive
			expectedRes = Double.valueOf(0.5);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("1.5-1")));

			// subtract floating point numbers, result negative
			expectedRes = Double.valueOf(-0.5);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("1-1.5")));

			// subtract two negative numbers
			expectedRes = Double.valueOf(-20);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-10-10")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}

	}

	
	static void testMultiply() {

		try {
			// multiply with zero
			double expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("20*0")));

			// multiply with one
			expectedRes = Double.valueOf(20.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("20*1")));

			// multiply positive with negative
			expectedRes = Double.valueOf(-20);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-2*10")));

			// multiply negative with negative
			expectedRes = Double.valueOf(20);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-2*-10")));

			// multiply two positives
			expectedRes = Double.valueOf(144);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("12*12")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}

	}
	
	
	static void testDivision() {

		try {
			// divide by 1
			double expectedRes = Double.valueOf(3.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("3/1")));
			
			expectedRes = Double.valueOf(0.5);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("1/2")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
		
		try {
			// divide by 0
			String expectedRes = "Error";
			assertEquals(SE.calculation("1/0"), expectedRes);
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
		
		
	}

	
	static void testInvalidExpression() {

		try {
			// divide by 1
			
			String expectedRes = "Error";
			assertEquals(expectedRes, SE.calculation("hello"));
			
			assertEquals(expectedRes, SE.calculation("***-2jdijcevi"));
			assertEquals(expectedRes, SE.calculation("1+2+3*uefio"));
			
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}	
	}
	
	
	 
	static void testTrigonometricFunctions() {
		try {
			double expectedRes = Double.valueOf(0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("sin(0)")));
			
			expectedRes = Double.valueOf(-0.8011526357338304);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("sin(180)")));
			
			expectedRes = Double.valueOf(1.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("cos(0)")));
			
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("tan(0)")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
		
	}

	
	static void testCompoundExpression() {

		try {
			double expectedRes = Double.valueOf(11);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("1+5*2")));
			
			expectedRes = Double.valueOf(-6);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-5*2+4")));
			
			// test expression with parantheses
			expectedRes = Double.valueOf(-30);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("-5*(2+4)")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
		
	}


	
	static void testAbs() {
		try {
			double expectedRes = Double.valueOf(0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("abs(0)")));
			
			expectedRes = Double.valueOf(20.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("abs(20)")));
			assertEquals(expectedRes, Double.valueOf(SE.calculation("abs(-20)")));
			
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
	}
	
	
	static void testConstants() {
		try {
			double expectedRes = Double.valueOf(3.141592653589793);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("pi")));
			
			expectedRes = Double.valueOf(2.718281828459045);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("e")));
			
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
		
	}
	
	
	static void testRoots() {
		try {
			double expectedRes = Double.valueOf(1.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("cbrt(1)")));
			assertEquals(expectedRes, Double.valueOf(SE.calculation("sqrt(1)")));
			
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("cbrt(0)")));
			assertEquals(expectedRes, Double.valueOf(SE.calculation("sqrt(0)")));
			
			expectedRes = Double.valueOf(3.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("cbrt(27)")));
			
			expectedRes = Double.valueOf(3.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("sqrt(9)")));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}

	}
	
	
	static void testLog() {
		try {
			double expectedRes = Double.valueOf(1.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("log(e)")));
			
			
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("log(1)")));
			
			expectedRes = Double.valueOf(3.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("log(e*e*e)")));
			

			assertEquals("-Infinity", SE.calculation("log(0)"));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
	}
	
	
	static void testDiv() {
		try {
			double expectedRes = Double.valueOf(1.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("5%2")));
			
			
			expectedRes = Double.valueOf(0.0);
			assertEquals(expectedRes, Double.valueOf(SE.calculation("5%5")));
			

			assertEquals("Error", SE.calculation("5%0"));
		} catch (Exception e) {
			System.out.println("This shouldn t be reached");
			e.printStackTrace();
		}
	}
	
	private static void assertEquals(Double expected, Double actual) {
		assert expected.equals(actual);
	}
	
	private static void assertEquals(String expected, String actual) {
		assert expected.equalsIgnoreCase(actual);
	}
}
