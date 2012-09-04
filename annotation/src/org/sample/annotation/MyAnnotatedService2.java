/**
 * 
 */
package org.sample.annotation;


/**
 * @author kanoodle
 *
 */
public class MyAnnotatedService2 {
	
	public void testMethod1(String test)  {
		System.out.println(this.getClass().getCanonicalName() + ": testMethod1(" + test+ ") is called!");

		new MyAnnotatedService().testMethod1();
	}
	
	public void testMethod1(Object test) {
		System.out.println(this.getClass().getCanonicalName() + ": testMethod1(" + test + ") is called!");

		new MyAnnotatedService().testMethod1();
	}	

	
}
