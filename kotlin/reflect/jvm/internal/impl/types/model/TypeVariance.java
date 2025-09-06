package kotlin.reflect.jvm.internal.impl.types.model;

import org.jetbrains.annotations.NotNull;

public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");

    public final String a;

    public TypeVariance(String s1) {
        this.a = s1;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

