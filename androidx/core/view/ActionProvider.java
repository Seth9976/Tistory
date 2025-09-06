package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class ActionProvider {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean arg1);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean arg1);
    }

    public final Context a;
    public SubUiVisibilityListener b;
    public VisibilityListener c;

    public ActionProvider(@NonNull Context context0) {
        this.a = context0;
    }

    @NonNull
    public Context getContext() {
        return this.a;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    @NonNull
    public abstract View onCreateActionView();

    @NonNull
    public View onCreateActionView(@NonNull MenuItem menuItem0) {
        return this.onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(@NonNull SubMenu subMenu0) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if(this.c != null && this.overridesItemVisibility()) {
            this.c.onActionProviderVisibilityChanged(this.isVisible());
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void reset() {
        this.c = null;
        this.b = null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void setSubUiVisibilityListener(@Nullable SubUiVisibilityListener actionProvider$SubUiVisibilityListener0) {
        this.b = actionProvider$SubUiVisibilityListener0;
    }

    public void setVisibilityListener(@Nullable VisibilityListener actionProvider$VisibilityListener0) {
        if(this.c != null && actionProvider$VisibilityListener0 != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = actionProvider$VisibilityListener0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public void subUiVisibilityChanged(boolean z) {
        SubUiVisibilityListener actionProvider$SubUiVisibilityListener0 = this.b;
        if(actionProvider$SubUiVisibilityListener0 != null) {
            actionProvider$SubUiVisibilityListener0.onSubUiVisibilityChanged(z);
        }
    }
}

