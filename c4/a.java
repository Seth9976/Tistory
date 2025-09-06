package c4;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.drawerlayout.widget.DrawerLayout;

public final class a implements AccessibilityViewCommand {
    public final DrawerLayout a;

    public a(DrawerLayout drawerLayout0) {
        this.a = drawerLayout0;
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        DrawerLayout drawerLayout0 = this.a;
        if(drawerLayout0.isDrawerOpen(view0) && drawerLayout0.getDrawerLockMode(view0) != 2) {
            drawerLayout0.closeDrawer(view0);
            return true;
        }
        return false;
    }
}

