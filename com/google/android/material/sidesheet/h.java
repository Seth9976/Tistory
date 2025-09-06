package com.google.android.material.sidesheet;

import android.view.View;

public final class h extends SideSheetCallback {
    public final SideSheetDialog a;

    public h(SideSheetDialog sideSheetDialog0) {
        this.a = sideSheetDialog0;
        super();
    }

    @Override  // com.google.android.material.sidesheet.SideSheetCallback
    public final void onSlide(View view0, float f) {
    }

    @Override  // com.google.android.material.sidesheet.SideSheetCallback
    public final void onStateChanged(View view0, int v) {
        if(v == 5) {
            this.a.cancel();
        }
    }
}

