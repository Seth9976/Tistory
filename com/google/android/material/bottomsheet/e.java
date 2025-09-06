package com.google.android.material.bottomsheet;

import android.view.View;

public final class e extends BottomSheetCallback {
    public final BottomSheetDialogFragment c;

    public e(BottomSheetDialogFragment bottomSheetDialogFragment0) {
        this.c = bottomSheetDialogFragment0;
        super();
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onSlide(View view0, float f) {
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onStateChanged(View view0, int v) {
        if(v == 5) {
            this.c.i();
        }
    }
}

