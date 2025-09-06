package kotlin.reflect.jvm.internal.impl.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WrappedValues {
    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable throwable0) {
            super("Rethrow stored exception", throwable0);
        }
    }

    public static final l a = null;
    public static volatile boolean throwWrappedProcessCanceledException = false;

    static {
        WrappedValues.a = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 2 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
                break;
            }
            case 3: {
                arr_object[0] = "throwable";
                break;
            }
            default: {
                arr_object[0] = "value";
            }
        }
        arr_object[1] = v == 1 || v == 2 ? "escapeNull" : "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                arr_object[2] = "escapeThrowable";
                break;
            }
            default: {
                arr_object[2] = v == 4 ? "unescapeExceptionOrNull" : "unescapeNull";
            }
        }
        String s = String.format((v == 1 || v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @NotNull
    public static Object escapeNull(@Nullable Object object0) {
        return object0 == null ? WrappedValues.a : object0;
    }

    @NotNull
    public static Object escapeThrowable(@NotNull Throwable throwable0) {
        if(throwable0 != null) {
            return new m(throwable0);
        }
        WrappedValues.a(3);
        throw null;
    }

    @Nullable
    public static Object unescapeExceptionOrNull(@NotNull Object object0) {
        if(object0 != null) {
            return WrappedValues.unescapeNull(WrappedValues.unescapeThrowable(object0));
        }
        WrappedValues.a(4);
        throw null;
    }

    @Nullable
    public static Object unescapeNull(@NotNull Object object0) {
        if(object0 != null) {
            return object0 == WrappedValues.a ? null : object0;
        }
        WrappedValues.a(0);
        throw null;
    }

    @Nullable
    public static Object unescapeThrowable(@Nullable Object object0) {
        if(object0 instanceof m) {
            Throwable throwable0 = ((m)object0).a;
            if(throwable0 != null) {
                if(!WrappedValues.throwWrappedProcessCanceledException || !ExceptionUtilsKt.isProcessCanceledException(throwable0)) {
                    throw ExceptionUtilsKt.rethrow(throwable0);
                }
                throw new WrappedProcessCanceledException(throwable0);
            }
            m.a(1);
            throw null;
        }
        return object0;
    }
}

