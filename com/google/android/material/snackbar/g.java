package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.List;

public final class g implements Handler.Callback {
    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        switch(message0.what) {
            case 0: {
                BaseTransientBottomBar baseTransientBottomBar0 = (BaseTransientBottomBar)message0.obj;
                if(baseTransientBottomBar0.view.getParent() == null) {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = baseTransientBottomBar0.view.getLayoutParams();
                    if(viewGroup$LayoutParams0 instanceof LayoutParams) {
                        SwipeDismissBehavior swipeDismissBehavior0 = baseTransientBottomBar0.w;
                        if(swipeDismissBehavior0 == null) {
                            swipeDismissBehavior0 = baseTransientBottomBar0.getNewBehavior();
                        }
                        if(swipeDismissBehavior0 instanceof Behavior) {
                            ((Behavior)swipeDismissBehavior0).z.setBaseTransientBottomBar(baseTransientBottomBar0);
                        }
                        swipeDismissBehavior0.setListener(new l(baseTransientBottomBar0));
                        ((LayoutParams)viewGroup$LayoutParams0).setBehavior(swipeDismissBehavior0);
                        if(baseTransientBottomBar0.getAnchorView() == null) {
                            ((LayoutParams)viewGroup$LayoutParams0).insetEdge = 80;
                        }
                    }
                    baseTransientBottomBar0.view.k = true;
                    baseTransientBottomBar0.g.addView(baseTransientBottomBar0.view);
                    baseTransientBottomBar0.view.k = false;
                    baseTransientBottomBar0.c();
                    baseTransientBottomBar0.view.setVisibility(4);
                }
                if(ViewCompat.isLaidOut(baseTransientBottomBar0.view)) {
                    baseTransientBottomBar0.d();
                    return true;
                }
                baseTransientBottomBar0.u = true;
                return true;
            }
            case 1: {
                BaseTransientBottomBar baseTransientBottomBar1 = (BaseTransientBottomBar)message0.obj;
                int v = message0.arg1;
                AccessibilityManager accessibilityManager0 = baseTransientBottomBar1.x;
                if(accessibilityManager0 == null) {
                label_31:
                    if(baseTransientBottomBar1.view.getVisibility() == 0) {
                        if(baseTransientBottomBar1.view.getAnimationMode() == 1) {
                            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                            valueAnimator0.setInterpolator(baseTransientBottomBar1.d);
                            valueAnimator0.addUpdateListener(new b(baseTransientBottomBar1));
                            valueAnimator0.setDuration(((long)baseTransientBottomBar1.b));
                            valueAnimator0.addListener(new a(baseTransientBottomBar1, v, 0));
                            valueAnimator0.start();
                            return true;
                        }
                        ValueAnimator valueAnimator1 = new ValueAnimator();
                        int v1 = baseTransientBottomBar1.view.getHeight();
                        ViewGroup.LayoutParams viewGroup$LayoutParams1 = baseTransientBottomBar1.view.getLayoutParams();
                        if(viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams) {
                            v1 += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1).bottomMargin;
                        }
                        valueAnimator1.setIntValues(new int[]{0, v1});
                        valueAnimator1.setInterpolator(baseTransientBottomBar1.e);
                        valueAnimator1.setDuration(((long)baseTransientBottomBar1.c));
                        valueAnimator1.addListener(new a(baseTransientBottomBar1, v, 1));
                        valueAnimator1.addUpdateListener(new f(baseTransientBottomBar1));
                        valueAnimator1.start();
                        return true;
                    }
                }
                else {
                    List list0 = accessibilityManager0.getEnabledAccessibilityServiceList(1);
                    if(list0 != null && list0.isEmpty()) {
                        goto label_31;
                    }
                }
                baseTransientBottomBar1.a(v);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

