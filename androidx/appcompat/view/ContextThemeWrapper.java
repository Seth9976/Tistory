package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.style;
import m.a;

public class ContextThemeWrapper extends ContextWrapper {
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;
    public static Configuration f;

    public ContextThemeWrapper() {
        super(null);
    }

    public ContextThemeWrapper(Context context0, @StyleRes int v) {
        super(context0);
        this.a = v;
    }

    public ContextThemeWrapper(Context context0, Resources.Theme resources$Theme0) {
        super(context0);
        this.b = resources$Theme0;
    }

    public final void a() {
        boolean z = this.b == null;
        if(z) {
            this.b = this.getResources().newTheme();
            Resources.Theme resources$Theme0 = this.getBaseContext().getTheme();
            if(resources$Theme0 != null) {
                this.b.setTo(resources$Theme0);
            }
        }
        this.onApplyThemeResource(this.b, this.a, z);
    }

    public void applyOverrideConfiguration(Configuration configuration0) {
        if(this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if(this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration0);
    }

    @Override  // android.content.ContextWrapper
    public void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
    }

    @Override  // android.content.ContextWrapper
    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    @Override  // android.content.ContextWrapper
    public Resources getResources() {
        if(this.e == null) {
            Configuration configuration0 = this.d;
            if(configuration0 != null) {
                if(ContextThemeWrapper.f == null) {
                    Configuration configuration1 = new Configuration();
                    configuration1.fontScale = 0.0f;
                    ContextThemeWrapper.f = configuration1;
                }
                if(!configuration0.equals(ContextThemeWrapper.f)) {
                    this.e = a.a(this, this.d).getResources();
                    return this.e;
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    @Override  // android.content.ContextWrapper
    public Object getSystemService(String s) {
        if("layout_inflater".equals(s)) {
            if(this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(s);
    }

    @Override  // android.content.ContextWrapper
    public Resources.Theme getTheme() {
        Resources.Theme resources$Theme0 = this.b;
        if(resources$Theme0 != null) {
            return resources$Theme0;
        }
        if(this.a == 0) {
            this.a = style.Theme_AppCompat_Light;
        }
        this.a();
        return this.b;
    }

    public int getThemeResId() {
        return this.a;
    }

    public void onApplyThemeResource(Resources.Theme resources$Theme0, int v, boolean z) {
        resources$Theme0.applyStyle(v, true);
    }

    @Override  // android.content.ContextWrapper
    public void setTheme(int v) {
        if(this.a != v) {
            this.a = v;
            this.a();
        }
    }
}

