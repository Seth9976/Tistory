package androidx.compose.ui.platform;

import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002FGBW\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00128\u0010\r\u001A4\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u000E\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010 \u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\u001CH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010#\u001A\u00020\f2\u0006\u0010\u0017\u001A\u00020!H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010\u001FJ\u000F\u0010$\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b$\u0010%J!\u0010&\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\u00062\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016\u00A2\u0006\u0004\b&\u0010\'J\u000F\u0010(\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b(\u0010%J\u000F\u0010)\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b)\u0010%J\"\u0010.\u001A\u00020\u00162\u0006\u0010*\u001A\u00020\u00162\u0006\u0010+\u001A\u00020\u0018H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-J\u001F\u00101\u001A\u00020\f2\u0006\u00100\u001A\u00020/2\u0006\u0010+\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b1\u00102JW\u00103\u001A\u00020\f28\u0010\r\u001A4\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n\u00A2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\f0\u000EH\u0016\u00A2\u0006\u0004\b3\u00104J\u001A\u00109\u001A\u00020\f2\u0006\u00106\u001A\u000205H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108J\u001A\u0010;\u001A\u00020\f2\u0006\u00106\u001A\u000205H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b:\u00108R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?R\u0014\u0010C\u001A\u00020@8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010BR\u0014\u0010E\u001A\u00020@8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bD\u0010B\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006H"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "()V", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "Companion", "androidx/compose/ui/platform/j1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,410:1\n1#2:411\n*E\n"})
public final class RenderNodeLayer implements GraphicLayerInfo, OwnedLayer {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "getMatrix", "Lkotlin/jvm/functions/Function2;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AndroidComposeView a;
    public Function2 b;
    public Function0 c;
    public boolean d;
    public final OutlineResolver e;
    public boolean f;
    public boolean g;
    public Paint h;
    public final LayerMatrixCache i;
    public final CanvasHolder j;
    public long k;
    public final DeviceRenderNode l;
    public int m;
    public static final a0 n;

    static {
        RenderNodeLayer.Companion = new Companion(null);
        RenderNodeLayer.$stable = 8;
        RenderNodeLayer.n = a0.z;
    }

