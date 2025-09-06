package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.text.selection.g1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import ca.c0;
import ca.x1;
import com.kakao.kandinsky.designsystem.util.Transform;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u001A$\u0010\u0005\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u0012\u0010\f\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001A\u00020\r\u001A\u0012\u0010\u000E\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000F\u001A\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"centerOffset", "Landroidx/compose/ui/Modifier;", "offsetProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "dim", "dimColor", "Landroidx/compose/ui/graphics/Color;", "clearRect", "Landroidx/compose/ui/geometry/Rect;", "dim-bw27NRU", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/Modifier;", "enabled", "", "graphicsLayer", "transform", "Lcom/kakao/kandinsky/designsystem/util/Transform;", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ModifierKt {
    @NotNull
    public static final Modifier centerOffset(@NotNull Modifier modifier0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "offsetProvider");
        return LayoutModifierKt.layout(modifier0, new c0(function00, 1));
    }

    @NotNull
    public static final Modifier dim-bw27NRU(@NotNull Modifier modifier0, long v, @NotNull Rect rect0) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$dim");
        Intrinsics.checkNotNullParameter(rect0, "clearRect");
        return DrawModifierKt.drawWithContent(modifier0, new x1(v, rect0));
    }

    @NotNull
    public static final Modifier enabled(@NotNull Modifier modifier0, boolean z) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return z ? AlphaKt.alpha(modifier0, 1.0f) : AlphaKt.alpha(modifier0, 0.2f);
    }

    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier0, @NotNull Transform transform0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(transform0, "transform");
        return GraphicsLayerModifierKt.graphicsLayer(modifier0, new g1(transform0, 17));
    }
}

