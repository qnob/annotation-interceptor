/**
 * 
 */
package org.sample.annotation;

import java.lang.reflect.Method;

/**
 * @author kanoodle
 */
public class MyAnnotatedService {

	public void testMethod1() {
		for (StackTraceElement e : Thread.currentThread().getStackTrace()) {
			System.out.println("Classname: " + e.getClassName() + "." + e.getMethodName());
			try {
				final Class clazz = Class.forName(e.getClassName());
				for (Method m : clazz.getMethods()) {
					if (e.getMethodName().equals(m.getName())) {
						boolean isAuditPresent = m.isAnnotationPresent(Audit.class);
						System.out.println("Method: " + m.getName() +  " Is Audit annotation present?: "
							+ isAuditPresent);
						if (isAuditPresent) System.out.println("****");
					}
				}

			} catch (SecurityException | ClassNotFoundException e1) {
				throw new RuntimeException(e1);
			}
		}

	}

}
