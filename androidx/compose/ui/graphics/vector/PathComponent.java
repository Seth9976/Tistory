package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u1.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001A\u00020\u0005*\u00020\u0004H\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\t\u0010\nR*\u0010\u0011\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\n\"\u0004\b\u000F\u0010\u0010R.\u0010\u0019\u001A\u0004\u0018\u00010\u00122\b\u0010\u000B\u001A\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R6\u0010*\u001A\b\u0012\u0004\u0012\u00020#0\"2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020#0\"8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)R0\u00102\u001A\u00020+2\u0006\u0010\u000B\u001A\u00020+8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00106\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u0010\u001C\u001A\u0004\b4\u0010\u001E\"\u0004\b5\u0010 R*\u0010:\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b7\u0010\u001C\u001A\u0004\b8\u0010\u001E\"\u0004\b9\u0010 R.\u0010>\u001A\u0004\u0018\u00010\u00122\b\u0010\u000B\u001A\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010\u0014\u001A\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u0018R0\u0010C\u001A\u00020?2\u0006\u0010\u000B\u001A\u00020?8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b@\u0010-\u001A\u0004\bA\u0010/\"\u0004\bB\u00101R0\u0010H\u001A\u00020D2\u0006\u0010\u000B\u001A\u00020D8\u0006@FX\u0086\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bE\u0010-\u001A\u0004\bF\u0010/\"\u0004\bG\u00101R*\u0010L\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010\u001C\u001A\u0004\bJ\u0010\u001E\"\u0004\bK\u0010 R*\u0010P\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bM\u0010\u001C\u001A\u0004\bN\u0010\u001E\"\u0004\bO\u0010 R*\u0010T\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010\u001C\u001A\u0004\bR\u0010\u001E\"\u0004\bS\u0010 R*\u0010X\u001A\u00020\u001A2\u0006\u0010\u000B\u001A\u00020\u001A8\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010\u001C\u001A\u0004\bV\u0010\u001E\"\u0004\bW\u0010 \u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Y"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "value", "b", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/Brush;", "c", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "e", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "f", "I", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "pathFillType", "g", "getStrokeAlpha", "setStrokeAlpha", "strokeAlpha", "h", "getStrokeLineWidth", "setStrokeLineWidth", "strokeLineWidth", "i", "getStroke", "setStroke", "stroke", "Landroidx/compose/ui/graphics/StrokeCap;", "j", "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "k", "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineJoin", "l", "getStrokeLineMiter", "setStrokeLineMiter", "strokeLineMiter", "m", "getTrimPathStart", "setTrimPathStart", "trimPathStart", "n", "getTrimPathEnd", "setTrimPathEnd", "trimPathEnd", "o", "getTrimPathOffset", "setTrimPathOffset", "trimPathOffset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
public final class PathComponent extends VNode {
    public static final int $stable = 8;
    public String b;
    public Brush c;
    public float d;
    public List e;
    public int f;
    public float g;
    public float h;
    public Brush i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Stroke s;
    public final Path t;
    public Path u;
    public final Lazy v;

    public PathComponent() {
        super(null);
        this.b = "";
        this.d = 1.0f;
        this.e = VectorKt.getEmptyPath();
        this.f = 0;
        this.g = 1.0f;
        this.j = 0;
        this.k = 0;
        this.l = 4.0f;
        this.n = 1.0f;
        this.p = true;
        this.q = true;
        Path path0 = AndroidPath_androidKt.Path();
        this.t = path0;
        this.u = path0;
        this.v = c.lazy(LazyThreadSafetyMode.NONE, a.x);
    }

