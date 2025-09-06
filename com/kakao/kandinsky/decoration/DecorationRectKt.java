package com.kakao.kandinsky.decoration;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import com.kakao.kandinsky.designsystem.util.Transform;
import com.kakao.kandinsky.utils.NumberExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A0\u0010\n\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/geometry/Offset;", "transitionOffset", "scaleAndRotateOffset", "Lcom/kakao/kandinsky/decoration/DecorationRect;", "calculateDecorationRect-XBZSM3c", "(JLandroid/graphics/Matrix;JJ)Lcom/kakao/kandinsky/decoration/DecorationRect;", "calculateDecorationRect", "decoration_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDecorationRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecorationRect.kt\ncom/kakao/kandinsky/decoration/DecorationRectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class DecorationRectKt {
    @NotNull
    public static final DecorationRect calculateDecorationRect-XBZSM3c(long v, @NotNull Matrix matrix0, long v1, long v2) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        float f = 1.0f;
        if(Size.isEmpty-impl(v)) {
            return new DecorationRect(v1, 1.0f, 0.0f, 0x3F8000003F800000L, 0L, null);
        }
        long v3 = Size.div-7Ah8Wj8(v, 2.0f);
        long v4 = OffsetKt.Offset(Size.getWidth-impl(v3), Size.getHeight-impl(v3));
        long v5 = Offset.plus-MK-Hz9U(OffsetExtensionKt.mapVector-Uv8p0NA(matrix0, v4), v2);
        float f1 = Offset.getDistance-impl(v5);
        double f2 = (double)OffsetExtensionKt.atan2-k-4lQ0M(v4);
        long v6 = SizeKt.Size(Math.abs(((float)Math.cos(f2)) * (f1 * 2.0f)), Math.abs(f1 * 2.0f * ((float)Math.sin(f2))));
        Matrix matrix1 = new Matrix();
        Transform transform0 = MatrixTransformKt.getTransform(matrix0);
        matrix1.postScale((Float.compare(transform0.getScaleX(), 0.0f) >= 0 ? 1.0f : -1.0f), (transform0.getScaleY() < 0.0f ? -1.0f : 1.0f));
        float f3 = NumberExtensionKt.toDegrees(OffsetExtensionKt.atan2-k-4lQ0M(v5) - OffsetExtensionKt.atan2-k-4lQ0M(OffsetExtensionKt.mapVector-Uv8p0NA(matrix1, v4)));
        Transform transform1 = MatrixTransformKt.getTransform(matrix0);
        float f4 = transform1.getScaleX() < 0.0f ? -1.0f : 1.0f;
        if(transform1.getScaleY() < 0.0f) {
            f = -1.0f;
        }
        return new DecorationRect(Offset.plus-MK-Hz9U(OffsetExtensionKt.getTransition(matrix0), v1), Size.getWidth-impl(v6) / Size.getWidth-impl(v), f3, OffsetKt.Offset(f4, f), v5, null);
    }
}

