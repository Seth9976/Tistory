package p1;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.net.Uri;
import android.util.Size;

public abstract class d {
    public static void A(RenderNode renderNode0, float f) {
        renderNode0.setPivotX(f);
    }

    public static void B(RenderNode renderNode0, float f) {
        renderNode0.setPivotY(f);
    }

    public static void C(RenderNode renderNode0, float f) {
        renderNode0.setCameraDistance(f);
    }

    public static void D(RenderNode renderNode0, float f) {
        renderNode0.setElevation(f);
    }

    public static long b(RenderNode renderNode0) {
        return renderNode0.getUniqueId();
    }

    public static Bitmap c(ContentResolver contentResolver0, Uri uri0, Size size0) {
        return contentResolver0.loadThumbnail(uri0, size0, null);
    }

    public static BlendModeColorFilter e(int v, BlendMode blendMode0) {
        return new BlendModeColorFilter(v, blendMode0);
    }

    public static RenderNode f() {
        return new RenderNode("graphicsLayer");
    }

    public static void g() {
    }

    public static void i(Paint paint0, BlendMode blendMode0) {
        paint0.setBlendMode(blendMode0);
    }

    public static void j(RenderNode renderNode0) {
        renderNode0.discardDisplayList();
    }

    public static void k(RenderNode renderNode0, float f) {
        renderNode0.setTranslationY(f);
    }

    public static void l(RenderNode renderNode0, Matrix matrix0) {
        renderNode0.getMatrix(matrix0);
    }

    public static void m(RenderNode renderNode0, Paint paint0) {
        renderNode0.setUseCompositingLayer(true, paint0);
    }

    public static void n(RenderNode renderNode0, boolean z) {
        renderNode0.setClipToBounds(z);
    }

    public static boolean o(RenderNode renderNode0) {
        return renderNode0.hasDisplayList();
    }

    public static void q(RenderNode renderNode0) {
        renderNode0.setHasOverlappingRendering(true);
    }

    public static void r(RenderNode renderNode0, float f) {
        renderNode0.setAlpha(f);
    }

    public static void s(RenderNode renderNode0, Paint paint0) {
        renderNode0.setUseCompositingLayer(false, paint0);
    }

    public static void t(RenderNode renderNode0, boolean z) {
        renderNode0.setClipToOutline(z);
    }

    public static void u(RenderNode renderNode0) {
        renderNode0.setHasOverlappingRendering(false);
    }

    public static void v(RenderNode renderNode0, float f) {
        renderNode0.setScaleX(f);
    }

    public static void w(RenderNode renderNode0) {
        renderNode0.resetPivot();
    }

    public static void x(RenderNode renderNode0, float f) {
        renderNode0.setScaleY(f);
    }

    public static void y(RenderNode renderNode0) {
        renderNode0.setClipToBounds(false);
    }

    public static void z(RenderNode renderNode0, float f) {
        renderNode0.setRotationX(f);
    }
}

