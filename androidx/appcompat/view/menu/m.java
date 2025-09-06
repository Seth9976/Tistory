package androidx.appcompat.view.menu;

import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.ActionProvider.VisibilityListener;

public final class m extends l implements ActionProvider.VisibilityListener {
    public VisibilityListener f;

    @Override  // androidx.core.view.ActionProvider
    public final boolean isVisible() {
        return this.d.isVisible();
    }

    @Override  // android.view.ActionProvider$VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        VisibilityListener actionProvider$VisibilityListener0 = this.f;
        if(actionProvider$VisibilityListener0 != null) {
            actionProvider$VisibilityListener0.onActionProviderVisibilityChanged(z);
        }
    }

    @Override  // androidx.core.view.ActionProvider
    public final View onCreateActionView(MenuItem menuItem0) {
        return this.d.onCreateActionView(menuItem0);
    }

    @Override  // androidx.core.view.ActionProvider
    public final boolean overridesItemVisibility() {
        return this.d.overridesItemVisibility();
    }

    @Override  // androidx.core.view.ActionProvider
    public final void refreshVisibility() {
        this.d.refreshVisibility();
    }

    @Override  // androidx.core.view.ActionProvider
    public final void setVisibilityListener(VisibilityListener actionProvider$VisibilityListener0) {
        this.f = actionProvider$VisibilityListener0;
        this.d.setVisibilityListener((actionProvider$VisibilityListener0 == null ? null : this));
    }
}

