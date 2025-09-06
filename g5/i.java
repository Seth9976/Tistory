package g5;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.viewpager2.widget.ViewPager2;

public final class i implements AccessibilityViewCommand {
    public final k a;

    public i(k k0) {
        this.a = k0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        int v = ((ViewPager2)view0).getCurrentItem();
        ViewPager2 viewPager20 = this.a.d;
        if(viewPager20.isUserInputEnabled()) {
            viewPager20.c(v + 1, true);
        }
        return true;
    }
}

