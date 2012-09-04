/**
 * 
 */
package org.sample.annotation;

import java.lang.annotation.Annotation;

/**
 * @author kanoodle
 * 
 */
public class MyAnnotatedService {

	public void testMethod1() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
			System.out.println("Classname: " + e.getClassName() + "."
					+ e.getMethodName());
				System.out.println("Method: "
						+ Class.forName(e.getClassName()).getMethod(
								e.getMethodName()).getName()
						+ " Is Audit annotation present?: "
						+ Class.forName(e.getClassName())
								.getMethod(e.getMethodName())
								.isAnnotationPresent(Audit.class));
		}

	}

}
