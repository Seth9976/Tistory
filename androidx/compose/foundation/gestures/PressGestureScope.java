package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\bf\u0018\u00002\u00020\u0001J\u000E\u0010\u0002\u001A\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface PressGestureScope extends Density {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull PressGestureScope pressGestureScope0, long v) {
            return pressGestureScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull PressGestureScope pressGestureScope0, float f) {
            return pressGestureScope0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull PressGestureScope pressGestureScope0, long v) {
            return pressGestureScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull PressGestureScope pressGestureScope0, float f) {
            return pressGestureScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull PressGestureScope pressGestureScope0, int v) {
            return pressGestureScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull PressGestureScope pressGestureScope0, long v) {
            return pressGestureScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull PressGestureScope pressGestureScope0, long v) {
            return pressGestureScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull PressGestureScope pressGestureScope0, float f) {
            return pressGestureScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope0, @NotNull DpRect dpRect0) {
            return pressGestureScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull PressGestureScope pressGestureScope0, long v) {
            return pressGestureScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull PressGestureScope pressGestureScope0, float f) {
            return pressGestureScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull PressGestureScope pressGestureScope0, float f) {
            return pressGestureScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull PressGestureScope pressGestureScope0, int v) {
            return pressGestureScope0.super.toSp-kPz2Gy4(v);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation arg1);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation arg1);
}

