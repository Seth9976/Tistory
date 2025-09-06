package com.google.android.material.sidesheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;

public final class c implements AccessibilityViewCommand {
    public final SideSheetBehavior a;
    public final int b;

    public c(SideSheetBehavior sideSheetBehavior0, int v) {
        this.a = sideSheetBehavior0;
        this.b = v;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        this.a.setState(this.b);
        return true;
    }
}

