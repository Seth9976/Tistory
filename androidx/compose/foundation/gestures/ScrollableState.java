package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000EH&JA\u0010\u0010\u001A\u00020\u00112\b\b\u0002\u0010\u0012\u001A\u00020\u00132\'\u0010\u0014\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0002\b\u0018H¦@¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0005R\u0014\u0010\u000B\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001AÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollForward", "getCanScrollForward", "isScrollInProgress", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "dispatchRawDelta", "", "delta", "scroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ScrollableState {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean getCanScrollBackward(@NotNull ScrollableState scrollableState0) {
            return scrollableState0.super.getCanScrollBackward();
        }

        @Deprecated
        public static boolean getCanScrollForward(@NotNull ScrollableState scrollableState0) {
            return scrollableState0.super.getCanScrollForward();
        }

        @Deprecated
        public static boolean getLastScrolledBackward(@NotNull ScrollableState scrollableState0) {
            return scrollableState0.super.getLastScrolledBackward();
        }

        @Deprecated
        public static boolean getLastScrolledForward(@NotNull ScrollableState scrollableState0) {
            return scrollableState0.super.getLastScrolledForward();
        }

        public static Object scroll$default(ScrollableState scrollableState0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object0) {
            return ScrollableState.scroll$default(scrollableState0, mutatePriority0, function20, continuation0, v, object0);
        }
    }

    float dispatchRawDelta(float arg1);

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    boolean isScrollInProgress();

    @Nullable
    Object scroll(@NotNull MutatePriority arg1, @NotNull Function2 arg2, @NotNull Continuation arg3);

    static Object scroll$default(ScrollableState scrollableState0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.Default;
        }
        return scrollableState0.scroll(mutatePriority0, function20, continuation0);
    }
}

