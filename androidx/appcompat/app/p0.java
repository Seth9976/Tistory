package androidx.appcompat.app;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;

public final class p0 implements OnMenuItemClickListener {
    public final t0 a;

    public p0(t0 t00) {
        this.a = t00;
    }

    @Override  // androidx.appcompat.widget.Toolbar$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        return this.a.b.onMenuItemSelected(0, menuItem0);
    }
}

