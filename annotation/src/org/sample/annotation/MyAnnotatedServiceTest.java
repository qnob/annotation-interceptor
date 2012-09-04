/**
 * 
 */
package org.sample.annotation;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author kanoodle
 * 
 */
public class MyAnnotatedServiceTest {

	/**
	 * Test method for
	 * {@link org.sample.annotation.MyAnnotatedService#testMethod1()}.
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	@Test
	public final void testTestMethod1() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		new MyAnnotatedService().testMethod1();

//		for (Method method : MyAnnotatedService.class.getDeclaredMethods()) {
//			for (Annotation annotation : method.getAnnotations()) {
//				System.out.println(method.getName() + ":" + annotation);
//			}
//		}

		assertTrue("Is annotated method",
				MyAnnotatedService.class.isAnnotationPresent(Audit.class));

	}

	/**
	 * Test method for
	 * {@link org.sample.annotation.MyAnnotatedService#testMethod2()}.
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws ClassNotFoundException 
	 */
	@Test
	public final void testTestMethod2() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		
				new MyAnnotatedService3().testMethod1();
				assertTrue("Is annotated method",
						MyAnnotatedService3.class.getMethod("testMethod1").isAnnotationPresent(Audit.class));



	}

}
