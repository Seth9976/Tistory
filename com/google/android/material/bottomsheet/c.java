package com.google.android.material.bottomsheet;

import android.view.View;

public final class c extends BottomSheetCallback {
    public final BottomSheetDialog c;

    public c(BottomSheetDialog bottomSheetDialog0) {
        this.c = bottomSheetDialog0;
        super();
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onSlide(View view0, float f) {
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onStateChanged(View view0, int v) {
        if(v == 5) {
            this.c.cancel();
        }
    }
}

