package io.reactivex.internal.functions;

import a7.c;
import io.reactivex.functions.BiPredicate;

public final class ObjectHelper {
    public static final c a;

    static {
        ObjectHelper.a = new c(4);
    }

    public static int compare(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v <= v1 ? 0 : 1;
    }

    public static int compare(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 <= 0 ? 0 : 1;
    }

    // 去混淆评级： 低(20)
    public static boolean equals(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static BiPredicate equalsPredicate() {
        return ObjectHelper.a;
    }

    public static int hashCode(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    @Deprecated
    public static long requireNonNull(long v, String s) {
        throw new InternalError("Null check on a primitive: " + s);
    }

    public static Object requireNonNull(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    public static int verifyPositive(int v, String s) {
        if(v <= 0) {
            throw new IllegalArgumentException(s + " > 0 required but it was " + v);
        }
        return v;
    }

    public static long verifyPositive(long v, String s) {
        if(v <= 0L) {
            throw new IllegalArgumentException(s + " > 0 required but it was " + v);
        }
        return v;
    }
}

