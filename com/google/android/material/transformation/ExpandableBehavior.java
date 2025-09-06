package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import h8.a;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends Behavior {
    public int o;

    public ExpandableBehavior() {
        this.o = 0;
    }

    public ExpandableBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = 0;
    }

    @Nullable
    public ExpandableWidget findExpandableWidget(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0) {
        List list0 = coordinatorLayout0.getDependencies(view0);
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = (View)list0.get(v1);
            if(this.layoutDependsOn(coordinatorLayout0, view0, view1)) {
                return (ExpandableWidget)view1;
            }
        }
        return null;
    }

    @Nullable
    public static ExpandableBehavior from(@NonNull View view0, @NonNull Class class0) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        Behavior coordinatorLayout$Behavior0 = ((LayoutParams)viewGroup$LayoutParams0).getBehavior();
        if(!(coordinatorLayout$Behavior0 instanceof ExpandableBehavior)) {
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        return (ExpandableBehavior)class0.cast(coordinatorLayout$Behavior0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout arg1, View arg2, View arg3);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
        int v = 2;
        if(!((ExpandableWidget)view1).isExpanded()) {
            if(this.o == 1) {
            label_5:
                if(((ExpandableWidget)view1).isExpanded()) {
                    v = 1;
                }
                this.o = v;
                return this.onExpandedStateChange(((View)(((ExpandableWidget)view1))), view0, ((ExpandableWidget)view1).isExpanded(), true);
            }
        }
        else if(this.o == 0 || this.o == 2) {
            goto label_5;
        }
        return false;
    }

    public abstract boolean onExpandedStateChange(View arg1, View arg2, boolean arg3, boolean arg4);

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        if(!ViewCompat.isLaidOut(view0)) {
            int v1 = 2;
            ExpandableWidget expandableWidget0 = this.findExpandableWidget(coordinatorLayout0, view0);
            if(expandableWidget0 != null) {
                if(!expandableWidget0.isExpanded()) {
                    if(this.o == 1) {
                    label_8:
                        if(expandableWidget0.isExpanded()) {
                            v1 = 1;
                        }
                        this.o = v1;
                        view0.getViewTreeObserver().addOnPreDrawListener(new a(this, view0, v1, expandableWidget0));
                    }
                }
                else if(this.o == 0 || this.o == 2) {
                    goto label_8;
                }
            }
        }
        return false;
    }
}

