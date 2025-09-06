package com.google.android.material.shape;

import android.view.View;
import androidx.annotation.DoNotInline;

public final class l extends ShapeableDelegate {
    public l(View view0) {
        this.d(view0);
    }

    @Override  // com.google.android.material.shape.ShapeableDelegate
    public final void a(View view0) {
        view0.setClipToOutline(!this.a);
        if(this.a) {
            view0.invalidate();
            return;
        }
        view0.invalidateOutline();
    }

    @Override  // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return this.a;
    }

    @DoNotInline
    private void d(View view0) {
        view0.setOutlineProvider(new j(this, 1));
    }
}

