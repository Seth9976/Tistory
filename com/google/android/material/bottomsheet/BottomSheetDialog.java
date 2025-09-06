package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.motion.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.style;
import com.google.android.material.motion.MaterialBackOrchestrator;

public class BottomSheetDialog extends AppCompatDialog {
    public BottomSheetBehavior f;
    public FrameLayout g;
    public CoordinatorLayout h;
    public FrameLayout i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public d n;
    public final boolean o;
    public MaterialBackOrchestrator p;
    public final c q;

    public BottomSheetDialog(@NonNull Context context0) {
        this(context0, 0);
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context0, @StyleRes int v) {
        if(v == 0) {
            TypedValue typedValue0 = new TypedValue();
            v = context0.getTheme().resolveAttribute(attr.bottomSheetDialogTheme, typedValue0, true) ? typedValue0.resourceId : style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context0, v);
        this.k = true;
        this.l = true;
        this.q = new c(this);
        this.supportRequestWindowFeature(1);
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context0, boolean z, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        super(context0, z, dialogInterface$OnCancelListener0);
        this.k = true;
        this.l = true;
        this.q = new c(this);
        this.supportRequestWindowFeature(1);
        this.k = z;
        this.o = this.getContext().getTheme().obtainStyledAttributes(new int[]{attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override  // android.app.Dialog
    public void cancel() {
        BottomSheetBehavior bottomSheetBehavior0 = this.getBehavior();
        if(this.j && bottomSheetBehavior0.getState() != 5) {
            bottomSheetBehavior0.setState(5);
            return;
        }
        super.cancel();
    }

    public final void d() {
        if(this.g == null) {
            FrameLayout frameLayout0 = (FrameLayout)View.inflate(this.getContext(), layout.design_bottom_sheet_dialog, null);
            this.g = frameLayout0;
            this.h = (CoordinatorLayout)frameLayout0.findViewById(id.coordinator);
            FrameLayout frameLayout1 = (FrameLayout)this.g.findViewById(id.design_bottom_sheet);
            this.i = frameLayout1;
            BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.from(frameLayout1);
            this.f = bottomSheetBehavior0;
            bottomSheetBehavior0.addBottomSheetCallback(this.q);
            this.f.setHideable(this.k);
            this.p = new MaterialBackOrchestrator(this.f, this.i);
        }
    }

    public final FrameLayout e(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.d();
        CoordinatorLayout coordinatorLayout0 = (CoordinatorLayout)this.g.findViewById(id.coordinator);
        if(v != 0 && view0 == null) {
            view0 = this.getLayoutInflater().inflate(v, coordinatorLayout0, false);
        }
        if(this.o) {
            ViewCompat.setOnApplyWindowInsetsListener(this.i, new b(this));
        }
        this.i.removeAllViews();
        if(viewGroup$LayoutParams0 == null) {
            this.i.addView(view0);
        }
        else {
            this.i.addView(view0, viewGroup$LayoutParams0);
        }
        coordinatorLayout0.findViewById(id.touch_outside).setOnClickListener(new r7.d(this));
        ViewCompat.setAccessibilityDelegate(this.i, new com.google.android.material.internal.b(this, 5));
        this.i.setOnTouchListener(new q(1));
        return this.g;
    }

    @NonNull
    public BottomSheetBehavior getBehavior() {
        if(this.f == null) {
            this.d();
        }
        return this.f;
    }

    public boolean getDismissWithAnimation() {
        return this.j;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.o;
    }

    @Override  // android.app.Dialog
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window0 = this.getWindow();
        if(window0 != null) {
            int v = !this.o || Color.alpha(window0.getNavigationBarColor()) >= 0xFF ? 0 : 1;
            FrameLayout frameLayout0 = this.g;
            if(frameLayout0 != null) {
                frameLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            CoordinatorLayout coordinatorLayout0 = this.h;
            if(coordinatorLayout0 != null) {
                coordinatorLayout0.setFitsSystemWindows(((boolean)(v ^ 1)));
            }
            WindowCompat.setDecorFitsSystemWindows(window0, ((boolean)(v ^ 1)));
            d d0 = this.n;
            if(d0 != null) {
                d0.c(window0);
            }
        }
        MaterialBackOrchestrator materialBackOrchestrator0 = this.p;
        if(materialBackOrchestrator0 != null) {
            if(this.k) {
                materialBackOrchestrator0.startListeningForBackCallbacks();
                return;
            }
            materialBackOrchestrator0.stopListeningForBackCallbacks();
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void onCreate(Bundle bundle0) {
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
        d d0 = this.n;
        if(d0 != null) {
            d0.c(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator0 = this.p;
        if(materialBackOrchestrator0 != null) {
            materialBackOrchestrator0.stopListeningForBackCallbacks();
        }
    }

    @Override  // androidx.activity.ComponentDialog
    public void onStart() {
        super.onStart();
        if(this.f != null && this.f.getState() == 5) {
            this.f.setState(4);
        }
    }

    @Override  // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if(this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior0 = this.f;
            if(bottomSheetBehavior0 != null) {
                bottomSheetBehavior0.setHideable(z);
            }
            if(this.getWindow() != null) {
                MaterialBackOrchestrator materialBackOrchestrator0 = this.p;
                if(materialBackOrchestrator0 != null) {
                    if(this.k) {
                        materialBackOrchestrator0.startListeningForBackCallbacks();
                        return;
                    }
                    materialBackOrchestrator0.stopListeningForBackCallbacks();
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if(z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(@LayoutRes int v) {
        super.setContentView(this.e(null, v, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0) {
        super.setContentView(this.e(view0, 0, null));
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(this.e(view0, 0, viewGroup$LayoutParams0));
    }

    public void setDismissWithAnimation(boolean z) {
        this.j = z;
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view0, boolean z) {
        int v = view0.getSystemUiVisibility();
        view0.setSystemUiVisibility((z ? v | 0x2000 : v & 0xFFFFDFFF));
    }
}

