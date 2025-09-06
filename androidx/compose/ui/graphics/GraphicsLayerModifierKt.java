package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A%\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00A2\u0006\u0002\b\u0006H\u0007\u001A\u0098\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019\u001A\u00A4\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001BH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001D\u001A\u00B8\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001F2\b\b\u0002\u0010 \u001A\u00020\u001FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b!\u0010\"\u001A\u00C2\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00172\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u001E\u001A\u00020\u001F2\b\b\u0002\u0010 \u001A\u00020\u001F2\b\b\u0002\u0010#\u001A\u00020$H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&\u001A\f\u0010\'\u001A\u00020\u0001*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006("}, d2 = {"graphicsLayer", "Landroidx/compose/ui/Modifier;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "graphicsLayer-2Xn7asI", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;)Landroidx/compose/ui/Modifier;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "graphicsLayer-pANQ8Wg", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJ)Landroidx/compose/ui/Modifier;", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "graphicsLayer-Ap8cVGQ", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class GraphicsLayerModifierKt {
    @Stable
    @NotNull
    public static final Modifier graphicsLayer(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        return modifier0.then(new BlockGraphicsLayerElement(function10));
    }

    // 去混淆评级： 中等(60)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier graphicsLayer-2Xn7asI(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0) {
        return GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, 0xFF00000000000000L, 0xFF00000000000000L, 0);
    }

    public static Modifier graphicsLayer-2Xn7asI$default(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, int v1, Object object0) {
        float f10 = 1.0f;
        float f11 = (v1 & 1) == 0 ? f : 1.0f;
        float f12 = (v1 & 2) == 0 ? f1 : 1.0f;
        if((v1 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v1 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v1 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v1 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v1 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v1 & 0x80) == 0 ? f7 : 0.0f;
        if((v1 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v1 & 0x200) == 0 ? f9 : 8.0f;
        long v2 = (v1 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v1 & 0x800) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        boolean z1 = (v1 & 0x1000) == 0 ? z : false;
        return (v1 & 0x2000) == 0 ? GraphicsLayerModifierKt.graphicsLayer-2Xn7asI(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z1, renderEffect0) : GraphicsLayerModifierKt.graphicsLayer-2Xn7asI(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z1, null);
    }

    @Stable
    @NotNull
    public static final Modifier graphicsLayer-Ap8cVGQ(@NotNull Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, @NotNull Shape shape0, boolean z, @Nullable RenderEffect renderEffect0, long v1, long v2, int v3) {
        return modifier0.then(new GraphicsLayerElement(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, v3));
    }

    public static Modifier graphicsLayer-Ap8cVGQ$default(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, int v4, Object object0) {
        float f10 = 1.0f;
        float f11 = (v4 & 1) == 0 ? f : 1.0f;
        float f12 = (v4 & 2) == 0 ? f1 : 1.0f;
        if((v4 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v4 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v4 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v4 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v4 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v4 & 0x80) == 0 ? f7 : 0.0f;
        if((v4 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v4 & 0x200) == 0 ? f9 : 8.0f;
        long v5 = (v4 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v4 & 0x800) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        boolean z1 = (v4 & 0x1000) == 0 ? z : false;
        RenderEffect renderEffect1 = (v4 & 0x2000) == 0 ? renderEffect0 : null;
        long v6 = (v4 & 0x4000) == 0 ? v1 : 0xFF00000000000000L;
        long v7 = (v4 & 0x8000) == 0 ? v2 : 0xFF00000000000000L;
        return (v4 & 0x10000) == 0 ? GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v5, shape1, z1, renderEffect1, v6, v7, v3) : GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v5, shape1, z1, renderEffect1, v6, v7, 0);
    }

    // 去混淆评级： 低(20)
    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier graphicsLayer-pANQ8Wg(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2) {
        return GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, 0);
    }

    public static Modifier graphicsLayer-pANQ8Wg$default(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, Object object0) {
        float f10 = 1.0f;
        float f11 = (v3 & 1) == 0 ? f : 1.0f;
        float f12 = (v3 & 2) == 0 ? f1 : 1.0f;
        if((v3 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v3 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v3 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v3 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v3 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v3 & 0x80) == 0 ? f7 : 0.0f;
        if((v3 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v3 & 0x200) == 0 ? f9 : 8.0f;
        long v4 = (v3 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v3 & 0x800) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        boolean z1 = (v3 & 0x1000) == 0 ? z : false;
        RenderEffect renderEffect1 = (v3 & 0x2000) == 0 ? renderEffect0 : null;
        long v5 = (v3 & 0x4000) == 0 ? v1 : 0xFF00000000000000L;
        return (v3 & 0x8000) == 0 ? GraphicsLayerModifierKt.graphicsLayer-pANQ8Wg(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v4, shape1, z1, renderEffect1, v5, v2) : GraphicsLayerModifierKt.graphicsLayer-pANQ8Wg(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v4, shape1, z1, renderEffect1, v5, 0xFF00000000000000L);
    }

    @Stable
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    public static final Modifier graphicsLayer-sKFY_QE(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(modifier0, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, null, 0L, 0L, 0, 0x1C000, null);
    }

    public static Modifier graphicsLayer-sKFY_QE$default(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, int v1, Object object0) {
        float f10 = 1.0f;
        float f11 = (v1 & 1) == 0 ? f : 1.0f;
        float f12 = (v1 & 2) == 0 ? f1 : 1.0f;
        if((v1 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v1 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v1 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v1 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v1 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v1 & 0x80) == 0 ? f7 : 0.0f;
        if((v1 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v1 & 0x200) == 0 ? f9 : 8.0f;
        long v2 = (v1 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v1 & 0x800) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        return (v1 & 0x1000) == 0 ? GraphicsLayerModifierKt.graphicsLayer-sKFY_QE(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z) : GraphicsLayerModifierKt.graphicsLayer-sKFY_QE(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, false);
    }

    // 去混淆评级： 低(30)
    @Stable
    @NotNull
    public static final Modifier toolingGraphicsLayer(@NotNull Modifier modifier0) {
        return modifier0;
    }
}

