package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001A\b\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\u0010\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0000\u001A\u0012\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0007H\u0000\u001A(\u0010\u000B\u001A\u00020\u00052\u0006\u0010\f\u001A\u00020\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00050\u000F¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0002\u0010\u0011\u001A.\u0010\u0012\u001A\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\f\u001A\u00020\r2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u0002H\u00130\u000F¢\u0006\u0002\b\u0010H\u0000¢\u0006\u0002\u0010\u0014\u001A*\u0010\u0015\u001A\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001A\u00020\u00072\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u0002H\u00160\u000FH\u0081\b¢\u0006\u0002\u0010\u0019*\u001E\b\u0000\u0010\u001A\u001A\u0004\b\u0000\u0010\u001B\"\b\u0012\u0004\u0012\u0002H\u001B0\u001C2\b\u0012\u0004\u0012\u0002H\u001B0\u001C*\f\b\u0000\u0010\u001D\"\u00020\u001E2\u00020\u001E¨\u0006\u001F"}, d2 = {"currentThreadId", "", "currentThreadName", "", "ensureMutable", "", "it", "", "identityHashCode", "", "instance", "invokeComposable", "composer", "Landroidx/compose/runtime/Composer;", "composable", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)V", "invokeComposableForResult", "T", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "synchronized", "R", "lock", "block", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "AtomicReference", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "TestOnly", "Lorg/jetbrains/annotations/TestOnly;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActualJvm_jvmKt {
    public static void AtomicReference$annotations() {
    }

    public static final long currentThreadId() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @NotNull
    public static final String currentThreadName() [...] // 潜在的解密器

    public static final void ensureMutable(@NotNull Object object0) {
    }

    public static final int identityHashCode(@Nullable Object object0) {
        return System.identityHashCode(object0);
    }

    public static final void invokeComposable(@NotNull Composer composer0, @NotNull Function2 function20) {
        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(composer0, 1);
    }

    public static final Object invokeComposableForResult(@NotNull Composer composer0, @NotNull Function2 function20) {
        Intrinsics.checkNotNull(function20, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, T of androidx.compose.runtime.ActualJvm_jvmKt.invokeComposableForResult>");
        return ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(composer0, 1);
    }

    @PublishedApi
    public static final Object synchronized(@NotNull Object object0, @NotNull Function0 function00) {
        synchronized(object0) {
            return function00.invoke();
        }
    }
}

