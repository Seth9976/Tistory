package androidx.legacy.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;
import h4.a;

@Deprecated
public class ActionBarDrawerToggle implements DrawerListener {
    @Deprecated
    public interface Delegate {
        @Nullable
        Drawable getThemeUpIndicator();

        void setActionBarDescription(@StringRes int arg1);

        void setActionBarUpIndicator(Drawable arg1, @StringRes int arg2);
    }

    @Deprecated
    public interface DelegateProvider {
        @Nullable
        Delegate getDrawerToggleDelegate();
    }

    public final Activity a;
    public final Delegate b;
    public final DrawerLayout c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public Drawable g;
    public final a h;
    public final int i;
    public final int j;
    public final int k;
    public static final int[] l;

    static {
        ActionBarDrawerToggle.l = new int[]{0x101030B};
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, @DrawableRes int v, @StringRes int v1, @StringRes int v2) {
        this(activity0, drawerLayout0, ((boolean)0), v, v1, v2);
    }

    public ActionBarDrawerToggle(Activity activity0, DrawerLayout drawerLayout0, boolean z, @DrawableRes int v, @StringRes int v1, @StringRes int v2) {
        this.d = true;
        this.a = activity0;
        this.b = activity0 instanceof DelegateProvider ? ((DelegateProvider)activity0).getDrawerToggleDelegate() : null;
        this.c = drawerLayout0;
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.f = this.a();
        this.g = ContextCompat.getDrawable(activity0, v);
        a a0 = new a(this, this.g);
        this.h = a0;
        a0.d = z ? 0.333333f : 0.0f;
        a0.invalidateSelf();
    }

    public final Drawable a() {
        Delegate actionBarDrawerToggle$Delegate0 = this.b;
        if(actionBarDrawerToggle$Delegate0 != null) {
            return actionBarDrawerToggle$Delegate0.getThemeUpIndicator();
        }
        Context context0 = this.a;
        ActionBar actionBar0 = ((Activity)context0).getActionBar();
        if(actionBar0 != null) {
            context0 = actionBar0.getThemedContext();
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, ActionBarDrawerToggle.l, 0x10102CE, 0);
        Drawable drawable0 = typedArray0.getDrawable(0);
        typedArray0.recycle();
        return drawable0;
    }

    public final void b(Drawable drawable0, int v) {
        Delegate actionBarDrawerToggle$Delegate0 = this.b;
        if(actionBarDrawerToggle$Delegate0 != null) {
            actionBarDrawerToggle$Delegate0.setActionBarUpIndicator(drawable0, v);
            return;
        }
        ActionBar actionBar0 = this.a.getActionBar();
        if(actionBar0 != null) {
            actionBar0.setHomeAsUpIndicator(drawable0);
            actionBar0.setHomeActionContentDescription(v);
        }
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.d;
    }

    public void onConfigurationChanged(Configuration configuration0) {
        if(!this.e) {
            this.f = this.a();
        }
        this.g = ContextCompat.getDrawable(this.a, this.i);
        this.syncState();
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerClosed(View view0) {
        this.h.c = 0.0f;
        this.h.invalidateSelf();
        if(this.d) {
            int v = this.j;
            Delegate actionBarDrawerToggle$Delegate0 = this.b;
            if(actionBarDrawerToggle$Delegate0 != null) {
                actionBarDrawerToggle$Delegate0.setActionBarDescription(v);
                return;
            }
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeActionContentDescription(v);
            }
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerOpened(View view0) {
        this.h.c = 1.0f;
        this.h.invalidateSelf();
        if(this.d) {
            int v = this.k;
            Delegate actionBarDrawerToggle$Delegate0 = this.b;
            if(actionBarDrawerToggle$Delegate0 != null) {
                actionBarDrawerToggle$Delegate0.setActionBarDescription(v);
                return;
            }
            ActionBar actionBar0 = this.a.getActionBar();
            if(actionBar0 != null) {
                actionBar0.setHomeActionContentDescription(v);
            }
        }
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerSlide(View view0, float f) {
        float f1 = this.h.c;
        this.h.c = Float.compare(f, 0.5f) <= 0 ? Math.min(f1, f * 2.0f) : Math.max(f1, Math.max(0.0f, f - 0.5f) * 2.0f);
        this.h.invalidateSelf();
    }

    @Override  // androidx.drawerlayout.widget.DrawerLayout$DrawerListener
    public void onDrawerStateChanged(int v) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0 != null && menuItem0.getItemId() == 0x102002C && this.d) {
            DrawerLayout drawerLayout0 = this.c;
            if(drawerLayout0.isDrawerVisible(0x800003)) {
                drawerLayout0.closeDrawer(0x800003);
                return true;
            }
            drawerLayout0.openDrawer(0x800003);
            return true;
        }
        return false;
    }

    public void setDrawerIndicatorEnabled(boolean z) {
        if(z != this.d) {
            if(z) {
                int v = this.c.isDrawerOpen(0x800003) ? this.k : this.j;
                this.b(this.h, v);
            }
            else {
                this.b(this.f, 0);
            }
            this.d = z;
        }
    }

    public void setHomeAsUpIndicator(int v) {
        this.setHomeAsUpIndicator((v == 0 ? null : ContextCompat.getDrawable(this.a, v)));
    }

    public void setHomeAsUpIndicator(Drawable drawable0) {
        if(drawable0 == null) {
            this.f = this.a();
            this.e = false;
        }
        else {
            this.f = drawable0;
            this.e = true;
        }
        if(!this.d) {
            this.b(this.f, 0);
        }
    }

    public void syncState() {
        DrawerLayout drawerLayout0 = this.c;
        boolean z = drawerLayout0.isDrawerOpen(0x800003);
        a a0 = this.h;
        a0.c = z ? 1.0f : 0.0f;
        a0.invalidateSelf();
        if(this.d) {
            this.b(a0, (drawerLayout0.isDrawerOpen(0x800003) ? this.k : this.j));
        }
    }
}

