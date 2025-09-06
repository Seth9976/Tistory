package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001A\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B#\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\f\u0010\rJ@\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0017\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014\u00A2\u0006\u0002\b\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u00162\u0006\u0010 \u001A\u00020\u001FH\u0014\u00A2\u0006\u0004\b!\u0010\"J7\u0010)\u001A\u00020\u00162\u0006\u0010#\u001A\u00020\u000B2\u0006\u0010%\u001A\u00020$2\u0006\u0010&\u001A\u00020$2\u0006\u0010\'\u001A\u00020$2\u0006\u0010(\u001A\u00020$H\u0014\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b+\u0010\u001CR\u0017\u0010\u0002\u001A\u00020\u00018\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b(\u00100\u001A\u0004\b1\u00102R\"\u00105\u001A\u00020\u000B8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001E\"\u0004\b6\u00107R*\u0010<\u001A\u00020\u000B2\u0006\u00108\u001A\u00020\u000B8\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b9\u00104\u001A\u0004\b:\u0010\u001E\"\u0004\b;\u00107\u00A8\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroid/view/View;Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "Landroid/graphics/Outline;", "outline", "", "setLayerOutline", "(Landroid/graphics/Outline;)Z", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "drawBlock", "setDrawParams", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "d", "Z", "isInvalidated", "setInvalidated", "(Z)V", "value", "f", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,562:1\n47#2,3:563\n50#2,2:592\n329#3,26:566\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/ViewLayer\n*L\n122#1:563,3\n122#1:592,2\n123#1:566,26\n*E\n"})
public final class ViewLayer extends View {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer$Companion;", "", "Landroid/view/ViewOutlineProvider;", "LayerOutlineProvider", "Landroid/view/ViewOutlineProvider;", "getLayerOutlineProvider$ui_graphics_release", "()Landroid/view/ViewOutlineProvider;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final ViewOutlineProvider getLayerOutlineProvider$ui_graphics_release() {
            return ViewLayer.k;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final View a;
    public final CanvasHolder b;
    public final CanvasDrawScope c;
    public boolean d;
    public Outline e;
    public boolean f;
    public Density g;
    public LayoutDirection h;
    public Function1 i;
    public GraphicsLayer j;
    public static final ViewLayer.Companion.LayerOutlineProvider.1 k;

    static {
        ViewLayer.Companion = new Companion(null);
        ViewLayer.k = new ViewLayer.Companion.LayerOutlineProvider.1();  // 初始化器: Landroid/view/ViewOutlineProvider;-><init>()V
    }

    public ViewLayer(@NotNull View view0, @NotNull CanvasHolder canvasHolder0, @NotNull CanvasDrawScope canvasDrawScope0) {
        super(view0.getContext());
        this.a = view0;
        this.b = canvasHolder0;
        this.c = canvasDrawScope0;
        this.setOutlineProvider(ViewLayer.k);
        this.f = true;
        this.g = DrawContextKt.getDefaultDensity();
        this.h = LayoutDirection.Ltr;
        this.i = GraphicsLayerImpl.Companion.getDefaultDrawBlock();
        this.setWillNotDraw(false);
        this.setClipBounds(null);
    }

    public ViewLayer(View view0, CanvasHolder canvasHolder0, CanvasDrawScope canvasDrawScope0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            canvasHolder0 = new CanvasHolder();
        }
        if((v & 4) != 0) {
            canvasDrawScope0 = new CanvasDrawScope();
        }
        this(view0, canvasHolder0, canvasDrawScope0);
    }

    @Override  // android.view.View
    public void dispatchDraw(@NotNull Canvas canvas0) {
        this.b.getAndroidCanvas().setInternalCanvas(canvas0);
        AndroidCanvas androidCanvas0 = this.b.getAndroidCanvas();
        Density density0 = this.g;
        LayoutDirection layoutDirection0 = this.h;
        long v = SizeKt.Size(this.getWidth(), this.getHeight());
        GraphicsLayer graphicsLayer0 = this.j;
        Function1 function10 = this.i;
        Density density1 = this.c.getDrawContext().getDensity();
        LayoutDirection layoutDirection1 = this.c.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas1 = this.c.getDrawContext().getCanvas();
        long v1 = this.c.getDrawContext().getSize-NH-jbRc();
        GraphicsLayer graphicsLayer1 = this.c.getDrawContext().getGraphicsLayer();
        DrawContext drawContext0 = this.c.getDrawContext();
        drawContext0.setDensity(density0);
        drawContext0.setLayoutDirection(layoutDirection0);
        drawContext0.setCanvas(androidCanvas0);
        drawContext0.setSize-uvyYCjk(v);
        drawContext0.setGraphicsLayer(graphicsLayer0);
        androidCanvas0.save();
        try {
            function10.invoke(this.c);
        }
        finally {
            androidCanvas0.restore();
            DrawContext drawContext1 = this.c.getDrawContext();
            drawContext1.setDensity(density1);
            drawContext1.setLayoutDirection(layoutDirection1);
            drawContext1.setCanvas(canvas1);
            drawContext1.setSize-uvyYCjk(v1);
            drawContext1.setGraphicsLayer(graphicsLayer1);
        }
        this.b.getAndroidCanvas().setInternalCanvas(this.b.getAndroidCanvas().getInternalCanvas());
        this.d = false;
    }

    @Override  // android.view.View
    public void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.b;
    }

    @NotNull
    public final View getOwnerView() {
        return this.a;
    }

    @Override  // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override  // android.view.View
    public void invalidate() {
        if(!this.d) {
            this.d = true;
            super.invalidate();
        }
    }

    public final boolean isInvalidated() {
        return this.d;
    }

    @Override  // android.view.View
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if(this.f != z) {
            this.f = z;
            this.invalidate();
        }
    }

    public final void setDrawParams(@NotNull Density density0, @NotNull LayoutDirection layoutDirection0, @Nullable GraphicsLayer graphicsLayer0, @NotNull Function1 function10) {
        this.g = density0;
        this.h = layoutDirection0;
        this.i = function10;
        this.j = graphicsLayer0;
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    public final boolean setLayerOutline(@Nullable Outline outline0) {
        this.e = outline0;
        this.invalidateOutline();
        return true;
    }
}

