package androidx.compose.ui.graphics;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001C\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0005\u0010\u0003J\u000F\u0010\u0007\u001A\u00020\u0004H\u0000\u00A2\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000F\u001A\u00020\b8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER*\u0010\u0018\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001C\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001A\u0004\b\u001A\u0010\u0015\"\u0004\b\u001B\u0010\u0017R*\u0010 \u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\u001D\u0010\u0013\u001A\u0004\b\u001E\u0010\u0015\"\u0004\b\u001F\u0010\u0017R*\u0010$\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b!\u0010\u0013\u001A\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R*\u0010(\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b%\u0010\u0013\u001A\u0004\b&\u0010\u0015\"\u0004\b\'\u0010\u0017R*\u0010,\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010\u0013\u001A\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R0\u00104\u001A\u00020-2\u0006\u0010\u0011\u001A\u00020-8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R0\u00108\u001A\u00020-2\u0006\u0010\u0011\u001A\u00020-8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b5\u0010/\u001A\u0004\b6\u00101\"\u0004\b7\u00103R*\u0010<\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b9\u0010\u0013\u001A\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R*\u0010@\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b=\u0010\u0013\u001A\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R*\u0010D\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010\u0013\u001A\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017R*\u0010H\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00108\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bE\u0010\u0013\u001A\u0004\bF\u0010\u0015\"\u0004\bG\u0010\u0017R0\u0010M\u001A\u00020I2\u0006\u0010\u0011\u001A\u00020I8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bJ\u0010/\u001A\u0004\bK\u00101\"\u0004\bL\u00103R*\u0010U\u001A\u00020N2\u0006\u0010\u0011\u001A\u00020N8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010]\u001A\u00020V2\u0006\u0010\u0011\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\"\u0004\b[\u0010\\R0\u0010b\u001A\u00020^2\u0006\u0010\u0011\u001A\u00020^8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b_\u0010\n\u001A\u0004\b`\u0010\f\"\u0004\ba\u0010\u000ER(\u0010g\u001A\u00020c8\u0016@\u0016X\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bd\u0010/\u001A\u0004\be\u00101\"\u0004\bf\u00103R\"\u0010o\u001A\u00020h8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bi\u0010j\u001A\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001A\u00020p8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bq\u0010r\u001A\u0004\bs\u0010t\"\u0004\bu\u0010vR.\u0010\u007F\u001A\u0004\u0018\u00010x2\b\u0010\u0011\u001A\u0004\u0018\u00010x8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\by\u0010z\u001A\u0004\b{\u0010|\"\u0004\b}\u0010~R8\u0010\u0088\u0001\u001A\u0005\u0018\u00010\u0080\u00012\n\u0010\u0081\u0001\u001A\u0005\u0018\u00010\u0080\u00018\u0000@AX\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001A\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\u008A\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0089\u0001\u0010\u0015R\u0016\u0010\u008C\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u008B\u0001\u0010\u0015\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u008D\u0001"}, d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "<init>", "()V", "", "reset", "updateOutline$ui_release", "updateOutline", "", "a", "I", "getMutatedFields$ui_release", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "b", "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "c", "getScaleY", "setScaleY", "scaleY", "d", "getAlpha", "setAlpha", "alpha", "e", "getTranslationX", "setTranslationX", "translationX", "f", "getTranslationY", "setTranslationY", "translationY", "g", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "h", "J", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "ambientShadowColor", "i", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "j", "getRotationX", "setRotationX", "rotationX", "k", "getRotationY", "setRotationY", "rotationY", "l", "getRotationZ", "setRotationZ", "rotationZ", "m", "getCameraDistance", "setCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "n", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "o", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "", "p", "Z", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/CompositingStrategy;", "q", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "Landroidx/compose/ui/geometry/Size;", "r", "getSize-NH-jbRc", "setSize-uvyYCjk", "size", "Landroidx/compose/ui/unit/Density;", "s", "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "graphicsDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$ui_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$ui_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/graphics/RenderEffect;", "u", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "v", "Landroidx/compose/ui/graphics/Outline;", "getOutline$ui_release", "()Landroidx/compose/ui/graphics/Outline;", "setOutline$ui_release", "(Landroidx/compose/ui/graphics/Outline;)V", "outline", "getDensity", "density", "getFontScale", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    public static final int $stable;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public long h;
    public long i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public Shape o;
    public boolean p;
    public int q;
    public long r;
    public Density s;
    public LayoutDirection t;
    public RenderEffect u;
    public Outline v;

    public ReusableGraphicsLayerScope() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = 1.0f;
        this.h = 0xFF00000000000000L;
        this.i = 0xFF00000000000000L;
        this.m = 8.0f;
        this.n = 0x3F0000003F000000L;
        this.o = RectangleShapeKt.getRectangleShape();
        this.q = 0;
        this.r = 0x7FC000007FC00000L;
        this.s = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.t = LayoutDirection.Ltr;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.d;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long getAmbientShadowColor-0d7_KjU() {
        return this.h;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.m;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.p;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public int getCompositingStrategy--NrFUSI() {
        return this.q;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.s.getDensity();
    }

    @Override  // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.s.getFontScale();
    }

    @NotNull
    public final Density getGraphicsDensity$ui_release() {
        return this.s;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection$ui_release() {
        return this.t;
    }

    public final int getMutatedFields$ui_release() {
        return this.a;
    }

    @Nullable
    public final Outline getOutline$ui_release() {
        return this.v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.u;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.k;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.l;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.c;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.g;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    @NotNull
    public Shape getShape() {
        return this.o;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long getSize-NH-jbRc() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long getSpotShadowColor-0d7_KjU() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long getTransformOrigin-SzJe1aQ() {
        return this.n;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.e;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.f;
    }

    public final void reset() {
        this.setScaleX(1.0f);
        this.setScaleY(1.0f);
        this.setAlpha(1.0f);
        this.setTranslationX(0.0f);
        this.setTranslationY(0.0f);
        this.setShadowElevation(0.0f);
        this.setAmbientShadowColor-8_81llA(0L);
        this.setSpotShadowColor-8_81llA(0L);
        this.setRotationX(0.0f);
        this.setRotationY(0.0f);
        this.setRotationZ(0.0f);
        this.setCameraDistance(8.0f);
        this.setTransformOrigin-__ExYCQ(0x3F0000003F000000L);
        this.setShape(RectangleShapeKt.getRectangleShape());
        this.setClip(false);
        this.setRenderEffect(null);
        this.setCompositingStrategy-aDBOjCE(0);
        this.setSize-uvyYCjk(0x7FC000007FC00000L);
        this.v = null;
        this.a = 0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAlpha(float f) {
        if(this.d != f) {
            this.a |= 4;
            this.d = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setAmbientShadowColor-8_81llA(long v) {
        if(!Color.equals-impl0(this.h, v)) {
            this.a |= 0x40;
            this.h = v;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f) {
        if(this.m != f) {
            this.a |= 0x800;
            this.m = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setClip(boolean z) {
        if(this.p != z) {
            this.a |= 0x4000;
            this.p = z;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setCompositingStrategy-aDBOjCE(int v) {
        if(!CompositingStrategy.equals-impl0(this.q, v)) {
            this.a |= 0x8000;
            this.q = v;
        }
    }

    public final void setGraphicsDensity$ui_release(@NotNull Density density0) {
        this.s = density0;
    }

    public final void setLayoutDirection$ui_release(@NotNull LayoutDirection layoutDirection0) {
        this.t = layoutDirection0;
    }

    public final void setMutatedFields$ui_release(int v) {
        this.a = v;
    }

    @VisibleForTesting
    public final void setOutline$ui_release(@Nullable Outline outline0) {
        this.v = outline0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        if(!Intrinsics.areEqual(this.u, renderEffect0)) {
            this.a |= 0x20000;
            this.u = renderEffect0;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationX(float f) {
        if(this.j != f) {
            this.a |= 0x100;
            this.j = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationY(float f) {
        if(this.k != f) {
            this.a |= 0x200;
            this.k = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f) {
        if(this.l != f) {
            this.a |= 0x400;
            this.l = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleX(float f) {
        if(this.b != f) {
            this.a |= 1;
            this.b = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setScaleY(float f) {
        if(this.c != f) {
            this.a |= 2;
            this.c = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f) {
        if(this.g != f) {
            this.a |= 0x20;
            this.g = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setShape(@NotNull Shape shape0) {
        if(!Intrinsics.areEqual(this.o, shape0)) {
            this.a |= 0x2000;
            this.o = shape0;
        }
    }

    public void setSize-uvyYCjk(long v) {
        this.r = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setSpotShadowColor-8_81llA(long v) {
        if(!Color.equals-impl0(this.i, v)) {
            this.a |= 0x80;
            this.i = v;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTransformOrigin-__ExYCQ(long v) {
        if(!TransformOrigin.equals-impl0(this.n, v)) {
            this.a |= 0x1000;
            this.n = v;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f) {
        if(this.e != f) {
            this.a |= 8;
            this.e = f;
        }
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f) {
        if(this.f != f) {
            this.a |= 16;
            this.f = f;
        }
    }

    public final void updateOutline$ui_release() {
        this.v = this.getShape().createOutline-Pq9zytI(this.getSize-NH-jbRc(), this.t, this.s);
    }
}

