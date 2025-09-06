package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class e2 implements Callback {
    public final PopupMenu a;

    public e2(PopupMenu popupMenu0) {
        this.a = popupMenu0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        OnMenuItemClickListener popupMenu$OnMenuItemClickListener0 = this.a.e;
        return popupMenu$OnMenuItemClickListener0 == null ? false : popupMenu$OnMenuItemClickListener0.onMenuItemClick(menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
    }
}

