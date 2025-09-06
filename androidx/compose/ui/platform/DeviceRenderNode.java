package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010W\u001A\u00020XH&J\u0010\u0010Y\u001A\u00020X2\u0006\u0010Z\u001A\u00020[H&J\b\u0010\\\u001A\u00020]H&J\u0010\u0010^\u001A\u00020X2\u0006\u0010_\u001A\u00020`H&J\u0010\u0010a\u001A\u00020X2\u0006\u0010_\u001A\u00020`H&J\u0010\u0010b\u001A\u00020X2\u0006\u0010c\u001A\u00020\tH&J\u0010\u0010d\u001A\u00020X2\u0006\u0010c\u001A\u00020\tH&J.\u0010e\u001A\u00020X2\u0006\u0010f\u001A\u00020g2\b\u0010h\u001A\u0004\u0018\u00010i2\u0012\u0010j\u001A\u000E\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00020X0kH&J\u0010\u0010m\u001A\u00020\u00142\u0006\u0010n\u001A\u00020\u0014H&J\u0012\u0010o\u001A\u00020X2\b\u0010p\u001A\u0004\u0018\u00010qH&J(\u0010r\u001A\u00020\u00142\u0006\u0010\'\u001A\u00020\t2\u0006\u0010I\u001A\u00020\t2\u0006\u00105\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\tH&R\u0018\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u000BR\u0018\u0010\u0010\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R\u0018\u0010\u0013\u001A\u00020\u0014X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001A\u00020\u0014X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u001A\u0010\u0016\"\u0004\b\u001B\u0010\u0018R\u001E\u0010\u001C\u001A\u00020\u001DX\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\u001E\u0010\u000B\"\u0004\b\u001F\u0010\rR\u0018\u0010 \u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u0012\u0010#\u001A\u00020\u0014X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010\u0016R\u0012\u0010%\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b&\u0010\u000BR\u0012\u0010\'\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010\u000BR\u0018\u0010)\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u001A\u0010/\u001A\u0004\u0018\u000100X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b1\u00102\"\u0004\b3\u00104R\u0012\u00105\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b6\u0010\u000BR\u0018\u00107\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b8\u0010\u0005\"\u0004\b9\u0010\u0007R\u0018\u0010:\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b;\u0010\u0005\"\u0004\b<\u0010\u0007R\u0018\u0010=\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b>\u0010\u0005\"\u0004\b?\u0010\u0007R\u0018\u0010@\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bA\u0010\u0005\"\u0004\bB\u0010\u0007R\u0018\u0010C\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bD\u0010\u0005\"\u0004\bE\u0010\u0007R\u0018\u0010F\u001A\u00020\tX\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bG\u0010\u000B\"\u0004\bH\u0010\rR\u0012\u0010I\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010\u000BR\u0018\u0010K\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007R\u0018\u0010N\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bO\u0010\u0005\"\u0004\bP\u0010\u0007R\u0012\u0010Q\u001A\u00020RX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u0012\u0010U\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bV\u0010\u000B\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006s\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "", "getAmbientShadowColor", "()I", "setAmbientShadowColor", "(I)V", "bottom", "getBottom", "cameraDistance", "getCameraDistance", "setCameraDistance", "clipToBounds", "", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "right", "getRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "spotShadowColor", "getSpotShadowColor", "setSpotShadowColor", "top", "getTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "discardDisplayList", "", "drawInto", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(@NotNull Canvas arg1);

    @NotNull
    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getAmbientShadowColor();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    int getCompositingStrategy--NrFUSI();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@NotNull Matrix arg1);

    int getLeft();

    void getMatrix(@NotNull Matrix arg1);

    float getPivotX();

    float getPivotY();

    @Nullable
    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getSpotShadowColor();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int arg1);

    void offsetTopAndBottom(int arg1);

    void record(@NotNull CanvasHolder arg1, @Nullable Path arg2, @NotNull Function1 arg3);

    void setAlpha(float arg1);

    void setAmbientShadowColor(int arg1);

    void setCameraDistance(float arg1);

    void setClipToBounds(boolean arg1);

    void setClipToOutline(boolean arg1);

    void setCompositingStrategy-aDBOjCE(int arg1);

    void setElevation(float arg1);

    boolean setHasOverlappingRendering(boolean arg1);

    void setOutline(@Nullable Outline arg1);

    void setPivotX(float arg1);

    void setPivotY(float arg1);

    boolean setPosition(int arg1, int arg2, int arg3, int arg4);

    void setRenderEffect(@Nullable RenderEffect arg1);

    void setRotationX(float arg1);

    void setRotationY(float arg1);

    void setRotationZ(float arg1);

    void setScaleX(float arg1);

    void setScaleY(float arg1);

    void setSpotShadowColor(int arg1);

    void setTranslationX(float arg1);

    void setTranslationY(float arg1);
}

