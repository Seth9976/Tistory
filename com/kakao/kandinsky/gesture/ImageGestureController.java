package com.kakao.kandinsky.gesture;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import ha.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0016\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u000Eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Lcom/kakao/kandinsky/gesture/ImageGestureController;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Offset;", "moveOffset", "Landroidx/compose/ui/geometry/Rect;", "cropRect", "imageRect", "getMovableOffset-qto3Fdw", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)J", "getMovableOffset", "Landroid/graphics/Matrix;", "matrix", "", "manualScale", "fitMatrixIntoImage", "(Landroid/graphics/Matrix;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;F)Landroid/graphics/Matrix;", "pivot", "minScale", "adjustScaleIntoImage-YqVAtuI", "(Landroid/graphics/Matrix;JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;F)Landroid/graphics/Matrix;", "adjustScaleIntoImage", "Companion", "gesture_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGestureController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGestureController.kt\ncom/kakao/kandinsky/gesture/ImageGestureController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public class ImageGestureController {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/kandinsky/gesture/ImageGestureController$Companion;", "", "", "MOVE_RUBBER_BAND_RATIO", "F", "gesture_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        ImageGestureController.Companion = new Companion(null);
    }

    public static long a(Rect rect0, Rect rect1) {
        Pair pair0 = TuplesKt.to(0.0f, 0.0f);
        Pair pair1 = TuplesKt.to(0.0f, 0.0f);
        return OffsetKt.Offset(Math.max(((Number)pair0.component1()).floatValue(), rect0.getRight() - rect1.getRight()) + Math.min(((Number)pair0.component2()).floatValue(), rect0.getLeft() - rect1.getLeft()), Math.max(((Number)pair1.component1()).floatValue(), rect0.getBottom() - rect1.getBottom()) + Math.min(((Number)pair1.component2()).floatValue(), rect0.getTop() - rect1.getTop()));
    }

    @NotNull
    public final Matrix adjustScaleIntoImage-YqVAtuI(@NotNull Matrix matrix0, long v, @NotNull Rect rect0, @NotNull Rect rect1, float f) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        float f1 = Math.max(Math.max(rect0.getWidth() / (rect0.getWidth() - (rect1.getLeft() - rect0.getLeft()) * 2.0f), rect0.getWidth() / (rect0.getWidth() - (rect0.getRight() - rect1.getRight()) * 2.0f)), Math.max(rect0.getHeight() / (rect0.getHeight() - (rect1.getTop() - rect0.getTop()) * 2.0f), rect0.getHeight() / (rect0.getHeight() - 2.0f * (rect0.getBottom() - rect1.getBottom()))));
        if(f1 < 0.0f) {
            f1 = 1.0f;
        }
        return MatrixExtensionKt.buildMatrix(matrix0, new d(f1, v, f));
    }

    @NotNull
    public final Matrix fitMatrixIntoImage(@NotNull Matrix matrix0, @NotNull Rect rect0, @NotNull Rect rect1, float f) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        Rect rect2 = RectExtensionKt.mapRect(MatrixExtensionKt.invert(matrix0), rect0);
        Rect rect3 = rect2.translate-k-4lQ0M(Offset.minus-MK-Hz9U(rect1.getCenter-F1C5BW0(), rect2.getCenter-F1C5BW0()));
        Matrix matrix1 = this.adjustScaleIntoImage-YqVAtuI(matrix0, rect3.getCenter-F1C5BW0(), rect3, rect1, f);
        long v = OffsetExtensionKt.mapVector-Uv8p0NA(matrix1, ImageGestureController.a(RectExtensionKt.mapRect(MatrixExtensionKt.invert(matrix1), rect0), rect1));
        matrix1.postTranslate(Offset.getX-impl(v) - rect0.getLeft(), Offset.getY-impl(v) - rect0.getTop());
        return matrix1;
    }

    public final long getMovableOffset-qto3Fdw(long v, @NotNull Rect rect0, @NotNull Rect rect1) {
        Intrinsics.checkNotNullParameter(rect0, "cropRect");
        Intrinsics.checkNotNullParameter(rect1, "imageRect");
        long v1 = Size.times-7Ah8Wj8(SizeKt.Size(rect0.getWidth(), rect0.getHeight()), 0.166667f);
        long v2 = ImageGestureController.a(rect0, rect1);
        long v3 = ImageGestureController.a(rect0.translate-k-4lQ0M(Offset.unaryMinus-F1C5BW0(v)), rect1);
        if(!Offset.equals-impl0(v3, 0L)) {
            RubberBand rubberBand0 = RubberBand.INSTANCE;
            long v4 = rubberBand0.calculateBandOffset-ywzJ3js(v2, v1);
            float f = Offset.getX-impl(v3);
            Float float0 = f;
            Float float1 = null;
            if(f == 0.0f) {
                float0 = null;
            }
            float f1 = float0 == null ? -Offset.getX-impl(v) : ((float)float0);
            float f2 = Offset.getY-impl(v3);
            Float float2 = f2;
            if(f2 != 0.0f) {
                float1 = float2;
            }
            long v5 = rubberBand0.calculateBandOffset-ywzJ3js(OffsetKt.Offset(f1, (float1 == null ? -Offset.getY-impl(v) : ((float)float1))), v1);
            float f3 = Offset.getX-impl(v5) < 0.0f ? Math.max(Offset.getX-impl(v5), -Size.getWidth-impl(v1)) : Math.min(Offset.getX-impl(v5), Size.getWidth-impl(v1));
            float f4 = Offset.getY-impl(v5);
            float f5 = Size.getHeight-impl(v1);
            return Float.compare(Offset.getY-impl(v5), 0.0f) >= 0 ? Offset.minus-MK-Hz9U(v4, OffsetKt.Offset(f3, Math.min(f4, f5))) : Offset.minus-MK-Hz9U(v4, OffsetKt.Offset(f3, Math.max(f4, -f5)));
        }
        return v;
    }
}

