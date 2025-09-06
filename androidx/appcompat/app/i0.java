package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.res.ResourcesCompat.ThemeCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class i0 extends AppCompatDelegate implements LayoutInflater.Factory2, Callback {
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public AppCompatDelegateImpl.PanelFeatureState[] M;
    public AppCompatDelegateImpl.PanelFeatureState N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public Configuration S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public d0 X;
    public d0 Y;
    public boolean Z;
    public int a0;
    public final r b0;
    public boolean c0;
    public Rect d0;
    public Rect e0;
    public AppCompatViewInflater f0;
    public OnBackInvokedDispatcher g0;
    public OnBackInvokedCallback h0;
    public static final SimpleArrayMap i0;
    public final Object j;
    public static final int[] j0;
    public final Context k;
    public static final boolean k0;
    public Window l;
    public static final boolean l0;
    public c0 m;
    public final AppCompatCallback n;
    public ActionBar o;
    public SupportMenuInflater p;
    public CharSequence q;
    public DecorContentParent r;
    public x s;
    public h0 t;
    public ActionMode u;
    public ActionBarContextView v;
    public PopupWindow w;
    public u x;
    public ViewPropertyAnimatorCompat y;
    public boolean z;

    static {
        i0.i0 = new SimpleArrayMap();
        i0.j0 = new int[]{0x1010054};
        i0.k0 = true;
        i0.l0 = true;
    }

    public i0(Context context0, Window window0, AppCompatCallback appCompatCallback0, Object object0) {
        AppCompatActivity appCompatActivity0 = null;
        this.y = null;
        this.z = true;
        this.T = -100;
        this.b0 = new r(this, 0);
        this.k = context0;
        this.n = appCompatCallback0;
        this.j = object0;
        if(object0 instanceof Dialog) {
            while(context0 != null) {
                if(context0 instanceof AppCompatActivity) {
                    appCompatActivity0 = (AppCompatActivity)context0;
                    break;
                }
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                context0 = ((ContextWrapper)context0).getBaseContext();
            }
            if(appCompatActivity0 != null) {
                this.T = appCompatActivity0.getDelegate().getLocalNightMode();
            }
        }
        if(this.T == -100) {
            SimpleArrayMap simpleArrayMap0 = i0.i0;
            Integer integer0 = (Integer)simpleArrayMap0.get(this.j.getClass().getName());
            if(integer0 != null) {
                this.T = (int)integer0;
                simpleArrayMap0.remove(this.j.getClass().getName());
            }
        }
        if(window0 != null) {
            this.g(window0);
        }
        AppCompatDrawableManager.preload();
    }

    public final void A() {
        boolean z = false;
        if(Build.VERSION.SDK_INT >= 33) {
            if(this.g0 != null) {
                if(this.s(0).m) {
                    z = true;
                }
                else if(this.u != null) {
                    z = true;
                }
            }
            if(z && this.h0 == null) {
                this.h0 = b0.b(this.g0, this);
                return;
            }
            if(!z) {
                OnBackInvokedCallback onBackInvokedCallback0 = this.h0;
                if(onBackInvokedCallback0 != null) {
                    b0.c(this.g0, onBackInvokedCallback0);
                }
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void a() {
        Context context0 = this.k;
        if(AppCompatDelegate.c(context0) && (AppCompatDelegate.c != null && !AppCompatDelegate.c.equals(AppCompatDelegate.d))) {
            o o0 = new o(context0, 1);
            AppCompatDelegate.a.execute(o0);
        }
        this.f(true, true);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.o();
        ((ViewGroup)this.B.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        this.m.a(this.l.getCallback());
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final boolean applyDayNight() {
        return this.f(true, true);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final Context attachBaseContext2(Context context0) {
        this.P = true;
        int v = this.u(context0, (this.T == -100 ? -100 : this.T));
        if(AppCompatDelegate.c(context0)) {
            AppCompatDelegate.e(context0);
        }
        LocaleListCompat localeListCompat0 = i0.h(context0);
        Configuration configuration0 = null;
        if(i0.l0 && context0 instanceof ContextThemeWrapper) {
            Configuration configuration1 = i0.l(context0, v, localeListCompat0, null, false);
            try {
                ((ContextThemeWrapper)context0).applyOverrideConfiguration(configuration1);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(context0 instanceof androidx.appcompat.view.ContextThemeWrapper) {
            Configuration configuration2 = i0.l(context0, v, localeListCompat0, null, false);
            try {
                ((androidx.appcompat.view.ContextThemeWrapper)context0).applyOverrideConfiguration(configuration2);
                return context0;
            }
            catch(IllegalStateException unused_ex) {
            }
        }
        if(!i0.k0) {
            return super.attachBaseContext2(context0);
        }
        Configuration configuration3 = new Configuration();
        configuration3.uiMode = -1;
        configuration3.fontScale = 0.0f;
        Configuration configuration4 = context0.createConfigurationContext(configuration3).getResources().getConfiguration();
        Configuration configuration5 = context0.getResources().getConfiguration();
        configuration4.uiMode = configuration5.uiMode;
        if(!configuration4.equals(configuration5)) {
            configuration0 = new Configuration();
            configuration0.fontScale = 0.0f;
            if(configuration4.diff(configuration5) != 0) {
                float f = configuration5.fontScale;
                if(configuration4.fontScale != f) {
                    configuration0.fontScale = f;
                }
                int v1 = configuration5.mcc;
                if(configuration4.mcc != v1) {
                    configuration0.mcc = v1;
                }
                int v2 = configuration5.mnc;
                if(configuration4.mnc != v2) {
                    configuration0.mnc = v2;
                }
                z.a(configuration4, configuration5, configuration0);
                int v3 = configuration5.touchscreen;
                if(configuration4.touchscreen != v3) {
                    configuration0.touchscreen = v3;
                }
                int v4 = configuration5.keyboard;
                if(configuration4.keyboard != v4) {
                    configuration0.keyboard = v4;
                }
                int v5 = configuration5.keyboardHidden;
                if(configuration4.keyboardHidden != v5) {
                    configuration0.keyboardHidden = v5;
                }
                int v6 = configuration5.navigation;
                if(configuration4.navigation != v6) {
                    configuration0.navigation = v6;
                }
                int v7 = configuration5.navigationHidden;
                if(configuration4.navigationHidden != v7) {
                    configuration0.navigationHidden = v7;
                }
                int v8 = configuration5.orientation;
                if(configuration4.orientation != v8) {
                    configuration0.orientation = v8;
                }
                int v9 = configuration5.screenLayout & 15;
                if((configuration4.screenLayout & 15) != v9) {
                    configuration0.screenLayout |= v9;
                }
                int v10 = configuration5.screenLayout & 0xC0;
                if((configuration4.screenLayout & 0xC0) != v10) {
                    configuration0.screenLayout |= v10;
                }
                int v11 = configuration5.screenLayout & 0x30;
                if((configuration4.screenLayout & 0x30) != v11) {
                    configuration0.screenLayout |= v11;
                }
                int v12 = configuration5.screenLayout & 0x300;
                if((configuration4.screenLayout & 0x300) != v12) {
                    configuration0.screenLayout |= v12;
                }
                int v13 = configuration5.colorMode & 3;
                if((configuration4.colorMode & 3) != v13) {
                    configuration0.colorMode |= v13;
                }
                int v14 = configuration5.colorMode & 12;
                if((configuration4.colorMode & 12) != v14) {
                    configuration0.colorMode |= v14;
                }
                int v15 = configuration5.uiMode & 15;
                if((configuration4.uiMode & 15) != v15) {
                    configuration0.uiMode |= v15;
                }
                int v16 = configuration5.uiMode & 0x30;
                if((configuration4.uiMode & 0x30) != v16) {
                    configuration0.uiMode |= v16;
                }
                int v17 = configuration5.screenWidthDp;
                if(configuration4.screenWidthDp != v17) {
                    configuration0.screenWidthDp = v17;
                }
                int v18 = configuration5.screenHeightDp;
                if(configuration4.screenHeightDp != v18) {
                    configuration0.screenHeightDp = v18;
                }
                int v19 = configuration5.smallestScreenWidthDp;
                if(configuration4.smallestScreenWidthDp != v19) {
                    configuration0.smallestScreenWidthDp = v19;
                }
                int v20 = configuration5.densityDpi;
                if(configuration4.densityDpi != v20) {
                    configuration0.densityDpi = v20;
                }
            }
        }
        Configuration configuration6 = i0.l(context0, v, localeListCompat0, configuration0, true);
        androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper0 = new androidx.appcompat.view.ContextThemeWrapper(context0, style.Theme_AppCompat_Empty);
        contextThemeWrapper0.applyOverrideConfiguration(configuration6);
        try {
            if(context0.getTheme() != null) {
                goto label_94;
            }
        }
        catch(NullPointerException unused_ex) {
        }
        return super.attachBaseContext2(contextThemeWrapper0);
    label_94:
        ThemeCompat.rebase(contextThemeWrapper0.getTheme());
        return super.attachBaseContext2(contextThemeWrapper0);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final View createView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        if(this.f0 == null) {
            Context context1 = this.k;
            String s1 = context1.obtainStyledAttributes(styleable.AppCompatTheme).getString(styleable.AppCompatTheme_viewInflaterClass);
            if(s1 == null) {
                this.f0 = new AppCompatViewInflater();
                return this.f0.createView(view0, s, context0, attributeSet0, false, false, true, false);
            }
            try {
                this.f0 = (AppCompatViewInflater)context1.getClassLoader().loadClass(s1).getDeclaredConstructor(null).newInstance(null);
                return this.f0.createView(view0, s, context0, attributeSet0, false, false, true, false);
            }
            catch(Throwable throwable0) {
                Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + s1 + ". Falling back to default.", throwable0);
                this.f0 = new AppCompatViewInflater();
                return this.f0.createView(view0, s, context0, attributeSet0, false, false, true, false);
            }
        }
        return this.f0.createView(view0, s, context0, attributeSet0, false, false, true, false);
    }

    public final boolean f(boolean z, boolean z1) {
        boolean z4;
        int v3;
        boolean z2 = false;
        if(this.R) {
            return false;
        }
        int v = this.T == -100 ? -100 : this.T;
        Context context0 = this.k;
        int v1 = this.u(context0, v);
        int v2 = Build.VERSION.SDK_INT;
        LocaleListCompat localeListCompat0 = v2 >= 33 ? null : i0.h(context0);
        if(!z1 && localeListCompat0 != null) {
            localeListCompat0 = z.b(context0.getResources().getConfiguration());
        }
        Configuration configuration0 = i0.l(context0, v1, localeListCompat0, null, false);
        boolean z3 = true;
        Object object0 = this.j;
        if(this.W || !(object0 instanceof Activity)) {
            this.W = true;
            v3 = this.V;
        }
        else {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                v3 = 0;
            }
            else {
                try {
                    ActivityInfo activityInfo0 = packageManager0.getActivityInfo(new ComponentName(context0, object0.getClass()), (v2 < 29 ? 0xC0000 : 0x100C0000));
                    if(activityInfo0 != null) {
                        this.V = activityInfo0.configChanges;
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", packageManager$NameNotFoundException0);
                    this.V = 0;
                }
                this.W = true;
                v3 = this.V;
            }
        }
        Configuration configuration1 = this.S == null ? context0.getResources().getConfiguration() : this.S;
        int v4 = configuration1.uiMode & 0x30;
        int v5 = configuration0.uiMode & 0x30;
        LocaleListCompat localeListCompat1 = z.b(configuration1);
        LocaleListCompat localeListCompat2 = localeListCompat0 == null ? null : z.b(configuration0);
        int v6 = v4 == v5 ? 0 : 0x200;
        if(localeListCompat2 != null && !localeListCompat1.equals(localeListCompat2)) {
            v6 |= 0x2004;
        }
        if((~v3 & v6) == 0 || !z || !this.P || !i0.k0 && !this.Q || !(object0 instanceof Activity) || ((Activity)object0).isChild()) {
            z4 = false;
        }
        else {
            ActivityCompat.recreate(((Activity)object0));
            z4 = true;
        }
        if(z4 || v6 == 0) {
            z3 = z4;
        }
        else {
            if((v6 & v3) == v6) {
                z2 = true;
            }
            Resources resources0 = context0.getResources();
            Configuration configuration2 = new Configuration(resources0.getConfiguration());
            configuration2.uiMode = resources0.getConfiguration().uiMode & -49 | v5;
            if(localeListCompat2 != null) {
                z.d(configuration2, localeListCompat2);
            }
            resources0.updateConfiguration(configuration2, null);
            int v7 = this.U;
            if(v7 != 0) {
                context0.setTheme(v7);
                context0.getTheme().applyStyle(this.U, true);
            }
            if(z2 && object0 instanceof Activity) {
                if(!(((Activity)object0) instanceof LifecycleOwner)) {
                    if(this.Q && !this.R) {
                        ((Activity)object0).onConfigurationChanged(configuration2);
                    }
                }
                else if(((LifecycleOwner)(((Activity)object0))).getLifecycle().getCurrentState().isAtLeast(State.CREATED)) {
                    ((Activity)object0).onConfigurationChanged(configuration2);
                }
            }
        }
        if(z3 && localeListCompat2 != null) {
            z.c(z.b(context0.getResources().getConfiguration()));
        }
        if(v == 0) {
            this.r(context0).e();
        }
        else {
            d0 d00 = this.X;
            if(d00 != null) {
                d00.a();
            }
        }
        if(v == 3) {
            if(this.Y == null) {
                this.Y = new d0(this, context0);
            }
            this.Y.e();
            return z3;
        }
        d0 d01 = this.Y;
        if(d01 != null) {
            d01.a();
        }
        return z3;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final View findViewById(int v) {
        this.o();
        return this.l.findViewById(v);
    }

    public final void g(Window window0) {
        if(this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback window$Callback0 = window0.getCallback();
        if(window$Callback0 instanceof c0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        c0 c00 = new c0(this, window$Callback0);
        this.m = c00;
        window0.setCallback(c00);
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(this.k, null, i0.j0);
        Drawable drawable0 = tintTypedArray0.getDrawableIfKnown(0);
        if(drawable0 != null) {
            window0.setBackgroundDrawable(drawable0);
        }
        tintTypedArray0.recycle();
        this.l = window0;
        if(Build.VERSION.SDK_INT >= 33 && this.g0 == null) {
            this.setOnBackInvokedDispatcher(null);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final Context getContextForDelegate() {
        return this.k;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final Delegate getDrawerToggleDelegate() {
        return new w(this);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final int getLocalNightMode() {
        return this.T;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater getMenuInflater() {
        if(this.p == null) {
            this.t();
            this.p = new SupportMenuInflater((this.o == null ? this.k : this.o.getThemedContext()));
        }
        return this.p;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar getSupportActionBar() {
        this.t();
        return this.o;
    }

    public static LocaleListCompat h(Context context0) {
        LocaleListCompat localeListCompat2;
        if(Build.VERSION.SDK_INT >= 33) {
            return null;
        }
        LocaleListCompat localeListCompat0 = AppCompatDelegate.c;
        if(localeListCompat0 == null) {
            return null;
        }
        LocaleListCompat localeListCompat1 = z.b(context0.getApplicationContext().getResources().getConfiguration());
        if(localeListCompat0.isEmpty()) {
            localeListCompat2 = LocaleListCompat.getEmptyLocaleList();
            return localeListCompat2.isEmpty() ? localeListCompat1 : localeListCompat2;
        }
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(int v = 0; v < localeListCompat1.size() + localeListCompat0.size(); ++v) {
            Locale locale0 = v >= localeListCompat0.size() ? localeListCompat1.get(v - localeListCompat0.size()) : localeListCompat0.get(v);
            if(locale0 != null) {
                linkedHashSet0.add(locale0);
            }
        }
        localeListCompat2 = LocaleListCompat.create(((Locale[])linkedHashSet0.toArray(new Locale[linkedHashSet0.size()])));
        return localeListCompat2.isEmpty() ? localeListCompat1 : localeListCompat2;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final boolean hasWindowFeature(int v) {
        int v1;
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                v1 = 108;
                break;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                v1 = 109;
                break;
            }
            default: {
                v1 = v;
            }
        }
        switch(v1) {
            case 1: {
                return this.K || this.l.hasFeature(v);
            }
            case 2: {
                return this.E || this.l.hasFeature(v);
            }
            case 5: {
                return this.F || this.l.hasFeature(v);
            }
            case 10: {
                return this.I || this.l.hasFeature(v);
            }
            case 108: {
                return this.G || this.l.hasFeature(v);
            }
            case 109: {
                return this.H || this.l.hasFeature(v);
            }
            default: {
                return this.l.hasFeature(v);
            }
        }
    }

    public final void i(int v, AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, MenuBuilder menuBuilder0) {
        if(menuBuilder0 == null) {
            if(appCompatDelegateImpl$PanelFeatureState0 == null && v >= 0) {
                AppCompatDelegateImpl.PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.M;
                if(v < arr_appCompatDelegateImpl$PanelFeatureState.length) {
                    appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v];
                }
            }
            if(appCompatDelegateImpl$PanelFeatureState0 != null) {
                menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.h;
            }
        }
        if(appCompatDelegateImpl$PanelFeatureState0 != null && !appCompatDelegateImpl$PanelFeatureState0.m) {
            return;
        }
        if(!this.R) {
            c0 c00 = this.m;
            Window.Callback window$Callback0 = this.l.getCallback();
            c00.getClass();
            try {
                c00.e = true;
                window$Callback0.onPanelClosed(v, menuBuilder0);
                c00.e = false;
            }
            catch(Throwable throwable0) {
                c00.e = false;
                throw throwable0;
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void installViewFactory() {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.k);
        if(layoutInflater0.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflater0, this);
            return;
        }
        if(!(layoutInflater0.getFactory2() instanceof i0)) {
            Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void invalidateOptionsMenu() {
        if(this.o != null) {
            this.t();
            if(!this.o.invalidateOptionsMenu()) {
                this.a0 |= 1;
                if(!this.Z) {
                    ViewCompat.postOnAnimation(this.l.getDecorView(), this.b0);
                    this.Z = true;
                }
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final boolean isHandleNativeActionModesEnabled() {
        return this.z;
    }

    public final void j(MenuBuilder menuBuilder0) {
        if(this.L) {
            return;
        }
        this.L = true;
        this.r.dismissPopups();
        Window.Callback window$Callback0 = this.l.getCallback();
        if(window$Callback0 != null && !this.R) {
            window$Callback0.onPanelClosed(108, menuBuilder0);
        }
        this.L = false;
    }

    public final void k(AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, boolean z) {
        if(z && appCompatDelegateImpl$PanelFeatureState0.a == 0 && (this.r != null && this.r.isOverflowMenuShowing())) {
            this.j(appCompatDelegateImpl$PanelFeatureState0.h);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.k.getSystemService("window");
        if(windowManager0 != null && appCompatDelegateImpl$PanelFeatureState0.m) {
            g0 g00 = appCompatDelegateImpl$PanelFeatureState0.e;
            if(g00 != null) {
                windowManager0.removeView(g00);
                if(z) {
                    this.i(appCompatDelegateImpl$PanelFeatureState0.a, appCompatDelegateImpl$PanelFeatureState0, null);
                }
            }
        }
        appCompatDelegateImpl$PanelFeatureState0.k = false;
        appCompatDelegateImpl$PanelFeatureState0.l = false;
        appCompatDelegateImpl$PanelFeatureState0.m = false;
        appCompatDelegateImpl$PanelFeatureState0.f = null;
        appCompatDelegateImpl$PanelFeatureState0.n = true;
        if(this.N == appCompatDelegateImpl$PanelFeatureState0) {
            this.N = null;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.a == 0) {
            this.A();
        }
    }

    public static Configuration l(Context context0, int v, LocaleListCompat localeListCompat0, Configuration configuration0, boolean z) {
        int v1;
        switch(v) {
            case 1: {
                v1 = 16;
                break;
            }
            case 2: {
                v1 = 0x20;
                break;
            }
            default: {
                v1 = z ? 0 : context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
            }
        }
        Configuration configuration1 = new Configuration();
        configuration1.fontScale = 0.0f;
        if(configuration0 != null) {
            configuration1.setTo(configuration0);
        }
        configuration1.uiMode = v1 | configuration1.uiMode & -49;
        if(localeListCompat0 != null) {
            z.d(configuration1, localeListCompat0);
        }
        return configuration1;
    }

    public final boolean m(KeyEvent keyEvent0) {
        boolean z2;
        boolean z4;
        boolean z = true;
        if(this.j instanceof Component || this.j instanceof AppCompatDialog) {
            View view0 = this.l.getDecorView();
            if(view0 != null && KeyEventDispatcher.dispatchBeforeHierarchy(view0, keyEvent0)) {
                return true;
            }
        }
        if(keyEvent0.getKeyCode() == 82) {
            c0 c00 = this.m;
            Window.Callback window$Callback0 = this.l.getCallback();
            c00.getClass();
            try {
                c00.d = true;
                boolean z1 = window$Callback0.dispatchKeyEvent(keyEvent0);
                c00.d = false;
            }
            catch(Throwable throwable0) {
                c00.d = false;
                throw throwable0;
            }
            if(z1) {
                return true;
            }
        }
        int v = keyEvent0.getKeyCode();
        if(keyEvent0.getAction() == 0) {
            switch(v) {
                case 4: {
                    goto label_22;
                }
                case 82: {
                    goto label_26;
                }
            }
            return false;
        label_22:
            if((keyEvent0.getFlags() & 0x80) == 0) {
                z = false;
            }
            this.O = z;
            return false;
        label_26:
            if(keyEvent0.getRepeatCount() == 0) {
                AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.s(0);
                if(!appCompatDelegateImpl$PanelFeatureState0.m) {
                    this.y(appCompatDelegateImpl$PanelFeatureState0, keyEvent0);
                    return true;
                }
            }
        }
        else {
            switch(v) {
                case 4: {
                    return this.v();
                }
                case 82: {
                    if(this.u == null) {
                        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.s(0);
                        Context context0 = this.k;
                        if(this.r == null || !this.r.canShowOverflowMenu() || ViewConfiguration.get(context0).hasPermanentMenuKey()) {
                            boolean z3 = appCompatDelegateImpl$PanelFeatureState1.m;
                            if(z3 || appCompatDelegateImpl$PanelFeatureState1.l) {
                                this.k(appCompatDelegateImpl$PanelFeatureState1, true);
                                z2 = z3;
                            }
                            else if(appCompatDelegateImpl$PanelFeatureState1.k) {
                                if(appCompatDelegateImpl$PanelFeatureState1.o) {
                                    appCompatDelegateImpl$PanelFeatureState1.k = false;
                                    z4 = this.y(appCompatDelegateImpl$PanelFeatureState1, keyEvent0);
                                }
                                else {
                                    z4 = true;
                                }
                                if(z4) {
                                    this.w(appCompatDelegateImpl$PanelFeatureState1, keyEvent0);
                                    z2 = true;
                                }
                                else {
                                    z2 = false;
                                }
                            }
                            else {
                                z2 = false;
                            }
                        }
                        else if(this.r.isOverflowMenuShowing()) {
                            z2 = this.r.hideOverflowMenu();
                        }
                        else if(!this.R && this.y(appCompatDelegateImpl$PanelFeatureState1, keyEvent0)) {
                            z2 = this.r.showOverflowMenu();
                        }
                        else {
                            z2 = false;
                        }
                        if(z2) {
                            AudioManager audioManager0 = (AudioManager)context0.getApplicationContext().getSystemService("audio");
                            if(audioManager0 != null) {
                                audioManager0.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
                            return true;
                        }
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }

    public final void n(int v) {
        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.s(v);
        if(appCompatDelegateImpl$PanelFeatureState0.h != null) {
            Bundle bundle0 = new Bundle();
            appCompatDelegateImpl$PanelFeatureState0.h.saveActionViewStates(bundle0);
            if(bundle0.size() > 0) {
                appCompatDelegateImpl$PanelFeatureState0.p = bundle0;
            }
            appCompatDelegateImpl$PanelFeatureState0.h.stopDispatchingItemsChanged();
            appCompatDelegateImpl$PanelFeatureState0.h.clear();
        }
        appCompatDelegateImpl$PanelFeatureState0.o = true;
        appCompatDelegateImpl$PanelFeatureState0.n = true;
        if((v == 0 || v == 108) && this.r != null) {
            AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.s(0);
            appCompatDelegateImpl$PanelFeatureState1.k = false;
            this.y(appCompatDelegateImpl$PanelFeatureState1, null);
        }
    }

    public final void o() {
        ViewGroup viewGroup0;
        if(!this.A) {
            Context context0 = this.k;
            TypedArray typedArray0 = context0.obtainStyledAttributes(styleable.AppCompatTheme);
            if(!typedArray0.hasValue(styleable.AppCompatTheme_windowActionBar)) {
                typedArray0.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowNoTitle, false)) {
                this.requestWindowFeature(1);
            }
            else if(typedArray0.getBoolean(styleable.AppCompatTheme_windowActionBar, false)) {
                this.requestWindowFeature(108);
            }
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                this.requestWindowFeature(109);
            }
            if(typedArray0.getBoolean(styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                this.requestWindowFeature(10);
            }
            this.J = typedArray0.getBoolean(styleable.AppCompatTheme_android_windowIsFloating, false);
            typedArray0.recycle();
            this.p();
            this.l.getDecorView();
            LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
            if(this.K) {
                viewGroup0 = this.I ? ((ViewGroup)layoutInflater0.inflate(layout.abc_screen_simple_overlay_action_mode, null)) : ((ViewGroup)layoutInflater0.inflate(layout.abc_screen_simple, null));
            }
            else if(this.J) {
                viewGroup0 = (ViewGroup)layoutInflater0.inflate(layout.abc_dialog_title_material, null);
                this.H = false;
                this.G = false;
            }
            else if(this.G) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(attr.actionBarTheme, typedValue0, true);
                Context context1 = typedValue0.resourceId == 0 ? context0 : new androidx.appcompat.view.ContextThemeWrapper(context0, typedValue0.resourceId);
                viewGroup0 = (ViewGroup)LayoutInflater.from(context1).inflate(layout.abc_screen_toolbar, null);
                DecorContentParent decorContentParent0 = (DecorContentParent)viewGroup0.findViewById(id.decor_content_parent);
                this.r = decorContentParent0;
                decorContentParent0.setWindowCallback(this.l.getCallback());
                if(this.H) {
                    this.r.initFeature(109);
                }
                if(this.E) {
                    this.r.initFeature(2);
                }
                if(this.F) {
                    this.r.initFeature(5);
                }
            }
            else {
                viewGroup0 = null;
            }
            if(viewGroup0 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
            }
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup0, new s0(this));
            if(this.r == null) {
                this.C = (TextView)viewGroup0.findViewById(id.title);
            }
            ViewUtils.makeOptionalFitsSystemWindows(viewGroup0);
            ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)viewGroup0.findViewById(id.action_bar_activity_content);
            ViewGroup viewGroup1 = (ViewGroup)this.l.findViewById(0x1020002);
            if(viewGroup1 != null) {
                while(viewGroup1.getChildCount() > 0) {
                    View view0 = viewGroup1.getChildAt(0);
                    viewGroup1.removeViewAt(0);
                    contentFrameLayout0.addView(view0);
                }
                viewGroup1.setId(-1);
                contentFrameLayout0.setId(0x1020002);
                if(viewGroup1 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup1).setForeground(null);
                }
            }
            this.l.setContentView(viewGroup0);
            contentFrameLayout0.setAttachListener(new s(this));
            this.B = viewGroup0;
            CharSequence charSequence0 = this.j instanceof Activity ? ((Activity)this.j).getTitle() : this.q;
            if(!TextUtils.isEmpty(charSequence0)) {
                DecorContentParent decorContentParent1 = this.r;
                if(decorContentParent1 == null) {
                    ActionBar actionBar0 = this.o;
                    if(actionBar0 == null) {
                        TextView textView0 = this.C;
                        if(textView0 != null) {
                            textView0.setText(charSequence0);
                        }
                    }
                    else {
                        actionBar0.setWindowTitle(charSequence0);
                    }
                }
                else {
                    decorContentParent1.setWindowTitle(charSequence0);
                }
            }
            ContentFrameLayout contentFrameLayout1 = (ContentFrameLayout)this.B.findViewById(0x1020002);
            View view1 = this.l.getDecorView();
            contentFrameLayout1.setDecorPadding(view1.getPaddingLeft(), view1.getPaddingTop(), view1.getPaddingRight(), view1.getPaddingBottom());
            TypedArray typedArray1 = context0.obtainStyledAttributes(styleable.AppCompatTheme);
            typedArray1.getValue(styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout1.getMinWidthMajor());
            typedArray1.getValue(styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout1.getMinWidthMinor());
            if(typedArray1.hasValue(styleable.AppCompatTheme_windowFixedWidthMajor)) {
                typedArray1.getValue(styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout1.getFixedWidthMajor());
            }
            if(typedArray1.hasValue(styleable.AppCompatTheme_windowFixedWidthMinor)) {
                typedArray1.getValue(styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout1.getFixedWidthMinor());
            }
            if(typedArray1.hasValue(styleable.AppCompatTheme_windowFixedHeightMajor)) {
                typedArray1.getValue(styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout1.getFixedHeightMajor());
            }
            if(typedArray1.hasValue(styleable.AppCompatTheme_windowFixedHeightMinor)) {
                typedArray1.getValue(styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout1.getFixedHeightMinor());
            }
            typedArray1.recycle();
            contentFrameLayout1.requestLayout();
            this.A = true;
            AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.s(0);
            if(!this.R && appCompatDelegateImpl$PanelFeatureState0.h == null) {
                this.a0 |= 0x1000;
                if(!this.Z) {
                    ViewCompat.postOnAnimation(this.l.getDecorView(), this.b0);
                    this.Z = true;
                }
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onConfigurationChanged(Configuration configuration0) {
        if(this.G && this.A) {
            this.t();
            ActionBar actionBar0 = this.o;
            if(actionBar0 != null) {
                actionBar0.onConfigurationChanged(configuration0);
            }
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.k);
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.f(false, false);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onCreate(Bundle bundle0) {
        this.P = true;
        this.f(false, true);
        this.p();
        Object object0 = this.j;
        if(object0 instanceof Activity) {
            try {
                String s = null;
                s = NavUtils.getParentActivityName(((Activity)object0));
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(s != null) {
                ActionBar actionBar0 = this.o;
                if(actionBar0 == null) {
                    this.c0 = true;
                }
                else {
                    actionBar0.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized(AppCompatDelegate.h) {
                AppCompatDelegate.d(this);
                WeakReference weakReference0 = new WeakReference(this);
                AppCompatDelegate.g.add(weakReference0);
            }
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.createView(null, s, context0, attributeSet0);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onDestroy() {
        if(this.j instanceof Activity) {
            synchronized(AppCompatDelegate.h) {
                AppCompatDelegate.d(this);
            }
        }
        if(this.Z) {
            this.l.getDecorView().removeCallbacks(this.b0);
        }
        this.R = true;
        if(this.T == -100 || (!(this.j instanceof Activity) || !((Activity)this.j).isChangingConfigurations())) {
            String s1 = this.j.getClass().getName();
            i0.i0.remove(s1);
        }
        else {
            String s = this.j.getClass().getName();
            i0.i0.put(s, this.T);
        }
        ActionBar actionBar0 = this.o;
        if(actionBar0 != null) {
            actionBar0.a();
        }
        d0 d00 = this.X;
        if(d00 != null) {
            d00.a();
        }
        d0 d01 = this.Y;
        if(d01 != null) {
            d01.a();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        Window.Callback window$Callback0 = this.l.getCallback();
        if(window$Callback0 != null && !this.R) {
            MenuBuilder menuBuilder1 = menuBuilder0.getRootMenu();
            AppCompatDelegateImpl.PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.M;
            int v = arr_appCompatDelegateImpl$PanelFeatureState == null ? 0 : arr_appCompatDelegateImpl$PanelFeatureState.length;
            for(int v1 = 0; v1 < v; ++v1) {
                AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v1];
                if(appCompatDelegateImpl$PanelFeatureState0 != null && appCompatDelegateImpl$PanelFeatureState0.h == menuBuilder1) {
                    return appCompatDelegateImpl$PanelFeatureState0 == null ? false : window$Callback0.onMenuItemSelected(appCompatDelegateImpl$PanelFeatureState0.a, menuItem0);
                }
            }
            throw new NullPointerException();
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
        if(this.r == null || !this.r.canShowOverflowMenu() || ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.r.isOverflowMenuShowPending()) {
            AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.s(0);
            appCompatDelegateImpl$PanelFeatureState1.n = true;
            this.k(appCompatDelegateImpl$PanelFeatureState1, false);
            this.w(appCompatDelegateImpl$PanelFeatureState1, null);
        }
        else {
            Window.Callback window$Callback0 = this.l.getCallback();
            if(this.r.isOverflowMenuShowing()) {
                this.r.hideOverflowMenu();
                if(!this.R) {
                    window$Callback0.onPanelClosed(108, this.s(0).h);
                }
            }
            else if(window$Callback0 != null && !this.R) {
                if(this.Z && (1 & this.a0) != 0) {
                    this.l.getDecorView().removeCallbacks(this.b0);
                    this.b0.run();
                }
                AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.s(0);
                if(appCompatDelegateImpl$PanelFeatureState0.h != null && !appCompatDelegateImpl$PanelFeatureState0.o && window$Callback0.onPreparePanel(0, appCompatDelegateImpl$PanelFeatureState0.g, appCompatDelegateImpl$PanelFeatureState0.h)) {
                    window$Callback0.onMenuOpened(108, appCompatDelegateImpl$PanelFeatureState0.h);
                    this.r.showOverflowMenu();
                }
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onPostCreate(Bundle bundle0) {
        this.o();
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onPostResume() {
        this.t();
        ActionBar actionBar0 = this.o;
        if(actionBar0 != null) {
            actionBar0.setShowHideAnimationEnabled(true);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onSaveInstanceState(Bundle bundle0) {
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onStart() {
        this.f(true, false);
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void onStop() {
        this.t();
        ActionBar actionBar0 = this.o;
        if(actionBar0 != null) {
            actionBar0.setShowHideAnimationEnabled(false);
        }
    }

    public final void p() {
        if(this.l == null) {
            Object object0 = this.j;
            if(object0 instanceof Activity) {
                this.g(((Activity)object0).getWindow());
            }
        }
        if(this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context q() {
        this.t();
        Context context0 = this.o == null ? null : this.o.getThemedContext();
        return context0 == null ? this.k : context0;
    }

    public final f0 r(Context context0) {
        if(this.X == null) {
            if(w0.d == null) {
                Context context1 = context0.getApplicationContext();
                w0.d = new w0(context1, ((LocationManager)context1.getSystemService("location")));
            }
            this.X = new d0(this, w0.d);
        }
        return this.X;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final boolean requestWindowFeature(int v) {
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                v = 108;
                break;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                v = 109;
            }
        }
        if(this.K && v == 108) {
            return false;
        }
        if(this.G && v == 1) {
            this.G = false;
        }
        switch(v) {
            case 1: {
                this.z();
                this.K = true;
                return true;
            }
            case 2: {
                this.z();
                this.E = true;
                return true;
            }
            case 5: {
                this.z();
                this.F = true;
                return true;
            }
            case 10: {
                this.z();
                this.I = true;
                return true;
            }
            case 108: {
                this.z();
                this.G = true;
                return true;
            }
            case 109: {
                this.z();
                this.H = true;
                return true;
            }
            default: {
                return this.l.requestFeature(v);
            }
        }
    }

    public final AppCompatDelegateImpl.PanelFeatureState s(int v) {
        AppCompatDelegateImpl.PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState = this.M;
        if(arr_appCompatDelegateImpl$PanelFeatureState == null || arr_appCompatDelegateImpl$PanelFeatureState.length <= v) {
            AppCompatDelegateImpl.PanelFeatureState[] arr_appCompatDelegateImpl$PanelFeatureState1 = new AppCompatDelegateImpl.PanelFeatureState[v + 1];
            if(arr_appCompatDelegateImpl$PanelFeatureState != null) {
                System.arraycopy(arr_appCompatDelegateImpl$PanelFeatureState, 0, arr_appCompatDelegateImpl$PanelFeatureState1, 0, arr_appCompatDelegateImpl$PanelFeatureState.length);
            }
            this.M = arr_appCompatDelegateImpl$PanelFeatureState1;
            arr_appCompatDelegateImpl$PanelFeatureState = arr_appCompatDelegateImpl$PanelFeatureState1;
        }
        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = arr_appCompatDelegateImpl$PanelFeatureState[v];
        if(appCompatDelegateImpl$PanelFeatureState0 == null) {
            appCompatDelegateImpl$PanelFeatureState0 = new AppCompatDelegateImpl.PanelFeatureState();  // 初始化器: Ljava/lang/Object;-><init>()V
            appCompatDelegateImpl$PanelFeatureState0.a = v;
            appCompatDelegateImpl$PanelFeatureState0.n = false;
            arr_appCompatDelegateImpl$PanelFeatureState[v] = appCompatDelegateImpl$PanelFeatureState0;
        }
        return appCompatDelegateImpl$PanelFeatureState0;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(int v) {
        this.o();
        ViewGroup viewGroup0 = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        LayoutInflater.from(this.k).inflate(v, viewGroup0);
        this.m.a(this.l.getCallback());
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view0) {
        this.o();
        ViewGroup viewGroup0 = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        this.m.a(this.l.getCallback());
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.o();
        ViewGroup viewGroup0 = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        this.m.a(this.l.getCallback());
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setHandleNativeActionModesEnabled(boolean z) {
        this.z = z;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setLocalNightMode(int v) {
        if(this.T != v) {
            this.T = v;
            if(this.P) {
                this.f(true, true);
            }
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher0);
        OnBackInvokedDispatcher onBackInvokedDispatcher1 = this.g0;
        if(onBackInvokedDispatcher1 != null) {
            OnBackInvokedCallback onBackInvokedCallback0 = this.h0;
            if(onBackInvokedCallback0 != null) {
                b0.c(onBackInvokedDispatcher1, onBackInvokedCallback0);
                this.h0 = null;
            }
        }
        if(onBackInvokedDispatcher0 == null) {
            Object object0 = this.j;
            this.g0 = !(object0 instanceof Activity) || ((Activity)object0).getWindow() == null ? null : b0.a(((Activity)object0));
        }
        else {
            this.g0 = onBackInvokedDispatcher0;
        }
        this.A();
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setSupportActionBar(Toolbar toolbar0) {
        Object object0 = this.j;
        if(!(object0 instanceof Activity)) {
            return;
        }
        this.t();
        ActionBar actionBar0 = this.o;
        if(actionBar0 instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.p = null;
        if(actionBar0 != null) {
            actionBar0.a();
        }
        this.o = null;
        if(toolbar0 == null) {
            this.m.b = null;
        }
        else {
            t0 t00 = new t0(toolbar0, (object0 instanceof Activity ? ((Activity)object0).getTitle() : this.q), this.m);
            this.o = t00;
            this.m.b = t00.c;
            toolbar0.setBackInvokedCallbackEnabled(true);
        }
        this.invalidateOptionsMenu();
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setTheme(int v) {
        this.U = v;
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence0) {
        this.q = charSequence0;
        DecorContentParent decorContentParent0 = this.r;
        if(decorContentParent0 != null) {
            decorContentParent0.setWindowTitle(charSequence0);
            return;
        }
        ActionBar actionBar0 = this.o;
        if(actionBar0 != null) {
            actionBar0.setWindowTitle(charSequence0);
            return;
        }
        TextView textView0 = this.C;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
    }

    @Override  // androidx.appcompat.app.AppCompatDelegate
    public final ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback actionMode$Callback0) {
        if(actionMode$Callback0 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        ActionMode actionMode0 = this.u;
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        y y0 = new y(this, actionMode$Callback0);
        this.t();
        ActionBar actionBar0 = this.o;
        AppCompatCallback appCompatCallback0 = this.n;
        if(actionBar0 != null) {
            ActionMode actionMode1 = actionBar0.startActionMode(y0);
            this.u = actionMode1;
            if(actionMode1 != null && appCompatCallback0 != null) {
                appCompatCallback0.onSupportActionModeStarted(actionMode1);
            }
        }
        if(this.u == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.y;
            if(viewPropertyAnimatorCompat0 != null) {
                viewPropertyAnimatorCompat0.cancel();
            }
            ActionMode actionMode2 = this.u;
            if(actionMode2 != null) {
                actionMode2.finish();
            }
            ActionMode actionMode3 = null;
            if(appCompatCallback0 != null && !this.R) {
                try {
                    actionMode3 = appCompatCallback0.onWindowStartingSupportActionMode(y0);
                }
                catch(AbstractMethodError unused_ex) {
                }
            }
            if(actionMode3 == null) {
                if(this.v == null) {
                    if(this.J) {
                        TypedValue typedValue0 = new TypedValue();
                        Context context0 = this.k;
                        Resources.Theme resources$Theme0 = context0.getTheme();
                        resources$Theme0.resolveAttribute(attr.actionBarTheme, typedValue0, true);
                        if(typedValue0.resourceId != 0) {
                            Resources.Theme resources$Theme1 = context0.getResources().newTheme();
                            resources$Theme1.setTo(resources$Theme0);
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper0 = new androidx.appcompat.view.ContextThemeWrapper(context0, 0);
                            contextThemeWrapper0.getTheme().setTo(resources$Theme1);
                            context0 = contextThemeWrapper0;
                        }
                        this.v = new ActionBarContextView(context0);
                        PopupWindow popupWindow0 = new PopupWindow(context0, null, attr.actionModePopupWindowStyle);
                        this.w = popupWindow0;
                        PopupWindowCompat.setWindowLayoutType(popupWindow0, 2);
                        this.w.setContentView(this.v);
                        this.w.setWidth(-1);
                        context0.getTheme().resolveAttribute(attr.actionBarSize, typedValue0, true);
                        int v = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                        this.v.setContentHeight(v);
                        this.w.setHeight(-2);
                        this.x = new u(this);
                    }
                    else {
                        ViewStubCompat viewStubCompat0 = (ViewStubCompat)this.B.findViewById(id.action_mode_bar_stub);
                        if(viewStubCompat0 != null) {
                            viewStubCompat0.setLayoutInflater(LayoutInflater.from(this.q()));
                            this.v = (ActionBarContextView)viewStubCompat0.inflate();
                        }
                    }
                }
                if(this.v != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1 = this.y;
                    if(viewPropertyAnimatorCompat1 != null) {
                        viewPropertyAnimatorCompat1.cancel();
                    }
                    this.v.killMode();
                    StandaloneActionMode standaloneActionMode0 = new StandaloneActionMode(this.v.getContext(), this.v, y0, this.w == null);
                    if(y0.a.onCreateActionMode(standaloneActionMode0, standaloneActionMode0.getMenu())) {
                        standaloneActionMode0.invalidate();
                        this.v.initForMode(standaloneActionMode0);
                        this.u = standaloneActionMode0;
                        if(!this.A || (this.B == null || !ViewCompat.isLaidOut(this.B))) {
                            this.v.setAlpha(1.0f);
                            this.v.setVisibility(0);
                            if(this.v.getParent() instanceof View) {
                                ViewCompat.requestApplyInsets(((View)this.v.getParent()));
                            }
                        }
                        else {
                            this.v.setAlpha(0.0f);
                            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = ViewCompat.animate(this.v).alpha(1.0f);
                            this.y = viewPropertyAnimatorCompat2;
                            viewPropertyAnimatorCompat2.setListener(new v(this));
                        }
                        if(this.w != null) {
                            this.l.getDecorView().post(this.x);
                        }
                    }
                    else {
                        this.u = null;
                    }
                }
            }
            else {
                this.u = actionMode3;
            }
            ActionMode actionMode4 = this.u;
            if(actionMode4 != null && appCompatCallback0 != null) {
                appCompatCallback0.onSupportActionModeStarted(actionMode4);
            }
            this.A();
            this.u = this.u;
        }
        this.A();
        return this.u;
    }

    public final void t() {
        this.o();
        if(this.G && this.o == null) {
            Object object0 = this.j;
            if(object0 instanceof Activity) {
                this.o = new WindowDecorActionBar(((Activity)object0), this.H);
            }
            else if(object0 instanceof Dialog) {
                this.o = new WindowDecorActionBar(((Dialog)object0));
            }
            ActionBar actionBar0 = this.o;
            if(actionBar0 != null) {
                actionBar0.setDefaultDisplayHomeAsUpEnabled(this.c0);
            }
        }
    }

    public final int u(Context context0, int v) {
        switch(v) {
            case -100: {
                return -1;
            }
            case 0: {
                return ((UiModeManager)context0.getApplicationContext().getSystemService("uimode")).getNightMode() == 0 ? -1 : this.r(context0).c();
            }
            case -1: 
            case 1: 
            case 2: {
                return v;
            }
            case 3: {
                if(this.Y == null) {
                    this.Y = new d0(this, context0);
                }
                return this.Y.c();
            }
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
    }

    public final boolean v() {
        boolean z = this.O;
        this.O = false;
        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0 = this.s(0);
        if(appCompatDelegateImpl$PanelFeatureState0.m) {
            if(!z) {
                this.k(appCompatDelegateImpl$PanelFeatureState0, true);
            }
            return true;
        }
        ActionMode actionMode0 = this.u;
        if(actionMode0 != null) {
            actionMode0.finish();
            return true;
        }
        this.t();
        return this.o != null && this.o.collapseActionView();
    }

    public final void w(AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, KeyEvent keyEvent0) {
        int v1;
        if(!appCompatDelegateImpl$PanelFeatureState0.m && !this.R) {
            int v = appCompatDelegateImpl$PanelFeatureState0.a;
            Context context0 = this.k;
            if(v == 0 && (context0.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback window$Callback0 = this.l.getCallback();
            if(window$Callback0 != null && !window$Callback0.onMenuOpened(v, appCompatDelegateImpl$PanelFeatureState0.h)) {
                this.k(appCompatDelegateImpl$PanelFeatureState0, true);
                return;
            }
            WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
            if(windowManager0 == null) {
                return;
            }
            if(!this.y(appCompatDelegateImpl$PanelFeatureState0, keyEvent0)) {
                return;
            }
            g0 g00 = appCompatDelegateImpl$PanelFeatureState0.e;
            if(g00 != null && !appCompatDelegateImpl$PanelFeatureState0.n) {
                View view0 = appCompatDelegateImpl$PanelFeatureState0.g;
                if(view0 == null) {
                    goto label_76;
                }
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                if(viewGroup$LayoutParams0 == null || viewGroup$LayoutParams0.width != -1) {
                    goto label_76;
                }
                v1 = -1;
                goto label_77;
            }
            if(g00 == null) {
                Context context1 = this.q();
                TypedValue typedValue0 = new TypedValue();
                Resources.Theme resources$Theme0 = context1.getResources().newTheme();
                resources$Theme0.setTo(context1.getTheme());
                resources$Theme0.resolveAttribute(attr.actionBarPopupTheme, typedValue0, true);
                int v2 = typedValue0.resourceId;
                if(v2 != 0) {
                    resources$Theme0.applyStyle(v2, true);
                }
                resources$Theme0.resolveAttribute(attr.panelMenuListTheme, typedValue0, true);
                int v3 = typedValue0.resourceId;
                if(v3 == 0) {
                    resources$Theme0.applyStyle(style.Theme_AppCompat_CompactMenu, true);
                }
                else {
                    resources$Theme0.applyStyle(v3, true);
                }
                androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper0 = new androidx.appcompat.view.ContextThemeWrapper(context1, 0);
                contextThemeWrapper0.getTheme().setTo(resources$Theme0);
                appCompatDelegateImpl$PanelFeatureState0.j = contextThemeWrapper0;
                TypedArray typedArray0 = contextThemeWrapper0.obtainStyledAttributes(styleable.AppCompatTheme);
                appCompatDelegateImpl$PanelFeatureState0.b = typedArray0.getResourceId(styleable.AppCompatTheme_panelBackground, 0);
                appCompatDelegateImpl$PanelFeatureState0.d = typedArray0.getResourceId(styleable.AppCompatTheme_android_windowAnimationStyle, 0);
                typedArray0.recycle();
                appCompatDelegateImpl$PanelFeatureState0.e = new g0(this, appCompatDelegateImpl$PanelFeatureState0.j);
                appCompatDelegateImpl$PanelFeatureState0.c = 81;
            }
            else if(appCompatDelegateImpl$PanelFeatureState0.n && g00.getChildCount() > 0) {
                appCompatDelegateImpl$PanelFeatureState0.e.removeAllViews();
            }
            View view1 = appCompatDelegateImpl$PanelFeatureState0.g;
            if(view1 != null) {
                appCompatDelegateImpl$PanelFeatureState0.f = view1;
                goto label_65;
            }
            else if(appCompatDelegateImpl$PanelFeatureState0.h != null) {
                if(this.t == null) {
                    this.t = new h0(this);
                }
                h0 h00 = this.t;
                if(appCompatDelegateImpl$PanelFeatureState0.i == null) {
                    ListMenuPresenter listMenuPresenter0 = new ListMenuPresenter(appCompatDelegateImpl$PanelFeatureState0.j, layout.abc_list_menu_item_layout);
                    appCompatDelegateImpl$PanelFeatureState0.i = listMenuPresenter0;
                    listMenuPresenter0.setCallback(h00);
                    appCompatDelegateImpl$PanelFeatureState0.h.addMenuPresenter(appCompatDelegateImpl$PanelFeatureState0.i);
                }
                View view2 = (View)appCompatDelegateImpl$PanelFeatureState0.i.getMenuView(appCompatDelegateImpl$PanelFeatureState0.e);
                appCompatDelegateImpl$PanelFeatureState0.f = view2;
                if(view2 != null) {
                label_65:
                    if(appCompatDelegateImpl$PanelFeatureState0.hasPanelItems()) {
                        ViewGroup.LayoutParams viewGroup$LayoutParams1 = appCompatDelegateImpl$PanelFeatureState0.f.getLayoutParams();
                        if(viewGroup$LayoutParams1 == null) {
                            viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        appCompatDelegateImpl$PanelFeatureState0.e.setBackgroundResource(appCompatDelegateImpl$PanelFeatureState0.b);
                        ViewParent viewParent0 = appCompatDelegateImpl$PanelFeatureState0.f.getParent();
                        if(viewParent0 instanceof ViewGroup) {
                            ((ViewGroup)viewParent0).removeView(appCompatDelegateImpl$PanelFeatureState0.f);
                        }
                        appCompatDelegateImpl$PanelFeatureState0.e.addView(appCompatDelegateImpl$PanelFeatureState0.f, viewGroup$LayoutParams1);
                        if(!appCompatDelegateImpl$PanelFeatureState0.f.hasFocus()) {
                            appCompatDelegateImpl$PanelFeatureState0.f.requestFocus();
                        }
                    label_76:
                        v1 = -2;
                    label_77:
                        appCompatDelegateImpl$PanelFeatureState0.l = false;
                        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(v1, -2, 0, 0, 1002, 0x820000, -3);
                        windowManager$LayoutParams0.gravity = appCompatDelegateImpl$PanelFeatureState0.c;
                        windowManager$LayoutParams0.windowAnimations = appCompatDelegateImpl$PanelFeatureState0.d;
                        windowManager0.addView(appCompatDelegateImpl$PanelFeatureState0.e, windowManager$LayoutParams0);
                        appCompatDelegateImpl$PanelFeatureState0.m = true;
                        if(v == 0) {
                            this.A();
                        }
                        return;
                    }
                }
            }
            appCompatDelegateImpl$PanelFeatureState0.n = true;
        }
    }

    public final boolean x(AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.isSystem()) {
            return false;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.k || this.y(appCompatDelegateImpl$PanelFeatureState0, keyEvent0)) {
            return appCompatDelegateImpl$PanelFeatureState0.h == null ? false : appCompatDelegateImpl$PanelFeatureState0.h.performShortcut(v, keyEvent0, 1);
        }
        return false;
    }

    public final boolean y(AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState0, KeyEvent keyEvent0) {
        Resources.Theme resources$Theme1;
        if(this.R) {
            return false;
        }
        if(appCompatDelegateImpl$PanelFeatureState0.k) {
            return true;
        }
        AppCompatDelegateImpl.PanelFeatureState appCompatDelegateImpl$PanelFeatureState1 = this.N;
        if(appCompatDelegateImpl$PanelFeatureState1 != null && appCompatDelegateImpl$PanelFeatureState1 != appCompatDelegateImpl$PanelFeatureState0) {
            this.k(appCompatDelegateImpl$PanelFeatureState1, false);
        }
        Window.Callback window$Callback0 = this.l.getCallback();
        int v = appCompatDelegateImpl$PanelFeatureState0.a;
        if(window$Callback0 != null) {
            appCompatDelegateImpl$PanelFeatureState0.g = window$Callback0.onCreatePanelView(v);
        }
        boolean z = v == 0 || v == 108;
        if(z) {
            DecorContentParent decorContentParent0 = this.r;
            if(decorContentParent0 != null) {
                decorContentParent0.setMenuPrepared();
            }
        }
        if(appCompatDelegateImpl$PanelFeatureState0.g == null && (!z || !(this.o instanceof t0))) {
            MenuBuilder menuBuilder0 = appCompatDelegateImpl$PanelFeatureState0.h;
            if(menuBuilder0 == null || appCompatDelegateImpl$PanelFeatureState0.o) {
                if(menuBuilder0 == null) {
                    Context context0 = this.k;
                    if((v == 0 || v == 108) && this.r != null) {
                        TypedValue typedValue0 = new TypedValue();
                        Resources.Theme resources$Theme0 = context0.getTheme();
                        resources$Theme0.resolveAttribute(attr.actionBarTheme, typedValue0, true);
                        if(typedValue0.resourceId == 0) {
                            resources$Theme0.resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
                            resources$Theme1 = null;
                        }
                        else {
                            resources$Theme1 = context0.getResources().newTheme();
                            resources$Theme1.setTo(resources$Theme0);
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                            resources$Theme1.resolveAttribute(attr.actionBarWidgetTheme, typedValue0, true);
                        }
                        if(typedValue0.resourceId != 0) {
                            if(resources$Theme1 == null) {
                                resources$Theme1 = context0.getResources().newTheme();
                                resources$Theme1.setTo(resources$Theme0);
                            }
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        }
                        if(resources$Theme1 != null) {
                            androidx.appcompat.view.ContextThemeWrapper contextThemeWrapper0 = new androidx.appcompat.view.ContextThemeWrapper(context0, 0);
                            contextThemeWrapper0.getTheme().setTo(resources$Theme1);
                            context0 = contextThemeWrapper0;
                        }
                    }
                    MenuBuilder menuBuilder1 = new MenuBuilder(context0);
                    menuBuilder1.setCallback(this);
                    MenuBuilder menuBuilder2 = appCompatDelegateImpl$PanelFeatureState0.h;
                    if(menuBuilder1 != menuBuilder2) {
                        if(menuBuilder2 != null) {
                            menuBuilder2.removeMenuPresenter(appCompatDelegateImpl$PanelFeatureState0.i);
                        }
                        appCompatDelegateImpl$PanelFeatureState0.h = menuBuilder1;
                        ListMenuPresenter listMenuPresenter0 = appCompatDelegateImpl$PanelFeatureState0.i;
                        if(listMenuPresenter0 != null) {
                            menuBuilder1.addMenuPresenter(listMenuPresenter0);
                        }
                    }
                    if(appCompatDelegateImpl$PanelFeatureState0.h == null) {
                        return false;
                    }
                }
                if(z) {
                    DecorContentParent decorContentParent1 = this.r;
                    if(decorContentParent1 != null) {
                        if(this.s == null) {
                            this.s = new x(this);
                        }
                        decorContentParent1.setMenu(appCompatDelegateImpl$PanelFeatureState0.h, this.s);
                    }
                }
                appCompatDelegateImpl$PanelFeatureState0.h.stopDispatchingItemsChanged();
                if(!window$Callback0.onCreatePanelMenu(v, appCompatDelegateImpl$PanelFeatureState0.h)) {
                    MenuBuilder menuBuilder3 = appCompatDelegateImpl$PanelFeatureState0.h;
                    if(menuBuilder3 != null) {
                        menuBuilder3.removeMenuPresenter(appCompatDelegateImpl$PanelFeatureState0.i);
                        appCompatDelegateImpl$PanelFeatureState0.h = null;
                    }
                    if(z) {
                        DecorContentParent decorContentParent2 = this.r;
                        if(decorContentParent2 != null) {
                            decorContentParent2.setMenu(null, this.s);
                        }
                    }
                    return false;
                }
                appCompatDelegateImpl$PanelFeatureState0.o = false;
            }
            appCompatDelegateImpl$PanelFeatureState0.h.stopDispatchingItemsChanged();
            Bundle bundle0 = appCompatDelegateImpl$PanelFeatureState0.p;
            if(bundle0 != null) {
                appCompatDelegateImpl$PanelFeatureState0.h.restoreActionViewStates(bundle0);
                appCompatDelegateImpl$PanelFeatureState0.p = null;
            }
            if(!window$Callback0.onPreparePanel(0, appCompatDelegateImpl$PanelFeatureState0.g, appCompatDelegateImpl$PanelFeatureState0.h)) {
                if(z) {
                    DecorContentParent decorContentParent3 = this.r;
                    if(decorContentParent3 != null) {
                        decorContentParent3.setMenu(null, this.s);
                    }
                }
                appCompatDelegateImpl$PanelFeatureState0.h.startDispatchingItemsChanged();
                return false;
            }
            boolean z1 = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
            appCompatDelegateImpl$PanelFeatureState0.qwertyMode = z1;
            appCompatDelegateImpl$PanelFeatureState0.h.setQwertyMode(z1);
            appCompatDelegateImpl$PanelFeatureState0.h.startDispatchingItemsChanged();
        }
        appCompatDelegateImpl$PanelFeatureState0.k = true;
        appCompatDelegateImpl$PanelFeatureState0.l = false;
        this.N = appCompatDelegateImpl$PanelFeatureState0;
        return true;
    }

    public final void z() {
        if(this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}

