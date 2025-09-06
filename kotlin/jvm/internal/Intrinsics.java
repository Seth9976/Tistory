package kotlin.jvm.internal;

import a5.b;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

public class Intrinsics {
    @SinceKotlin(version = "1.4")
    public static class Kotlin {
    }

    public static String a(String s) {
        StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
        int v;
        for(v = 0; !arr_stackTraceElement[v].getClassName().equals("kotlin.jvm.internal.Intrinsics"); ++v) {
        }
        while(arr_stackTraceElement[v].getClassName().equals("kotlin.jvm.internal.Intrinsics")) {
            ++v;
        }
        StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
        StringBuilder stringBuilder0 = b.w("Parameter specified as non-null is null: method ", stackTraceElement0.getClassName(), ".", stackTraceElement0.getMethodName(), ", parameter ");
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(double f, Double double0) {
        return double0 != null && f == ((double)double0);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(float f, Float float0) {
        return float0 != null && f == ((float)float0);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double double0, double f) {
        return double0 != null && ((double)double0) == f;
    }

    // 去混淆评级： 低(20)
    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double double0, Double double1) {
        return double0 == null ? double1 == null : double1 != null && ((double)double0) == ((double)double1);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float float0, float f) {
        return float0 != null && ((float)float0) == f;
    }

    // 去混淆评级： 低(20)
    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float float0, Float float1) {
        return float0 == null ? float1 == null : float1 != null && ((float)float0) == ((float)float1);
    }

    public static boolean areEqual(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public static void b(Throwable throwable0, String s) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = -1;
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            if(s.equals(arr_stackTraceElement[v1].getClassName())) {
                v = v1;
            }
        }
        throwable0.setStackTrace(((StackTraceElement[])Arrays.copyOfRange(arr_stackTraceElement, v + 1, arr_stackTraceElement.length)));
    }

    public static void checkExpressionValueIsNotNull(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException(s + " must not be null");
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static void checkFieldIsNotNull(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException(s);
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static void checkFieldIsNotNull(Object object0, String s, String s1) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException("Field specified as non-null is null: " + s + "." + s1);
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static void checkHasClass(String s) throws ClassNotFoundException {
        String s1 = s.replace('/', '.');
        try {
            Class.forName(s1);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            ClassNotFoundException classNotFoundException1 = new ClassNotFoundException("Class " + s1 + " is not found. Please update the Kotlin runtime to the latest version", classNotFoundException0);
            Intrinsics.b(classNotFoundException1, "kotlin.jvm.internal.Intrinsics");
            throw classNotFoundException1;
        }
    }

    public static void checkHasClass(String s, String s1) throws ClassNotFoundException {
        String s2 = s.replace('/', '.');
        try {
            Class.forName(s2);
        }
        catch(ClassNotFoundException classNotFoundException0) {
            ClassNotFoundException classNotFoundException1 = new ClassNotFoundException("Class " + s2 + " is not found: this code requires the Kotlin runtime of version at least " + s1, classNotFoundException0);
            Intrinsics.b(classNotFoundException1, "kotlin.jvm.internal.Intrinsics");
            throw classNotFoundException1;
        }
    }

    public static void checkNotNull(Object object0) [...] // 潜在的解密器

    public static void checkNotNull(Object object0, String s) [...] // 潜在的解密器

    public static void checkNotNullExpressionValue(Object object0, String s) [...] // 潜在的解密器

    public static void checkNotNullParameter(Object object0, String s) [...] // Inlined contents

    public static void checkParameterIsNotNull(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(Intrinsics.a(s));
        Intrinsics.b(illegalArgumentException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalArgumentException0;
    }

    public static void checkReturnedValueIsNotNull(Object object0, String s) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException(s);
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static void checkReturnedValueIsNotNull(Object object0, String s, String s1) {
        if(object0 != null) {
            return;
        }
        IllegalStateException illegalStateException0 = new IllegalStateException("Method specified as non-null returned null: " + s + "." + s1);
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static int compare(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }

    public static int compare(long v, long v1) {
        int v2 = Long.compare(v, v1);
        if(v2 < 0) {
            return -1;
        }
        return v2 == 0 ? 0 : 1;
    }

    public static void needClassReification() {
        Intrinsics.throwUndefinedForReified();
    }

    public static void needClassReification(String s) {
        Intrinsics.throwUndefinedForReified(s);
    }

    public static void reifiedOperationMarker(int v, String s) {
        Intrinsics.throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int v, String s, String s1) {
        Intrinsics.throwUndefinedForReified(s1);
    }

    public static String stringPlus(String s, Object object0) [...] // Inlined contents

    public static void throwAssert() {
        AssertionError assertionError0 = new AssertionError();
        Intrinsics.b(assertionError0, "kotlin.jvm.internal.Intrinsics");
        throw assertionError0;
    }

    public static void throwAssert(String s) {
        AssertionError assertionError0 = new AssertionError(s);
        Intrinsics.b(assertionError0, "kotlin.jvm.internal.Intrinsics");
        throw assertionError0;
    }

    public static void throwIllegalArgument() {
        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException();
        Intrinsics.b(illegalArgumentException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalArgumentException0;
    }

    public static void throwIllegalArgument(String s) {
        IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException(s);
        Intrinsics.b(illegalArgumentException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalArgumentException0;
    }

    public static void throwIllegalState() {
        IllegalStateException illegalStateException0 = new IllegalStateException();
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    public static void throwIllegalState(String s) {
        IllegalStateException illegalStateException0 = new IllegalStateException(s);
        Intrinsics.b(illegalStateException0, "kotlin.jvm.internal.Intrinsics");
        throw illegalStateException0;
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
        NullPointerException nullPointerException0 = new NullPointerException();
        Intrinsics.b(nullPointerException0, "kotlin.jvm.internal.Intrinsics");
        throw nullPointerException0;
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe(String s) {
        NullPointerException nullPointerException0 = new NullPointerException(s);
        Intrinsics.b(nullPointerException0, "kotlin.jvm.internal.Intrinsics");
        throw nullPointerException0;
    }

    public static void throwNpe() {
        KotlinNullPointerException kotlinNullPointerException0 = new KotlinNullPointerException();
        Intrinsics.b(kotlinNullPointerException0, "kotlin.jvm.internal.Intrinsics");
        throw kotlinNullPointerException0;
    }

    public static void throwNpe(String s) {
        KotlinNullPointerException kotlinNullPointerException0 = new KotlinNullPointerException(s);
        Intrinsics.b(kotlinNullPointerException0, "kotlin.jvm.internal.Intrinsics");
        throw kotlinNullPointerException0;
    }

    public static void throwUndefinedForReified() {
        Intrinsics.throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String s) {
        throw new UnsupportedOperationException(s);
    }

    public static void throwUninitializedProperty(String s) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException0 = new UninitializedPropertyAccessException(s);
        Intrinsics.b(uninitializedPropertyAccessException0, "kotlin.jvm.internal.Intrinsics");
        throw uninitializedPropertyAccessException0;
    }

    public static void throwUninitializedPropertyAccessException(String s) {
        Intrinsics.throwUninitializedProperty(("lateinit property " + s + " has not been initialized"));
    }
}

