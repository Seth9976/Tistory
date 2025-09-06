package r7;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class c implements AccessibilityViewCommand {
    public final int a;
    public final BottomSheetBehavior b;

    public c(BottomSheetBehavior bottomSheetBehavior0, int v) {
        this.b = bottomSheetBehavior0;
        this.a = v;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        this.b.setState(this.a);
        return true;
    }
}

