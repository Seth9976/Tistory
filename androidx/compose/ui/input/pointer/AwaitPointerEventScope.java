package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0011\u001A\u00020\u00032\b\b\u0002\u0010\u0012\u001A\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014JE\u0010\u0015\u001A\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001A\u00020\u00182\'\u0010\u0019\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001A¢\u0006\u0002\b\u001DH\u0096@¢\u0006\u0002\u0010\u001EJG\u0010\u001F\u001A\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001A\u00020\u00182\'\u0010\u0019\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u001A¢\u0006\u0002\b\u001DH\u0096@¢\u0006\u0002\u0010\u001ER\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0006\u001A\u00020\u00078VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0018\u0010\n\u001A\u00020\u000BX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\f\u0010\tR\u0012\u0010\r\u001A\u00020\u000EX¦\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@RestrictsSuspension
public interface AwaitPointerEventScope extends Density {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, Continuation continuation0, int v, Object object0) {
            return AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope0, pointerEventPass0, continuation0, v, object0);
        }

        @Deprecated
        public static long getExtendedTouchPadding-NH-jbRc(@NotNull AwaitPointerEventScope awaitPointerEventScope0) {
            return awaitPointerEventScope0.super.getExtendedTouchPadding-NH-jbRc();
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return awaitPointerEventScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return awaitPointerEventScope0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return awaitPointerEventScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return awaitPointerEventScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull AwaitPointerEventScope awaitPointerEventScope0, int v) {
            return awaitPointerEventScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return awaitPointerEventScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return awaitPointerEventScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return awaitPointerEventScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull AwaitPointerEventScope awaitPointerEventScope0, @NotNull DpRect dpRect0) {
            return awaitPointerEventScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return awaitPointerEventScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return awaitPointerEventScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return awaitPointerEventScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull AwaitPointerEventScope awaitPointerEventScope0, int v) {
            return awaitPointerEventScope0.super.toSp-kPz2Gy4(v);
        }

        @Deprecated
        @Nullable
        public static Object withTimeout(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
            return awaitPointerEventScope0.super.withTimeout(v, function20, continuation0);
        }

        @Deprecated
        @Nullable
        public static Object withTimeoutOrNull(@NotNull AwaitPointerEventScope awaitPointerEventScope0, long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
            return awaitPointerEventScope0.super.withTimeoutOrNull(v, function20, continuation0);
        }
    }

    @Nullable
    Object awaitPointerEvent(@NotNull PointerEventPass arg1, @NotNull Continuation arg2);

    static Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, Continuation continuation0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if((v & 1) != 0) {
            pointerEventPass0 = PointerEventPass.Main;
        }
        return awaitPointerEventScope0.awaitPointerEvent(pointerEventPass0, continuation0);
    }

    @NotNull
    PointerEvent getCurrentEvent();

    // 去混淆评级： 低(20)
    default long getExtendedTouchPadding-NH-jbRc() {
        return 0L;
    }

    long getSize-YbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @Nullable
    default Object withTimeout(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return AwaitPointerEventScope.withTimeout$suspendImpl(this, v, function20, continuation0);
    }

    static Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope0, long v, Function2 function20, Continuation continuation0) {
        return function20.invoke(awaitPointerEventScope0, continuation0);
    }

    @Nullable
    default Object withTimeoutOrNull(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return AwaitPointerEventScope.withTimeoutOrNull$suspendImpl(this, v, function20, continuation0);
    }

    static Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope0, long v, Function2 function20, Continuation continuation0) {
        return function20.invoke(awaitPointerEventScope0, continuation0);
    }
}

