package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

public final class c implements Delegate {
    public final Activity a;

    public c(Activity activity0) {
        this.a = activity0;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Context getActionBarThemedContext() {
        ActionBar actionBar0 = this.a.getActionBar();
        return actionBar0 == null ? this.a : actionBar0.getThemedContext();
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Drawable getThemeUpIndicator() {
        TypedArray typedArray0 = this.getActionBarThemedContext().obtainStyledAttributes(null, new int[]{0x101030B}, 0x10102CE, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        typedArray0.recycle();
        return drawable0;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final boolean isNavigationVisible() {
        ActionBar actionBar0 = this.a.getActionBar();
        return actionBar0 != null && (actionBar0.getDisplayOptions() & 4) != 0;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarDescription(int v) {
        ActionBar actionBar0 = this.a.getActionBar();
        if(actionBar0 != null) {
            b.a(actionBar0, v);
        }
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarUpIndicator(Drawable drawable0, int v) {
        ActionBar actionBar0 = this.a.getActionBar();
        if(actionBar0 != null) {
            b.b(actionBar0, drawable0);
            b.a(actionBar0, v);
        }
    }
}

