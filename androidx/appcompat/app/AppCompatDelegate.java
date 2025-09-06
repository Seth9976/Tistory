package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.AnyThread;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.BuildCompat;
import androidx.core.os.LocaleListCompat;
import g.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

public abstract class AppCompatDelegate {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;
    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    public static final m0 a;
    public static int b;
    public static LocaleListCompat c;
    public static LocaleListCompat d;
    public static Boolean e;
    public static boolean f;
    public static final ArraySet g;
    public static final Object h;
    public static final Object i;

    static {
        AppCompatDelegate.a = new m0(new n0(0));
        AppCompatDelegate.b = -100;
        AppCompatDelegate.c = null;
        AppCompatDelegate.d = null;
        AppCompatDelegate.e = null;
        AppCompatDelegate.f = false;
        AppCompatDelegate.g = new ArraySet();
        AppCompatDelegate.h = new Object();
        AppCompatDelegate.i = new Object();
    }

    public void a() {
    }

    public abstract void addContentView(View arg1, ViewGroup.LayoutParams arg2);

    public abstract boolean applyDayNight();

    @Deprecated
    public void attachBaseContext(Context context0) {
    }

    @CallSuper
    @NonNull
    public Context attachBaseContext2(@NonNull Context context0) {
        return context0;
    }

    public static Object b() {
        for(Object object0: AppCompatDelegate.g) {
            AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object0).get();
            if(appCompatDelegate0 != null) {
                Context context0 = appCompatDelegate0.getContextForDelegate();
                if(context0 != null) {
                    return context0.getSystemService("locale");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    public static boolean c(Context context0) {
        if(AppCompatDelegate.e == null) {
            try {
                Bundle bundle0 = AppLocalesMetadataHolderService.getServiceInfo(context0).metaData;
                if(bundle0 != null) {
                    AppCompatDelegate.e = Boolean.valueOf(bundle0.getBoolean("autoStoreLocales"));
                    return AppCompatDelegate.e.booleanValue();
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                AppCompatDelegate.e = Boolean.FALSE;
                return AppCompatDelegate.e.booleanValue();
            }
        }
        return AppCompatDelegate.e.booleanValue();
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Activity activity0, @Nullable AppCompatCallback appCompatCallback0) {
        return new i0(activity0, null, appCompatCallback0, activity0);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Dialog dialog0, @Nullable AppCompatCallback appCompatCallback0) {
        return new i0(dialog0.getContext(), dialog0.getWindow(), appCompatCallback0, dialog0);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context0, @NonNull Activity activity0, @Nullable AppCompatCallback appCompatCallback0) {
        return new i0(context0, null, appCompatCallback0, activity0);
    }

    @NonNull
    public static AppCompatDelegate create(@NonNull Context context0, @NonNull Window window0, @Nullable AppCompatCallback appCompatCallback0) {
        return new i0(context0, window0, appCompatCallback0, context0);
    }

    public abstract View createView(@Nullable View arg1, String arg2, @NonNull Context arg3, @NonNull AttributeSet arg4);

    public static void d(i0 i00) {
        synchronized(AppCompatDelegate.h) {
            Iterator iterator0 = AppCompatDelegate.g.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object1).get();
                if(appCompatDelegate0 == i00 || appCompatDelegate0 == null) {
                    iterator0.remove();
                }
            }
        }
    }

    public static void e(Context context0) {
        Object object0;
        if(!AppCompatDelegate.c(context0)) {
            return;
        }
        if(!BuildCompat.isAtLeastT()) {
            object0 = AppCompatDelegate.i;
            synchronized(object0) {
                LocaleListCompat localeListCompat0 = AppCompatDelegate.c;
                if(localeListCompat0 == null) {
                    if(AppCompatDelegate.d == null) {
                        AppCompatDelegate.d = LocaleListCompat.forLanguageTags(a.V(context0));
                    }
                    if(!AppCompatDelegate.d.isEmpty()) {
                        AppCompatDelegate.c = AppCompatDelegate.d;
                        return;
                    }
                    return;
                }
                else {
                    goto label_18;
                }
                return;
            }
            return;
        label_18:
            if(!localeListCompat0.equals(AppCompatDelegate.d)) {
                AppCompatDelegate.d = AppCompatDelegate.c;
                a.P(context0, AppCompatDelegate.c.toLanguageTags());
            }
        }
        else if(!AppCompatDelegate.f) {
            o o0 = new o(context0, 0);
            AppCompatDelegate.a.execute(o0);
        }
    }

    @Nullable
    public abstract View findViewById(@IdRes int arg1);

    @AnyThread
    @NonNull
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static LocaleListCompat getApplicationLocales() {
        if(BuildCompat.isAtLeastT()) {
            Object object0 = AppCompatDelegate.b();
            return object0 == null ? LocaleListCompat.getEmptyLocaleList() : LocaleListCompat.wrap(q.a(object0));
        }
        return AppCompatDelegate.c == null ? LocaleListCompat.getEmptyLocaleList() : AppCompatDelegate.c;
    }

    @Nullable
    public Context getContextForDelegate() {
        return null;
    }

    public static int getDefaultNightMode() [...] // 潜在的解密器

    @Nullable
    public abstract Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    @Nullable
    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int arg1);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    // 去混淆评级： 低(20)
    public static boolean isCompatVectorFromResourcesEnabled() {
        return false;
    }

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration arg1);

    public abstract void onCreate(Bundle arg1);

    public View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.createView(view0, s, context0, attributeSet0);
    }

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle arg1);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle arg1);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int arg1);

    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public static void setApplicationLocales(@NonNull LocaleListCompat localeListCompat0) {
        Objects.requireNonNull(localeListCompat0);
        if(BuildCompat.isAtLeastT()) {
            Object object0 = AppCompatDelegate.b();
            if(object0 != null) {
                q.b(object0, p.a(localeListCompat0.toLanguageTags()));
            }
        }
        else if(!localeListCompat0.equals(AppCompatDelegate.c)) {
            synchronized(AppCompatDelegate.h) {
                AppCompatDelegate.c = localeListCompat0;
                for(Object object2: AppCompatDelegate.g) {
                    AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object2).get();
                    if(appCompatDelegate0 != null) {
                        appCompatDelegate0.a();
                    }
                }
            }
        }
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z);
    }

    public abstract void setContentView(@LayoutRes int arg1);

    public abstract void setContentView(View arg1);

    public abstract void setContentView(View arg1, ViewGroup.LayoutParams arg2);

    public static void setDefaultNightMode(int v) {
        if(v != -1 && v != 0 && (v != 1 && v != 2 && v != 3)) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if(AppCompatDelegate.b != v) {
            AppCompatDelegate.b = v;
            synchronized(AppCompatDelegate.h) {
                for(Object object1: AppCompatDelegate.g) {
                    AppCompatDelegate appCompatDelegate0 = (AppCompatDelegate)((WeakReference)object1).get();
                    if(appCompatDelegate0 != null) {
                        appCompatDelegate0.applyDayNight();
                    }
                }
            }
        }
    }

    public abstract void setHandleNativeActionModesEnabled(boolean arg1);

    @RequiresApi(17)
    public abstract void setLocalNightMode(int arg1);

    @CallSuper
    @RequiresApi(33)
    public void setOnBackInvokedDispatcher(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher0) {
    }

    public abstract void setSupportActionBar(@Nullable Toolbar arg1);

    public void setTheme(@StyleRes int v) {
    }

    public abstract void setTitle(@Nullable CharSequence arg1);

    @Nullable
    public abstract ActionMode startSupportActionMode(@NonNull Callback arg1);
}

