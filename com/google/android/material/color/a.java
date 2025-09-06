package com.google.android.material.color;

import android.app.Activity;
import android.app.UiModeManager.ContrastChangeListener;

public final class a implements UiModeManager.ContrastChangeListener {
    public final b a;

    public a(b b0) {
        this.a = b0;
    }

    @Override  // android.app.UiModeManager$ContrastChangeListener
    public final void onContrastChanged(float f) {
        for(Object object0: this.a.a) {
            ((Activity)object0).recreate();
        }
    }
}

