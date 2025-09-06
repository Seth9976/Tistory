package com.google.android.material.sidesheet;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;

public class SideSheetDialog extends b {
    public static final int p;
    public static final int q;

    static {
        SideSheetDialog.p = attr.sideSheetDialogTheme;
        SideSheetDialog.q = style.Theme_Material3_Light_SideSheetDialog;
    }

    public SideSheetDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    public SideSheetDialog(@NonNull Context context0, @StyleRes int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            v = context0.getTheme().resolveAttribute(SideSheetDialog.p, typedValue0, true) ? typedValue0.resourceId : SideSheetDialog.q;
        }
        super(context0, v);
        this.j = true;
        this.k = true;
        this.supportRequestWindowFeature(1);
    }

    @Override  // com.google.android.material.sidesheet.b
    public void cancel() {
        super.cancel();
    }

    @Override  // com.google.android.material.sidesheet.b
    @NonNull
    public Sheet getBehavior() {
        return this.getBehavior();
    }

    @NonNull
    public SideSheetBehavior getBehavior() {
        if(this.f == null) {
            this.d();
        }
        SideSheetBehavior sideSheetBehavior0 = this.f;
        if(sideSheetBehavior0 == null) {
            throw new IllegalStateException("The view is not associated with SideSheetBehavior");
        }
        return sideSheetBehavior0;
    }

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.i;
    }

    @Override  // com.google.android.material.sidesheet.b
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override  // com.google.android.material.sidesheet.b
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override  // com.google.android.material.sidesheet.b
    public void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override  // com.google.android.material.sidesheet.b
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override  // com.google.android.material.sidesheet.b
    public void setContentView(@LayoutRes int v) {
        super.setContentView(v);
    }

    @Override  // com.google.android.material.sidesheet.b
    public void setContentView(@Nullable View view0) {
        super.setContentView(view0);
    }

    @Override  // com.google.android.material.sidesheet.b
    public void setContentView(@Nullable View view0, @Nullable ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    public void setDismissWithSheetAnimationEnabled(boolean z) {
        this.i = z;
    }

    public void setSheetEdge(@GravityInt int v) {
        FrameLayout frameLayout0 = this.h;
        if(frameLayout0 == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if(ViewCompat.isLaidOut(frameLayout0)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.h.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            ((LayoutParams)viewGroup$LayoutParams0).gravity = v;
            this.e();
        }
    }
}

