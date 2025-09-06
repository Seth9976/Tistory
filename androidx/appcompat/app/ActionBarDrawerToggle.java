package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;

public class ActionBarDrawerToggle implements DrawerListener {
    public interface Delegate {
        Context getActionBarThemedContext();

        Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(@StringRes int arg1);

        void setActionBarUpIndicator(Drawable arg1, @StringRes int arg2);
    }

    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    public final Delegate a;
    public final DrawerLayout b;
    public DrawerArrowDrawable c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public boolean g;
    public final int h;
    public final int i;
    public View.OnClickListener j;
    public boolean k;

    public ActionBarDrawerToggle(Activity activity0, Toolbar toolbar0, DrawerLayout drawerLayout0, int v, int v1) {
        this.d = true;
        this.f = true;
        this.k = false;
        if(toolbar0 != null) {
            this.a = new d(toolbar0);
            toolbar0.setNavigationOnClickListener(new a(this));
        }
        else if(activity0 instanceof DelegateProvider) {
            this.a = ((DelegateProvider)activity0).getDrawerToggleDelegate();
        }
        else {
            this.a = new c(activity0);
        }
        this.b = drawerLayout0;
        this.h = v;
        this.i = v1;
        this.c = new DrawerArrowDrawable(this.a.getActionBarThemedContext());
        this.e = this.a.getThemeUpIndicator();
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, @StringRes int v, @StringRes int v1) {
        this(activity0, null, drawerLayout0, v, v1);
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, Toolbar toolbar0, @StringRes int v, @StringRes int v1) {
        this(activity0, toolbar0, drawerLayout0, v, v1);
    }

    public final void a(Drawable drawable0, int v) {
        Delegate actionBarDrawerToggle$Delegate0 = this.a;
        if(!this.k && !actionBarDrawerToggle$Delegate0.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        actionBarDrawerToggle$Delegate0.setActionBarUpIndicator(drawable0, v);
    }

    public final void b(float f) {
        switch(f) {
            case 0: {
                this.c.setVerticalMirror(false);
                break;
            }
            case 0x3F800000: {
                this.c.setVerticalMirror(true);
            }
        }
        this.c.setProgress(f);
    }

    @NonNull
    public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.c;
    }

    public View.OnClickListener getToolbarNavigationClickListener() {
        return this.j;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.f;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.d;
    }

    public void onConfigurationChanged(Configuration configuration0) {
        if(!this.g) {
            this.e = this.a.getThemeUpIndicator();
        }
        this.syncState();
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerClosed(View view0) {
        this.b(0.0f);
        if(this.f) {
            this.a.setActionBarDescription(this.h);
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerOpened(View view0) {
        this.b(1.0f);
        if(this.f) {
            this.a.setActionBarDescription(this.i);
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerSlide(View view0, float f) {
        if(this.d) {
            this.b(Math.min(1.0f, Math.max(0.0f, f)));
            return;
        }
        this.b(0.0f);
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerStateChanged(int v) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0 != null && menuItem0.getItemId() == 0x102002C && this.f) {
            DrawerLayout drawerLayout0 = this.b;
            int v = drawerLayout0.getDrawerLockMode(0x800003);
            if(drawerLayout0.isDrawerVisible(0x800003) && v != 2) {
                drawerLayout0.closeDrawer(0x800003);
                return true;
            }
            if(v != 1) {
                drawerLayout0.openDrawer(0x800003);
            }
            return true;
        }
        return false;
    }

    public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable drawerArrowDrawable0) {
        this.c = drawerArrowDrawable0;
        this.syncState();
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if(z != this.f) {
            if(z) {
                this.a(this.c, (this.b.isDrawerOpen(0x800003) ? this.i : this.h));
            }
            else {
                this.a(this.e, 0);
            }
            this.f = z;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean z) {
        this.d = z;
        if(!z) {
            this.b(0.0f);
        }
    }

    public void setHomeAsUpIndicator(int v) {
        this.setHomeAsUpIndicator((v == 0 ? null : this.b.getResources().getDrawable(v)));
    }

    public void setHomeAsUpIndicator(Drawable drawable0) {
        if(drawable0 == null) {
            this.e = this.a.getThemeUpIndicator();
            this.g = false;
        }
        else {
            this.e = drawable0;
            this.g = true;
        }
        if(!this.f) {
            this.a(this.e, 0);
        }
    }

    public void setToolbarNavigationClickListener(View.OnClickListener view$OnClickListener0) {
        this.j = view$OnClickListener0;
    }

    public void syncState() {
        DrawerLayout drawerLayout0 = this.b;
        if(drawerLayout0.isDrawerOpen(0x800003)) {
            this.b(1.0f);
        }
        else {
            this.b(0.0f);
        }
        if(this.f) {
            this.a(this.c, (drawerLayout0.isDrawerOpen(0x800003) ? this.i : this.h));
        }
    }
}

