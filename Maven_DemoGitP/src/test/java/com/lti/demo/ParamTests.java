package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.lti.entity.Calculator;

class ParamTests {
	
	
//	testCases ---> no is even
//	multiple param --->
//	60 90 50 40 90 100
    @Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,50,100})
	public void testArrays(int arg) {
		System.out.println(" arg :"+ arg);
		Assertions.assertTrue(arg%2==0);
	}
    
    
    @Disabled
    @ParameterizedTest
    @DisplayName("Should Pass all non null arguments to method")
    @ValueSource(strings= {"Hello","World","Gayatri","Hello World"})
    public void testParam(String msg) {
    	
    	String searchKey="Hello";
    	
    	Assertions.assertTrue(msg.contains(searchKey));
    }
    
//    LOGIN 3 ATTEMPTS - WITH SAME CODE
    @Disabled
	@RepeatedTest(3)
	public void shouldRepeat() {
		int x = 10, y = 20;
		assertEquals(200, x * y);
	}
	
	
//	Junit 5 support Lambda
	@Disabled
	@Test
	public void testLambda() {
		Integer[] intAry = { 2, 3, 7, 5, 10 };
		List<Integer> numbers = Arrays.asList(intAry);
		Assertions.assertAll(() -> assertEquals(2, numbers.get(0)), 
				() -> assertEquals(3, numbers.get(1)),
				() -> assertEquals(7, numbers.get(2)), 
				() -> assertEquals(5, numbers.get(3)),
				() -> assertEquals(10, numbers.get(4))

		);
		
	}
		
//		testing whether exceptions is called - excp obj got created
		
		@Disabled
		   @Test
		   void testExceptions(){
				Assertions.assertThrows(NumberFormatException.class, ()->{
					Integer.parseInt("One");
				});
			
			
			
			
		}
		   
		   @Test
			  void testException1() {

				  Calculator c= new Calculator();
				  
				  final Exception e = assertThrows(ArithmeticException.class, () -> {
					  c.searchEmpId(0);
			    
			    });
			    Assertions.assertEquals("u enetered zero",e.getMessage());
			  }
			  
		
		
		

	
	
	
	
}
