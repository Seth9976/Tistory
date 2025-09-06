package dagger.hilt.android;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@GeneratesRootInput
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface HiltAndroidApp {
    Class value() default Void.class;
}

