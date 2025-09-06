package com.kakao.kandinsky.crop.math;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.designsystem.util.OffsetExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0001\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0005¨\u0006\u0006"}, d2 = {"mapVertex", "Lcom/kakao/kandinsky/crop/math/RectVertex;", "Landroid/graphics/Matrix;", "vertex", "toVertex", "Landroidx/compose/ui/geometry/Rect;", "crop_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class RectVertexKt {
    @NotNull
    public static final RectVertex mapVertex(@NotNull Matrix matrix0, @NotNull RectVertex rectVertex0) {
        Intrinsics.checkNotNullParameter(matrix0, "<this>");
        Intrinsics.checkNotNullParameter(rectVertex0, "vertex");
        return new RectVertex(OffsetExtensionKt.mapOffset-Uv8p0NA(matrix0, rectVertex0.getTopLeft-F1C5BW0()), OffsetExtensionKt.mapOffset-Uv8p0NA(matrix0, rectVertex0.getTopRight-F1C5BW0()), OffsetExtensionKt.mapOffset-Uv8p0NA(matrix0, rectVertex0.getBottomRight-F1C5BW0()), OffsetExtensionKt.mapOffset-Uv8p0NA(matrix0, rectVertex0.getBottomLeft-F1C5BW0()), null);
    }

    @NotNull
    public static final RectVertex toVertex(@NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        return new RectVertex(rect0.getTopLeft-F1C5BW0(), rect0.getTopRight-F1C5BW0(), rect0.getBottomRight-F1C5BW0(), rect0.getBottomLeft-F1C5BW0(), null);
    }
}

