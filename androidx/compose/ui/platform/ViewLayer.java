package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00A0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 l2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002lmB_\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00128\u0010\u0010\u001A4\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\b\u0012\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010 \u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u001CH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010%\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020!H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010(\u001A\u00020\u000F2\u0006\u0010\u001D\u001A\u00020&H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010$J!\u0010)\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\t2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020+H\u0014\u00A2\u0006\u0004\b,\u0010-J\u000F\u0010.\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b.\u0010/J7\u00106\u001A\u00020\u000F2\u0006\u00100\u001A\u00020\u00192\u0006\u00102\u001A\u0002012\u0006\u00103\u001A\u0002012\u0006\u00104\u001A\u0002012\u0006\u00105\u001A\u000201H\u0014\u00A2\u0006\u0004\b6\u00107J\u000F\u00108\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b8\u0010/J\u000F\u00109\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b9\u0010/J\u000F\u0010:\u001A\u00020\u000FH\u0016\u00A2\u0006\u0004\b:\u0010/J\"\u0010?\u001A\u00020\u001C2\u0006\u0010;\u001A\u00020\u001C2\u0006\u0010<\u001A\u00020\u0019H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010>J\u001F\u0010B\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020@2\u0006\u0010<\u001A\u00020\u0019H\u0016\u00A2\u0006\u0004\bB\u0010CJW\u0010D\u001A\u00020\u000F28\u0010\u0010\u001A4\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r\u00A2\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u00020\u000F0\b2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u000F0\u0011H\u0016\u00A2\u0006\u0004\bD\u0010EJ\u001A\u0010J\u001A\u00020\u000F2\u0006\u0010G\u001A\u00020FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010IJ\u001A\u0010L\u001A\u00020\u000F2\u0006\u0010G\u001A\u00020FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010IR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b5\u0010Q\u001A\u0004\bR\u0010SR*\u0010W\u001A\u00020\u00192\u0006\u0010T\u001A\u00020\u00198\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bU\u0010V\u001A\u0004\bW\u0010\u001B\"\u0004\bX\u0010YR\u001A\u0010_\u001A\u00020Z8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R\u0014\u0010a\u001A\u00020Z8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b`\u0010^R$\u0010g\u001A\u00020b2\u0006\u0010T\u001A\u00020b8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bc\u0010d\"\u0004\be\u0010fR\u0016\u0010k\u001A\u0004\u0018\u00010h8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006n"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "updateLayerProperties", "(Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;)V", "", "hasOverlappingRendering", "()Z", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "updateDisplayList", "forceLayout", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "value", "h", "Z", "isInvalidated", "setInvalidated", "(Z)V", "", "n", "J", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "Companion", "androidx/compose/ui/platform/u1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,495:1\n47#2,5:496\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n310#1:496,5\n*E\n"})
public final class ViewLayer extends View implements GraphicLayerInfo, OwnedLayer {
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR$\u0010\u000E\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f8\u0006@@X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R&\u0010\u0018\u001A\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001B\u001A\u0004\u0018\u00010\u001A8\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u001B\u0010\u001CR\u0018\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u001E\u0010\u001F¨\u0006 "}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "Landroid/view/View;", "view", "", "updateDisplayList", "(Landroid/view/View;)V", "Landroid/view/ViewOutlineProvider;", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "", "<set-?>", "hasRetrievedMethod", "Z", "getHasRetrievedMethod", "()Z", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,495:1\n26#2:496\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n450#1:496\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean getHasRetrievedMethod() [...] // 潜在的解密器

