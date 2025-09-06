package md;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.internal.HidesMembers;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class b {
    @SinceKotlin(version = "1.1")
    @HidesMembers
    public static void addSuppressed(@NotNull Throwable throwable0, @NotNull Throwable throwable1) {
        Intrinsics.checkNotNullParameter(throwable0, "<this>");
        Intrinsics.checkNotNullParameter(throwable1, "exception");
        if(throwable0 != throwable1) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(throwable0, throwable1);
        }
    }

    @NotNull
    public static final StackTraceElement[] getStackTrace(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "<this>");
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        Intrinsics.checkNotNull(arr_stackTraceElement);
        return arr_stackTraceElement;
    }

    public static void getStackTrace$annotations(Throwable throwable0) {
    }

    @NotNull
    public static final List getSuppressedExceptions(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "<this>");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(throwable0);
    }

    @SinceKotlin(version = "1.4")
    public static void getSuppressedExceptions$annotations(Throwable throwable0) {
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String stackTraceToString(@NotNull Throwable throwable0) {
        Intrinsics.checkNotNullParameter(throwable0, "<this>");
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        throwable0.printStackTrace(printWriter0);
        printWriter0.flush();
        String s = stringWriter0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }
}

