package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
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
import s1.m;
import s1.n;

@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ*\u0010\u0014\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001A\u00020\u00112\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J@\u0010#\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0017\u0010\"\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001F\u00A2\u0006\u0002\b!H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010\'\u001A\u00020\u00112\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b,\u0010-R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\"\u00109\u001A\u0002068\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001A\u0010?\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b=\u0010/\u001A\u0004\b>\u00101R0\u0010H\u001A\u00020@2\u0006\u0010A\u001A\u00020@8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR.\u0010P\u001A\u0004\u0018\u00010I2\b\u0010A\u001A\u0004\u0018\u00010I8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR0\u0010U\u001A\u00020Q2\u0006\u0010A\u001A\u00020Q8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bR\u0010C\u001A\u0004\bS\u0010E\"\u0004\bT\u0010GR*\u0010]\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\"\u0004\b[\u0010\\R0\u0010b\u001A\u00020^2\u0006\u0010A\u001A\u00020^8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b\r\u0010/\u001A\u0004\b_\u00101\"\u0004\b`\u0010aR*\u0010e\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\u000E\u0010X\u001A\u0004\bc\u0010Z\"\u0004\bd\u0010\\R*\u0010i\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bf\u0010X\u001A\u0004\bg\u0010Z\"\u0004\bh\u0010\\R*\u0010m\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bj\u0010X\u001A\u0004\bk\u0010Z\"\u0004\bl\u0010\\R*\u0010q\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bn\u0010X\u001A\u0004\bo\u0010Z\"\u0004\bp\u0010\\R*\u0010u\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\br\u0010X\u001A\u0004\bs\u0010Z\"\u0004\bt\u0010\\R0\u0010z\u001A\u00020v2\u0006\u0010A\u001A\u00020v8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bw\u0010/\u001A\u0004\bx\u00101\"\u0004\by\u0010aR0\u0010~\u001A\u00020v2\u0006\u0010A\u001A\u00020v8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b{\u0010/\u001A\u0004\b|\u00101\"\u0004\b}\u0010aR,\u0010\u0081\u0001\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0013\n\u0004\bX\u0010X\u001A\u0004\b\u007F\u0010Z\"\u0005\b\u0080\u0001\u0010\\R.\u0010\u0085\u0001\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0015\n\u0005\b\u0082\u0001\u0010X\u001A\u0005\b\u0083\u0001\u0010Z\"\u0005\b\u0084\u0001\u0010\\R.\u0010\u0089\u0001\u001A\u00020V2\u0006\u0010A\u001A\u00020V8\u0016@VX\u0096\u000E\u00A2\u0006\u0015\n\u0005\b\u0086\u0001\u0010X\u001A\u0005\b\u0087\u0001\u0010Z\"\u0005\b\u0088\u0001\u0010\\R6\u0010\u0090\u0001\u001A\u0005\u0018\u00010\u008A\u00012\t\u0010A\u001A\u0005\u0018\u00010\u008A\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0017\n\u0005\bC\u0010\u008B\u0001\u001A\u0006\b\u008C\u0001\u0010\u008D\u0001\"\u0006\b\u008E\u0001\u0010\u008F\u0001R\'\u0010\u0093\u0001\u001A\u00020V2\u0006\u0010A\u001A\u00020V8V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u0091\u0001\u0010Z\"\u0005\b\u0092\u0001\u0010\\R\'\u0010\u0096\u0001\u001A\u0002062\u0006\u0010A\u001A\u0002068V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u0094\u0001\u0010:\"\u0005\b\u0095\u0001\u0010<\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0098\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "discardDisplayList", "()V", "b", "J", "getOwnerId", "()J", "c", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "", "o", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "r", "getLayerId", "layerId", "Landroidx/compose/ui/graphics/BlendMode;", "value", "s", "I", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "t", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "u", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "compositingStrategy", "", "v", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/geometry/Offset;", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "pivotOffset", "getScaleX", "setScaleX", "scaleX", "z", "getScaleY", "setScaleY", "scaleY", "A", "getTranslationX", "setTranslationX", "translationX", "B", "getTranslationY", "setTranslationY", "translationY", "C", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "D", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "E", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "getRotationX", "setRotationX", "rotationX", "G", "getRotationY", "setRotationY", "rotationY", "H", "getRotationZ", "setRotationZ", "rotationZ", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCameraDistance", "setCameraDistance", "cameraDistance", "getClip", "setClip", "clip", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,562:1\n1#2:563\n47#3,3:564\n50#3,2:584\n47#3,5:586\n546#4,17:567\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n425#1:564,3\n425#1:584,2\n437#1:586,5\n426#1:567,17\n*E\n"})
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "", "mayRenderInSoftware", "Z", "getMayRenderInSoftware", "()Z", "Landroid/graphics/Canvas;", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "getPlaceholderCanvas", "()Landroid/graphics/Canvas;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.J;
        }

        @NotNull
        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.K;
        }
    }

    public float A;
    public float B;
    public float C;
    @NotNull
    public static final Companion Companion;
    public long D;
    public long E;
    public float F;
    public float G;
    public float H;
    public RenderEffect I;
    public static final boolean J;
    public static final GraphicsViewLayer.Companion.PlaceholderCanvas.1 K;
    public final DrawChildContainer a;
    public final long b;
    public final CanvasHolder c;
    public final ViewLayer d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public final Picture h;
    public final CanvasDrawScope i;
    public final CanvasHolder j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final long r;
    public int s;
    public ColorFilter t;
    public int u;
    public float v;
    public boolean w;
    public long x;
    public float y;
    public float z;

    static {
        GraphicsViewLayer.Companion = new Companion(null);
        GraphicsViewLayer.J = false;
        GraphicsViewLayer.K = new GraphicsViewLayer.Companion.PlaceholderCanvas.1();  // 初始化器: Landroid/graphics/Canvas;-><init>()V
    }

    public GraphicsViewLayer(@NotNull DrawChildContainer drawChildContainer0, long v, @NotNull CanvasHolder canvasHolder0, @NotNull CanvasDrawScope canvasDrawScope0) {
        this.a = drawChildContainer0;
        this.b = v;
        this.c = canvasHolder0;
        ViewLayer viewLayer0 = new ViewLayer(drawChildContainer0, canvasHolder0, canvasDrawScope0);
        this.d = viewLayer0;
        this.e = drawChildContainer0.getResources();
        this.f = new Rect();
        this.h = GraphicsViewLayer.J ? new Picture() : null;
        this.i = GraphicsViewLayer.J ? new CanvasDrawScope() : null;
        this.j = GraphicsViewLayer.J ? new CanvasHolder() : null;
        drawChildContainer0.addView(viewLayer0);
        viewLayer0.setClipBounds(null);
        this.m = 0L;
        this.o = true;
        this.r = (long)View.generateViewId();
        this.s = 3;
        this.u = 0;
        this.v = 1.0f;
        this.x = 0L;
        this.y = 1.0f;
        this.z = 1.0f;
        this.D = 0xFF00000000000000L;
        this.E = 0xFF00000000000000L;
    }

    public GraphicsViewLayer(DrawChildContainer drawChildContainer0, long v, CanvasHolder canvasHolder0, CanvasDrawScope canvasDrawScope0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            canvasHolder0 = new CanvasHolder();
        }
        if((v1 & 8) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(drawChildContainer0, v, canvasHolder0, canvasDrawScope0);
    }

    public final void a(int v) {
        boolean z = true;
        ViewLayer viewLayer0 = this.d;
        if(CompositingStrategy.equals-impl0(v, 1)) {
            viewLayer0.setLayerType(2, this.g);
        }
        else if(CompositingStrategy.equals-impl0(v, 2)) {
            viewLayer0.setLayerType(0, this.g);
            z = false;
        }
        else {
            viewLayer0.setLayerType(0, this.g);
        }
        viewLayer0.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    public final void b() {
        try {
            this.c.getAndroidCanvas().setInternalCanvas(GraphicsViewLayer.K);
            long v = this.d.getDrawingTime();
            this.a.drawChild$ui_graphics_release(this.c.getAndroidCanvas(), this.d, v);
            this.c.getAndroidCanvas().setInternalCanvas(this.c.getAndroidCanvas().getInternalCanvas());
        }
        catch(Throwable unused_ex) {
        }
    }

    public final void c() {
        if(!CompositingStrategy.equals-impl0(this.getCompositingStrategy-ke2Ky5w(), 1) && BlendMode.equals-impl0(this.getBlendMode-0nO6VwU(), 3) && this.getColorFilter() == null) {
            this.a(this.getCompositingStrategy-ke2Ky5w());
            return;
        }
        this.a(1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @NotNull
    public Matrix calculateMatrix() {
        return this.d.getMatrix();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.a.removeViewInLayout(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@NotNull androidx.compose.ui.graphics.Canvas canvas0) {
        Rect rect0;
        ViewLayer viewLayer0 = this.d;
        if(this.n) {
            if(!this.getClip() || this.p) {
                rect0 = null;
            }
            else {
                rect0 = this.f;
                rect0.left = 0;
                rect0.top = 0;
                rect0.right = viewLayer0.getWidth();
                rect0.bottom = viewLayer0.getHeight();
            }
            viewLayer0.setClipBounds(rect0);
        }
        Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        if(canvas1.isHardwareAccelerated()) {
            long v = viewLayer0.getDrawingTime();
            this.a.drawChild$ui_graphics_release(canvas0, viewLayer0, v);
            return;
        }
        Picture picture0 = this.h;
        if(picture0 != null) {
            canvas1.drawPicture(picture0);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.v;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getAmbientShadowColor-0d7_KjU() {
        return this.D;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getBlendMode-0nO6VwU() {
        return this.s;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.d.getCameraDistance() / ((float)this.e.getDisplayMetrics().densityDpi);
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.q || this.d.getClipToOutline();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public ColorFilter getColorFilter() {
        return this.t;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getCompositingStrategy-ke2Ky5w() {
        return this.u;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getPivotOffset-F1C5BW0() {
        return this.x;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.I;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.F;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.G;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.H;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.y;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.z;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.C;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getSpotShadowColor-0d7_KjU() {
        return this.E;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.A;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.B;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.o;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull GraphicsLayer graphicsLayer0, @NotNull Function1 function10) {
        Canvas canvas2;
        CanvasHolder canvasHolder1;
        ViewLayer viewLayer0 = this.d;
        if(viewLayer0.getParent() == null) {
            this.a.addView(viewLayer0);
        }
        viewLayer0.setDrawParams(density0, layoutDirection0, graphicsLayer0, function10);
        if(viewLayer0.isAttachedToWindow()) {
            viewLayer0.setVisibility(4);
            viewLayer0.setVisibility(0);
            this.b();
            Picture picture0 = this.h;
            if(picture0 != null) {
                Canvas canvas0 = picture0.beginRecording(IntSize.getWidth-impl(this.m), IntSize.getHeight-impl(this.m));
                try {
                    CanvasHolder canvasHolder0 = this.j;
                    if(canvasHolder0 != null) {
                        Canvas canvas1 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
                        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
                        AndroidCanvas androidCanvas0 = canvasHolder0.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope0 = this.i;
                        if(canvasDrawScope0 == null) {
                            canvasHolder1 = canvasHolder0;
                            canvas2 = canvas1;
                        }
                        else {
                            long v1 = IntSizeKt.toSize-ozmzZPI(this.m);
                            DrawParams canvasDrawScope$DrawParams0 = canvasDrawScope0.getDrawParams();
                            canvasHolder1 = canvasHolder0;
                            canvas2 = canvas1;
                            DrawParams canvasDrawScope$DrawParams1 = canvasDrawScope0.getDrawParams();
                            canvasDrawScope$DrawParams1.setDensity(density0);
                            canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
                            canvasDrawScope$DrawParams1.setCanvas(androidCanvas0);
                            canvasDrawScope$DrawParams1.setSize-uvyYCjk(v1);
                            androidCanvas0.save();
                            function10.invoke(canvasDrawScope0);
                            androidCanvas0.restore();
                            DrawParams canvasDrawScope$DrawParams2 = canvasDrawScope0.getDrawParams();
                            canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
                            canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
                            canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
                            canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
                        }
                        canvasHolder1.getAndroidCanvas().setInternalCanvas(canvas2);
                    }
                }
                finally {
                    picture0.endRecording();
                }
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.v = f;
        this.d.setAlpha(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAmbientShadowColor-8_81llA(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.D = v;
            int v1 = ColorKt.toArgb-8_81llA(v);
            m.a.b(this.d, v1);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setBlendMode-s9anfk8(int v) {
        this.s = v;
        Paint paint0 = this.g;
        if(paint0 == null) {
            paint0 = new Paint();
            this.g = paint0;
        }
        paint0.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v)));
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        DisplayMetrics displayMetrics0 = this.e.getDisplayMetrics();
        this.d.setCameraDistance(f * ((float)displayMetrics0.densityDpi));
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        boolean z1 = false;
        this.q = z && !this.p;
        this.n = true;
        if(z && this.p) {
            z1 = true;
        }
        this.d.setClipToOutline(z1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.t = colorFilter0;
        Paint paint0 = this.g;
        if(paint0 == null) {
            paint0 = new Paint();
            this.g = paint0;
        }
        paint0.setColorFilter((colorFilter0 == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0)));
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCompositingStrategy-Wpw9cng(int v) {
        this.u = v;
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.o = z;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setOutline(@Nullable Outline outline0) {
        ViewLayer viewLayer0 = this.d;
        boolean z = viewLayer0.setLayerOutline(outline0);
        boolean z1 = false;
        if(this.getClip() && outline0 != null) {
            viewLayer0.setClipToOutline(true);
            if(this.q) {
                this.q = false;
                this.n = true;
            }
        }
        if(outline0 != null) {
            z1 = true;
        }
        this.p = z1;
        if(!z) {
            viewLayer0.invalidate();
            this.b();
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPivotOffset-k-4lQ0M(long v) {
        this.x = v;
        ViewLayer viewLayer0 = this.d;
        if(OffsetKt.isUnspecified-k-4lQ0M(v)) {
            if(Build.VERSION.SDK_INT >= 28) {
                m.a.a(viewLayer0);
                return;
            }
            this.w = true;
            viewLayer0.setPivotX(((float)IntSize.getWidth-impl(this.m)) / 2.0f);
            viewLayer0.setPivotY(((float)IntSize.getHeight-impl(this.m)) / 2.0f);
            return;
        }
        this.w = false;
        viewLayer0.setPivotX(Offset.getX-impl(v));
        viewLayer0.setPivotY(Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPosition-H0pRuoY(int v, int v1, long v2) {
        ViewLayer viewLayer0 = this.d;
        if(IntSize.equals-impl0(this.m, v2)) {
            int v3 = this.k;
            if(v3 != v) {
                viewLayer0.offsetLeftAndRight(v - v3);
            }
            int v4 = this.l;
            if(v4 != v1) {
                viewLayer0.offsetTopAndBottom(v1 - v4);
            }
        }
        else {
            if(this.getClip()) {
                this.n = true;
            }
            viewLayer0.layout(v, v1, IntSize.getWidth-impl(v2) + v, IntSize.getHeight-impl(v2) + v1);
            this.m = v2;
            if(this.w) {
                viewLayer0.setPivotX(((float)IntSize.getWidth-impl(v2)) / 2.0f);
                viewLayer0.setPivotY(((float)IntSize.getHeight-impl(v2)) / 2.0f);
            }
        }
        this.k = v;
        this.l = v1;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.I = renderEffect0;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            n.a.a(this.d, renderEffect0);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.F = f;
        this.d.setRotationX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.G = f;
        this.d.setRotationY(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.H = f;
        this.d.setRotation(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.y = f;
        this.d.setScaleX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.z = f;
        this.d.setScaleY(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.C = f;
        this.d.setElevation(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setSpotShadowColor-8_81llA(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.E = v;
            int v1 = ColorKt.toArgb-8_81llA(v);
            m.a.c(this.d, v1);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.A = f;
        this.d.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.B = f;
        this.d.setTranslationY(f);
    }
}

