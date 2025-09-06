package androidx.appcompat.widget;

import android.view.MenuItem;

public final class h3 implements OnMenuItemClickListener {
    public final Toolbar a;

    public h3(Toolbar toolbar0) {
        this.a = toolbar0;
    }

    @Override  // androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        Toolbar toolbar0 = this.a;
        if(toolbar0.M.onMenuItemSelected(menuItem0)) {
            return true;
        }
        return toolbar0.O == null ? false : toolbar0.O.onMenuItemClick(menuItem0);
    }
}

