package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public final class FieldAttributes {
    public final Field a;

    public FieldAttributes(Field field0) {
        Objects.requireNonNull(field0);
        this.a = field0;
    }

    public Annotation getAnnotation(Class class0) {
        return this.a.getAnnotation(class0);
    }

    public Collection getAnnotations() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public Class getDeclaredClass() {
        return this.a.getType();
    }

    public Type getDeclaredType() {
        return this.a.getGenericType();
    }

    public Class getDeclaringClass() {
        return this.a.getDeclaringClass();
    }

    public String getName() {
        return this.a.getName();
    }

    public boolean hasModifier(int v) {
        return (v & this.a.getModifiers()) != 0;
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

