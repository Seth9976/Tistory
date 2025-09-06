package kotlin.reflect.jvm.internal.impl.utils;

public final class m {
    public final Throwable a;

    public m(Throwable throwable0) {
        if(throwable0 != null) {
            super();
            this.a = throwable0;
            return;
        }
        m.a(0);
        throw null;
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 ? 2 : 3)];
        arr_object[0] = v == 1 ? "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper" : "throwable";
        arr_object[1] = v == 1 ? "getThrowable" : "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
        if(v != 1) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 1 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

