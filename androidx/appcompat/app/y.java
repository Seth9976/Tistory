package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

public final class y implements Callback {
    public final Callback a;
    public final i0 b;

    public y(i0 i00, Callback actionMode$Callback0) {
        this.b = i00;
        this.a = actionMode$Callback0;
    }

    @Override  // androidx.appcompat.view.ActionMode$Callback
    public final boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
        return this.a.onActionItemClicked(actionMode0, menuItem0);
    }

    @Override  // androidx.appcompat.view.ActionMode$Callback
    public final boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
        return this.a.onCreateActionMode(actionMode0, menu0);
    }

    @Override  // androidx.appcompat.view.ActionMode$Callback
    public final void onDestroyActionMode(ActionMode actionMode0) {
        this.a.onDestroyActionMode(actionMode0);
        i0 i00 = this.b;
        if(i00.w != null) {
            i00.l.getDecorView().removeCallbacks(i00.x);
        }
        if(i00.v != null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = i00.y;
            if(viewPropertyAnimatorCompat0 != null) {
                viewPropertyAnimatorCompat0.cancel();
            }
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1 = ViewCompat.animate(i00.v).alpha(0.0f);
            i00.y = viewPropertyAnimatorCompat1;
            viewPropertyAnimatorCompat1.setListener(new t(this, 1));
        }
        AppCompatCallback appCompatCallback0 = i00.n;
        if(appCompatCallback0 != null) {
            appCompatCallback0.onSupportActionModeFinished(i00.u);
        }
        i00.u = null;
        ViewCompat.requestApplyInsets(i00.B);
        i00.A();
    }

    @Override  // androidx.appcompat.view.ActionMode$Callback
    public final boolean onPrepareActionMode(ActionMode actionMode0, Menu menu0) {
        ViewCompat.requestApplyInsets(this.b.B);
        return this.a.onPrepareActionMode(actionMode0, menu0);
    }
}

