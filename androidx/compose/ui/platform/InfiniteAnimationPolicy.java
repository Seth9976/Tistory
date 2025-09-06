package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ2\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u001C\u0010\b\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\tH¦@¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000EÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onInfiniteOperation", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InfiniteAnimationPolicy extends Element {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy0, Object object0, @NotNull Function2 function20) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(infiniteAnimationPolicy0, object0, function20);
        }

        @Nullable
        public static Element get(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(infiniteAnimationPolicy0, coroutineContext$Key0);
        }

        @Deprecated
        @NotNull
        public static Key getKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy0) {
            return infiniteAnimationPolicy0.super.getKey();
        }

        @NotNull
        public static CoroutineContext minusKey(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy0, @NotNull Key coroutineContext$Key0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(infiniteAnimationPolicy0, coroutineContext$Key0);
        }

        @NotNull
        public static CoroutineContext plus(@NotNull InfiniteAnimationPolicy infiniteAnimationPolicy0, @NotNull CoroutineContext coroutineContext0) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(infiniteAnimationPolicy0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class androidx.compose.ui.platform.InfiniteAnimationPolicy.Key implements Key {
        public static final androidx.compose.ui.platform.InfiniteAnimationPolicy.Key a;

        static {
            androidx.compose.ui.platform.InfiniteAnimationPolicy.Key.a = new androidx.compose.ui.platform.InfiniteAnimationPolicy.Key();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    @NotNull
    public static final androidx.compose.ui.platform.InfiniteAnimationPolicy.Key Key;

    static {
        InfiniteAnimationPolicy.Key = androidx.compose.ui.platform.InfiniteAnimationPolicy.Key.a;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    @NotNull
    default Key getKey() {
        return InfiniteAnimationPolicy.Key;
    }

    @Nullable
    Object onInfiniteOperation(@NotNull Function1 arg1, @NotNull Continuation arg2);
}

