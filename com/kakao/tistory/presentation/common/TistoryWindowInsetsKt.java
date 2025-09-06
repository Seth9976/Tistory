package com.kakao.tistory.presentation.common;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A:\u0010\u0005\u001A\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000E\u001A\u001C\u0010\u000F\u001A\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"getBottomInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "isModalBottomSheet", "", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "bottomInsetsHeight", "Landroidx/compose/ui/Modifier;", "height", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "shape", "Landroidx/compose/ui/graphics/Shape;", "bottomInsetsHeight-JKjFIXU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "topInsetsHeight", "topInsetsHeight-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TistoryWindowInsetsKt {
    @NotNull
    public static final Modifier bottomInsetsHeight-JKjFIXU(@NotNull Modifier modifier0, float f, long v, @NotNull Shape shape0, boolean z) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$bottomInsetsHeight");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        return ComposedModifierKt.composed$default(modifier0, null, new g(z, f, v, shape0), 1, null);
    }

    public static Modifier bottomInsetsHeight-JKjFIXU$default(Modifier modifier0, float f, long v, Shape shape0, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = Color.Companion.getTransparent-0d7_KjU();
        }
        if((v1 & 4) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        if((v1 & 8) != 0) {
            z = false;
        }
        return TistoryWindowInsetsKt.bottomInsetsHeight-JKjFIXU(modifier0, f, v, shape0, z);
    }

    @Composable
    @NotNull
    public static final WindowInsets getBottomInsets(boolean z, @Nullable Composer composer0, int v) {
        WindowInsets windowInsets0;
        composer0.startReplaceGroup(1907533954);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1907533954, v, -1, "com.kakao.tistory.presentation.common.getBottomInsets (TistoryWindowInsets.kt:35)");
        }
        if(z) {
            composer0.startReplaceGroup(-1738950835);
            windowInsets0 = TistoryWindowInsets.INSTANCE.getModalBottom(composer0, 6);
        }
        else {
            composer0.startReplaceGroup(0x9859BBE8);
            windowInsets0 = TistoryWindowInsets.INSTANCE.getBottom(composer0, 6);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return windowInsets0;
    }

    @NotNull
    public static final Modifier topInsetsHeight-3ABfNKs(@NotNull Modifier modifier0, float f) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$topInsetsHeight");
        return ComposedModifierKt.composed$default(modifier0, null, new h(f), 1, null);
    }
}

