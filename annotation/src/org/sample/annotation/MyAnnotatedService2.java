/**
 * 
 */
package org.sample.annotation;

import org.sample.annotation.Audit.Priority;

/**
 * @author kanoodle
 *
 */
public class MyAnnotatedService2 {
	
	public void testMethod1() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		System.out.println(this.getClass().getCanonicalName() + ": testMethod1() is called!");

		new MyAnnotatedService().testMethod1();
	}
	
	public void testMethod2() {
		
		System.out.println(this.getClass().getCanonicalName() + ": testMethod2() is called!");
	}
	
}