    public RenderNodeLayer(@NotNull AndroidComposeView androidComposeView0, @NotNull Function2 function20, @NotNull Function0 function00) {
        this.a = androidComposeView0;
        this.b = function20;
        this.c = function00;
        this.e = new OutlineResolver();
        this.i = new LayerMatrixCache(RenderNodeLayer.n);
        this.j = new CanvasHolder();
        this.k = 0x3F0000003F000000L;
        RenderNodeApi29 renderNodeApi290 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView0) : new RenderNodeApi23(androidComposeView0);
        renderNodeApi290.setHasOverlappingRendering(true);
        renderNodeApi290.setClipToBounds(false);
        this.l = renderNodeApi290;
    }

    public final void a(boolean z) {
        if(z != this.d) {
            this.d = z;
            this.a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        DeviceRenderNode deviceRenderNode0 = this.l;
        if(deviceRenderNode0.getHasDisplayList()) {
            deviceRenderNode0.discardDisplayList();
        }
        this.b = null;
        this.c = null;
        this.f = true;
        this.a(false);
        this.a.requestClearInvalidObservations();
        this.a.recycle$ui_release(this);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        boolean z = canvas1.isHardwareAccelerated();
        boolean z1 = false;
        DeviceRenderNode deviceRenderNode0 = this.l;
        if(z) {
            this.updateDisplayList();
            if(deviceRenderNode0.getElevation() > 0.0f) {
                z1 = true;
            }
            this.g = z1;
            if(z1) {
                canvas0.enableZ();
            }
            deviceRenderNode0.drawInto(canvas1);
            if(this.g) {
                canvas0.disableZ();
            }
        }
        else {
            float f = (float)deviceRenderNode0.getLeft();
            float f1 = (float)deviceRenderNode0.getTop();
            float f2 = (float)deviceRenderNode0.getRight();
            float f3 = (float)deviceRenderNode0.getBottom();
            if(deviceRenderNode0.getAlpha() < 1.0f) {
                Paint paint0 = this.h;
                if(paint0 == null) {
                    paint0 = AndroidPaint_androidKt.Paint();
                    this.h = paint0;
                }
                paint0.setAlpha(deviceRenderNode0.getAlpha());
                canvas1.saveLayer(f, f1, f2, f3, paint0.asFrameworkPaint());
            }
            else {
                canvas0.save();
            }
            canvas0.translate(f, f1);
            canvas0.concat-58bKbWc(this.i.calculateMatrix-GrdbGEg(deviceRenderNode0));
            if(deviceRenderNode0.getClipToOutline() || deviceRenderNode0.getClipToBounds()) {
                this.e.clipToOutline(canvas0);
            }
            Function2 function20 = this.b;
            if(function20 != null) {
                function20.invoke(canvas0, null);
            }
            canvas0.restore();
            this.a(false);
        }
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.l.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : j1.a(this.a);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.d && !this.f) {
            this.a.invalidate();
            this.a(true);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void inverseTransform-58bKbWc(@NotNull float[] arr_f) {
        float[] arr_f1 = this.i.calculateInverseMatrix-bWbORWo(this.l);
        if(arr_f1 != null) {
            Matrix.timesAssign-58bKbWc(arr_f, arr_f1);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean isInLayer-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        DeviceRenderNode deviceRenderNode0 = this.l;
        if(deviceRenderNode0.getClipToBounds()) {
            return 0.0f <= f && f < ((float)deviceRenderNode0.getWidth()) && 0.0f <= f1 && f1 < ((float)deviceRenderNode0.getHeight());
        }
        return deviceRenderNode0.getClipToOutline() ? this.e.isInOutline-k-4lQ0M(v) : true;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect mutableRect0, boolean z) {
        DeviceRenderNode deviceRenderNode0 = this.l;
        LayerMatrixCache layerMatrixCache0 = this.i;
        if(z) {
            float[] arr_f = layerMatrixCache0.calculateInverseMatrix-bWbORWo(deviceRenderNode0);
            if(arr_f == null) {
                mutableRect0.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Matrix.map-impl(arr_f, mutableRect0);
            return;
        }
        Matrix.map-impl(layerMatrixCache0.calculateMatrix-GrdbGEg(deviceRenderNode0), mutableRect0);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public long mapOffset-8S9VItk(long v, boolean z) {
        DeviceRenderNode deviceRenderNode0 = this.l;
        LayerMatrixCache layerMatrixCache0 = this.i;
        if(z) {
            float[] arr_f = layerMatrixCache0.calculateInverseMatrix-bWbORWo(deviceRenderNode0);
            return arr_f == null ? 0x7F8000007F800000L : Matrix.map-MK-Hz9U(arr_f, v);
        }
        return Matrix.map-MK-Hz9U(layerMatrixCache0.calculateMatrix-GrdbGEg(deviceRenderNode0), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void move--gyyYBs(long v) {
        DeviceRenderNode deviceRenderNode0 = this.l;
        int v1 = deviceRenderNode0.getLeft();
        int v2 = deviceRenderNode0.getTop();
        int v3 = IntOffset.getX-impl(v);
        int v4 = IntOffset.getY-impl(v);
        if(v1 != v3 || v2 != v4) {
            if(v1 != v3) {
                deviceRenderNode0.offsetLeftAndRight(v3 - v1);
            }
            if(v2 != v4) {
                deviceRenderNode0.offsetTopAndBottom(v4 - v2);
            }
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.a);
            this.i.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void resize-ozmzZPI(long v) {
        int v1 = IntSize.getWidth-impl(v);
        int v2 = IntSize.getHeight-impl(v);
        DeviceRenderNode deviceRenderNode0 = this.l;
        deviceRenderNode0.setPivotX(TransformOrigin.getPivotFractionX-impl(this.k) * ((float)v1));
        deviceRenderNode0.setPivotY(TransformOrigin.getPivotFractionY-impl(this.k) * ((float)v2));
        if(deviceRenderNode0.setPosition(deviceRenderNode0.getLeft(), deviceRenderNode0.getTop(), deviceRenderNode0.getLeft() + v1, deviceRenderNode0.getTop() + v2)) {
            deviceRenderNode0.setOutline(this.e.getAndroidOutline());
            this.invalidate();
            this.i.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function2 function20, @NotNull Function0 function00) {
        this.a(false);
        this.f = false;
        this.g = false;
        this.k = 0x3F0000003F000000L;
        this.b = function20;
        this.c = function00;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void transform-58bKbWc(@NotNull float[] arr_f) {
        Matrix.timesAssign-58bKbWc(arr_f, this.i.calculateMatrix-GrdbGEg(this.l));
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        Path path0;
        DeviceRenderNode deviceRenderNode0 = this.l;
        if(this.d || !deviceRenderNode0.getHasDisplayList()) {
            if(deviceRenderNode0.getClipToOutline()) {
                OutlineResolver outlineResolver0 = this.e;
                path0 = outlineResolver0.getOutlineClipSupported() ? null : outlineResolver0.getClipPath();
            }
            else {
                path0 = null;
            }
            Function2 function20 = this.b;
            if(function20 != null) {
                k1 k10 = new k1(function20, 0);
                deviceRenderNode0.record(this.j, path0, k10);
            }
            this.a(false);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@NotNull ReusableGraphicsLayerScope reusableGraphicsLayerScope0) {
        int v = reusableGraphicsLayerScope0.getMutatedFields$ui_release() | this.m;
        if((v & 0x1000) != 0) {
            this.k = reusableGraphicsLayerScope0.getTransformOrigin-SzJe1aQ();
        }
        DeviceRenderNode deviceRenderNode0 = this.l;
        boolean z = deviceRenderNode0.getClipToOutline();
        int v1 = 1;
        OutlineResolver outlineResolver0 = this.e;
        int v2 = !z || outlineResolver0.getOutlineClipSupported() ? 0 : 1;
        if((v & 1) != 0) {
            deviceRenderNode0.setScaleX(reusableGraphicsLayerScope0.getScaleX());
        }
        if((v & 2) != 0) {
            deviceRenderNode0.setScaleY(reusableGraphicsLayerScope0.getScaleY());
        }
        if((v & 4) != 0) {
            deviceRenderNode0.setAlpha(reusableGraphicsLayerScope0.getAlpha());
        }
        if((v & 8) != 0) {
            deviceRenderNode0.setTranslationX(reusableGraphicsLayerScope0.getTranslationX());
        }
        if((v & 16) != 0) {
            deviceRenderNode0.setTranslationY(reusableGraphicsLayerScope0.getTranslationY());
        }
        if((v & 0x20) != 0) {
            deviceRenderNode0.setElevation(reusableGraphicsLayerScope0.getShadowElevation());
        }
        if((v & 0x40) != 0) {
            deviceRenderNode0.setAmbientShadowColor(ColorKt.toArgb-8_81llA(reusableGraphicsLayerScope0.getAmbientShadowColor-0d7_KjU()));
        }
        if((v & 0x80) != 0) {
            deviceRenderNode0.setSpotShadowColor(ColorKt.toArgb-8_81llA(reusableGraphicsLayerScope0.getSpotShadowColor-0d7_KjU()));
        }
        if((v & 0x400) != 0) {
            deviceRenderNode0.setRotationZ(reusableGraphicsLayerScope0.getRotationZ());
        }
        if((v & 0x100) != 0) {
            deviceRenderNode0.setRotationX(reusableGraphicsLayerScope0.getRotationX());
        }
        if((v & 0x200) != 0) {
            deviceRenderNode0.setRotationY(reusableGraphicsLayerScope0.getRotationY());
        }
        if((v & 0x800) != 0) {
            deviceRenderNode0.setCameraDistance(reusableGraphicsLayerScope0.getCameraDistance());
        }
        if((v & 0x1000) != 0) {
            deviceRenderNode0.setPivotX(TransformOrigin.getPivotFractionX-impl(this.k) * ((float)deviceRenderNode0.getWidth()));
            deviceRenderNode0.setPivotY(TransformOrigin.getPivotFractionY-impl(this.k) * ((float)deviceRenderNode0.getHeight()));
        }
        boolean z1 = reusableGraphicsLayerScope0.getClip() && reusableGraphicsLayerScope0.getShape() != RectangleShapeKt.getRectangleShape();
        if((v & 0x6000) != 0) {
            deviceRenderNode0.setClipToOutline(z1);
            deviceRenderNode0.setClipToBounds(reusableGraphicsLayerScope0.getClip() && reusableGraphicsLayerScope0.getShape() == RectangleShapeKt.getRectangleShape());
        }
        if((0x20000 & v) != 0) {
            deviceRenderNode0.setRenderEffect(reusableGraphicsLayerScope0.getRenderEffect());
        }
        if((0x8000 & v) != 0) {
            deviceRenderNode0.setCompositingStrategy-aDBOjCE(reusableGraphicsLayerScope0.getCompositingStrategy--NrFUSI());
        }
        boolean z2 = this.e.update-S_szKao(reusableGraphicsLayerScope0.getOutline$ui_release(), reusableGraphicsLayerScope0.getAlpha(), z1, reusableGraphicsLayerScope0.getShadowElevation(), reusableGraphicsLayerScope0.getSize-NH-jbRc());
        if(outlineResolver0.getCacheIsDirty$ui_release()) {
            deviceRenderNode0.setOutline(outlineResolver0.getAndroidOutline());
        }
        if(!z1 || outlineResolver0.getOutlineClipSupported()) {
            v1 = 0;
        }
        if(v2 != v1 || v1 != 0 && z2) {
            this.invalidate();
        }
        else {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.a);
        }
        if(!this.g && deviceRenderNode0.getElevation() > 0.0f) {
            Function0 function00 = this.c;
            if(function00 != null) {
                function00.invoke();
            }
        }
        if((v & 0x1F1B) != 0) {
            this.i.invalidate();
        }
        this.m = reusableGraphicsLayerScope0.getMutatedFields$ui_release();
    }
}

