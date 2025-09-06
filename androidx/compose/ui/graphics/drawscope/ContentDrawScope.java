package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ContentDrawScope extends DrawScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static void drawImage-AZ2fEMs(@NotNull ContentDrawScope contentDrawScope0, @NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @FloatRange(from = 0.0, to = 1.0) float f, @NotNull DrawStyle drawStyle0, @Nullable ColorFilter colorFilter0, int v4, int v5) {
            contentDrawScope0.super.drawImage-AZ2fEMs(imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
        }

        @Deprecated
        public static long getCenter-F1C5BW0(@NotNull ContentDrawScope contentDrawScope0) {
            return contentDrawScope0.super.getCenter-F1C5BW0();
        }

        @Deprecated
        public static long getSize-NH-jbRc(@NotNull ContentDrawScope contentDrawScope0) {
            return contentDrawScope0.super.getSize-NH-jbRc();
        }

        @Deprecated
        public static void record-JVtK1S4(@NotNull ContentDrawScope contentDrawScope0, @NotNull GraphicsLayer graphicsLayer0, long v, @NotNull Function1 function10) {
            contentDrawScope0.super.record-JVtK1S4(graphicsLayer0, v, function10);
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull ContentDrawScope contentDrawScope0, long v) {
            return contentDrawScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull ContentDrawScope contentDrawScope0, float f) {
            return contentDrawScope0.super.roundToPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull ContentDrawScope contentDrawScope0, long v) {
            return contentDrawScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull ContentDrawScope contentDrawScope0, float f) {
            return contentDrawScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull ContentDrawScope contentDrawScope0, int v) {
            return contentDrawScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull ContentDrawScope contentDrawScope0, long v) {
            return contentDrawScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull ContentDrawScope contentDrawScope0, long v) {
            return contentDrawScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull ContentDrawScope contentDrawScope0, float f) {
            return contentDrawScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope0, @NotNull DpRect dpRect0) {
            return contentDrawScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull ContentDrawScope contentDrawScope0, long v) {
            return contentDrawScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull ContentDrawScope contentDrawScope0, float f) {
            return contentDrawScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull ContentDrawScope contentDrawScope0, float f) {
            return contentDrawScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull ContentDrawScope contentDrawScope0, int v) {
            return contentDrawScope0.super.toSp-kPz2Gy4(v);
        }
    }

    void drawContent();
}

