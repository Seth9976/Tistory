package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u.q0;
import u.s0;
import u.t0;
import u.u0;
import u.v0;
import u.w0;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001A\b\u0000\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tR0\u0010\u0011\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\u00028\u0006@FX\u0086\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R*\u0010\u0018\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u00048\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001F\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u00068\u0006@FX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001E\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "widthParameter", "Landroidx/compose/ui/graphics/Brush;", "brushParameter", "Landroidx/compose/ui/graphics/Shape;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "value", "q", "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "width", "r", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "brush", "s", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,516:1\n386#2,26:517\n412#2,4:544\n421#2,6:557\n427#2:589\n428#2,2:598\n1#3:543\n546#4,9:548\n555#4,8:590\n128#5,3:563\n184#5,6:566\n272#5,14:572\n132#5,3:586\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n263#1:517,26\n263#1:544,4\n263#1:557,6\n263#1:589\n263#1:598,2\n263#1:543\n263#1:548,9\n263#1:590,8\n269#1:563,3\n281#1:566,6\n281#1:572,14\n269#1:586,3\n*E\n"})
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    public q0 p;
    public float q;
    public Brush r;
    public Shape s;
    public final CacheDrawModifierNode t;

    public BorderModifierNode(float f, Brush brush0, Shape shape0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.q = f;
        this.r = brush0;
        this.s = shape0;
        this.t = (CacheDrawModifierNode)this.delegate(DrawModifierKt.CacheDrawModifierNode(new w0(this)));
    }

    public static final DrawResult access$drawGenericBorder(BorderModifierNode borderModifierNode0, CacheDrawScope cacheDrawScope0, Brush brush0, Generic outline$Generic0, boolean z, float f) {
        long v7;
        DrawContext drawContext1;
        float f3;
        Stroke stroke0;
        Canvas canvas1;
        ImageBitmap imageBitmap1;
        ColorFilter colorFilter0;
        int v1;
        ImageBitmapConfig imageBitmapConfig0 = null;
        borderModifierNode0.getClass();
        if(z) {
            return cacheDrawScope0.onDrawWithContent(new s0(outline$Generic0, brush0));
        }
        if(brush0 instanceof SolidColor) {
            long v = ((SolidColor)brush0).getValue-0d7_KjU();
            v1 = 1;
            colorFilter0 = Companion.tint-xETnrds$default(ColorFilter.Companion, v, 0, 2, null);
        }
        else {
            v1 = 0;
            colorFilter0 = null;
        }
        Rect rect0 = outline$Generic0.getPath().getBounds();
        if(borderModifierNode0.p == null) {
            borderModifierNode0.p = new q0();
        }
        q0 q00 = borderModifierNode0.p;
        Intrinsics.checkNotNull(q00);
        Path path0 = q00.d;
        if(path0 == null) {
            path0 = AndroidPath_androidKt.Path();
            q00.d = path0;
        }
        path0.reset();
        Path.addRect$default(path0, rect0, null, 2, null);
        path0.op-N5in7k0(path0, outline$Generic0.getPath(), 0);
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        long v2 = IntSizeKt.IntSize(((int)(((float)Math.ceil(rect0.getWidth())))), ((int)(((float)Math.ceil(rect0.getHeight())))));
        q0 q01 = borderModifierNode0.p;
        Intrinsics.checkNotNull(q01);
        ImageBitmap imageBitmap0 = q01.a;
        Canvas canvas0 = q01.b;
        ImageBitmapConfig imageBitmapConfig1 = imageBitmap0 == null ? null : ImageBitmapConfig.box-impl(imageBitmap0.getConfig-_sVssgQ());
        boolean z1 = false;
        if((imageBitmapConfig1 == null ? false : ImageBitmapConfig.equals-impl0(imageBitmapConfig1.unbox-impl(), 0))) {
            z1 = true;
        }
        else {
            if(imageBitmap0 != null) {
                imageBitmapConfig0 = ImageBitmapConfig.box-impl(imageBitmap0.getConfig-_sVssgQ());
            }
            if(ImageBitmapConfig.equals-impl(v1, imageBitmapConfig0)) {
                z1 = true;
            }
        }
        if(imageBitmap0 == null || canvas0 == null || Size.getWidth-impl(cacheDrawScope0.getSize-NH-jbRc()) > ((float)imageBitmap0.getWidth()) || Size.getHeight-impl(cacheDrawScope0.getSize-NH-jbRc()) > ((float)imageBitmap0.getHeight()) || !z1) {
            ImageBitmap imageBitmap2 = ImageBitmapKt.ImageBitmap-x__-hDU$default(IntSize.getWidth-impl(v2), IntSize.getHeight-impl(v2), v1, false, null, 24, null);
            q01.a = imageBitmap2;
            Canvas canvas2 = CanvasKt.Canvas(imageBitmap2);
            q01.b = canvas2;
            imageBitmap1 = imageBitmap2;
            canvas1 = canvas2;
        }
        else {
            imageBitmap1 = imageBitmap0;
            canvas1 = canvas0;
        }
        CanvasDrawScope canvasDrawScope0 = q01.c;
        if(canvasDrawScope0 == null) {
            canvasDrawScope0 = new CanvasDrawScope();
            q01.c = canvasDrawScope0;
        }
        long v3 = IntSizeKt.toSize-ozmzZPI(v2);
        LayoutDirection layoutDirection0 = cacheDrawScope0.getLayoutDirection();
        DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
        Density density0 = canvasDrawScope$DrawParams0.component1();
        LayoutDirection layoutDirection1 = canvasDrawScope$DrawParams0.component2();
        Canvas canvas3 = canvasDrawScope$DrawParams0.component3();
        long v4 = canvasDrawScope$DrawParams0.component4-NH-jbRc();
        DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(cacheDrawScope0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas1);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(v3);
        canvas1.save();
        DrawScope.drawRect-n-J9OG0$default(canvasDrawScope0, 0xFF00000000000000L, 0L, v3, 0.0f, null, null, 0, 58, null);
        float f1 = rect0.getLeft();
        float f2 = -rect0.getTop();
        canvasDrawScope0.getDrawContext().getTransform().translate(-f1, f2);
        try {
            stroke0 = new Stroke(f * 2.0f, 0.0f, 0, 0, null, 30, null);
        }
        catch(Throwable throwable0) {
            f3 = -f1;
            goto label_104;
        }
        try {
            DrawScope.drawPath-GBMwjPU$default(canvasDrawScope0, outline$Generic0.getPath(), brush0, 0.0f, stroke0, null, 0, 52, null);
            float f4 = (Size.getWidth-impl(canvasDrawScope0.getSize-NH-jbRc()) + 1.0f) / Size.getWidth-impl(canvasDrawScope0.getSize-NH-jbRc());
            float f5 = (Size.getHeight-impl(canvasDrawScope0.getSize-NH-jbRc()) + 1.0f) / Size.getHeight-impl(canvasDrawScope0.getSize-NH-jbRc());
            long v5 = canvasDrawScope0.getCenter-F1C5BW0();
            DrawContext drawContext0 = canvasDrawScope0.getDrawContext();
            long v6 = drawContext0.getSize-NH-jbRc();
            drawContext0.getCanvas().save();
            try {
                drawContext0.getTransform().scale-0AR0LA0(f4, f5, v5);
                drawContext1 = drawContext0;
            }
            catch(Throwable throwable1) {
                v7 = v6;
                drawContext1 = drawContext0;
                f3 = -f1;
                goto label_94;
            }
            try {
                DrawScope.drawPath-GBMwjPU$default(canvasDrawScope0, path0, brush0, 0.0f, null, null, 0, 28, null);
                goto label_99;
            }
            catch(Throwable throwable1) {
                f3 = -f1;
                v7 = v6;
            }
            try {
            label_94:
                drawContext1.getCanvas().restore();
                drawContext1.setSize-uvyYCjk(v7);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                goto label_104;
            }
        label_99:
            drawContext1.getCanvas().restore();
            drawContext1.setSize-uvyYCjk(v6);
            goto label_106;
        }
        catch(Throwable throwable0) {
            f3 = -f1;
        }
    label_104:
        canvasDrawScope0.getDrawContext().getTransform().translate(-f3, -f2);
        throw throwable0;
    label_106:
        canvasDrawScope0.getDrawContext().getTransform().translate(--f1, -f2);
        canvas1.restore();
        DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(density0);
        canvasDrawScope$DrawParams2.setLayoutDirection(layoutDirection1);
        canvasDrawScope$DrawParams2.setCanvas(canvas3);
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(v4);
        imageBitmap1.prepareToDraw();
        ref$ObjectRef0.element = imageBitmap1;
        return cacheDrawScope0.onDrawWithContent(new t0(rect0, ref$ObjectRef0, v2, colorFilter0));
    }

    public static final DrawResult access$drawRoundRectBorder-JqoCqck(BorderModifierNode borderModifierNode0, CacheDrawScope cacheDrawScope0, Brush brush0, Rounded outline$Rounded0, long v, long v1, boolean z, float f) {
        borderModifierNode0.getClass();
        if(RoundRectKt.isSimple(outline$Rounded0.getRoundRect())) {
            return cacheDrawScope0.onDrawWithContent(new u0(z, brush0, outline$Rounded0.getRoundRect().getTopLeftCornerRadius-kKHJgLs(), f / 2.0f, f, v, v1, new Stroke(f, 0.0f, 0, 0, null, 30, null)));
        }
        if(borderModifierNode0.p == null) {
            borderModifierNode0.p = new q0();
        }
        q0 q00 = borderModifierNode0.p;
        Intrinsics.checkNotNull(q00);
        Path path0 = q00.d;
        if(path0 == null) {
            path0 = AndroidPath_androidKt.Path();
            q00.d = path0;
        }
        return cacheDrawScope0.onDrawWithContent(new v0(BorderKt.access$createRoundRectPath(path0, outline$Rounded0.getRoundRect(), f, z), brush0));
    }

    @NotNull
    public final Brush getBrush() {
        return this.r;
    }

    @NotNull
    public final Shape getShape() {
        return this.s;
    }

    public final float getWidth-D9Ej5fM() {
        return this.q;
    }

    public final void setBrush(@NotNull Brush brush0) {
        if(!Intrinsics.areEqual(this.r, brush0)) {
            this.r = brush0;
            this.t.invalidateDrawCache();
        }
    }

    public final void setShape(@NotNull Shape shape0) {
        if(!Intrinsics.areEqual(this.s, shape0)) {
            this.s = shape0;
            this.t.invalidateDrawCache();
        }
    }

    public final void setWidth-0680j_4(float f) {
        if(!Dp.equals-impl0(this.q, f)) {
            this.q = f;
            this.t.invalidateDrawCache();
        }
    }
}

