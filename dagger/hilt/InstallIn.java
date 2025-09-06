package dagger.hilt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface InstallIn {
    Class[] value();
}

