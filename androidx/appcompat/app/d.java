package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;

public final class d implements Delegate {
    public final Toolbar a;
    public final Drawable b;
    public final CharSequence c;

    public d(Toolbar toolbar0) {
        this.a = toolbar0;
        this.b = toolbar0.getNavigationIcon();
        this.c = toolbar0.getNavigationContentDescription();
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Context getActionBarThemedContext() {
        return this.a.getContext();
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Drawable getThemeUpIndicator() {
        return this.b;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final boolean isNavigationVisible() {
        return true;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarDescription(int v) {
        Toolbar toolbar0 = this.a;
        if(v == 0) {
            toolbar0.setNavigationContentDescription(this.c);
            return;
        }
        toolbar0.setNavigationContentDescription(v);
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarUpIndicator(Drawable drawable0, int v) {
        this.a.setNavigationIcon(drawable0);
        this.setActionBarDescription(v);
    }
}

