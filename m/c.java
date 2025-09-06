package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.lang.reflect.Constructor;

public final class c {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public final SupportMenuInflater E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public ActionProvider z;

    public c(SupportMenuInflater supportMenuInflater0, Menu menu0) {
        this.E = supportMenuInflater0;
        this.C = null;
        this.D = null;
        this.a = menu0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String s, Class[] arr_class, Object[] arr_object) {
        try {
            Constructor constructor0 = Class.forName(s, false, this.E.c.getClassLoader()).getConstructor(arr_class);
            constructor0.setAccessible(true);
            return constructor0.newInstance(arr_object);
        }
        catch(Exception exception0) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, exception0);
            return null;
        }
    }

    public final void b(MenuItem menuItem0) {
        boolean z = false;
        menuItem0.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int v = this.v;
        if(v >= 0) {
            menuItem0.setShowAsAction(v);
        }
        SupportMenuInflater supportMenuInflater0 = this.E;
        if(this.y != null) {
            if(supportMenuInflater0.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if(supportMenuInflater0.d == null) {
                supportMenuInflater0.d = SupportMenuInflater.a(supportMenuInflater0.c);
            }
            Object object0 = supportMenuInflater0.d;
            String s = this.y;
            b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            b0.a = object0;
            Class class0 = object0.getClass();
            try {
                b0.b = class0.getMethod(s, b.c);
            }
            catch(Exception exception0) {
                StringBuilder stringBuilder0 = a5.b.v("Couldn\'t resolve menu item onClick handler ", s, " in class ");
                stringBuilder0.append(class0.getName());
                InflateException inflateException0 = new InflateException(stringBuilder0.toString());
                inflateException0.initCause(exception0);
                throw inflateException0;
            }
            menuItem0.setOnMenuItemClickListener(b0);
        }
        if(this.r >= 2) {
            if(menuItem0 instanceof MenuItemImpl) {
                ((MenuItemImpl)menuItem0).setExclusiveCheckable(true);
            }
            else if(menuItem0 instanceof MenuItemWrapperICS) {
                ((MenuItemWrapperICS)menuItem0).setExclusiveCheckable(true);
            }
        }
        String s1 = this.x;
        if(s1 != null) {
            menuItem0.setActionView(((View)this.a(s1, SupportMenuInflater.e, supportMenuInflater0.a)));
            z = true;
        }
        int v1 = this.w;
        if(v1 > 0) {
            if(z) {
                Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
            }
            else {
                menuItem0.setActionView(v1);
            }
        }
        ActionProvider actionProvider0 = this.z;
        if(actionProvider0 != null) {
            MenuItemCompat.setActionProvider(menuItem0, actionProvider0);
        }
        MenuItemCompat.setContentDescription(menuItem0, this.A);
        MenuItemCompat.setTooltipText(menuItem0, this.B);
        MenuItemCompat.setAlphabeticShortcut(menuItem0, this.n, this.o);
        MenuItemCompat.setNumericShortcut(menuItem0, this.p, this.q);
        PorterDuff.Mode porterDuff$Mode0 = this.D;
        if(porterDuff$Mode0 != null) {
            MenuItemCompat.setIconTintMode(menuItem0, porterDuff$Mode0);
        }
        ColorStateList colorStateList0 = this.C;
        if(colorStateList0 != null) {
            MenuItemCompat.setIconTintList(menuItem0, colorStateList0);
        }
    }
}

