package androidx.activity;

import android.graphics.RenderNode;
import android.view.View;
import android.view.Window;

public abstract class s {
    public static void f(RenderNode renderNode0) {
        renderNode0.setUseCompositingLayer(true, null);
    }

    public static void h(View view0) {
        view0.setForceDarkAllowed(false);
    }

    public static void j(Window window0) {
        window0.setStatusBarContrastEnforced(false);
    }

    public static void s(RenderNode renderNode0) {
        renderNode0.setUseCompositingLayer(false, null);
    }
}

