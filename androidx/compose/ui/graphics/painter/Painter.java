package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001A\u00020\u0005*\u00020\u0004H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u000F\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0019\u001A\u00020\u0005*\u00020\u00042\u0006\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001C\u001A\u00020\u00158&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/geometry/Size;", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "draw", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,218:1\n68#2,3:219\n256#2:222\n72#2,3:230\n111#3,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n195#1:219,3\n206#1:222\n195#1:230,3\n207#1:223,7\n*E\n"})
public abstract class Painter {
    public Paint a;
    public boolean b;
    public ColorFilter c;
    public float d;
    public LayoutDirection e;

    public Painter() {
        this.d = 1.0f;
        this.e = LayoutDirection.Ltr;
        new h1(this, 7);
    }

    public boolean applyAlpha(float f) {
        return false;
    }

    public boolean applyColorFilter(@Nullable ColorFilter colorFilter0) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection0) {
        return false;
    }

    public final void draw-x_KDEd0(@NotNull DrawScope drawScope0, long v, float f, @Nullable ColorFilter colorFilter0) {
        if(Float.compare(this.d, f) != 0) {
            if(!this.applyAlpha(f)) {
                if(f == 1.0f) {
                    Paint paint0 = this.a;
                    if(paint0 != null) {
                        paint0.setAlpha(1.0f);
                    }
                    this.b = false;
                }
                else {
                    Paint paint1 = this.a;
                    if(paint1 == null) {
                        paint1 = AndroidPaint_androidKt.Paint();
                        this.a = paint1;
                    }
                    paint1.setAlpha(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if(!Intrinsics.areEqual(this.c, colorFilter0)) {
            if(!this.applyColorFilter(colorFilter0)) {
                if(colorFilter0 == null) {
                    Paint paint2 = this.a;
                    if(paint2 != null) {
                        paint2.setColorFilter(null);
                    }
                    this.b = false;
                }
                else {
                    Paint paint3 = this.a;
                    if(paint3 == null) {
                        paint3 = AndroidPaint_androidKt.Paint();
                        this.a = paint3;
                    }
                    paint3.setColorFilter(colorFilter0);
                    this.b = true;
                }
            }
            this.c = colorFilter0;
        }
        LayoutDirection layoutDirection0 = drawScope0.getLayoutDirection();
        if(this.e != layoutDirection0) {
            this.applyLayoutDirection(layoutDirection0);
            this.e = layoutDirection0;
        }
        float f1 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc()) - Size.getWidth-impl(v);
        float f2 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc()) - Size.getHeight-impl(v);
        drawScope0.getDrawContext().getTransform().inset(0.0f, 0.0f, f1, f2);
        try {
            if(Float.compare(f, 0.0f) > 0 && (Size.getWidth-impl(v) > 0.0f && Size.getHeight-impl(v) > 0.0f)) {
                if(this.b) {
                    Rect rect0 = RectKt.Rect-tz77jQw(0L, SizeKt.Size(Size.getWidth-impl(v), Size.getHeight-impl(v)));
                    Canvas canvas0 = drawScope0.getDrawContext().getCanvas();
                    Paint paint4 = this.a;
                    if(paint4 == null) {
                        paint4 = AndroidPaint_androidKt.Paint();
                        this.a = paint4;
                    }
                    try {
                        canvas0.saveLayer(rect0, paint4);
                        this.onDraw(drawScope0);
                    }
                    catch(Throwable throwable0) {
                        canvas0.restore();
                        throw throwable0;
                    }
                    canvas0.restore();
                }
                else {
                    this.onDraw(drawScope0);
                }
            }
        }
        finally {
            drawScope0.getDrawContext().getTransform().inset(-0.0f, -0.0f, -f1, -f2);
        }
    }

    public static void draw-x_KDEd0$default(Painter painter0, DrawScope drawScope0, long v, float f, ColorFilter colorFilter0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if((v1 & 2) != 0) {
            f = 1.0f;
        }
        if((v1 & 4) != 0) {
            colorFilter0 = null;
        }
        painter0.draw-x_KDEd0(drawScope0, v, f, colorFilter0);
    }

    public abstract long getIntrinsicSize-NH-jbRc();

    public abstract void onDraw(@NotNull DrawScope arg1);
}

