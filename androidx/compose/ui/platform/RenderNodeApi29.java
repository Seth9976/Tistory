package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build.VERSION;
import androidx.activity.s;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1.d;
import s1.c;

@RequiresApi(29)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J/\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001B\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001AJ5\u0010#\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0012\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000E0 H\u0016\u00A2\u0006\u0004\b#\u0010$J\u0017\u0010\'\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010)\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b)\u0010(J\u0017\u0010,\u001A\u00020\u000E2\u0006\u0010+\u001A\u00020*H\u0016\u00A2\u0006\u0004\b,\u0010-J\u0017\u0010.\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b.\u0010/J\u000F\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b1\u00102J\u000F\u00103\u001A\u00020\u000EH\u0016\u00A2\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R\u0014\u0010<\u001A\u0002098VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b:\u0010;R\u0014\u0010\u0012\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b=\u0010>R\u0014\u0010\u0013\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b?\u0010>R\u0014\u0010\u0014\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010>R\u0014\u0010\u0015\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010>R\u0014\u0010C\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bB\u0010>R\u0014\u0010E\u001A\u00020\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bD\u0010>R$\u0010L\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010O\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bM\u0010I\"\u0004\bN\u0010KR$\u0010R\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bP\u0010I\"\u0004\bQ\u0010KR$\u0010U\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bS\u0010I\"\u0004\bT\u0010KR$\u0010X\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bV\u0010I\"\u0004\bW\u0010KR$\u0010[\u001A\u00020\u00112\u0006\u0010G\u001A\u00020\u00118V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bY\u0010>\"\u0004\bZ\u0010\u001AR$\u0010^\u001A\u00020\u00112\u0006\u0010G\u001A\u00020\u00118V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\\\u0010>\"\u0004\b]\u0010\u001AR$\u0010a\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b_\u0010I\"\u0004\b`\u0010KR$\u0010d\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bb\u0010I\"\u0004\bc\u0010KR$\u0010g\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\be\u0010I\"\u0004\bf\u0010KR$\u0010j\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bh\u0010I\"\u0004\bi\u0010KR$\u0010m\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bk\u0010I\"\u0004\bl\u0010KR$\u0010p\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bn\u0010I\"\u0004\bo\u0010KR$\u0010t\u001A\u00020\u00062\u0006\u0010G\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bq\u0010\b\"\u0004\br\u0010sR$\u0010w\u001A\u00020\u00062\u0006\u0010G\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bu\u0010\b\"\u0004\bv\u0010sR$\u0010z\u001A\u00020F2\u0006\u0010G\u001A\u00020F8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bx\u0010I\"\u0004\by\u0010KR)\u0010\u0080\u0001\u001A\u0004\u0018\u00010{2\b\u0010G\u001A\u0004\u0018\u00010{8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b|\u0010}\"\u0004\b~\u0010\u007FR/\u0010\u0084\u0001\u001A\u00030\u0081\u00012\u0007\u0010G\u001A\u00030\u0081\u00018V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\u001A\u0005\b\u0082\u0001\u0010>\"\u0005\b\u0083\u0001\u0010\u001AR\u0016\u0010\u0086\u0001\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0085\u0001\u0010\b\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "isUsingCompositingLayer$ui_release", "()Z", "isUsingCompositingLayer", "hasOverlappingRendering$ui_release", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "", "setOutline", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "setPosition", "(IIII)Z", "offset", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
public final class RenderNodeApi29 implements DeviceRenderNode {
    public static final int $stable = 8;
    public final AndroidComposeView a;
    public final RenderNode b;
    public RenderEffect c;
    public int d;

    public RenderNodeApi29(@NotNull AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
        this.b = h1.d();
        this.d = 0;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        d.j(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas0) {
        c.i(canvas0, this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(d.b(this.b), this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom(), this.b.getWidth(), this.b.getHeight(), this.b.getScaleX(), this.b.getScaleY(), this.b.getTranslationX(), this.b.getTranslationY(), h1.a(this.b), h1.b(this.b), h1.t(this.b), h1.s(this.b), h1.x(this.b), h1.z(this.b), h1.B(this.b), h1.D(this.b), this.b.getPivotY(), this.b.getClipToOutline(), this.b.getClipToBounds(), this.b.getAlpha(), this.c, this.d, null);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.b.getAlpha();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return h1.b(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.b.getBottom();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return h1.B(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.b.getClipToBounds();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.b.getClipToOutline();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getCompositingStrategy--NrFUSI() {
        return this.d;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return h1.a(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return d.o(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix0) {
        h1.o(this.b, matrix0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.b.getLeft();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix0) {
        d.l(this.b, matrix0);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return h1.D(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.b.getPivotY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.c;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.b.getRight();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return h1.x(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return h1.z(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return h1.s(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.b.getScaleX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.b.getScaleY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        return h1.t(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.b.getTop();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.b.getTranslationX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.b.getTranslationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return d.b(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.b.getWidth();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return h1.r(this.b);
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        return h1.w(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int v) {
        this.b.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int v) {
        h1.n(this.b, v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder0, @Nullable Path path0, @NotNull Function1 function10) {
        RecordingCanvas recordingCanvas0 = c.d(this.b);
        Canvas canvas0 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(recordingCanvas0);
        AndroidCanvas androidCanvas0 = canvasHolder0.getAndroidCanvas();
        if(path0 != null) {
            androidCanvas0.save();
            androidx.compose.ui.graphics.Canvas.clipPath-mtrdD-E$default(androidCanvas0, path0, 0, 2, null);
        }
        function10.invoke(androidCanvas0);
        if(path0 != null) {
            androidCanvas0.restore();
        }
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
        c.j(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        d.r(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int v) {
        c.l(this.b, v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        d.C(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        d.n(this.b, z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        d.t(this.b, z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCompositingStrategy-aDBOjCE(int v) {
        RenderNode renderNode0 = this.b;
        if(CompositingStrategy.equals-impl0(v, 1)) {
            s.f(renderNode0);
            d.q(renderNode0);
        }
        else if(CompositingStrategy.equals-impl0(v, 2)) {
            s.s(renderNode0);
            d.u(renderNode0);
        }
        else {
            s.s(renderNode0);
            d.q(renderNode0);
        }
        this.d = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        d.D(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline0) {
        c.o(this.b, outline0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        d.A(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        d.B(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int v, int v1, int v2, int v3) {
        return this.b.setPosition(v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.c = renderEffect0;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            i1.a.a(this.b, renderEffect0);
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        d.z(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        c.x(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        c.A(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        d.v(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        d.x(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int v) {
        c.y(this.b, v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        c.k(this.b, f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        d.k(this.b, f);
    }
}

