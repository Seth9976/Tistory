package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class AppCompatDrawableManager {
    public ResourceManagerInternal a;
    public static final PorterDuff.Mode b;
    public static AppCompatDrawableManager c;

    static {
        AppCompatDrawableManager.b = PorterDuff.Mode.SRC_IN;
    }

    public static void a(Drawable drawable0, TintInfo tintInfo0, int[] arr_v) {
        int[] arr_v1 = drawable0.getState();
        if(drawable0.mutate() != drawable0) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if(drawable0 instanceof LayerDrawable && drawable0.isStateful()) {
            drawable0.setState(new int[0]);
            drawable0.setState(arr_v1);
        }
        ColorFilter colorFilter0 = null;
        boolean z = tintInfo0.mHasTintList;
        if(!z && !tintInfo0.mHasTintMode) {
            drawable0.clearColorFilter();
            return;
        }
        ColorStateList colorStateList0 = z ? tintInfo0.mTintList : null;
        PorterDuff.Mode porterDuff$Mode0 = tintInfo0.mHasTintMode ? tintInfo0.mTintMode : ResourceManagerInternal.f;
        if(colorStateList0 != null && porterDuff$Mode0 != null) {
            colorFilter0 = ResourceManagerInternal.getPorterDuffColorFilter(colorStateList0.getColorForState(arr_v, 0), porterDuff$Mode0);
        }
        drawable0.setColorFilter(colorFilter0);
    }

    public static AppCompatDrawableManager get() {
        synchronized(AppCompatDrawableManager.class) {
            if(AppCompatDrawableManager.c == null) {
                AppCompatDrawableManager.preload();
            }
            return AppCompatDrawableManager.c;
        }
    }

    public Drawable getDrawable(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            return this.a.getDrawable(context0, v);
        }
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(AppCompatDrawableManager.class) {
            return ResourceManagerInternal.getPorterDuffColorFilter(v, porterDuff$Mode0);
        }
    }

    public void onConfigurationChanged(@NonNull Context context0) {
        synchronized(this) {
            this.a.onConfigurationChanged(context0);
        }
    }

    public static void preload() {
        synchronized(AppCompatDrawableManager.class) {
            if(AppCompatDrawableManager.c == null) {
                AppCompatDrawableManager appCompatDrawableManager0 = new AppCompatDrawableManager();
                AppCompatDrawableManager.c = appCompatDrawableManager0;
                appCompatDrawableManager0.a = ResourceManagerInternal.get();
                AppCompatDrawableManager.c.a.setHooks(new b0());
            }
        }
    }
}

