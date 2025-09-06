package com.kakao.kandinsky.decoration;

import android.graphics.Matrix;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import com.kakao.kandinsky.designsystem.util.RectExtensionKt;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J4\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\"\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0017\u0010\u001B\u001A\u00020\u00102\b\u0010\u0015\u001A\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0016J*\u0010\u001C\u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u00002\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001D\u001A\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\u0015\u0010 \u001A\u00020\u00102\u0006\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "T", "", "isInDisplayRect", "", "size", "Landroidx/compose/ui/geometry/Size;", "cropRect", "Landroidx/compose/ui/geometry/Rect;", "decorationMatrix", "Landroid/graphics/Matrix;", "draggingOffset", "Landroidx/compose/ui/geometry/Offset;", "isInDisplayRect-v05aCt0", "(JLandroidx/compose/ui/geometry/Rect;Landroid/graphics/Matrix;J)Z", "onClickEmptyArea", "", "offset", "onClickEmptyArea-k-4lQ0M", "(J)V", "onDelete", "decoration", "(Ljava/lang/Object;)V", "onDrag", "onDrag-Uv8p0NA", "(Ljava/lang/Object;J)V", "onOutOfImage", "onPress", "onScaleAndRotate", "matrix", "onScaleAndRotate-12SF9DM", "(Ljava/lang/Object;JLandroid/graphics/Matrix;)V", "onTap", "decoration_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface DecorationControllerInterface {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean isInDisplayRect-v05aCt0(@NotNull DecorationControllerInterface decorationControllerInterface0, long v, @NotNull Rect rect0, @NotNull Matrix matrix0, long v1) {
            Intrinsics.checkNotNullParameter(rect0, "cropRect");
            Intrinsics.checkNotNullParameter(matrix0, "decorationMatrix");
            return RectExtensionKt.mapRect(MatrixExtensionKt.buildMatrix(matrix0, new b(v1)), SizeKt.toRect-uvyYCjk(v).translate-k-4lQ0M(Offset.unaryMinus-F1C5BW0(SizeKt.getCenter-uvyYCjk(v)))).overlaps(rect0);
        }

        public static boolean isInDisplayRect-v05aCt0$default(DecorationControllerInterface decorationControllerInterface0, long v, Rect rect0, Matrix matrix0, long v1, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInDisplayRect-v05aCt0");
            }
            if((v2 & 8) != 0) {
                v1 = 0L;
            }
            return decorationControllerInterface0.isInDisplayRect-v05aCt0(v, rect0, matrix0, v1);
        }

        public static void onClickEmptyArea-k-4lQ0M(@NotNull DecorationControllerInterface decorationControllerInterface0, long v) {
        }

        public static void onDelete(@NotNull DecorationControllerInterface decorationControllerInterface0, Object object0) {
        }

        public static void onDrag-Uv8p0NA(@NotNull DecorationControllerInterface decorationControllerInterface0, Object object0, long v) {
        }

        public static void onOutOfImage(@NotNull DecorationControllerInterface decorationControllerInterface0, Object object0) {
        }

        public static void onPress(@NotNull DecorationControllerInterface decorationControllerInterface0, @Nullable Object object0) {
        }

        public static void onScaleAndRotate-12SF9DM(@NotNull DecorationControllerInterface decorationControllerInterface0, Object object0, long v, @NotNull Matrix matrix0) {
            Intrinsics.checkNotNullParameter(matrix0, "matrix");
        }

        public static void onTap(@NotNull DecorationControllerInterface decorationControllerInterface0, Object object0) {
        }
    }

    boolean isInDisplayRect-v05aCt0(long arg1, @NotNull Rect arg2, @NotNull Matrix arg3, long arg4);

    void onClickEmptyArea-k-4lQ0M(long arg1);

    void onDelete(Object arg1);

    void onDrag-Uv8p0NA(Object arg1, long arg2);

    void onOutOfImage(Object arg1);

    void onPress(@Nullable Object arg1);

    void onScaleAndRotate-12SF9DM(Object arg1, long arg2, @NotNull Matrix arg3);

    void onTap(Object arg1);
}

