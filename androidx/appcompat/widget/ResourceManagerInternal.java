package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.resources.R.drawable;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public final class ResourceManagerInternal {
    interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context arg1, @NonNull XmlPullParser arg2, @NonNull AttributeSet arg3, @Nullable Resources.Theme arg4);
    }

    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    public interface ResourceManagerHooks {
        @Nullable
        Drawable createDrawableFor(@NonNull ResourceManagerInternal arg1, @NonNull Context arg2, @DrawableRes int arg3);

        @Nullable
        ColorStateList getTintListForDrawableRes(@NonNull Context arg1, @DrawableRes int arg2);

        @Nullable
        PorterDuff.Mode getTintModeForDrawableRes(int arg1);

        boolean tintDrawable(@NonNull Context arg1, @DrawableRes int arg2, @NonNull Drawable arg3);

        boolean tintDrawableUsingColorFilter(@NonNull Context arg1, @DrawableRes int arg2, @NonNull Drawable arg3);
    }

    public WeakHashMap a;
    public final WeakHashMap b;
    public TypedValue c;
    public boolean d;
    public ResourceManagerHooks e;
    public static final PorterDuff.Mode f;
    public static ResourceManagerInternal g;
    public static final g2 h;

    static {
        ResourceManagerInternal.f = PorterDuff.Mode.SRC_IN;
        ResourceManagerInternal.h = new g2(6);  // 初始化器: Landroidx/collection/LruCache;-><init>(I)V
    }

    public ResourceManagerInternal() {
        this.b = new WeakHashMap(0);
    }

    public final void a(Context context0, long v, Drawable drawable0) {
        synchronized(this) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                LongSparseArray longSparseArray0 = (LongSparseArray)this.b.get(context0);
                if(longSparseArray0 == null) {
                    longSparseArray0 = new LongSparseArray();
                    this.b.put(context0, longSparseArray0);
                }
                longSparseArray0.put(v, new WeakReference(drawable$ConstantState0));
            }
        }
    }

    public final Drawable b(Context context0, long v) {
        synchronized(this) {
            LongSparseArray longSparseArray0 = (LongSparseArray)this.b.get(context0);
            if(longSparseArray0 == null) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)longSparseArray0.get(v);
            if(weakReference0 != null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakReference0.get();
                if(drawable$ConstantState0 != null) {
                    return drawable$ConstantState0.newDrawable(context0.getResources());
                }
                longSparseArray0.remove(v);
            }
            return null;
        }
    }

    public final Drawable c(Context context0, int v, boolean z) {
        synchronized(this) {
            if(!this.d) {
                this.d = true;
                Drawable drawable0 = this.getDrawable(context0, drawable.abc_vector_test);
                if(drawable0 == null || !(drawable0 instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawable0.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            if(this.c == null) {
                this.c = new TypedValue();
            }
            TypedValue typedValue0 = this.c;
            context0.getResources().getValue(v, typedValue0, true);
            long v2 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
            Drawable drawable1 = this.b(context0, v2);
            if(drawable1 == null) {
                drawable1 = this.e == null ? null : this.e.createDrawableFor(this, context0, v);
                if(drawable1 != null) {
                    drawable1.setChangingConfigurations(typedValue0.changingConfigurations);
                    this.a(context0, v2, drawable1);
                }
            }
            if(drawable1 == null) {
                drawable1 = ContextCompat.getDrawable(context0, v);
            }
            if(drawable1 != null) {
                drawable1 = this.e(context0, v, z, drawable1);
            }
            if(drawable1 != null) {
                DrawableUtils.a(drawable1);
            }
            return drawable1;
        }
    }

    public final ColorStateList d(Context context0, int v) {
        ColorStateList colorStateList1;
        synchronized(this) {
            WeakHashMap weakHashMap0 = this.a;
            ColorStateList colorStateList0 = null;
            if(weakHashMap0 == null) {
                colorStateList1 = null;
            }
            else {
                SparseArrayCompat sparseArrayCompat0 = (SparseArrayCompat)weakHashMap0.get(context0);
                colorStateList1 = sparseArrayCompat0 == null ? null : ((ColorStateList)sparseArrayCompat0.get(v));
            }
            if(colorStateList1 == null) {
                ResourceManagerHooks resourceManagerInternal$ResourceManagerHooks0 = this.e;
                if(resourceManagerInternal$ResourceManagerHooks0 != null) {
                    colorStateList0 = resourceManagerInternal$ResourceManagerHooks0.getTintListForDrawableRes(context0, v);
                }
                if(colorStateList0 != null) {
                    if(this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    SparseArrayCompat sparseArrayCompat1 = (SparseArrayCompat)this.a.get(context0);
                    if(sparseArrayCompat1 == null) {
                        sparseArrayCompat1 = new SparseArrayCompat();
                        this.a.put(context0, sparseArrayCompat1);
                    }
                    sparseArrayCompat1.append(v, colorStateList0);
                }
                colorStateList1 = colorStateList0;
            }
            return colorStateList1;
        }
    }

    public final Drawable e(Context context0, int v, boolean z, Drawable drawable0) {
        ColorStateList colorStateList0 = this.d(context0, v);
        PorterDuff.Mode porterDuff$Mode0 = null;
        if(colorStateList0 != null) {
            drawable0 = drawable0.mutate();
            DrawableCompat.setTintList(drawable0, colorStateList0);
            ResourceManagerHooks resourceManagerInternal$ResourceManagerHooks0 = this.e;
            if(resourceManagerInternal$ResourceManagerHooks0 != null) {
                porterDuff$Mode0 = resourceManagerInternal$ResourceManagerHooks0.getTintModeForDrawableRes(v);
            }
            if(porterDuff$Mode0 != null) {
                DrawableCompat.setTintMode(drawable0, porterDuff$Mode0);
                return drawable0;
            }
            return drawable0;
        }
        return this.e != null && this.e.tintDrawable(context0, v, drawable0) || (this.e != null && this.e.tintDrawableUsingColorFilter(context0, v, drawable0) || !z) ? drawable0 : null;
    }

    public static ResourceManagerInternal get() {
        synchronized(ResourceManagerInternal.class) {
            if(ResourceManagerInternal.g == null) {
                ResourceManagerInternal.g = new ResourceManagerInternal();
            }
            return ResourceManagerInternal.g;
        }
    }

    public Drawable getDrawable(@NonNull Context context0, @DrawableRes int v) {
        synchronized(this) {
            return this.c(context0, v, false);
        }
    }

    public static PorterDuffColorFilter getPorterDuffColorFilter(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(ResourceManagerInternal.class) {
            g2 g20 = ResourceManagerInternal.h;
            g20.getClass();
            int v2 = (v + 0x1F) * 0x1F;
            PorterDuffColorFilter porterDuffColorFilter0 = (PorterDuffColorFilter)g20.get(((int)(porterDuff$Mode0.hashCode() + v2)));
            if(porterDuffColorFilter0 == null) {
                porterDuffColorFilter0 = new PorterDuffColorFilter(v, porterDuff$Mode0);
                PorterDuffColorFilter porterDuffColorFilter1 = (PorterDuffColorFilter)g20.put(((int)(porterDuff$Mode0.hashCode() + v2)), porterDuffColorFilter0);
            }
            return porterDuffColorFilter0;
        }
    }

    public void onConfigurationChanged(@NonNull Context context0) {
        synchronized(this) {
            LongSparseArray longSparseArray0 = (LongSparseArray)this.b.get(context0);
            if(longSparseArray0 != null) {
                longSparseArray0.clear();
            }
        }
    }

    public void setHooks(ResourceManagerHooks resourceManagerInternal$ResourceManagerHooks0) {
        synchronized(this) {
            this.e = resourceManagerInternal$ResourceManagerHooks0;
        }
    }
}

