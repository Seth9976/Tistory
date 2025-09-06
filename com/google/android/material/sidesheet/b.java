package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.datepicker.t;
import com.google.android.material.motion.MaterialBackOrchestrator;

public abstract class b extends AppCompatDialog {
    public SideSheetBehavior f;
    public FrameLayout g;
    public FrameLayout h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public MaterialBackOrchestrator m;
    public static final int n;
    public static final int o;

    static {
        b.n = id.coordinator;
        b.o = id.touch_outside;
    }

    @Override  // android.app.Dialog
    public void cancel() {
        Sheet sheet0 = this.getBehavior();
        if(this.i && sheet0.getState() != 5) {
            sheet0.setState(5);
            return;
        }
        super.cancel();
    }

    public final void d() {
        if(this.g == null) {
            FrameLayout frameLayout0 = (FrameLayout)View.inflate(this.getContext(), layout.m3_side_sheet_dialog, null);
            this.g = frameLayout0;
            FrameLayout frameLayout1 = (FrameLayout)frameLayout0.findViewById(id.m3_side_sheet);
            this.h = frameLayout1;
            SideSheetBehavior sideSheetBehavior0 = SideSheetBehavior.from(frameLayout1);
            this.f = sideSheetBehavior0;
            sideSheetBehavior0.addCallback(new h(((SideSheetDialog)this)));
            this.m = new MaterialBackOrchestrator(this.f, this.h);
        }
    }

    public final void e() {
        Window window0 = this.getWindow();
        if(window0 != null && (this.h != null && this.h.getLayoutParams() instanceof LayoutParams)) {
            window0.setWindowAnimations((GravityCompat.getAbsoluteGravity(((LayoutParams)this.h.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this.h)) == 3 ? style.Animation_Material3_SideSheetDialog_Left : style.Animation_Material3_SideSheetDialog_Right));
        }
    }

    public final FrameLayout f(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.d();
        if(this.g == null) {
            this.d();
        }
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.g.findViewById(b.n);
        if(v != 0 && view0 == null) {
            view0 = this.getLayoutInflater().inflate(v, coordinatorLayout0, false);
        }
        if(this.h == null) {
            this.d();
        }
        FrameLayout frameLayout0 = this.h;
        frameLayout0.removeAllViews();
        if(viewGroup$LayoutParams0 == null) {
            frameLayout0.addView(view0);
        }
        else {
            frameLayout0.addView(view0, viewGroup$LayoutParams0);
        }
        coordinatorLayout0.findViewById(b.o).setOnClickListener(new t(this, 1));
        if(this.h == null) {
            this.d();
        }
        ViewCompat.setAccessibilityDelegate(this.h, new com.google.android.material.internal.b(this, 2));
        return this.g;
    }

    public abstract Sheet getBehavior();

    @Override  // android.app.Dialog
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e();
        MaterialBackOrchestrator materialBackOrchestrator0 = this.m;
        if(materialBackOrchestrator0 != null) {
            if(this.j) {
                materialBackOrchestrator0.startListeningForBackCallbacks();
                return;
            }
            materialBackOrchestrator0.stopListeningForBackCallbacks();
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        if(window0 != null) {
            window0.setStatusBarColor(0);
            window0.addFlags(0x80000000);
            window0.setLayout(-1, -1);
        }
    }

    @Override  // android.app.Dialog
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator0 = this.m;
        if(materialBackOrchestrator0 != null) {
            materialBackOrchestrator0.stopListeningForBackCallbacks();
        }
    }

    @Override  // androidx.activity.ComponentDialog
    public void onStart() {
        super.onStart();
        if(this.f != null && this.f.getState() == 5) {
            this.f.setState(3);
        }
    }

    @Override  // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if(this.j != z) {
            this.j = z;
        }
        if(this.getWindow() != null) {
            MaterialBackOrchestrator materialBackOrchestrator0 = this.m;
            if(materialBackOrchestrator0 != null) {
                if(this.j) {
                    materialBackOrchestrator0.startListeningForBackCallbacks();
                    return;
                }
                materialBackOrchestrator0.stopListeningForBackCallbacks();
            }
        }
    }

    @Override  // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if(z && !this.j) {
            this.j = true;
        }
        this.k = z;
        this.l = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(int v) {
        super.setContentView(this.f(null, v, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0) {
        super.setContentView(this.f(view0, 0, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(this.f(view0, 0, viewGroup$LayoutParams0));
    }
}

