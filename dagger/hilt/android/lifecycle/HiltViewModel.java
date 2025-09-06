package dagger.hilt.android.lifecycle;

import dagger.hilt.GeneratesRootInput;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface HiltViewModel {
    Class assistedFactory() default Object.class;
}

