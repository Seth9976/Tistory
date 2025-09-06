package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@PlacementScopeMarker
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\b\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u0018\u0010\u000E\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u000F\u0010\u0005\"\u0004\b\u0010\u0010\u0007R \u0010\u0011\u001A\u00020\u00128fX\u00A6\u000E\u00A2\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u0019\u001A\u00020\u001A8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER(\u0010!\u001A\u0004\u0018\u00010 2\b\u0010\u001F\u001A\u0004\u0018\u00010 8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001A\u000209X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001A\u0010>\u001A\u00020?8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b@\u0010\u000BR*\u0010A\u001A\u00020\t2\u0006\u0010A\u001A\u00020\t8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bB\u0010\u000B\"\u0004\bC\u0010\rR\u001E\u0010D\u001A\u00020EX\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\bF\u0010\u000B\"\u0004\bG\u0010\rR\u0018\u0010H\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006N\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface GraphicsLayerScope extends Density {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Deprecated
        public static long getAmbientShadowColor-0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope0) {
            return graphicsLayerScope0.super.getAmbientShadowColor-0d7_KjU();
        }

        public static void getClip$annotations() {
        }

        @Deprecated
        public static int getCompositingStrategy--NrFUSI(@NotNull GraphicsLayerScope graphicsLayerScope0) {
            return graphicsLayerScope0.super.getCompositingStrategy--NrFUSI();
        }

        @Deprecated
        @Nullable
        public static RenderEffect getRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope0) {
            return graphicsLayerScope0.super.getRenderEffect();
        }

        @Deprecated
        public static long getSize-NH-jbRc(@NotNull GraphicsLayerScope graphicsLayerScope0) {
            return graphicsLayerScope0.super.getSize-NH-jbRc();
        }

        @Deprecated
        public static long getSpotShadowColor-0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope0) {
            return graphicsLayerScope0.super.getSpotShadowColor-0d7_KjU();
        }

        @Stable
        @Deprecated
        public static int roundToPx--R2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            return graphicsLayerScope0.super.roundToPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static int roundToPx-0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope0, float f) {
            return graphicsLayerScope0.super.roundToPx-0680j_4(f);
        }

        @Deprecated
        public static void setAmbientShadowColor-8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            graphicsLayerScope0.super.setAmbientShadowColor-8_81llA(v);
        }

        @Deprecated
        public static void setCompositingStrategy-aDBOjCE(@NotNull GraphicsLayerScope graphicsLayerScope0, int v) {
            graphicsLayerScope0.super.setCompositingStrategy-aDBOjCE(v);
        }

        @Deprecated
        public static void setRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope0, @Nullable RenderEffect renderEffect0) {
            graphicsLayerScope0.super.setRenderEffect(renderEffect0);
        }

        @Deprecated
        public static void setSpotShadowColor-8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            graphicsLayerScope0.super.setSpotShadowColor-8_81llA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-GaN1DYA(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            return graphicsLayerScope0.super.toDp-GaN1DYA(v);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope0, float f) {
            return graphicsLayerScope0.super.toDp-u2uoSUM(f);
        }

        @Stable
        @Deprecated
        public static float toDp-u2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope0, int v) {
            return graphicsLayerScope0.super.toDp-u2uoSUM(v);
        }

        @Stable
        @Deprecated
        public static long toDpSize-k-rfVVM(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            return graphicsLayerScope0.super.toDpSize-k-rfVVM(v);
        }

        @Stable
        @Deprecated
        public static float toPx--R2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            return graphicsLayerScope0.super.toPx--R2X_6o(v);
        }

        @Stable
        @Deprecated
        public static float toPx-0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope0, float f) {
            return graphicsLayerScope0.super.toPx-0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull GraphicsLayerScope graphicsLayerScope0, @NotNull DpRect dpRect0) {
            return graphicsLayerScope0.super.toRect(dpRect0);
        }

        @Stable
        @Deprecated
        public static long toSize-XkaWNTQ(@NotNull GraphicsLayerScope graphicsLayerScope0, long v) {
            return graphicsLayerScope0.super.toSize-XkaWNTQ(v);
        }

        @Stable
        @Deprecated
        public static long toSp-0xMU5do(@NotNull GraphicsLayerScope graphicsLayerScope0, float f) {
            return graphicsLayerScope0.super.toSp-0xMU5do(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope0, float f) {
            return graphicsLayerScope0.super.toSp-kPz2Gy4(f);
        }

        @Stable
        @Deprecated
        public static long toSp-kPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope0, int v) {
            return graphicsLayerScope0.super.toSp-kPz2Gy4(v);
        }
    }

    float getAlpha();

    default long getAmbientShadowColor-0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    // 去混淆评级： 低(20)
    default int getCompositingStrategy--NrFUSI() {
        return 0;
    }

    @Nullable
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @NotNull
    Shape getShape();

    // 去混淆评级： 低(20)
    default long getSize-NH-jbRc() {
        return 0x7FC000007FC00000L;
    }

    // 去混淆评级： 低(20)
    default long getSpotShadowColor-0d7_KjU() {
        return 0xFF00000000000000L;
    }

    long getTransformOrigin-SzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float arg1);

    default void setAmbientShadowColor-8_81llA(long v) {
    }

    void setCameraDistance(float arg1);

    void setClip(boolean arg1);

    default void setCompositingStrategy-aDBOjCE(int v) {
    }

    default void setRenderEffect(@Nullable RenderEffect renderEffect0) {
    }

    void setRotationX(float arg1);

    void setRotationY(float arg1);

    void setRotationZ(float arg1);

    void setScaleX(float arg1);

    void setScaleY(float arg1);

    void setShadowElevation(float arg1);

    void setShape(@NotNull Shape arg1);

    default void setSpotShadowColor-8_81llA(long v) {
    }

    void setTransformOrigin-__ExYCQ(long arg1);

    void setTranslationX(float arg1);

    void setTranslationY(float arg1);
}

