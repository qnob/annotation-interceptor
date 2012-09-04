/**
 * 
 */
package org.sample.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * @author kanoodle
 *
 */
@Retention( RetentionPolicy.RUNTIME )
public @interface Audit {
	
    enum Priority { LOW, NORM, HIGH }
       Priority   priority()  default Priority.NORM  ;

}
