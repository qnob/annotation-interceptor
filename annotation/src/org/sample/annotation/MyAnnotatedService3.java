/**
 * 
 */
package org.sample.annotation;

import org.sample.annotation.Audit.Priority;

/**
 * @author kanoodle
 *
 */
public class MyAnnotatedService3 {
	
	@Audit(priority=Priority.NORM)
	public void testMethod1() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		System.out.println(this.getClass().getCanonicalName() + ": testMethod1() is called!");
		new MyAnnotatedService2().testMethod1();
	}
	
}
