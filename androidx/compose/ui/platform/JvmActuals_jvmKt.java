package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001H\u0000\u001A*\u0010\u0005\u001A\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001A\u00020\u00032\f\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00060\tH\u0081\b¢\u0006\u0002\u0010\n\u001A\f\u0010\u000B\u001A\u00020\u0003*\u00020\u0003H\u0000*\f\b\u0000\u0010\f\"\u00020\r2\u00020\r¨\u0006\u000E"}, d2 = {"simpleIdentityToString", "", "obj", "", "name", "synchronized", "R", "lock", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "nativeClass", "AtomicInt", "Ljava/util/concurrent/atomic/AtomicInteger;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class JvmActuals_jvmKt {
    public static void AtomicInt$annotations() {
    }

    @NotNull
    public static final Object nativeClass(@NotNull Object object0) {
        return object0.getClass();
    }

    @NotNull
    public static final String simpleIdentityToString(@NotNull Object object0, @Nullable String s) {
        if(s == null) {
            s = object0.getClass().isAnonymousClass() ? object0.getClass().getName() : object0.getClass().getSimpleName();
        }
        String s1 = String.format("%07x", Arrays.copyOf(new Object[]{System.identityHashCode(object0)}, 1));
        Intrinsics.checkNotNullExpressionValue(s1, "format(format, *args)");
        return s + '@' + s1;
    }

    @PublishedApi
    public static final Object synchronized(@NotNull Object object0, @NotNull Function0 function00) {
        synchronized(object0) {
            return function00.invoke();
        }
    }
}

