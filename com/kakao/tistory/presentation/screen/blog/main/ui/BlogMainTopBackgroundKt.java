package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A$\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"drawTopBackground", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "size", "Landroidx/compose/ui/geometry/Size;", "drawTopBackground-cSwnlzA", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;J)Landroidx/compose/ui/draw/DrawResult;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainTopBackgroundKt {
    @NotNull
    public static final DrawResult drawTopBackground-cSwnlzA(@NotNull CacheDrawScope cacheDrawScope0, @NotNull Brush brush0, long v) {
        Intrinsics.checkNotNullParameter(cacheDrawScope0, "$this$drawTopBackground");
        Intrinsics.checkNotNullParameter(brush0, "brush");
        return cacheDrawScope0.onDrawBehind(new r3(brush0, v, new SolidColor(Color.copy-wmQWz5c$default(TColor.INSTANCE.getGray700-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null)));
    }
}

