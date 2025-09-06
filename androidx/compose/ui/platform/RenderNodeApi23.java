package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0094\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\r\u001A\u00020\nH\u0000\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0016\u00A2\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001A\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001C\u001A\u00020\u00102\u0006\u0010\u0019\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001BJ5\u0010$\u001A\u00020\u00102\u0006\u0010\u001E\u001A\u00020\u001D2\b\u0010 \u001A\u0004\u0018\u00010\u001F2\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!H\u0016\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010*\u001A\u00020\u00102\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b*\u0010)J\u0017\u0010-\u001A\u00020\u00102\u0006\u0010,\u001A\u00020+H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0017\u0010/\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b/\u00100J\u000F\u00102\u001A\u000201H\u0016\u00A2\u0006\u0004\b2\u00103J\u000F\u00104\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\"\u0010\u0013\u001A\u00020\u00068\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\b\"\u0004\b=\u0010\u001BR\"\u0010\u0014\u001A\u00020\u00068\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\b>\u0010;\u001A\u0004\b?\u0010\b\"\u0004\b@\u0010\u001BR\"\u0010\u0015\u001A\u00020\u00068\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010;\u001A\u0004\bB\u0010\b\"\u0004\bC\u0010\u001BR\"\u0010\u0016\u001A\u00020\u00068\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010;\u001A\u0004\bE\u0010\b\"\u0004\bF\u0010\u001BR$\u0010N\u001A\u0004\u0018\u00010G8\u0016@\u0016X\u0096\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010U\u001A\u00020\n2\u0006\u0010O\u001A\u00020\n8\u0016@VX\u0096\u000E\u00A2\u0006\u0012\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010\f\"\u0004\bS\u0010TR\u0014\u0010Y\u001A\u00020V8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bW\u0010XR\u0014\u0010[\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bZ\u0010\bR\u0014\u0010]\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\\\u0010\bR$\u0010c\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010f\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bd\u0010`\"\u0004\be\u0010bR$\u0010i\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bg\u0010`\"\u0004\bh\u0010bR$\u0010l\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bj\u0010`\"\u0004\bk\u0010bR$\u0010o\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bm\u0010`\"\u0004\bn\u0010bR$\u0010r\u001A\u00020\u00062\u0006\u0010O\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bp\u0010\b\"\u0004\bq\u0010\u001BR$\u0010u\u001A\u00020\u00062\u0006\u0010O\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bs\u0010\b\"\u0004\bt\u0010\u001BR$\u0010x\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bv\u0010`\"\u0004\bw\u0010bR$\u0010{\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\by\u0010`\"\u0004\bz\u0010bR$\u0010~\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b|\u0010`\"\u0004\b}\u0010bR&\u0010\u0081\u0001\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\r\u001A\u0004\b\u007F\u0010`\"\u0005\b\u0080\u0001\u0010bR\'\u0010\u0084\u0001\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u0082\u0001\u0010`\"\u0005\b\u0083\u0001\u0010bR\'\u0010\u0087\u0001\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u0085\u0001\u0010`\"\u0005\b\u0086\u0001\u0010bR\'\u0010\u008A\u0001\u001A\u00020\n2\u0006\u0010O\u001A\u00020\n8V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u0088\u0001\u0010\f\"\u0005\b\u0089\u0001\u0010TR\'\u0010\u008D\u0001\u001A\u00020^2\u0006\u0010O\u001A\u00020^8V@VX\u0096\u000E\u00A2\u0006\u000E\u001A\u0005\b\u008B\u0001\u0010`\"\u0005\b\u008C\u0001\u0010bR/\u0010\u0091\u0001\u001A\u00030\u008E\u00012\u0007\u0010O\u001A\u00030\u008E\u00018V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000E\u001A\u0005\b\u008F\u0001\u0010\b\"\u0005\b\u0090\u0001\u0010\u001BR\u0016\u0010\u0093\u0001\u001A\u00020\n8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0092\u0001\u0010\f\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "getLayerType$ui_release", "()I", "getLayerType", "", "hasOverlappingRendering$ui_release", "()Z", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "", "setOutline", "(Landroid/graphics/Outline;)V", "left", "top", "right", "bottom", "setPosition", "(IIII)Z", "offset", "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "d", "I", "getLeft", "setLeft", "e", "getTop", "setTop", "f", "getRight", "setRight", "g", "getBottom", "setBottom", "Landroidx/compose/ui/graphics/RenderEffect;", "h", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "value", "i", "Z", "getClipToBounds", "setClipToBounds", "(Z)V", "clipToBounds", "", "getUniqueId", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "clipToOutline", "getAlpha", "setAlpha", "alpha", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
public final class RenderNodeApi23 implements DeviceRenderNode {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001A\u00020\u00028\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "", "testFailCreateRenderNode", "Z", "getTestFailCreateRenderNode$ui_release", "()Z", "setTestFailCreateRenderNode$ui_release", "(Z)V", "needToValidateAccess", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final boolean getTestFailCreateRenderNode$ui_release() {
            return false;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z) {
            RenderNodeApi23.j = z;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AndroidComposeView a;
    public final RenderNode b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public RenderEffect h;
    public boolean i;
    public static boolean j;
    public static boolean k;

    static {
        RenderNodeApi23.Companion = new Companion(null);
        RenderNodeApi23.$stable = 8;
        RenderNodeApi23.k = true;
    }

    public RenderNodeApi23(@NotNull AndroidComposeView androidComposeView0) {
        this.a = androidComposeView0;
        RenderNode renderNode0 = RenderNode.create("Compose", androidComposeView0);
        this.b = renderNode0;
        this.c = 0;
        if(RenderNodeApi23.k) {
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
                int v = m1.a.a(renderNode0);
                m1.a.c(renderNode0, v);
                int v1 = m1.a.b(renderNode0);
                m1.a.d(renderNode0, v1);
            }
            l1.a.a(renderNode0);
            renderNode0.setLayerType(0);
            renderNode0.setHasOverlappingRendering(renderNode0.hasOverlappingRendering());
            RenderNodeApi23.k = false;
        }
        if(RenderNodeApi23.j) {
            throw new NoClassDefFoundError();
        }
    }

