package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class TintContextWrapper extends ContextWrapper {
    public final h2 a;
    public final Resources.Theme b;
    public static final Object c;
    public static ArrayList d;

    static {
        TintContextWrapper.c = new Object();
    }

    public TintContextWrapper(Context context0) {
        super(context0);
        this.a = new e3(this, context0.getResources());
        this.b = null;
    }

    @Override  // android.content.ContextWrapper
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override  // android.content.ContextWrapper
    public Resources getResources() {
        return this.a;
    }

    @Override  // android.content.ContextWrapper
    public Resources.Theme getTheme() {
        return this.b == null ? super.getTheme() : this.b;
    }

    @Override  // android.content.ContextWrapper
    public void setTheme(int v) {
        Resources.Theme resources$Theme0 = this.b;
        if(resources$Theme0 == null) {
            super.setTheme(v);
            return;
        }
        resources$Theme0.applyStyle(v, true);
    }

    // 去混淆评级： 低(35)
    public static Context wrap(@NonNull Context context0) {
        boolean z = context0 instanceof TintContextWrapper || context0.getResources() instanceof e3 || context0.getResources() instanceof VectorEnabledTintResources;
        return context0;
    }
}

