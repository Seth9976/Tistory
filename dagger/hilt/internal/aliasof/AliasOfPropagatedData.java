package dagger.hilt.internal.aliasof;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface AliasOfPropagatedData {
    Class alias();

    Class[] defineComponentScopes();
}

