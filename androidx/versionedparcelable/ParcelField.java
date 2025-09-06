package androidx.versionedparcelable;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD})
public @interface ParcelField {
    String defaultValue() default "";

    int value();
}

