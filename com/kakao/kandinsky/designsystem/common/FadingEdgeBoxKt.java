package com.kakao.kandinsky.designsystem.common;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import ca.u;
import ca.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\u001A2\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A2\u0010\t\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"horizontalFadingEdge", "Landroidx/compose/ui/Modifier;", "fadingEdgeSize", "Landroidx/compose/ui/unit/Dp;", "fadingLeft", "", "fadingRight", "horizontalFadingEdge-ziNgDLE", "(Landroidx/compose/ui/Modifier;FZZ)Landroidx/compose/ui/Modifier;", "verticalFadingEdge", "fadingTop", "fadingBottom", "verticalFadingEdge-ziNgDLE", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFadingEdgeBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FadingEdgeBox.kt\ncom/kakao/kandinsky/designsystem/common/FadingEdgeBoxKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n148#2:52\n148#2:53\n*S KotlinDebug\n*F\n+ 1 FadingEdgeBox.kt\ncom/kakao/kandinsky/designsystem/common/FadingEdgeBoxKt\n*L\n14#1:52\n33#1:53\n*E\n"})
public final class FadingEdgeBoxKt {
    @NotNull
    public static final Modifier horizontalFadingEdge-ziNgDLE(@NotNull Modifier modifier0, float f, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$horizontalFadingEdge");
        return DrawModifierKt.drawWithCache(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 1, 0xFFFF, null), new u(f, z, z1));
    }

    public static Modifier horizontalFadingEdge-ziNgDLE$default(Modifier modifier0, float f, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 4.0f;
        }
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        return FadingEdgeBoxKt.horizontalFadingEdge-ziNgDLE(modifier0, f, z, z1);
    }

    @NotNull
    public static final Modifier verticalFadingEdge-ziNgDLE(@NotNull Modifier modifier0, float f, boolean z, boolean z1) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$verticalFadingEdge");
        return DrawModifierKt.drawWithCache(GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 1, 0xFFFF, null), new w(f, z, z1));
    }

    public static Modifier verticalFadingEdge-ziNgDLE$default(Modifier modifier0, float f, boolean z, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 4.0f;
        }
        if((v & 2) != 0) {
            z = true;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        return FadingEdgeBoxKt.verticalFadingEdge-ziNgDLE(modifier0, f, z, z1);
    }
}

