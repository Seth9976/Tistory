package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class ExpandableWidgetHelper {
    public final View a;
    public boolean b;
    public int c;

    public ExpandableWidgetHelper(ExpandableWidget expandableWidget0) {
        this.b = false;
        this.c = 0;
        this.a = (View)expandableWidget0;
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.c;
    }

    public boolean isExpanded() {
        return this.b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle0) {
        this.b = bundle0.getBoolean("expanded", false);
        this.c = bundle0.getInt("expandedComponentIdHint", 0);
        if(this.b) {
            View view0 = this.a;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof CoordinatorLayout) {
                ((CoordinatorLayout)viewParent0).dispatchDependentViewsChanged(view0);
            }
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("expanded", this.b);
        bundle0.putInt("expandedComponentIdHint", this.c);
        return bundle0;
    }

    public boolean setExpanded(boolean z) {
        if(this.b != z) {
            this.b = z;
            View view0 = this.a;
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof CoordinatorLayout) {
                ((CoordinatorLayout)viewParent0).dispatchDependentViewsChanged(view0);
            }
            return true;
        }
        return false;
    }

    public void setExpandedComponentIdHint(@IdRes int v) {
        this.c = v;
    }
}

