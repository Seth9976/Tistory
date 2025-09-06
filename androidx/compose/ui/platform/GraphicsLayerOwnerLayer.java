package androidx.compose.ui.platform;

import android.os.Build.VERSION;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00128\u0010\u0010\u001A4\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\t\u0012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001A\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\"\u001A\u00020\u000F2\u0006\u0010\u001A\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010!J\u001A\u0010&\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020#H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010!J!\u0010\'\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0003H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010)\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b+\u0010*J\u000F\u0010,\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b,\u0010*J\"\u00101\u001A\u00020\u00192\u0006\u0010-\u001A\u00020\u00192\u0006\u0010.\u001A\u00020\u001BH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b/\u00100J\u001F\u00104\u001A\u00020\u000F2\u0006\u00103\u001A\u0002022\u0006\u0010.\u001A\u00020\u001BH\u0016\u00A2\u0006\u0004\b4\u00105JW\u00106\u001A\u00020\u000F28\u0010\u0010\u001A4\u0012\u0013\u0012\u00110\n\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00A2\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\t2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0011H\u0016\u00A2\u0006\u0004\b6\u00107J\u001A\u0010<\u001A\u00020\u000F2\u0006\u00109\u001A\u000208H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u0010;J\u001A\u0010>\u001A\u00020\u000F2\u0006\u00109\u001A\u000208H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010;R\u0014\u0010B\u001A\u00020?8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u0014\u0010D\u001A\u00020?8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010A\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/platform/GraphicsLayerOwnerLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroidx/compose/ui/graphics/GraphicsContext;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "()V", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayerOwnerLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerOwnerLayer.android.kt\nandroidx/compose/ui/platform/GraphicsLayerOwnerLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1#2:438\n*E\n"})
public final class GraphicsLayerOwnerLayer implements GraphicLayerInfo, OwnedLayer {
    public static final int $stable = 8;
    public GraphicsLayer a;
    public final GraphicsContext b;
    public final AndroidComposeView c;
    public Function2 d;
    public Function0 e;
    public long f;
    public boolean g;
    public final float[] h;
    public float[] i;
    public boolean j;
    public Density k;
    public LayoutDirection l;
    public final CanvasDrawScope m;
    public int n;
    public long o;
    public Outline p;
    public Path q;
    public Paint r;
    public boolean s;
    public final g1 t;

    public GraphicsLayerOwnerLayer(@NotNull GraphicsLayer graphicsLayer0, @Nullable GraphicsContext graphicsContext0, @NotNull AndroidComposeView androidComposeView0, @NotNull Function2 function20, @NotNull Function0 function00) {
        this.a = graphicsLayer0;
        this.b = graphicsContext0;
        this.c = androidComposeView0;
        this.d = function20;
        this.e = function00;
        this.f = 0x7FFFFFFF7FFFFFFFL;
        this.h = Matrix.constructor-impl$default(null, 1, null);
        this.k = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.l = LayoutDirection.Ltr;
        this.m = new CanvasDrawScope();
        this.o = 0x3F0000003F000000L;
        this.t = new g1(this, 9);
    }

    public final float[] a() {
        float[] arr_f = this.b();
        float[] arr_f1 = this.i;
        if(arr_f1 == null) {
            arr_f1 = Matrix.constructor-impl$default(null, 1, null);
            this.i = arr_f1;
        }
        return InvertMatrixKt.invertTo-JiSxe2E(arr_f, arr_f1) ? arr_f1 : null;
    }

    public static final Function2 access$getDrawBlock$p(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer0) {
        return graphicsLayerOwnerLayer0.d;
    }

