package com.google.android.material.bottomsheet;

import android.view.View;

public final class f extends BottomSheetCallback {
    public final BottomSheetDragHandleView c;

    public f(BottomSheetDragHandleView bottomSheetDragHandleView0) {
        this.c = bottomSheetDragHandleView0;
        super();
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onSlide(View view0, float f) {
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onStateChanged(View view0, int v) {
        this.c.b(v);
    }
}