    public static final boolean access$getTestFailCreateRenderNode$cp() [...] // 潜在的解密器

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        l1.a.a(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNull(canvas0, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas)canvas0).drawRenderNode(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.b.getScaleX(), this.b.getScaleY(), this.b.getTranslationX(), this.b.getTranslationY(), this.b.getElevation(), this.getAmbientShadowColor(), this.getSpotShadowColor(), this.b.getRotation(), this.b.getRotationX(), this.b.getRotationY(), this.b.getCameraDistance(), this.b.getPivotX(), this.b.getPivotY(), this.b.getClipToOutline(), this.getClipToBounds(), this.b.getAlpha(), this.getRenderEffect(), this.c, null);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.b.getAlpha();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        return Build.VERSION.SDK_INT < 28 ? 0xFF000000 : m1.a.a(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.g;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.b.getCameraDistance();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.i;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.b.getClipToOutline();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getCompositingStrategy--NrFUSI() {
        return this.c;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.b.getElevation();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.b.isValid();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.getBottom() - this.getTop();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix0) {
        this.b.getInverseMatrix(matrix0);
    }

    // 去混淆评级： 低(40)
    public final int getLayerType$ui_release() {
        return CompositingStrategy.equals-impl0(this.c, 1) ? 2 : 0;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.d;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix0) {
        this.b.getMatrix(matrix0);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.b.getPivotX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.b.getPivotY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.h;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.f;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.b.getRotationX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.b.getRotationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.b.getRotation();
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
        return Build.VERSION.SDK_INT < 28 ? 0xFF000000 : m1.a.b(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.e;
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
        return 0L;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.getRight() - this.getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.b.hasOverlappingRendering();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int v) {
        this.setLeft(this.getLeft() + v);
        this.setRight(this.getRight() + v);
        this.b.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int v) {
        this.setTop(this.getTop() + v);
        this.setBottom(this.getBottom() + v);
        this.b.offsetTopAndBottom(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder0, @Nullable Path path0, @NotNull Function1 function10) {
        int v = this.getWidth();
        int v1 = this.getHeight();
        DisplayListCanvas displayListCanvas0 = this.b.start(v, v1);
        Canvas canvas0 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(((Canvas)displayListCanvas0));
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
        this.b.end(displayListCanvas0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.b.setAlpha(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            m1.a.c(this.b, v);
        }
    }

    public void setBottom(int v) {
        this.g = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.b.setCameraDistance(-f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.i = z;
        this.b.setClipToBounds(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCompositingStrategy-aDBOjCE(int v) {
        if(CompositingStrategy.equals-impl0(v, 1)) {
            this.b.setLayerType(2);
            this.b.setHasOverlappingRendering(true);
        }
        else if(CompositingStrategy.equals-impl0(v, 2)) {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(false);
        }
        else {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(true);
        }
        this.c = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        this.b.setElevation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    public void setLeft(int v) {
        this.d = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline0) {
        this.b.setOutline(outline0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        this.b.setPivotX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        this.b.setPivotY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int v, int v1, int v2, int v3) {
        this.setLeft(v);
        this.setTop(v1);
        this.setRight(v2);
        this.setBottom(v3);
        return this.b.setLeftTopRightBottom(v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect0) {
        this.h = renderEffect0;
    }

    public void setRight(int v) {
        this.f = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        this.b.setRotationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        this.b.setRotationY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        this.b.setRotation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.b.setScaleX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.b.setScaleY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            m1.a.d(this.b, v);
        }
    }

    public void setTop(int v) {
        this.e = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        this.b.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        this.b.setTranslationY(f);
    }
}

