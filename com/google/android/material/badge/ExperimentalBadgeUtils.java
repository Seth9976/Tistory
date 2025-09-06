package com.google.android.material.badge;

import androidx.annotation.experimental.Experimental.Level;
import androidx.annotation.experimental.Experimental;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Experimental(level = Level.ERROR)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
public @interface ExperimentalBadgeUtils {
}

