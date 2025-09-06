package com.google.android.material.sidesheet;

import android.view.View;
import androidx.activity.h;
import androidx.appcompat.widget.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class g {
    public final int a;
    public int b;
    public boolean c;
    public final Runnable d;
    public final Behavior e;

    public g(BottomSheetBehavior bottomSheetBehavior0) {
        this.a = 1;
        super();
        this.e = bottomSheetBehavior0;
        this.d = new a(this, 20);
    }

    public g(SideSheetBehavior sideSheetBehavior0) {
        this.a = 0;
        super();
        this.e = sideSheetBehavior0;
        this.d = new h(this, 13);
    }

    public final void a(int v) {
        if(this.a != 0) {
            BottomSheetBehavior bottomSheetBehavior0 = (BottomSheetBehavior)this.e;
            if(bottomSheetBehavior0.k0 != null && bottomSheetBehavior0.k0.get() != null) {
                this.b = v;
                if(!this.c) {
                    ViewCompat.postOnAnimation(((View)bottomSheetBehavior0.k0.get()), ((a)this.d));
                    this.c = true;
                }
            }
            return;
        }
        SideSheetBehavior sideSheetBehavior0 = (SideSheetBehavior)this.e;
        if(sideSheetBehavior0.E != null && sideSheetBehavior0.E.get() != null) {
            this.b = v;
            if(!this.c) {
                ViewCompat.postOnAnimation(((View)sideSheetBehavior0.E.get()), ((h)this.d));
                this.c = true;
            }
        }
    }
}

