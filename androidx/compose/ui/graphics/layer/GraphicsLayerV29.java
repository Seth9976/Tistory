package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;
import s1.c;

@RequiresApi(29)
@Metadata(d1 = {"\u0000\u00AC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ*\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\rH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001A\u00020\u000F2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J@\u0010!\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0017\u0010 \u001A\u0013\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u000F0\u001D\u00A2\u0006\u0002\b\u001FH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020#H\u0016\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b*\u0010+R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R*\u00108\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R0\u0010@\u001A\u0002092\u0006\u00101\u001A\u0002098\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010H\u001A\u0004\u0018\u00010A2\b\u00101\u001A\u0004\u0018\u00010A8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR0\u0010N\u001A\u00020I2\u0006\u00101\u001A\u00020I8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bJ\u0010-\u001A\u0004\bK\u0010/\"\u0004\bL\u0010MR*\u0010R\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bO\u00103\u001A\u0004\bP\u00105\"\u0004\bQ\u00107R*\u0010V\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bS\u00103\u001A\u0004\bT\u00105\"\u0004\bU\u00107R*\u0010Z\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bW\u00103\u001A\u0004\bX\u00105\"\u0004\bY\u00107R*\u0010^\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b[\u00103\u001A\u0004\b\\\u00105\"\u0004\b]\u00107R*\u0010b\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b_\u00103\u001A\u0004\b`\u00105\"\u0004\ba\u00107R0\u0010g\u001A\u00020c2\u0006\u00101\u001A\u00020c8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bd\u0010-\u001A\u0004\be\u0010/\"\u0004\bf\u0010MR0\u0010k\u001A\u00020c2\u0006\u00101\u001A\u00020c8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bh\u0010-\u001A\u0004\bi\u0010/\"\u0004\bj\u0010MR*\u0010o\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bl\u00103\u001A\u0004\bm\u00105\"\u0004\bn\u00107R*\u0010s\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bp\u00103\u001A\u0004\bq\u00105\"\u0004\br\u00107R*\u0010w\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bt\u00103\u001A\u0004\bu\u00105\"\u0004\bv\u00107R*\u0010{\u001A\u0002002\u0006\u00101\u001A\u0002008\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bx\u00103\u001A\u0004\by\u00105\"\u0004\bz\u00107R-\u0010\u0082\u0001\u001A\u00020|2\u0006\u00101\u001A\u00020|8\u0016@VX\u0096\u000E\u00A2\u0006\u0014\n\u0004\b\u000B\u0010}\u001A\u0004\b~\u0010\u007F\"\u0006\b\u0080\u0001\u0010\u0081\u0001R7\u0010\u008A\u0001\u001A\u0005\u0018\u00010\u0083\u00012\t\u00101\u001A\u0005\u0018\u00010\u0083\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R6\u0010\u008F\u0001\u001A\u00030\u008B\u00012\u0007\u00101\u001A\u00030\u008B\u00018\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0015\n\u0005\b\u008C\u0001\u0010;\u001A\u0005\b\u008D\u0001\u0010=\"\u0005\b\u008E\u0001\u0010?R\'\u0010\u0091\u0001\u001A\u00020|8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0016\n\u0005\b\u0090\u0001\u0010}\u001A\u0005\b\u0091\u0001\u0010\u007F\"\u0006\b\u0092\u0001\u0010\u0081\u0001R\u0016\u0010\u0094\u0001\u001A\u00020|8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0093\u0001\u0010\u007FR\u0016\u0010\u0096\u0001\u001A\u00020\u00028VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0095\u0001\u0010/\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0097\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "discardDisplayList", "()V", "a", "J", "getOwnerId", "()J", "", "value", "i", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "j", "I", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "k", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "Landroidx/compose/ui/geometry/Offset;", "l", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "pivotOffset", "m", "getScaleX", "setScaleX", "scaleX", "n", "getScaleY", "setScaleY", "scaleY", "o", "getTranslationX", "setTranslationX", "translationX", "p", "getTranslationY", "setTranslationY", "translationY", "q", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "r", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "s", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "t", "getRotationX", "setRotationX", "rotationX", "u", "getRotationY", "setRotationY", "rotationY", "v", "getRotationZ", "setRotationZ", "rotationZ", "w", "getCameraDistance", "setCameraDistance", "cameraDistance", "", "Z", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "A", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "B", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "compositingStrategy", "C", "isInvalidated", "setInvalidated", "getHasDisplayList", "hasDisplayList", "getLayerId", "layerId", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,293:1\n1#2:294\n47#3,5:295\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n237#1:295,5\n*E\n"})
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    public RenderEffect A;
    public int B;
    public boolean C;
    public final long a;
    public final CanvasHolder b;
    public final CanvasDrawScope c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public ColorFilter k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public boolean y;
    public boolean z;

    public GraphicsLayerV29(long v, @NotNull CanvasHolder canvasHolder0, @NotNull CanvasDrawScope canvasDrawScope0) {
        this.a = v;
        this.b = canvasHolder0;
        this.c = canvasDrawScope0;
        RenderNode renderNode0 = d.f();
        this.d = renderNode0;
        this.e = 0L;
        d.y(renderNode0);
        this.b(renderNode0, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 0x7FC000007FC00000L;
        this.m = 1.0f;
        this.n = 1.0f;
        this.r = 0xFF00000000000000L;
        this.s = 0xFF00000000000000L;
        this.w = 8.0f;
        this.B = 0;
        this.C = true;
    }

    public GraphicsLayerV29(long v, CanvasHolder canvasHolder0, CanvasDrawScope canvasDrawScope0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            canvasHolder0 = new CanvasHolder();
        }
        if((v1 & 4) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(v, canvasHolder0, canvasDrawScope0);
    }

    public final void a() {
        boolean z = false;
        boolean z1 = this.getClip() && !this.h;
        if(this.getClip() && this.h) {
            z = true;
        }
        if(z1 != this.y) {
            this.y = z1;
            d.n(this.d, z1);
        }
        if(z != this.z) {
            this.z = z;
            d.t(this.d, z);
        }
    }

    public final void b(RenderNode renderNode0, int v) {
        if(CompositingStrategy.equals-impl0(v, 1)) {
            d.m(renderNode0, this.f);
            d.q(renderNode0);
            return;
        }
        if(CompositingStrategy.equals-impl0(v, 2)) {
            d.s(renderNode0, this.f);
            d.u(renderNode0);
            return;
        }
        d.s(renderNode0, this.f);
        d.q(renderNode0);
    }

    public final void c() {
        if(!CompositingStrategy.equals-impl0(this.getCompositingStrategy-ke2Ky5w(), 1) && BlendMode.equals-impl0(this.getBlendMode-0nO6VwU(), 3) && this.getColorFilter() == null && this.getRenderEffect() == null) {
            this.b(this.d, this.getCompositingStrategy-ke2Ky5w());
            return;
        }
        this.b(this.d, 1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @NotNull
    public Matrix calculateMatrix() {
        Matrix matrix0 = this.g;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.g = matrix0;
        }
        d.l(this.d, matrix0);
        return matrix0;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        d.j(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@NotNull Canvas canvas0) {
        c.i(AndroidCanvas_androidKt.getNativeCanvas(canvas0), this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getAmbientShadowColor-0d7_KjU() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getBlendMode-0nO6VwU() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.w;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.x;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public ColorFilter getColorFilter() {
        return this.k;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getCompositingStrategy-ke2Ky5w() {
        return this.B;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return d.o(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return d.b(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getPivotOffset-F1C5BW0() {
        return this.l;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.A;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.t;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.u;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.v;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.m;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.n;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.q;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getSpotShadowColor-0d7_KjU() {
        return this.s;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.o;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.p;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.C;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull GraphicsLayer graphicsLayer0, @NotNull Function1 function10) {
        RecordingCanvas recordingCanvas0 = c.d(this.d);
        try {
            this.b.getAndroidCanvas().setInternalCanvas(recordingCanvas0);
            DrawContext drawContext0 = this.c.getDrawContext();
            drawContext0.setDensity(density0);
            drawContext0.setLayoutDirection(layoutDirection0);
            drawContext0.setGraphicsLayer(graphicsLayer0);
            drawContext0.setSize-uvyYCjk(this.e);
            drawContext0.setCanvas(this.b.getAndroidCanvas());
            function10.invoke(this.c);
            this.b.getAndroidCanvas().setInternalCanvas(this.b.getAndroidCanvas().getInternalCanvas());
        }
        finally {
            c.j(this.d);
        }
        this.setInvalidated(false);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.i = f;
        d.r(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAmbientShadowColor-8_81llA(long v) {
        this.r = v;
        int v1 = ColorKt.toArgb-8_81llA(v);
        c.l(this.d, v1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setBlendMode-s9anfk8(int v) {
        this.j = v;
        Paint paint0 = this.f;
        if(paint0 == null) {
            paint0 = new Paint();
            this.f = paint0;
        }
        d.i(paint0, AndroidBlendMode_androidKt.toAndroidBlendMode-s9anfk8(v));
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.w = f;
        d.C(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.x = z;
        this.a();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.k = colorFilter0;
        Paint paint0 = this.f;
        if(paint0 == null) {
            paint0 = new Paint();
            this.f = paint0;
        }
        paint0.setColorFilter((colorFilter0 == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0)));
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCompositingStrategy-Wpw9cng(int v) {
        this.B = v;
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.C = z;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setOutline(@Nullable Outline outline0) {
        c.o(this.d, outline0);
        this.h = outline0 != null;
        this.a();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPivotOffset-k-4lQ0M(long v) {
        this.l = v;
        if(OffsetKt.isUnspecified-k-4lQ0M(v)) {
            d.w(this.d);
            return;
        }
        d.A(this.d, Offset.getX-impl(v));
        d.B(this.d, Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPosition-H0pRuoY(int v, int v1, long v2) {
        c.n(this.d, v, v1, IntSize.getWidth-impl(v2) + v, IntSize.getHeight-impl(v2) + v1);
        this.e = IntSizeKt.toSize-ozmzZPI(v2);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.A = renderEffect0;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.d, renderEffect0);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.t = f;
        d.z(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.u = f;
        c.x(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.v = f;
        c.A(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.m = f;
        d.v(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.n = f;
        d.x(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.q = f;
        d.D(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setSpotShadowColor-8_81llA(long v) {
        this.s = v;
        int v1 = ColorKt.toArgb-8_81llA(v);
        c.y(this.d, v1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.o = f;
        c.k(this.d, f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.p = f;
        d.k(this.d, f);
    }
}

