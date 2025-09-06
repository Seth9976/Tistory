package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A7\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u0002H\b0\nH\u0086@¢\u0006\u0002\u0010\u000F\u001A7\u0010\u0010\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\b0\nH\u0086@¢\u0006\u0002\u0010\u000F\u001A=\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\u00012#\b\u0004\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u0002H\b0\nH\u0086H¢\u0006\u0002\u0010\u0012\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"monotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "withFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "frameTimeNanos", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
public final class MonotonicFrameClockKt {
    @NotNull
    public static final MonotonicFrameClock getMonotonicFrameClock(@NotNull CoroutineContext coroutineContext0) {
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)coroutineContext0.get(MonotonicFrameClock.Key);
        if(monotonicFrameClock0 == null) {
            throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        }
        return monotonicFrameClock0;
    }

    @ExperimentalComposeApi
    public static void getMonotonicFrameClock$annotations(CoroutineContext coroutineContext0) {
    }

    @Nullable
    public static final Object withFrameMillis(@NotNull MonotonicFrameClock monotonicFrameClock0, @NotNull Function1 function10, @NotNull Continuation continuation0) {
        return monotonicFrameClock0.withFrameNanos(new Function1(function10) {
            public final Function1 w;

            {
                this.w = function10;
                super(1);
            }

            public final Object invoke(long v) {
                return this.w.invoke(((long)(v / 1000000L)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).longValue());
            }
        }, continuation0);
    }

    @Nullable
    public static final Object withFrameMillis(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        return MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()).withFrameNanos(new androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis.2(function10), continuation0);
    }

    @Nullable
    public static final Object withFrameNanos(@NotNull Function1 function10, @NotNull Continuation continuation0) {
        return MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()).withFrameNanos(function10, continuation0);
    }
}

