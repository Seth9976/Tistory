package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.app.h;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.internal.b;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public final AccessibilityManager a;
    public BottomSheetBehavior b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final f i;
    public static final int j;

    static {
        BottomSheetDragHandleView.j = style.Widget_Material3_BottomSheet_DragHandle;
    }

    public BottomSheetDragHandleView(@NonNull Context context0) {
        this(context0, null);
    }

    public BottomSheetDragHandleView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, BottomSheetDragHandleView.j), attributeSet0, v);
        this.f = this.getResources().getString(string.bottomsheet_action_expand);
        this.g = this.getResources().getString(string.bottomsheet_action_collapse);
        this.h = this.getResources().getString(string.bottomsheet_drag_handle_clicked);
        this.i = new f(this);
        this.a = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.c();
        ViewCompat.setAccessibilityDelegate(this, new b(this, 6));
    }

    public final boolean a() {
        boolean z = false;
        if(!this.d) {
            return false;
        }
        AccessibilityManager accessibilityManager0 = this.a;
        if(accessibilityManager0 != null) {
            AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(0x4000);
            accessibilityEvent0.getText().add(this.h);
            accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
        }
        if(!this.b.isFitToContents()) {
            z = true;
        }
        int v = this.b.getState();
        int v1 = 6;
        int v2 = 3;
        if(v != 4) {
            if(v != 3) {
                if(!this.e) {
                    v2 = 4;
                }
                v1 = v2;
            }
            else if(!z) {
                v1 = 4;
            }
        }
        else if(!z) {
            v1 = 3;
        }
        this.b.setState(v1);
        return true;
    }

    public final void b(int v) {
        switch(v) {
            case 3: {
                this.e = false;
                break;
            }
            case 4: {
                this.e = true;
            }
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityActionCompat.ACTION_CLICK, (this.e ? this.f : this.g), new h(this, 26));
    }

    public final void c() {
        int v = 1;
        this.d = this.c && this.b != null;
        if(this.b == null) {
            v = 2;
        }
        ViewCompat.setImportantForAccessibility(this, v);
        this.setClickable(this.d);
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.c = z;
        this.c();
    }

    @Override  // android.widget.ImageView
    public void onAttachedToWindow() {
        Behavior coordinatorLayout$Behavior0;
        BottomSheetBehavior bottomSheetBehavior0;
        super.onAttachedToWindow();
        View view0 = this;
    alab1:
        while(true) {
            do {
                ViewParent viewParent0 = view0.getParent();
                bottomSheetBehavior0 = null;
                view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                if(view0 == null) {
                    break alab1;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
                    continue alab1;
                }
                coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).getBehavior();
            }
            while(!(coordinatorLayout$Behavior0 instanceof BottomSheetBehavior));
            bottomSheetBehavior0 = (BottomSheetBehavior)coordinatorLayout$Behavior0;
            break;
        }
        this.setBottomSheetBehavior(bottomSheetBehavior0);
        AccessibilityManager accessibilityManager0 = this.a;
        if(accessibilityManager0 != null) {
            accessibilityManager0.addAccessibilityStateChangeListener(this);
            this.onAccessibilityStateChanged(accessibilityManager0.isEnabled());
        }
    }

    @Override  // android.widget.ImageView
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager0 = this.a;
        if(accessibilityManager0 != null) {
            accessibilityManager0.removeAccessibilityStateChangeListener(this);
        }
        this.setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior bottomSheetBehavior0) {
        BottomSheetBehavior bottomSheetBehavior1 = this.b;
        f f0 = this.i;
        if(bottomSheetBehavior1 != null) {
            bottomSheetBehavior1.removeBottomSheetCallback(f0);
            this.b.k(null);
        }
        this.b = bottomSheetBehavior0;
        if(bottomSheetBehavior0 != null) {
            bottomSheetBehavior0.k(this);
            this.b(this.b.getState());
            this.b.addBottomSheetCallback(f0);
        }
        this.c();
    }
}

