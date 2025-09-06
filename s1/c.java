package s1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.RenderNode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.ssl.SSLSockets;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import javax.net.ssl.SSLSocket;

public abstract class c {
    public static void A(RenderNode renderNode0, float f) {
        renderNode0.setRotationZ(f);
    }

    public static AssetFileDescriptor b(ContentResolver contentResolver0, Uri uri0, Bundle bundle0) {
        return contentResolver0.openTypedAssetFile(uri0, "image/*", bundle0, null);
    }

    public static RenderNode e() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static ColorStateListDrawable f(Drawable drawable0) [...] // Inlined contents

    public static void k(RenderNode renderNode0, float f) {
        renderNode0.setTranslationX(f);
    }

    public static void l(RenderNode renderNode0, int v) {
        renderNode0.setAmbientShadowColor(v);
    }

    public static void m(RenderNode renderNode0, int v, int v1) {
        renderNode0.setPosition(0, 0, v, v1);
    }

    public static void n(RenderNode renderNode0, int v, int v1, int v2, int v3) {
        renderNode0.setPosition(v, v1, v2, v3);
    }

    public static void o(RenderNode renderNode0, Outline outline0) {
        renderNode0.setOutline(outline0);
    }

    public static void r(CoordinatorLayout coordinatorLayout0, Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0, int v) {
        coordinatorLayout0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, 0, v);
    }

    public static void t(SSLSocket sSLSocket0) {
        SSLSockets.setUseSessionTickets(sSLSocket0, true);
    }

    public static boolean u(Drawable drawable0) {
        return drawable0 instanceof ColorStateListDrawable;
    }

    public static void x(RenderNode renderNode0, float f) {
        renderNode0.setRotationY(f);
    }

    public static void y(RenderNode renderNode0, int v) {
        renderNode0.setSpotShadowColor(v);
    }

    public static void z(CoordinatorLayout coordinatorLayout0, Context context0, int[] arr_v, AttributeSet attributeSet0, TypedArray typedArray0, int v) {
        coordinatorLayout0.saveAttributeDataForStyleable(context0, arr_v, attributeSet0, typedArray0, v, 0);
    }
}