    public final float[] b() {
        GraphicsLayer graphicsLayer0 = this.a;
        long v = OffsetKt.isUnspecified-k-4lQ0M(graphicsLayer0.getPivotOffset-F1C5BW0()) ? SizeKt.getCenter-uvyYCjk(IntSizeKt.toSize-ozmzZPI(this.f)) : graphicsLayer0.getPivotOffset-F1C5BW0();
        Matrix.reset-impl(this.h);
        float[] arr_f = Matrix.constructor-impl$default(null, 1, null);
        Matrix.translate-impl$default(arr_f, -Offset.getX-impl(v), -Offset.getY-impl(v), 0.0f, 4, null);
        Matrix.timesAssign-58bKbWc(this.h, arr_f);
        float[] arr_f1 = Matrix.constructor-impl$default(null, 1, null);
        Matrix.translate-impl$default(arr_f1, graphicsLayer0.getTranslationX(), graphicsLayer0.getTranslationY(), 0.0f, 4, null);
        Matrix.rotateX-impl(arr_f1, graphicsLayer0.getRotationX());
        Matrix.rotateY-impl(arr_f1, graphicsLayer0.getRotationY());
        Matrix.rotateZ-impl(arr_f1, graphicsLayer0.getRotationZ());
        Matrix.scale-impl$default(arr_f1, graphicsLayer0.getScaleX(), graphicsLayer0.getScaleY(), 0.0f, 4, null);
        Matrix.timesAssign-58bKbWc(this.h, arr_f1);
        float[] arr_f2 = Matrix.constructor-impl$default(null, 1, null);
        Matrix.translate-impl$default(arr_f2, Offset.getX-impl(v), Offset.getY-impl(v), 0.0f, 4, null);
        Matrix.timesAssign-58bKbWc(this.h, arr_f2);
        return this.h;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.d = null;
        this.e = null;
        this.g = true;
        AndroidComposeView androidComposeView0 = this.c;
        if(this.j) {
            this.j = false;
            androidComposeView0.notifyLayerIsDirty$ui_release(this, false);
        }
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 != null) {
            graphicsContext0.releaseGraphicsLayer(this.a);
            androidComposeView0.recycle$ui_release(this);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        boolean z = false;
        if(canvas1.isHardwareAccelerated()) {
            this.updateDisplayList();
            if(this.a.getShadowElevation() > 0.0f) {
                z = true;
            }
            this.s = z;
            DrawContext drawContext0 = this.m.getDrawContext();
            drawContext0.setCanvas(canvas0);
            drawContext0.setGraphicsLayer(graphicsLayer0);
            GraphicsLayerKt.drawLayer(this.m, this.a);
            return;
        }
        float f = (float)IntOffset.getX-impl(this.a.getTopLeft-nOcc-ac());
        float f1 = (float)IntOffset.getY-impl(this.a.getTopLeft-nOcc-ac());
        float f2 = f + ((float)IntSize.getWidth-impl(this.f));
        float f3 = f1 + ((float)IntSize.getHeight-impl(this.f));
        if(this.a.getAlpha() < 1.0f) {
            Paint paint0 = this.r;
            if(paint0 == null) {
                paint0 = AndroidPaint_androidKt.Paint();
                this.r = paint0;
            }
            paint0.setAlpha(this.a.getAlpha());
            canvas1.saveLayer(f, f1, f2, f3, paint0.asFrameworkPaint());
        }
        else {
            canvas0.save();
        }
        canvas0.translate(f, f1);
        canvas0.concat-58bKbWc(this.b());
        if(this.a.getClip() && this.a.getClip()) {
            Outline outline0 = this.a.getOutline();
            if(outline0 instanceof Rectangle) {
                Canvas.clipRect-mtrdD-E$default(canvas0, ((Rectangle)outline0).getRect(), 0, 2, null);
            }
            else if(outline0 instanceof Rounded) {
                Path path0 = this.q;
                if(path0 == null) {
                    path0 = AndroidPath_androidKt.Path();
                    this.q = path0;
                }
                path0.reset();
                Path.addRoundRect$default(path0, ((Rounded)outline0).getRoundRect(), null, 2, null);
                Canvas.clipPath-mtrdD-E$default(canvas0, path0, 0, 2, null);
            }
            else if(outline0 instanceof Generic) {
                Canvas.clipPath-mtrdD-E$default(canvas0, ((Generic)outline0).getPath(), 0, 2, null);
            }
        }
        Function2 function20 = this.d;
        if(function20 != null) {
            function20.invoke(canvas0, null);
        }
        canvas0.restore();
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.a.getLayerId();
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.a.getOwnerViewId();
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.j && !this.g) {
            AndroidComposeView androidComposeView0 = this.c;
            androidComposeView0.invalidate();
            if(!this.j) {
                this.j = true;
                androidComposeView0.notifyLayerIsDirty$ui_release(this, true);
            }
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void inverseTransform-58bKbWc(@NotNull float[] arr_f) {
        float[] arr_f1 = this.a();
        if(arr_f1 != null) {
            Matrix.timesAssign-58bKbWc(arr_f, arr_f1);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean isInLayer-k-4lQ0M(long v) {
        return this.a.getClip() ? ShapeContainingUtilKt.isInOutline$default(this.a.getOutline(), Offset.getX-impl(v), Offset.getY-impl(v), null, null, 24, null) : true;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect mutableRect0, boolean z) {
        if(z) {
            float[] arr_f = this.a();
            if(arr_f == null) {
                mutableRect0.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Matrix.map-impl(arr_f, mutableRect0);
            return;
        }
        Matrix.map-impl(this.b(), mutableRect0);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public long mapOffset-8S9VItk(long v, boolean z) {
        if(z) {
            float[] arr_f = this.a();
            return arr_f == null ? 0x7F8000007F800000L : Matrix.map-MK-Hz9U(arr_f, v);
        }
        return Matrix.map-MK-Hz9U(this.b(), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void move--gyyYBs(long v) {
        this.a.setTopLeft--gyyYBs(v);
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.c);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void resize-ozmzZPI(long v) {
        if(!IntSize.equals-impl0(v, this.f)) {
            this.f = v;
            this.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function2 function20, @NotNull Function0 function00) {
        GraphicsContext graphicsContext0 = this.b;
        if(graphicsContext0 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if(!this.a.isReleased()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.a = graphicsContext0.createGraphicsLayer();
        this.g = false;
        this.d = function20;
        this.e = function00;
        this.o = 0x3F0000003F000000L;
        this.s = false;
        this.f = 0x7FFFFFFF7FFFFFFFL;
        this.p = null;
        this.n = 0;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void transform-58bKbWc(@NotNull float[] arr_f) {
        Matrix.timesAssign-58bKbWc(arr_f, this.b());
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if(this.j) {
            if(!TransformOrigin.equals-impl0(this.o, 0x3F0000003F000000L) && !IntSize.equals-impl0(this.a.getSize-YbymL2g(), this.f)) {
                this.a.setPivotOffset-k-4lQ0M(OffsetKt.Offset(TransformOrigin.getPivotFractionX-impl(this.o) * ((float)IntSize.getWidth-impl(this.f)), TransformOrigin.getPivotFractionY-impl(this.o) * ((float)IntSize.getHeight-impl(this.f))));
            }
            this.a.record-mL-hObY(this.k, this.l, this.f, this.t);
            if(this.j) {
                this.j = false;
                this.c.notifyLayerIsDirty$ui_release(this, false);
            }
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@NotNull ReusableGraphicsLayerScope reusableGraphicsLayerScope0) {
        boolean z;
        int v = reusableGraphicsLayerScope0.getMutatedFields$ui_release() | this.n;
        this.l = reusableGraphicsLayerScope0.getLayoutDirection$ui_release();
        this.k = reusableGraphicsLayerScope0.getGraphicsDensity$ui_release();
        if((v & 0x1000) != 0) {
            this.o = reusableGraphicsLayerScope0.getTransformOrigin-SzJe1aQ();
        }
        if((v & 1) != 0) {
            this.a.setScaleX(reusableGraphicsLayerScope0.getScaleX());
        }
        if((v & 2) != 0) {
            this.a.setScaleY(reusableGraphicsLayerScope0.getScaleY());
        }
        if((v & 4) != 0) {
            this.a.setAlpha(reusableGraphicsLayerScope0.getAlpha());
        }
        if((v & 8) != 0) {
            this.a.setTranslationX(reusableGraphicsLayerScope0.getTranslationX());
        }
        if((v & 16) != 0) {
            this.a.setTranslationY(reusableGraphicsLayerScope0.getTranslationY());
        }
        if((v & 0x20) != 0) {
            this.a.setShadowElevation(reusableGraphicsLayerScope0.getShadowElevation());
            if(reusableGraphicsLayerScope0.getShadowElevation() > 0.0f && !this.s) {
                Function0 function00 = this.e;
                if(function00 != null) {
                    function00.invoke();
                }
            }
        }
        if((v & 0x40) != 0) {
            this.a.setAmbientShadowColor-8_81llA(reusableGraphicsLayerScope0.getAmbientShadowColor-0d7_KjU());
        }
        if((v & 0x80) != 0) {
            this.a.setSpotShadowColor-8_81llA(reusableGraphicsLayerScope0.getSpotShadowColor-0d7_KjU());
        }
        if((v & 0x400) != 0) {
            this.a.setRotationZ(reusableGraphicsLayerScope0.getRotationZ());
        }
        if((v & 0x100) != 0) {
            this.a.setRotationX(reusableGraphicsLayerScope0.getRotationX());
        }
        if((v & 0x200) != 0) {
            this.a.setRotationY(reusableGraphicsLayerScope0.getRotationY());
        }
        if((v & 0x800) != 0) {
            this.a.setCameraDistance(reusableGraphicsLayerScope0.getCameraDistance());
        }
        if((v & 0x1000) != 0) {
            if(TransformOrigin.equals-impl0(this.o, 0x3F0000003F000000L)) {
                this.a.setPivotOffset-k-4lQ0M(0x7FC000007FC00000L);
            }
            else {
                this.a.setPivotOffset-k-4lQ0M(OffsetKt.Offset(TransformOrigin.getPivotFractionX-impl(this.o) * ((float)IntSize.getWidth-impl(this.f)), TransformOrigin.getPivotFractionY-impl(this.o) * ((float)IntSize.getHeight-impl(this.f))));
            }
        }
        if((v & 0x4000) != 0) {
            this.a.setClip(reusableGraphicsLayerScope0.getClip());
        }
        if((0x20000 & v) != 0) {
            this.a.setRenderEffect(reusableGraphicsLayerScope0.getRenderEffect());
        }
        if((0x8000 & v) != 0) {
            GraphicsLayer graphicsLayer0 = this.a;
            int v1 = reusableGraphicsLayerScope0.getCompositingStrategy--NrFUSI();
            if(CompositingStrategy.equals-impl0(v1, 0)) {
                graphicsLayer0.setCompositingStrategy-Wpw9cng(0);
            }
            else if(CompositingStrategy.equals-impl0(v1, 1)) {
                graphicsLayer0.setCompositingStrategy-Wpw9cng(1);
            }
            else {
                if(!CompositingStrategy.equals-impl0(v1, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                graphicsLayer0.setCompositingStrategy-Wpw9cng(2);
            }
        }
        if(Intrinsics.areEqual(this.p, reusableGraphicsLayerScope0.getOutline$ui_release())) {
            z = false;
        }
        else {
            Outline outline0 = reusableGraphicsLayerScope0.getOutline$ui_release();
            this.p = outline0;
            if(outline0 != null) {
                GraphicsLayerKt.setOutline(this.a, outline0);
                if(outline0 instanceof Generic && Build.VERSION.SDK_INT < 33) {
                    Function0 function01 = this.e;
                    if(function01 != null) {
                        function01.invoke();
                    }
                }
            }
            z = true;
        }
        this.n = reusableGraphicsLayerScope0.getMutatedFields$ui_release();
        if(v != 0 || z) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.c);
        }
    }
}