    public final void a() {
        Path path0 = this.t;
        if(Float.compare(this.m, 0.0f) == 0 && this.n == 1.0f) {
            this.u = path0;
            return;
        }
        if(Intrinsics.areEqual(this.u, path0)) {
            this.u = AndroidPath_androidKt.Path();
        }
        else {
            int v = this.u.getFillType-Rg-k1Os();
            this.u.rewind();
            this.u.setFillType-oQ8Xj4U(v);
        }
        Lazy lazy0 = this.v;
        ((PathMeasure)lazy0.getValue()).setPath(path0, false);
        float f = ((PathMeasure)lazy0.getValue()).getLength();
        float f1 = (this.m + this.o) % 1.0f * f;
        float f2 = (this.n + this.o) % 1.0f * f;
        if(Float.compare(f1, f2) > 0) {
            ((PathMeasure)lazy0.getValue()).getSegment(f1, f, this.u, true);
            ((PathMeasure)lazy0.getValue()).getSegment(0.0f, f2, this.u, true);
            return;
        }
        ((PathMeasure)lazy0.getValue()).getSegment(f1, f2, this.u, true);
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope0) {
        if(this.p) {
            PathParserKt.toPath(this.e, this.t);
            this.a();
        }
        else if(this.r) {
            this.a();
        }
        this.p = false;
        this.r = false;
        Brush brush0 = this.c;
        if(brush0 != null) {
            DrawScope.drawPath-GBMwjPU$default(drawScope0, this.u, brush0, this.d, null, null, 0, 56, null);
        }
        Brush brush1 = this.i;
        if(brush1 != null) {
            Stroke stroke0 = this.s;
            if(this.q || stroke0 == null) {
                stroke0 = new Stroke(this.h, this.l, this.j, this.k, null, 16, null);
                this.s = stroke0;
                this.q = false;
            }
            DrawScope.drawPath-GBMwjPU$default(drawScope0, this.u, brush1, this.g, stroke0, null, 0, 0x30, null);
        }
    }

    @Nullable
    public final Brush getFill() {
        return this.c;
    }

    public final float getFillAlpha() {
        return this.d;
    }

    @NotNull
    public final String getName() {
        return this.b;
    }

    @NotNull
    public final List getPathData() {
        return this.e;
    }

    public final int getPathFillType-Rg-k1Os() {
        return this.f;
    }

    @Nullable
    public final Brush getStroke() {
        return this.i;
    }

    public final float getStrokeAlpha() {
        return this.g;
    }

    public final int getStrokeLineCap-KaPHkGw() {
        return this.j;
    }

    public final int getStrokeLineJoin-LxFBmk8() {
        return this.k;
    }

    public final float getStrokeLineMiter() {
        return this.l;
    }

    public final float getStrokeLineWidth() {
        return this.h;
    }

    public final float getTrimPathEnd() {
        return this.n;
    }

    public final float getTrimPathOffset() {
        return this.o;
    }

    public final float getTrimPathStart() {
        return this.m;
    }

    public final void setFill(@Nullable Brush brush0) {
        this.c = brush0;
        this.invalidate();
    }

    public final void setFillAlpha(float f) {
        this.d = f;
        this.invalidate();
    }

    public final void setName(@NotNull String s) {
        this.b = s;
        this.invalidate();
    }

    public final void setPathData(@NotNull List list0) {
        this.e = list0;
        this.p = true;
        this.invalidate();
    }

    public final void setPathFillType-oQ8Xj4U(int v) {
        this.f = v;
        this.u.setFillType-oQ8Xj4U(v);
        this.invalidate();
    }

    public final void setStroke(@Nullable Brush brush0) {
        this.i = brush0;
        this.invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.g = f;
        this.invalidate();
    }

    public final void setStrokeLineCap-BeK7IIE(int v) {
        this.j = v;
        this.q = true;
        this.invalidate();
    }

    public final void setStrokeLineJoin-Ww9F2mQ(int v) {
        this.k = v;
        this.q = true;
        this.invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.l = f;
        this.q = true;
        this.invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.h = f;
        this.q = true;
        this.invalidate();
    }

    public final void setTrimPathEnd(float f) {
        this.n = f;
        this.r = true;
        this.invalidate();
    }

    public final void setTrimPathOffset(float f) {
        this.o = f;
        this.r = true;
        this.invalidate();
    }

    public final void setTrimPathStart(float f) {
        this.m = f;
        this.r = true;
        this.invalidate();
    }

    @Override
    @NotNull
    public String toString() {
        return this.t.toString();
    }
}

