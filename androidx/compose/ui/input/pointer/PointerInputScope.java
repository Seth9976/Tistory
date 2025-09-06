package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0016\u001A\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u0019¢\u0006\u0002\b\u001DH¦@¢\u0006\u0002\u0010\u001ER\u001A\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R*\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00078V@VX\u0096\u000E¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u0018\u0010\u000F\u001A\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001A\u00020\u0013X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001FÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PointerInputScope extends Density {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static long getExtendedTouchPadding-NH-jbRc(@NotNull PointerInputScope pointerInputScope0) {
            return pointerInputScope0.super.getExtendedTouchPadding-NH-jbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope0) {
            return pointerInputScope0.super.getInterceptOutOfBoundsChildEvents();
        }

        public static void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull PointerInputScope pointerInputScope0, long v) {
            return pointerInputScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull PointerInputScope pointerInputScope0, float f) {
            return pointerInputScope0.super.roundToPx-0680j_4(f);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@NotNull PointerInputScope pointerInputScope0, boolean z) {
            pointerInputScope0.super.setInterceptOutOfBoundsChildEvents(z);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull PointerInputScope pointerInputScope0, long v) {
            return pointerInputScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull PointerInputScope pointerInputScope0, float f) {
            return pointerInputScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull PointerInputScope pointerInputScope0, int v) {
            return pointerInputScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull PointerInputScope pointerInputScope0, long v) {
            return pointerInputScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull PointerInputScope pointerInputScope0, long v) {
            return pointerInputScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull PointerInputScope pointerInputScope0, float f) {
            return pointerInputScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PointerInputScope pointerInputScope0, @NotNull DpRect dpRect0) {
            return pointerInputScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull PointerInputScope pointerInputScope0, long v) {
            return pointerInputScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull PointerInputScope pointerInputScope0, float f) {
            return pointerInputScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull PointerInputScope pointerInputScope0, float f) {
            return pointerInputScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull PointerInputScope pointerInputScope0, int v) {
            return pointerInputScope0.super.toSp-kPz2Gy4(v);
        }
    }

    @Nullable
    Object awaitPointerEventScope(@NotNull Function2 arg1, @NotNull Continuation arg2);

    // 去混淆评级： 低(20)
    default long getExtendedTouchPadding-NH-jbRc() {
        return 0L;
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    long getSize-YbymL2g();

    @NotNull
    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}

