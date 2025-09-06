package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build.VERSION;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
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
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s1.j;
import s1.k;

@RequiresApi(23)
@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u009A\u00012\u00020\u0001:\u0002\u009A\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BJ*\u0010\u0014\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001A\u00020\u00112\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J@\u0010#\u001A\u00020\u00112\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0017\u0010\"\u001A\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00110\u001F\u00A2\u0006\u0002\b!H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010\'\u001A\u00020\u00112\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b*\u0010+J\u000F\u0010,\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010/\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b.\u0010-R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R0\u0010<\u001A\u0002042\u0006\u00105\u001A\u0002048\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010A\u001A\u00020=2\u0006\u00105\u001A\u00020=8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b>\u00107\u001A\u0004\b?\u00109\"\u0004\b@\u0010;R.\u0010I\u001A\u0004\u0018\u00010B2\b\u00105\u001A\u0004\u0018\u00010B8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bC\u0010D\u001A\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010Q\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bK\u0010L\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR0\u0010W\u001A\u00020R2\u0006\u00105\u001A\u00020R8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bS\u00101\u001A\u0004\bT\u00103\"\u0004\bU\u0010VR*\u0010[\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bX\u0010L\u001A\u0004\bY\u0010N\"\u0004\bZ\u0010PR*\u0010_\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\\\u0010L\u001A\u0004\b]\u0010N\"\u0004\b^\u0010PR*\u0010c\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b`\u0010L\u001A\u0004\ba\u0010N\"\u0004\bb\u0010PR*\u0010g\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bd\u0010L\u001A\u0004\be\u0010N\"\u0004\bf\u0010PR*\u0010k\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bh\u0010L\u001A\u0004\bi\u0010N\"\u0004\bj\u0010PR0\u0010p\u001A\u00020l2\u0006\u00105\u001A\u00020l8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bm\u00101\u001A\u0004\bn\u00103\"\u0004\bo\u0010VR0\u0010t\u001A\u00020l2\u0006\u00105\u001A\u00020l8\u0016@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\bq\u00101\u001A\u0004\br\u00103\"\u0004\bs\u0010VR*\u0010x\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bu\u0010L\u001A\u0004\bv\u0010N\"\u0004\bw\u0010PR*\u0010|\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\by\u0010L\u001A\u0004\bz\u0010N\"\u0004\b{\u0010PR*\u0010\u007F\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\b\r\u0010L\u001A\u0004\b}\u0010N\"\u0004\b~\u0010PR-\u0010\u0082\u0001\u001A\u00020J2\u0006\u00105\u001A\u00020J8\u0016@VX\u0096\u000E\u00A2\u0006\u0014\n\u0004\b\u000E\u0010L\u001A\u0005\b\u0080\u0001\u0010N\"\u0005\b\u0081\u0001\u0010PR3\u0010\u008A\u0001\u001A\u00030\u0083\u00012\u0007\u00105\u001A\u00030\u0083\u00018\u0016@VX\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001A\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u0092\u0001\u001A\u0005\u0018\u00010\u008B\u00018\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u008C\u0001\u0010\u008D\u0001\u001A\u0006\b\u008E\u0001\u0010\u008F\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0094\u0001\u001A\u00030\u0083\u00018\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0085\u0001\u001A\u0006\b\u0094\u0001\u0010\u0087\u0001\"\u0006\b\u0095\u0001\u0010\u0089\u0001R\u0018\u0010\u0097\u0001\u001A\u00030\u0083\u00018VX\u0096\u0004\u00A2\u0006\b\u001A\u0006\b\u0096\u0001\u0010\u0087\u0001R\u001D\u0010\u0098\u0001\u001A\u00020\u00048\u0016X\u0096D\u00A2\u0006\u000E\n\u0005\b\u0098\u0001\u00101\u001A\u0005\b\u0099\u0001\u00103\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u009B\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroid/view/View;", "ownerView", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "discardDisplayList", "()V", "discardDisplayListInternal$ui_graphics_release", "discardDisplayListInternal", "a", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "value", "i", "I", "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "Landroidx/compose/ui/graphics/BlendMode;", "j", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "k", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "", "l", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/geometry/Offset;", "n", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "pivotOffset", "o", "getScaleX", "setScaleX", "scaleX", "p", "getScaleY", "setScaleY", "scaleY", "q", "getTranslationX", "setTranslationX", "translationX", "r", "getTranslationY", "setTranslationY", "translationY", "s", "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", "t", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "u", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "v", "getRotationX", "setRotationX", "rotationX", "w", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "", "z", "Z", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "C", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "D", "isInvalidated", "setInvalidated", "getHasDisplayList", "hasDisplayList", "layerId", "getLayerId", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayerV23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,418:1\n1#2:419\n47#3,3:420\n50#3,2:449\n329#4,26:423\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV23.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV23\n*L\n315#1:420,3\n315#1:449,2\n316#1:423,26\n*E\n"})
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001A\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV23$Companion;", "", "", "testFailCreateRenderNode", "Z", "getTestFailCreateRenderNode$ui_graphics_release", "()Z", "setTestFailCreateRenderNode$ui_graphics_release", "(Z)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needToValidateAccess", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return false;
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean z) {
            GraphicsLayerV23.E = z;
        }
    }

    public boolean A;
    public boolean B;
    public RenderEffect C;
    @NotNull
    public static final Companion Companion;
    public boolean D;
    public static boolean E;
    public static final AtomicBoolean F;
    public final long a;
    public final CanvasHolder b;
    public final CanvasDrawScope c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public int i;
    public int j;
    public ColorFilter k;
    public float l;
    public boolean m;
    public long n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public long t;
    public long u;
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    static {
        GraphicsLayerV23.Companion = new Companion(null);
        GraphicsLayerV23.F = new AtomicBoolean(true);
    }

    public GraphicsLayerV23(@NotNull View view0, long v, @NotNull CanvasHolder canvasHolder0, @NotNull CanvasDrawScope canvasDrawScope0) {
        this.a = v;
        this.b = canvasHolder0;
        this.c = canvasDrawScope0;
        RenderNode renderNode0 = RenderNode.create("Compose", view0);
        this.d = renderNode0;
        this.e = 0L;
        if(GraphicsLayerV23.F.getAndSet(false)) {
            renderNode0.setScaleX(renderNode0.getScaleX());
            renderNode0.setScaleY(renderNode0.getScaleY());
            renderNode0.setTranslationX(renderNode0.getTranslationX());
            renderNode0.setTranslationY(renderNode0.getTranslationY());
            renderNode0.setElevation(renderNode0.getElevation());
            renderNode0.setRotation(renderNode0.getRotation());
            renderNode0.setRotationX(renderNode0.getRotationX());
            renderNode0.setRotationY(renderNode0.getRotationY());
            renderNode0.setCameraDistance(renderNode0.getCameraDistance());
            renderNode0.setPivotX(renderNode0.getPivotX());
            renderNode0.setPivotY(renderNode0.getPivotY());
            renderNode0.setClipToOutline(renderNode0.getClipToOutline());
            renderNode0.setClipToBounds(false);
            renderNode0.setAlpha(renderNode0.getAlpha());
            renderNode0.isValid();
            renderNode0.setLeftTopRightBottom(0, 0, 0, 0);
            renderNode0.offsetLeftAndRight(0);
            renderNode0.offsetTopAndBottom(0);
            if(Build.VERSION.SDK_INT >= 28) {
                int v1 = k.a.a(renderNode0);
                k.a.c(renderNode0, v1);
                int v2 = k.a.b(renderNode0);
                k.a.d(renderNode0, v2);
            }
            this.discardDisplayListInternal$ui_graphics_release();
            renderNode0.setLayerType(0);
            renderNode0.setHasOverlappingRendering(renderNode0.hasOverlappingRendering());
        }
        if(GraphicsLayerV23.E) {
            throw new NoClassDefFoundError();
        }
        renderNode0.setClipToBounds(false);
        this.b(0);
        this.i = 0;
        this.j = 3;
        this.l = 1.0f;
        this.n = 0x7FC000007FC00000L;
        this.o = 1.0f;
        this.p = 1.0f;
        this.t = 0xFF00000000000000L;
        this.u = 0xFF00000000000000L;
        this.y = 8.0f;
        this.D = true;
    }

    public GraphicsLayerV23(View view0, long v, CanvasHolder canvasHolder0, CanvasDrawScope canvasDrawScope0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            canvasHolder0 = new CanvasHolder();
        }
        if((v1 & 8) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(view0, v, canvasHolder0, canvasDrawScope0);
    }

    public final void a() {
        boolean z = false;
        boolean z1 = this.getClip() && !this.h;
        if(this.getClip() && this.h) {
            z = true;
        }
        if(z1 != this.A) {
            this.A = z1;
            this.d.setClipToBounds(z1);
        }
        if(z != this.B) {
            this.B = z;
            this.d.setClipToOutline(z);
        }
    }

    public static final boolean access$getTestFailCreateRenderNode$cp() [...] // 潜在的解密器

    public final void b(int v) {
        RenderNode renderNode0 = this.d;
        if(CompositingStrategy.equals-impl0(v, 1)) {
            renderNode0.setLayerType(2);
            renderNode0.setLayerPaint(this.f);
            renderNode0.setHasOverlappingRendering(true);
            return;
        }
        if(CompositingStrategy.equals-impl0(v, 2)) {
            renderNode0.setLayerType(0);
            renderNode0.setLayerPaint(this.f);
            renderNode0.setHasOverlappingRendering(false);
            return;
        }
        renderNode0.setLayerType(0);
        renderNode0.setLayerPaint(this.f);
        renderNode0.setHasOverlappingRendering(true);
    }

    public final void c() {
        if(!CompositingStrategy.equals-impl0(this.getCompositingStrategy-ke2Ky5w(), 1) && BlendMode.equals-impl0(this.getBlendMode-0nO6VwU(), 3) && this.getColorFilter() == null) {
            this.b(this.getCompositingStrategy-ke2Ky5w());
            return;
        }
        this.b(1);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @NotNull
    public Matrix calculateMatrix() {
        Matrix matrix0 = this.g;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.g = matrix0;
        }
        this.d.getMatrix(matrix0);
        return matrix0;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.discardDisplayListInternal$ui_graphics_release();
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        j.a.a(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(@NotNull Canvas canvas0) {
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        Intrinsics.checkNotNull(canvas1, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas)canvas1).drawRenderNode(this.d);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.l;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getAmbientShadowColor-0d7_KjU() {
        return this.t;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getBlendMode-0nO6VwU() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.y;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.z;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public ColorFilter getColorFilter() {
        return this.k;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public int getCompositingStrategy-ke2Ky5w() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return this.d.isValid();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return 0L;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getPivotOffset-F1C5BW0() {
        return this.n;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.C;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.v;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.w;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.x;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.o;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.p;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.s;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getSpotShadowColor-0d7_KjU() {
        return this.u;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.q;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.D;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @NotNull GraphicsLayer graphicsLayer0, @NotNull Function1 function10) {
        DisplayListCanvas displayListCanvas0 = this.d.start(IntSize.getWidth-impl(this.e), IntSize.getHeight-impl(this.e));
        try {
            CanvasHolder canvasHolder0 = this.b;
            android.graphics.Canvas canvas0 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
            canvasHolder0.getAndroidCanvas().setInternalCanvas(((android.graphics.Canvas)displayListCanvas0));
            AndroidCanvas androidCanvas0 = canvasHolder0.getAndroidCanvas();
            CanvasDrawScope canvasDrawScope0 = this.c;
            long v1 = IntSizeKt.toSize-ozmzZPI(this.e);
            Density density1 = canvasDrawScope0.getDrawContext().getDensity();
            LayoutDirection layoutDirection1 = canvasDrawScope0.getDrawContext().getLayoutDirection();
            Canvas canvas1 = canvasDrawScope0.getDrawContext().getCanvas();
            long v2 = canvasDrawScope0.getDrawContext().getSize-NH-jbRc();
            GraphicsLayer graphicsLayer1 = canvasDrawScope0.getDrawContext().getGraphicsLayer();
            DrawContext drawContext0 = canvasDrawScope0.getDrawContext();
            drawContext0.setDensity(density0);
            drawContext0.setLayoutDirection(layoutDirection0);
            drawContext0.setCanvas(androidCanvas0);
            drawContext0.setSize-uvyYCjk(v1);
            drawContext0.setGraphicsLayer(graphicsLayer0);
            androidCanvas0.save();
            try {
                function10.invoke(canvasDrawScope0);
            }
            catch(Throwable throwable0) {
                androidCanvas0.restore();
                DrawContext drawContext1 = canvasDrawScope0.getDrawContext();
                drawContext1.setDensity(density1);
                drawContext1.setLayoutDirection(layoutDirection1);
                drawContext1.setCanvas(canvas1);
                drawContext1.setSize-uvyYCjk(v2);
                drawContext1.setGraphicsLayer(graphicsLayer1);
                throw throwable0;
            }
            androidCanvas0.restore();
            DrawContext drawContext2 = canvasDrawScope0.getDrawContext();
            drawContext2.setDensity(density1);
            drawContext2.setLayoutDirection(layoutDirection1);
            drawContext2.setCanvas(canvas1);
            drawContext2.setSize-uvyYCjk(v2);
            drawContext2.setGraphicsLayer(graphicsLayer1);
            canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
        }
        finally {
            this.d.end(displayListCanvas0);
        }
        this.setInvalidated(false);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.l = f;
        this.d.setAlpha(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAmbientShadowColor-8_81llA(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.t = v;
            int v1 = ColorKt.toArgb-8_81llA(v);
            k.a.c(this.d, v1);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setBlendMode-s9anfk8(int v) {
        if(!BlendMode.equals-impl0(this.j, v)) {
            this.j = v;
            Paint paint0 = this.f;
            if(paint0 == null) {
                paint0 = new Paint();
                this.f = paint0;
            }
            paint0.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v)));
            this.c();
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.y = f;
        this.d.setCameraDistance(-f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z) {
        this.z = z;
        this.a();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.k = colorFilter0;
        if(colorFilter0 != null) {
            this.b(1);
            RenderNode renderNode0 = this.d;
            Paint paint0 = this.f;
            if(paint0 == null) {
                paint0 = new Paint();
                this.f = paint0;
            }
            paint0.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0));
            renderNode0.setLayerPaint(paint0);
            return;
        }
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCompositingStrategy-Wpw9cng(int v) {
        this.i = v;
        this.c();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z) {
        this.D = z;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setOutline(@Nullable Outline outline0) {
        this.d.setOutline(outline0);
        this.h = outline0 != null;
        this.a();
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPivotOffset-k-4lQ0M(long v) {
        this.n = v;
        if(OffsetKt.isUnspecified-k-4lQ0M(v)) {
            this.m = true;
            this.d.setPivotX(((float)IntSize.getWidth-impl(this.e)) / 2.0f);
            this.d.setPivotY(((float)IntSize.getHeight-impl(this.e)) / 2.0f);
            return;
        }
        this.m = false;
        this.d.setPivotX(Offset.getX-impl(v));
        this.d.setPivotY(Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setPosition-H0pRuoY(int v, int v1, long v2) {
        this.d.setLeftTopRightBottom(v, v1, IntSize.getWidth-impl(v2) + v, IntSize.getHeight-impl(v2) + v1);
        if(!IntSize.equals-impl0(this.e, v2)) {
            if(this.m) {
                this.d.setPivotX(((float)IntSize.getWidth-impl(v2)) / 2.0f);
                this.d.setPivotY(((float)IntSize.getHeight-impl(v2)) / 2.0f);
            }
            this.e = v2;
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.C = renderEffect0;
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.v = f;
        this.d.setRotationX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.w = f;
        this.d.setRotationY(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.x = f;
        this.d.setRotation(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.o = f;
        this.d.setScaleX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.p = f;
        this.d.setScaleY(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.s = f;
        this.d.setElevation(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setSpotShadowColor-8_81llA(long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.u = v;
            int v1 = ColorKt.toArgb-8_81llA(v);
            k.a.d(this.d, v1);
        }
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.q = f;
        this.d.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.r = f;
        this.d.setTranslationY(f);
    }
}

