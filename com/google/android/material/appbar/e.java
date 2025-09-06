package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class e implements AccessibilityViewCommand {
    public final AppBarLayout a;
    public final boolean b;

    public e(AppBarLayout appBarLayout0, boolean z) {
        this.a = appBarLayout0;
        this.b = z;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        this.a.setExpanded(this.b);
        return true;
    }
}

