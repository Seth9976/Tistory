package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ExceptionUtilsKt {
    public static final boolean isProcessCanceledException(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "<this>");
        Class class0 = throwable0.getClass();
        do {
            if(Intrinsics.areEqual(class0.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
                return true;
            }
            class0 = class0.getSuperclass();
        }
        while(class0 != null);
        return false;
    }

    @NotNull
    public static final RuntimeException rethrow(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "e");
        throw throwable0;
    }
}

