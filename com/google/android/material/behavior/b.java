package com.google.android.material.behavior;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class b implements AccessibilityViewCommand {
    public final SwipeDismissBehavior a;

    public b(SwipeDismissBehavior swipeDismissBehavior0) {
        this.a = swipeDismissBehavior0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        SwipeDismissBehavior swipeDismissBehavior0 = this.a;
        boolean z = false;
        if(swipeDismissBehavior0.canSwipeDismissView(view0)) {
            if(ViewCompat.getLayoutDirection(view0) == 1) {
                z = true;
            }
            ViewCompat.offsetLeftAndRight(view0, ((swipeDismissBehavior0.u != 0 || !z) && (swipeDismissBehavior0.u != 1 || z) ? view0.getWidth() : -view0.getWidth()));
            view0.setAlpha(0.0f);
            OnDismissListener swipeDismissBehavior$OnDismissListener0 = swipeDismissBehavior0.p;
            if(swipeDismissBehavior$OnDismissListener0 != null) {
                swipeDismissBehavior$OnDismissListener0.onDismiss(view0);
            }
            return true;
        }
        return false;
    }
}

