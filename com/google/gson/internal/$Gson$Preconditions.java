package com.google.gson.internal;

public final class .Gson.Preconditions {
    public static void checkArgument(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static Object checkNotNull(Object object0) {
        object0.getClass();
        return object0;
    }
}

