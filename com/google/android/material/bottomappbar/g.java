package com.google.android.material.bottomappbar;

import android.graphics.RectF;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import com.google.android.material.R.dimen;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;

public final class g implements View.OnLayoutChangeListener {
    public final Behavior a;

    public g(Behavior bottomAppBar$Behavior0) {
        this.a = bottomAppBar$Behavior0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        Behavior bottomAppBar$Behavior0 = this.a;
        BottomAppBar bottomAppBar0 = (BottomAppBar)bottomAppBar$Behavior0.B.get();
        if(bottomAppBar0 != null && (view0 instanceof FloatingActionButton || view0 instanceof ExtendedFloatingActionButton)) {
            int v8 = view0.getHeight();
            if(view0 instanceof FloatingActionButton) {
                ((FloatingActionButton)view0).getMeasuredContentRect(bottomAppBar$Behavior0.A);
                int v9 = bottomAppBar$Behavior0.A.height();
                bottomAppBar0.D(v9);
                bottomAppBar0.setFabCornerSize(((FloatingActionButton)view0).getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(bottomAppBar$Behavior0.A)));
                v8 = v9;
            }
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            if(bottomAppBar$Behavior0.C == 0) {
                if(bottomAppBar0.j0 == 1) {
                    int v10 = view0.getMeasuredHeight();
                    coordinatorLayout$LayoutParams0.bottomMargin = bottomAppBar0.getBottomInset() + (bottomAppBar0.getResources().getDimensionPixelOffset(dimen.mtrl_bottomappbar_fab_bottom_margin) - (v10 - v8) / 2);
                }
                coordinatorLayout$LayoutParams0.leftMargin = bottomAppBar0.getLeftInset();
                coordinatorLayout$LayoutParams0.rightMargin = bottomAppBar0.getRightInset();
                boolean z = ViewUtils.isLayoutRtl(view0);
                int v11 = bottomAppBar0.k0;
                if(z) {
                    coordinatorLayout$LayoutParams0.leftMargin += v11;
                }
                else {
                    coordinatorLayout$LayoutParams0.rightMargin += v11;
                }
            }
            bottomAppBar0.C();
            return;
        }
        view0.removeOnLayoutChangeListener(this);
    }
}

