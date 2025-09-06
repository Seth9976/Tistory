package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class Preconditions {
    public static void checkArgument(boolean z, String s) {
        if(!z) {
            throw new IllegalArgumentException(s);
        }
    }

    @CanIgnoreReturnValue
    public static Object checkNotNull(Object object0) {
        object0.getClass();
        return object0;
    }

    @CanIgnoreReturnValue
    public static Object checkNotNull(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static void checkState(boolean z, String s) {
        if(!z) {
            throw new IllegalStateException(s);
        }
    }
}

