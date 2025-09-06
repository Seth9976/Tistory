package com.kakao.tistory.presentation.design.ui.thumbnail;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001J*\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/design/ui/thumbnail/BlogShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogShape implements Shape {
    public static final int $stable;
    @NotNull
    public static final BlogShape INSTANCE;

    static {
        BlogShape.INSTANCE = new BlogShape();
    }

    @Override  // androidx.compose.ui.graphics.Shape
    @NotNull
    public Outline createOutline-Pq9zytI(long v, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(density0, "density");
        Path path0 = AndroidPath_androidKt.Path();
        float f = Size.getWidth-impl(v);
        float f1 = Size.getHeight-impl(v);
        path0.moveTo(f, f1 / 2.0f);
        path0.cubicTo(f, 0.868056f * f1, 0.868056f * f, f1, f / 2.0f, f1);
        path0.cubicTo(f * 0.131944f, f1, 0.0f, 0.868056f * f1, 0.0f, f1 / 2.0f);
        path0.cubicTo(0.0f, f1 * 0.131944f, f * 0.131944f, 0.0f, f / 2.0f, 0.0f);
        path0.cubicTo(0.868056f * f, 0.0f, f, f1 * 0.131944f, f, f1 / 2.0f);
        return new Generic(path0);
    }
}

