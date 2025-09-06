package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class d implements AccessibilityViewCommand {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final View c;
    public final int d;
    public final BaseBehavior e;

    public d(BaseBehavior appBarLayout$BaseBehavior0, CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v) {
        this.e = appBarLayout$BaseBehavior0;
        this.a = coordinatorLayout0;
        this.b = appBarLayout0;
        this.c = view0;
        this.d = v;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        this.e.onNestedPreScroll(this.a, this.b, this.c, 0, this.d, new int[]{0, 0}, 1);
        return true;
    }
}

