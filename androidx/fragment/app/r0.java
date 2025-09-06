package androidx.fragment.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;

public final class r0 implements MenuProvider {
    public final FragmentManager a;

    public r0(FragmentManager fragmentManager0) {
        this.a = fragmentManager0;
    }

    @Override  // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu0, MenuInflater menuInflater0) {
        this.a.j(menu0, menuInflater0);
    }

    @Override  // androidx.core.view.MenuProvider
    public final void onMenuClosed(Menu menu0) {
        this.a.p(menu0);
    }

    @Override  // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem0) {
        return this.a.o(menuItem0);
    }

    @Override  // androidx.core.view.MenuProvider
    public final void onPrepareMenu(Menu menu0) {
        this.a.s(menu0);
    }
}

