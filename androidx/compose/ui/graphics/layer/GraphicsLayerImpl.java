package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00A2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 r2\u00020\u0001:\u0001rJ\b\u0010U\u001A\u00020VH&J\b\u0010W\u001A\u00020XH&J\u0010\u0010Y\u001A\u00020X2\u0006\u0010Z\u001A\u00020[H&J9\u0010\\\u001A\u00020X2\u0006\u0010]\u001A\u00020^2\u0006\u0010_\u001A\u00020`2\u0006\u0010a\u001A\u00020b2\u0017\u0010c\u001A\u0013\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020X0d\u00A2\u0006\u0002\bfH&J\u0012\u0010g\u001A\u00020X2\b\u0010h\u001A\u0004\u0018\u00010iH&J*\u0010j\u001A\u00020X2\u0006\u0010k\u001A\u00020l2\u0006\u0010m\u001A\u00020l2\u0006\u0010n\u001A\u00020oH&\u00F8\u0001\u0000\u00A2\u0006\u0004\bp\u0010qR\u0018\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001E\u0010\b\u001A\u00020\tX\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001E\u0010\u000E\u001A\u00020\u000FX\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u0018\u0010\u0017\u001A\u00020\u0018X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001A\u0010\u001D\u001A\u0004\u0018\u00010\u001EX\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001E\u0010#\u001A\u00020$X\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u0014\u0010\'\u001A\u00020\u00188VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010\u001AR\u0018\u0010)\u001A\u00020\u0018X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b)\u0010\u001A\"\u0004\b*\u0010\u001CR\u0012\u0010+\u001A\u00020,X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010\u000BR\u0012\u0010.\u001A\u00020,X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b/\u0010\u000BR\u001E\u00100\u001A\u000201X\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b2\u0010\u000B\"\u0004\b3\u0010\rR\u001A\u00104\u001A\u0004\u0018\u000105X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010:\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b;\u0010\u0005\"\u0004\b<\u0010\u0007R\u0018\u0010=\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b>\u0010\u0005\"\u0004\b?\u0010\u0007R\u0018\u0010@\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bA\u0010\u0005\"\u0004\bB\u0010\u0007R\u0018\u0010C\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bD\u0010\u0005\"\u0004\bE\u0010\u0007R\u0018\u0010F\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bG\u0010\u0005\"\u0004\bH\u0010\u0007R\u0018\u0010I\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bJ\u0010\u0005\"\u0004\bK\u0010\u0007R\u001E\u0010L\u001A\u00020\tX\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bM\u0010\u000B\"\u0004\bN\u0010\rR\u0018\u0010O\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bP\u0010\u0005\"\u0004\bQ\u0010\u0007R\u0018\u0010R\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bS\u0010\u0005\"\u0004\bT\u0010\u0007\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006s\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip", "()Z", "setClip", "(Z)V", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "compositingStrategy", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "hasDisplayList", "getHasDisplayList", "isInvalidated", "setInvalidated", "layerId", "", "getLayerId", "ownerId", "getOwnerId", "pivotOffset", "Landroidx/compose/ui/geometry/Offset;", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "calculateMatrix", "Landroid/graphics/Matrix;", "discardDisplayList", "", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "record", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "x", "", "y", "size", "Landroidx/compose/ui/unit/IntSize;", "setPosition-H0pRuoY", "(IIJ)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface GraphicsLayerImpl {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R(\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "getDefaultDrawBlock", "()Lkotlin/jvm/functions/Function1;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static final a b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            Companion.b = a.w;
        }

        @NotNull
        public final Function1 getDefaultDrawBlock() {
            return Companion.b;
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        GraphicsLayerImpl.Companion = Companion.a;
    }

    @NotNull
    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(@NotNull Canvas arg1);

    float getAlpha();

    long getAmbientShadowColor-0d7_KjU();

    int getBlendMode-0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    @Nullable
    ColorFilter getColorFilter();

    int getCompositingStrategy-ke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    long getPivotOffset-F1C5BW0();

    @Nullable
    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    long getSpotShadowColor-0d7_KjU();

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(@NotNull Density arg1, @NotNull LayoutDirection arg2, @NotNull GraphicsLayer arg3, @NotNull Function1 arg4);

    void setAlpha(float arg1);

    void setAmbientShadowColor-8_81llA(long arg1);

    void setBlendMode-s9anfk8(int arg1);

    void setCameraDistance(float arg1);

    void setClip(boolean arg1);

    void setColorFilter(@Nullable ColorFilter arg1);

    void setCompositingStrategy-Wpw9cng(int arg1);

    void setInvalidated(boolean arg1);

    void setOutline(@Nullable Outline arg1);

    void setPivotOffset-k-4lQ0M(long arg1);

    void setPosition-H0pRuoY(int arg1, int arg2, long arg3);

    void setRenderEffect(@Nullable RenderEffect arg1);

    void setRotationX(float arg1);

    void setRotationY(float arg1);

    void setRotationZ(float arg1);

    void setScaleX(float arg1);

    void setScaleY(float arg1);

    void setShadowElevation(float arg1);

    void setSpotShadowColor-8_81llA(long arg1);

    void setTranslationX(float arg1);

    void setTranslationY(float arg1);
}

