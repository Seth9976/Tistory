package dagger.hilt;

import dagger.hilt.internal.definecomponent.DefineComponentNoParent;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@GeneratesRootInput
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface DefineComponent {
    @GeneratesRootInput
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.TYPE})
    public @interface Builder {
    }

    Class parent() default DefineComponentNoParent.class;
}

