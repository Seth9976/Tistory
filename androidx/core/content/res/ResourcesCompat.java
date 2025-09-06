package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.activity.m;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import c3.c;
import c3.d;
import c3.e;
import c3.f;
import c3.g;
import c3.h;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import jeb.synthetic.FIN;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat {
    public static abstract class FontCallback {
        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(int v, @Nullable Handler handler0) {
            FontCallback.getHandler(handler0).post(new h(this, v, 0));
        }

        @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull Typeface typeface0, @Nullable Handler handler0) {
            FontCallback.getHandler(handler0).post(new m(11, this, typeface0));
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler0) {
            return handler0 == null ? new Handler(Looper.getMainLooper()) : handler0;
        }

        public abstract void onFontRetrievalFailed(int arg1);

        public abstract void onFontRetrieved(@NonNull Typeface arg1);
    }

    public static final class ThemeCompat {
        public static void rebase(@NonNull Resources.Theme resources$Theme0) {
            if(Build.VERSION.SDK_INT >= 29) {
                b.a(resources$Theme0);
                return;
            }
            synchronized(a.a) {
                if(!a.c) {
                    try {
                        Method method0 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                        a.b = method0;
                        method0.setAccessible(true);
                    }
                    catch(NoSuchMethodException noSuchMethodException0) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException0);
                    }
                    a.c = true;
                }
                Method method1 = a.b;
                if(method1 != null) {
                    try {
                        method1.invoke(resources$Theme0, null);
                    }
                    catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException0);
                        a.b = null;
                    }
                }
            }
        }
    }

    @AnyRes
    public static final int ID_NULL;
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
        ResourcesCompat.a = new ThreadLocal();
        ResourcesCompat.b = new WeakHashMap(0);
        ResourcesCompat.c = new Object();
    }

    public static Typeface a(Context context0, int v, TypedValue typedValue0, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, boolean z1) {
        Resources resources0 = context0.getResources();
        resources0.getValue(v, typedValue0, true);
        CharSequence charSequence0 = typedValue0.string;
        if(charSequence0 == null) {
            throw new Resources.NotFoundException("Resource \"" + resources0.getResourceName(v) + "\" (" + Integer.toHexString(v) + ") is not a Font: " + typedValue0);
        }
        String s = charSequence0.toString();
        Typeface typeface0 = null;
        if(s.startsWith("res/")) {
            Typeface typeface1 = TypefaceCompat.findFromCache(resources0, v, s, typedValue0.assetCookie, v1);
            if(typeface1 != null) {
                if(resourcesCompat$FontCallback0 != null) {
                    resourcesCompat$FontCallback0.callbackSuccessAsync(typeface1, handler0);
                }
                typeface0 = typeface1;
            }
            else if(!z1) {
                try {
                    if(s.toLowerCase().endsWith(".xml")) {
                        FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0 = FontResourcesParserCompat.parse(resources0.getXml(v), resources0);
                        if(fontResourcesParserCompat$FamilyResourceEntry0 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if(resourcesCompat$FontCallback0 != null) {
                                resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
                            }
                        }
                        else {
                            typeface0 = TypefaceCompat.createFromResourcesFamilyXml(context0, fontResourcesParserCompat$FamilyResourceEntry0, resources0, v, s, typedValue0.assetCookie, v1, resourcesCompat$FontCallback0, handler0, z);
                        }
                    }
                    else {
                        Typeface typeface2 = TypefaceCompat.createFromResourcesFontFile(context0, resources0, v, s, typedValue0.assetCookie, v1);
                        if(resourcesCompat$FontCallback0 != null) {
                            if(typeface2 == null) {
                                resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
                            }
                            else {
                                resourcesCompat$FontCallback0.callbackSuccessAsync(typeface2, handler0);
                            }
                        }
                        typeface0 = typeface2;
                    }
                    goto label_42;
                }
                catch(XmlPullParserException xmlPullParserException0) {
                }
                catch(IOException iOException0) {
                    goto label_39;
                }
                Log.e("ResourcesCompat", "Failed to parse xml resource " + s, xmlPullParserException0);
                goto label_40;
            label_39:
                Log.e("ResourcesCompat", "Failed to read xml resource " + s, iOException0);
            label_40:
                if(resourcesCompat$FontCallback0 != null) {
                    resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
                }
            }
        }
        else if(resourcesCompat$FontCallback0 != null) {
            resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
        }
    label_42:
        if(typeface0 == null && resourcesCompat$FontCallback0 == null && !z1) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(v) + " could not be retrieved.");
        }
        return typeface0;
    }

    public static void clearCachesForTheme(@NonNull Resources.Theme resources$Theme0) {
        synchronized(ResourcesCompat.c) {
            Iterator iterator0 = ResourcesCompat.b.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((g)object1) != null && resources$Theme0.equals(((g)object1).b)) {
                    iterator0.remove();
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static Typeface getCachedFont(@NonNull Context context0, @FontRes int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.a(context0, v, new TypedValue(), 0, null, null, false, true);
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources0, @ColorRes int v, @Nullable Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return d.a(resources0, v, resources$Theme0);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources0, @ColorRes int v, @Nullable Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        ColorStateList colorStateList1;
        g g0 = new g(resources0, resources$Theme0);
        Object object0 = ResourcesCompat.c;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        SparseArray sparseArray0 = (SparseArray)ResourcesCompat.b.get(g0);
        ColorStateList colorStateList0 = null;
        if(sparseArray0 == null || sparseArray0.size() <= 0) {
        label_15:
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v1);
            colorStateList1 = null;
        }
        else {
            f f0 = (f)sparseArray0.get(v);
            if(f0 == null) {
                goto label_15;
            }
            else {
                Configuration configuration0 = resources0.getConfiguration();
                if(!f0.b.equals(configuration0) || (resources$Theme0 != null || f0.c != 0) && (resources$Theme0 == null || f0.c != resources$Theme0.hashCode())) {
                    sparseArray0.remove(v);
                    goto label_15;
                }
                else {
                    colorStateList1 = f0.a;
                    FIN.finallyExec$NT(v1);
                }
            }
        }
        if(colorStateList1 != null) {
            return colorStateList1;
        }
        ThreadLocal threadLocal0 = ResourcesCompat.a;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type < 28 || typedValue0.type > 0x1F) {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            try {
                colorStateList0 = ColorStateListInflaterCompat.createFromXml(resources0, xmlResourceParser0, resources$Theme0);
            }
            catch(Exception exception0) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", exception0);
            }
        }
        if(colorStateList0 != null) {
            synchronized(ResourcesCompat.c) {
                WeakHashMap weakHashMap0 = ResourcesCompat.b;
                SparseArray sparseArray1 = (SparseArray)weakHashMap0.get(g0);
                if(sparseArray1 == null) {
                    sparseArray1 = new SparseArray();
                    weakHashMap0.put(g0, sparseArray1);
                }
                sparseArray1.append(v, new f(colorStateList0, g0.a.getConfiguration(), resources$Theme0));
                return colorStateList0;
            }
        }
        return d.b(resources0, v, resources$Theme0);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return c.a(resources0, v, resources$Theme0);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources0, @DrawableRes int v, int v1, @Nullable Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return c.b(resources0, v, v1, resources$Theme0);
    }

    public static float getFloat(@NonNull Resources resources0, @DimenRes int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            return e.a(resources0, v);
        }
        ThreadLocal threadLocal0 = ResourcesCompat.a;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type != 4) {
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(v) + " type #0x" + Integer.toHexString(typedValue0.type) + " is not valid");
        }
        return typedValue0.getFloat();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public static Typeface getFont(@NonNull Context context0, @FontRes int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.a(context0, v, new TypedValue(), 0, null, null, false, false);
    }

    // 去混淆评级： 低(20)
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface getFont(@NonNull Context context0, @FontRes int v, @NonNull TypedValue typedValue0, int v1, @Nullable FontCallback resourcesCompat$FontCallback0) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.a(context0, v, typedValue0, v1, resourcesCompat$FontCallback0, null, true, false);
    }

    public static void getFont(@NonNull Context context0, @FontRes int v, @NonNull FontCallback resourcesCompat$FontCallback0, @Nullable Handler handler0) throws Resources.NotFoundException {
        Preconditions.checkNotNull(resourcesCompat$FontCallback0);
        if(context0.isRestricted()) {
            resourcesCompat$FontCallback0.callbackFailAsync(-4, handler0);
            return;
        }
        ResourcesCompat.a(context0, v, new TypedValue(), 0, resourcesCompat$FontCallback0, handler0, false, false);
    }
}

