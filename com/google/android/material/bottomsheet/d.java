package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;

public final class d extends BottomSheetCallback {
    public final Boolean c;
    public final WindowInsetsCompat d;
    public Window e;
    public boolean f;

    public d(FrameLayout frameLayout0, WindowInsetsCompat windowInsetsCompat0) {
        this.d = windowInsetsCompat0;
        MaterialShapeDrawable materialShapeDrawable0 = BottomSheetBehavior.from(frameLayout0).x;
        ColorStateList colorStateList0 = materialShapeDrawable0 == null ? ViewCompat.getBackgroundTintList(frameLayout0) : materialShapeDrawable0.getFillColor();
        if(colorStateList0 != null) {
            this.c = Boolean.valueOf(MaterialColors.isColorLight(colorStateList0.getDefaultColor()));
            return;
        }
        Integer integer0 = ViewUtils.getBackgroundColor(frameLayout0);
        if(integer0 != null) {
            this.c = Boolean.valueOf(MaterialColors.isColorLight(((int)integer0)));
            return;
        }
        this.c = null;
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void a(View view0) {
        this.b(view0);
    }

    public final void b(View view0) {
        int v = view0.getTop();
        WindowInsetsCompat windowInsetsCompat0 = this.d;
        if(v < windowInsetsCompat0.getSystemWindowInsetTop()) {
            Window window0 = this.e;
            if(window0 != null) {
                EdgeToEdgeUtils.setLightStatusBar(window0, (this.c == null ? this.f : this.c.booleanValue()));
            }
            view0.setPadding(view0.getPaddingLeft(), windowInsetsCompat0.getSystemWindowInsetTop() - view0.getTop(), view0.getPaddingRight(), view0.getPaddingBottom());
            return;
        }
        if(view0.getTop() != 0) {
            Window window1 = this.e;
            if(window1 != null) {
                EdgeToEdgeUtils.setLightStatusBar(window1, this.f);
            }
            view0.setPadding(view0.getPaddingLeft(), 0, view0.getPaddingRight(), view0.getPaddingBottom());
        }
    }

    public final void c(Window window0) {
        if(this.e == window0) {
            return;
        }
        this.e = window0;
        if(window0 != null) {
            this.f = WindowCompat.getInsetsController(window0, window0.getDecorView()).isAppearanceLightStatusBars();
        }
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onSlide(View view0, float f) {
        this.b(view0);
    }

    @Override  // com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback
    public final void onStateChanged(View view0, int v) {
        this.b(view0);
    }
}

