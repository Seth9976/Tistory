package androidx.compose.ui.graphics;

import android.graphics.Canvas.VertexMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0005"}, d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidVertexMode_androidKt {
    // 去混淆评级： 低(20)
    @NotNull
    public static final Canvas.VertexMode toAndroidVertexMode-JOOmi9M(int v) {
        if(VertexMode.equals-impl0(v, 0)) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if(VertexMode.equals-impl0(v, 1)) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        return VertexMode.equals-impl0(v, 2) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}

