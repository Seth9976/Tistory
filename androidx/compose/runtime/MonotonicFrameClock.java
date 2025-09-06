package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ7\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\tH¦@¢\u0006\u0002\u0010\u000ER\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface MonotonicFrameClock extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(@NotNull MonotonicFrameClock monotonicFrameClock0, Object object0, @NotNull Function2 function20) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(monotonicFrameClock0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull MonotonicFrameClock monotonicFrameClock0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(monotonicFrameClock0, coroutineContext$Key0);
        }

        @Deprecated
        @NotNull
        public static Key getKey(@NotNull MonotonicFrameClock monotonicFrameClock0) {
            return monotonicFrameClock0.super.getKey();
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull MonotonicFrameClock monotonicFrameClock0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(monotonicFrameClock0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull MonotonicFrameClock monotonicFrameClock0, @NotNull CoroutineContext coroutineContext0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(monotonicFrameClock0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.runtime.MonotonicFrameClock.Key implements Key {
        public static final androidx.compose.runtime.MonotonicFrameClock.Key a;

        static {
            androidx.compose.runtime.MonotonicFrameClock.Key.a = new androidx.compose.runtime.MonotonicFrameClock.Key();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final androidx.compose.runtime.MonotonicFrameClock.Key Key;

    static {
        MonotonicFrameClock.Key = androidx.compose.runtime.MonotonicFrameClock.Key.a;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    default Key getKey() {
        return MonotonicFrameClock.Key;
    }

    @Nullable
    Object withFrameNanos(@NotNull Function1 arg1, @NotNull Continuation arg2);
}