        @NotNull
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.q;
        }

        public final boolean getShouldUseDispatchDraw() [...] // 潜在的解密器

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.u = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@NotNull View view0) {
            Class class0 = String.class;
            Class class1 = Class.class;
            ViewLayer.t = true;
            Class class2 = View.class;
            ViewLayer.r = Build.VERSION.SDK_INT < 28 ? class2.getDeclaredMethod("updateDisplayListIfDirty", null) : ((Method)class1.getDeclaredMethod("getDeclaredMethod", class0, new Class[0].getClass()).invoke(class2, "updateDisplayListIfDirty"));
            ViewLayer.s = class2.getDeclaredField("mRecreateDisplayList");
            Method method0 = ViewLayer.r;
            if(method0 != null) {
                method0.setAccessible(true);
            }
            Field field0 = ViewLayer.s;
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Field field1 = ViewLayer.s;
            if(field1 != null) {
                field1.setBoolean(view0, true);
            }
            Method method1 = ViewLayer.r;
            if(method1 != null) {
                method1.invoke(view0, null);
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AndroidComposeView a;
    public final DrawChildContainer b;
    public Function2 c;
    public Function0 d;
    public final OutlineResolver e;
    public boolean f;
    public Rect g;
    public boolean h;
    public boolean i;
    public final CanvasHolder j;
    public final LayerMatrixCache k;
    public long l;
    public boolean m;
    public final long n;
    public int o;
    public static final a0 p;
    public static final ViewLayer.Companion.OutlineProvider.1 q;
    public static Method r;
    public static Field s;
    public static boolean t;
    public static boolean u;

    static {
        ViewLayer.Companion = new Companion(null);
        ViewLayer.$stable = 8;
        ViewLayer.p = a0.A;
        ViewLayer.q = new ViewLayer.Companion.OutlineProvider.1();  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
    }

    public ViewLayer(@NotNull AndroidComposeView androidComposeView0, @NotNull DrawChildContainer drawChildContainer0, @NotNull Function2 function20, @NotNull Function0 function00) {
        super(androidComposeView0.getContext());
        this.a = androidComposeView0;
        this.b = drawChildContainer0;
        this.c = function20;
        this.d = function00;
        this.e = new OutlineResolver();
        this.j = new CanvasHolder();
        this.k = new LayerMatrixCache(ViewLayer.p);
        this.l = 0x3F0000003F000000L;
        this.m = true;
        this.setWillNotDraw(false);
        drawChildContainer0.addView(this);
        this.n = (long)View.generateViewId();
    }

    public final void a() {
        Rect rect1;
        if(this.f) {
            Rect rect0 = this.g;
            if(rect0 == null) {
                this.g = new Rect(0, 0, this.getWidth(), this.getHeight());
            }
            else {
                Intrinsics.checkNotNull(rect0);
                rect0.set(0, 0, this.getWidth(), this.getHeight());
            }
            rect1 = this.g;
        }
        else {
            rect1 = null;
        }
        this.setClipBounds(rect1);
    }

    public static final OutlineResolver access$getOutlineResolver$p(ViewLayer viewLayer0) {
        return viewLayer0.e;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.setInvalidated(false);
        this.a.requestClearInvalidObservations();
        this.c = null;
        this.d = null;
        this.a.recycle$ui_release(this);
        this.b.removeViewInLayout(this);
    }

    @Override  // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas0) {
        boolean z;
        CanvasHolder canvasHolder0 = this.j;
        Canvas canvas1 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
        AndroidCanvas androidCanvas0 = canvasHolder0.getAndroidCanvas();
        if(this.getManualClipPath() != null || !canvas0.isHardwareAccelerated()) {
            androidCanvas0.save();
            this.e.clipToOutline(androidCanvas0);
            z = true;
        }
        else {
            z = false;
        }
        Function2 function20 = this.c;
        if(function20 != null) {
            function20.invoke(androidCanvas0, null);
        }
        if(z) {
            androidCanvas0.restore();
        }
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas1);
        this.setInvalidated(false);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(@NotNull androidx.compose.ui.graphics.Canvas canvas0, @Nullable GraphicsLayer graphicsLayer0) {
        boolean z = this.getElevation() > 0.0f;
        this.i = z;
        if(z) {
            canvas0.enableZ();
        }
        long v = this.getDrawingTime();
        this.b.drawChild$ui_release(canvas0, this, v);
        if(this.i) {
            canvas0.disableZ();
        }
    }

    @Override  // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return this.getCameraDistance() / ((float)this.getResources().getDisplayMetrics().densityDpi);
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.n;
    }

    private final Path getManualClipPath() {
        if(this.getClipToOutline()) {
            return this.e.getOutlineClipSupported() ? null : this.e.getClipPath();
        }
        return null;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : u1.a(this.a);
    }

    @Override  // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override  // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.h) {
            this.setInvalidated(true);
            super.invalidate();
            this.a.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void inverseTransform-58bKbWc(@NotNull float[] arr_f) {
        float[] arr_f1 = this.k.calculateInverseMatrix-bWbORWo(this);
        if(arr_f1 != null) {
            Matrix.timesAssign-58bKbWc(arr_f, arr_f1);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean isInLayer-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        if(this.f) {
            return 0.0f <= f && f < ((float)this.getWidth()) && 0.0f <= f1 && f1 < ((float)this.getHeight());
        }
        return this.getClipToOutline() ? this.e.isInOutline-k-4lQ0M(v) : true;
    }

    public final boolean isInvalidated() {
        return this.h;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect mutableRect0, boolean z) {
        LayerMatrixCache layerMatrixCache0 = this.k;
        if(z) {
            float[] arr_f = layerMatrixCache0.calculateInverseMatrix-bWbORWo(this);
            if(arr_f != null) {
                Matrix.map-impl(arr_f, mutableRect0);
                return;
            }
            mutableRect0.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        Matrix.map-impl(layerMatrixCache0.calculateMatrix-GrdbGEg(this), mutableRect0);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public long mapOffset-8S9VItk(long v, boolean z) {
        LayerMatrixCache layerMatrixCache0 = this.k;
        if(z) {
            float[] arr_f = layerMatrixCache0.calculateInverseMatrix-bWbORWo(this);
            return arr_f == null ? 0x7F8000007F800000L : Matrix.map-MK-Hz9U(arr_f, v);
        }
        return Matrix.map-MK-Hz9U(layerMatrixCache0.calculateMatrix-GrdbGEg(this), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void move--gyyYBs(long v) {
        int v1 = IntOffset.getX-impl(v);
        int v2 = this.getLeft();
        LayerMatrixCache layerMatrixCache0 = this.k;
        if(v1 != v2) {
            this.offsetLeftAndRight(v1 - this.getLeft());
            layerMatrixCache0.invalidate();
        }
        int v3 = IntOffset.getY-impl(v);
        if(v3 != this.getTop()) {
            this.offsetTopAndBottom(v3 - this.getTop());
            layerMatrixCache0.invalidate();
        }
    }

    @Override  // android.view.View
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void resize-ozmzZPI(long v) {
        int v1 = IntSize.getWidth-impl(v);
        int v2 = IntSize.getHeight-impl(v);
        if(v1 != this.getWidth() || v2 != this.getHeight()) {
            this.setPivotX(TransformOrigin.getPivotFractionX-impl(this.l) * ((float)v1));
            this.setPivotY(TransformOrigin.getPivotFractionY-impl(this.l) * ((float)v2));
            this.setOutlineProvider((this.e.getAndroidOutline() == null ? null : ViewLayer.q));
            this.layout(this.getLeft(), this.getTop(), this.getLeft() + v1, this.getTop() + v2);
            this.a();
            this.k.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function2 function20, @NotNull Function0 function00) {
        this.b.addView(this);
        this.f = false;
        this.i = false;
        this.l = 0x3F0000003F000000L;
        this.c = function20;
        this.d = function00;
    }

    public final void setCameraDistancePx(float f) {
        this.setCameraDistance(f * ((float)this.getResources().getDisplayMetrics().densityDpi));
    }

    private final void setInvalidated(boolean z) {
        if(z != this.h) {
            this.h = z;
            this.a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void transform-58bKbWc(@NotNull float[] arr_f) {
        Matrix.timesAssign-58bKbWc(arr_f, this.k.calculateMatrix-GrdbGEg(this));
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if(this.h && !ViewLayer.u) {
            ViewLayer.Companion.updateDisplayList(this);
            this.setInvalidated(false);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(@NotNull ReusableGraphicsLayerScope reusableGraphicsLayerScope0) {
        int v = reusableGraphicsLayerScope0.getMutatedFields$ui_release() | this.o;
        if((v & 0x1000) != 0) {
            long v1 = reusableGraphicsLayerScope0.getTransformOrigin-SzJe1aQ();
            this.l = v1;
            this.setPivotX(TransformOrigin.getPivotFractionX-impl(v1) * ((float)this.getWidth()));
            this.setPivotY(TransformOrigin.getPivotFractionY-impl(this.l) * ((float)this.getHeight()));
        }
        if((v & 1) != 0) {
            this.setScaleX(reusableGraphicsLayerScope0.getScaleX());
        }
        if((v & 2) != 0) {
            this.setScaleY(reusableGraphicsLayerScope0.getScaleY());
        }
        if((v & 4) != 0) {
            this.setAlpha(reusableGraphicsLayerScope0.getAlpha());
        }
        if((v & 8) != 0) {
            this.setTranslationX(reusableGraphicsLayerScope0.getTranslationX());
        }
        if((v & 16) != 0) {
            this.setTranslationY(reusableGraphicsLayerScope0.getTranslationY());
        }
        if((v & 0x20) != 0) {
            this.setElevation(reusableGraphicsLayerScope0.getShadowElevation());
        }
        if((v & 0x400) != 0) {
            this.setRotation(reusableGraphicsLayerScope0.getRotationZ());
        }
        if((v & 0x100) != 0) {
            this.setRotationX(reusableGraphicsLayerScope0.getRotationX());
        }
        if((v & 0x200) != 0) {
            this.setRotationY(reusableGraphicsLayerScope0.getRotationY());
        }
        if((v & 0x800) != 0) {
            this.setCameraDistancePx(reusableGraphicsLayerScope0.getCameraDistance());
        }
        boolean z = true;
        int v2 = this.getManualClipPath() == null ? 0 : 1;
        boolean z1 = reusableGraphicsLayerScope0.getClip() && reusableGraphicsLayerScope0.getShape() != RectangleShapeKt.getRectangleShape();
        if((v & 0x6000) != 0) {
            this.f = reusableGraphicsLayerScope0.getClip() && reusableGraphicsLayerScope0.getShape() == RectangleShapeKt.getRectangleShape();
            this.a();
            this.setClipToOutline(z1);
        }
        boolean z2 = this.e.update-S_szKao(reusableGraphicsLayerScope0.getOutline$ui_release(), reusableGraphicsLayerScope0.getAlpha(), z1, reusableGraphicsLayerScope0.getShadowElevation(), reusableGraphicsLayerScope0.getSize-NH-jbRc());
        OutlineResolver outlineResolver0 = this.e;
        if(outlineResolver0.getCacheIsDirty$ui_release()) {
            this.setOutlineProvider((outlineResolver0.getAndroidOutline() == null ? null : ViewLayer.q));
        }
        int v3 = this.getManualClipPath() == null ? 0 : 1;
        if(v2 != v3 || v3 != 0 && z2) {
            this.invalidate();
        }
        if(!this.i && this.getElevation() > 0.0f) {
            Function0 function00 = this.d;
            if(function00 != null) {
                function00.invoke();
            }
        }
        if((v & 0x1F1B) != 0) {
            this.k.invalidate();
        }
        int v4 = Build.VERSION.SDK_INT;
        if(v4 >= 28) {
            v1 v10 = v1.a;
            if((v & 0x40) != 0) {
                v10.a(this, ColorKt.toArgb-8_81llA(reusableGraphicsLayerScope0.getAmbientShadowColor-0d7_KjU()));
            }
            if((v & 0x80) != 0) {
                v10.b(this, ColorKt.toArgb-8_81llA(reusableGraphicsLayerScope0.getSpotShadowColor-0d7_KjU()));
            }
        }
        if(v4 >= 0x1F && (0x20000 & v) != 0) {
            w1.a.a(this, reusableGraphicsLayerScope0.getRenderEffect());
        }
        if((v & 0x8000) != 0) {
            int v5 = reusableGraphicsLayerScope0.getCompositingStrategy--NrFUSI();
            if(CompositingStrategy.equals-impl0(v5, 1)) {
                this.setLayerType(2, null);
            }
            else if(CompositingStrategy.equals-impl0(v5, 2)) {
                this.setLayerType(0, null);
                z = false;
            }
            else {
                this.setLayerType(0, null);
            }
            this.m = z;
        }
        this.o = reusableGraphicsLayerScope0.getMutatedFields$ui_release();
    }
}

