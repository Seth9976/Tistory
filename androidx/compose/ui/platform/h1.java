package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;

public abstract class h1 {
    public static float B(RenderNode renderNode0) {
        return renderNode0.getCameraDistance();
    }

    public static float D(RenderNode renderNode0) {
        return renderNode0.getPivotX();
    }

    public static float a(RenderNode renderNode0) {
        return renderNode0.getElevation();
    }

    public static int b(RenderNode renderNode0) {
        return renderNode0.getAmbientShadowColor();
    }

    public static RenderNode d() {
        return new RenderNode("Compose");
    }

    public static WindowInsets.Builder e(WindowInsets windowInsets0) {
        return new WindowInsets.Builder(windowInsets0);
    }

    public static void n(RenderNode renderNode0, int v) {
        renderNode0.offsetTopAndBottom(v);
    }

    public static void o(RenderNode renderNode0, Matrix matrix0) {
        renderNode0.getInverseMatrix(matrix0);
    }

    public static boolean r(RenderNode renderNode0) {
        return renderNode0.hasOverlappingRendering();
    }

    public static float s(RenderNode renderNode0) {
        return renderNode0.getRotationZ();
    }

    public static int t(RenderNode renderNode0) {
        return renderNode0.getSpotShadowColor();
    }

    public static boolean w(RenderNode renderNode0) {
        return renderNode0.getUseCompositingLayer();
    }

    public static float x(RenderNode renderNode0) {
        return renderNode0.getRotationX();
    }

    public static float z(RenderNode renderNode0) {
        return renderNode0.getRotationY();
    }
}

