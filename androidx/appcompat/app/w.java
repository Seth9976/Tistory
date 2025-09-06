package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.TintTypedArray;

public final class w implements Delegate {
    public final i0 a;

    public w(i0 i00) {
        this.a = i00;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Context getActionBarThemedContext() {
        return this.a.q();
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final Drawable getThemeUpIndicator() {
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.a.q(), null, new int[]{attr.homeAsUpIndicator});
        Drawable drawable0 = tintTypedArray0.getDrawable(0);
        tintTypedArray0.recycle();
        return drawable0;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final boolean isNavigationVisible() {
        this.a.t();
        ActionBar actionBar0 = this.a.o;
        return actionBar0 != null && (actionBar0.getDisplayOptions() & 4) != 0;
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarDescription(int v) {
        this.a.t();
        ActionBar actionBar0 = this.a.o;
        if(actionBar0 != null) {
            actionBar0.setHomeActionContentDescription(v);
        }
    }

    @Override  // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public final void setActionBarUpIndicator(Drawable drawable0, int v) {
        this.a.t();
        ActionBar actionBar0 = this.a.o;
        if(actionBar0 != null) {
            actionBar0.setHomeAsUpIndicator(drawable0);
            actionBar0.setHomeActionContentDescription(v);
        }
    }
}

