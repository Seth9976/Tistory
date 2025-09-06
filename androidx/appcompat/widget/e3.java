package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public final class e3 extends h2 {
    public final WeakReference b;

    public e3(TintContextWrapper tintContextWrapper0, Resources resources0) {
        super(resources0);
        this.b = new WeakReference(tintContextWrapper0);
    }

    @Override  // android.content.res.Resources
    public final Drawable getDrawable(int v) {
        Drawable drawable0 = this.a(v);
        Context context0 = (Context)this.b.get();
        if(drawable0 != null && context0 != null) {
            ResourceManagerHooks resourceManagerInternal$ResourceManagerHooks0 = ResourceManagerInternal.get().e;
            if(resourceManagerInternal$ResourceManagerHooks0 != null) {
                resourceManagerInternal$ResourceManagerHooks0.tintDrawableUsingColorFilter(context0, v, drawable0);
            }
        }
        return drawable0;
    }
}

