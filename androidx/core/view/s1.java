package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class s1 extends y1 {
    public final WindowInsets c;
    public Insets[] d;
    public Insets e;
    public WindowInsetsCompat f;
    public Insets g;
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;

    public s1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull WindowInsets windowInsets0) {
        super(windowInsetsCompat0);
        this.e = null;
        this.c = windowInsets0;
    }

    public s1(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull s1 s10) {
        this(windowInsetsCompat0, new WindowInsets(s10.c));
    }

    @SuppressLint({"PrivateApi"})
    private static void A() {
        try {
            s1.i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class class0 = Class.forName("android.view.View$AttachInfo");
            s1.j = class0;
            s1.k = class0.getDeclaredField("mVisibleInsets");
            s1.l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            s1.k.setAccessible(true);
            s1.l.setAccessible(true);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
        }
        s1.h = true;
    }

    @Override  // androidx.core.view.y1
    public void d(@NonNull View view0) {
        Insets insets0 = this.y(view0);
        if(insets0 == null) {
            insets0 = Insets.NONE;
        }
        this.s(insets0);
    }

    @Override  // androidx.core.view.y1
    public void e(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        windowInsetsCompat0.a.t(this.f);
        windowInsetsCompat0.a.s(this.g);
    }

    @Override  // androidx.core.view.y1
    public boolean equals(Object object0) {
        return super.equals(object0) ? Objects.equals(this.g, ((s1)object0).g) : false;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public Insets g(int v) {
        return this.v(v, false);
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public Insets h(int v) {
        return this.v(v, true);
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public final Insets l() {
        if(this.e == null) {
            this.e = Insets.of(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override  // androidx.core.view.y1
    @NonNull
    public WindowInsetsCompat n(int v, int v1, int v2, int v3) {
        Builder windowInsetsCompat$Builder0 = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.c));
        windowInsetsCompat$Builder0.setSystemWindowInsets(WindowInsetsCompat.a(this.l(), v, v1, v2, v3));
        windowInsetsCompat$Builder0.setStableInsets(WindowInsetsCompat.a(this.j(), v, v1, v2, v3));
        return windowInsetsCompat$Builder0.build();
    }

    @Override  // androidx.core.view.y1
    public boolean p() {
        return this.c.isRound();
    }

    @Override  // androidx.core.view.y1
    @SuppressLint({"WrongConstant"})
    public boolean q(int v) {
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0 && !this.z(v1)) {
                return false;
            }
        }
        return true;
    }

    @Override  // androidx.core.view.y1
    public void r(Insets[] arr_insets) {
        this.d = arr_insets;
    }

    @Override  // androidx.core.view.y1
    public void s(@NonNull Insets insets0) {
        this.g = insets0;
    }

    @Override  // androidx.core.view.y1
    public void t(@Nullable WindowInsetsCompat windowInsetsCompat0) {
        this.f = windowInsetsCompat0;
    }

    @SuppressLint({"WrongConstant"})
    @NonNull
    private Insets v(int v, boolean z) {
        Insets insets0 = Insets.NONE;
        for(int v1 = 1; v1 <= 0x100; v1 <<= 1) {
            if((v & v1) != 0) {
                insets0 = Insets.max(insets0, this.w(v1, z));
            }
        }
        return insets0;
    }

    @NonNull
    public Insets w(int v, boolean z) {
        Insets insets0 = null;
        switch(v) {
            case 1: {
                if(z) {
                    Insets insets1 = this.x();
                    Insets insets2 = this.l();
                    return Insets.of(0, Math.max(insets1.top, insets2.top), 0, 0);
                }
                return Insets.of(0, this.l().top, 0, 0);
            }
            case 2: {
                if(z) {
                    Insets insets3 = this.x();
                    Insets insets4 = this.j();
                    return Insets.of(Math.max(insets3.left, insets4.left), 0, Math.max(insets3.right, insets4.right), Math.max(insets3.bottom, insets4.bottom));
                }
                Insets insets5 = this.l();
                WindowInsetsCompat windowInsetsCompat0 = this.f;
                if(windowInsetsCompat0 != null) {
                    insets0 = windowInsetsCompat0.getStableInsets();
                }
                return Insets.of(insets5.left, 0, insets5.right, (insets0 == null ? insets5.bottom : Math.min(insets5.bottom, insets0.bottom)));
            }
            case 8: {
                Insets[] arr_insets = this.d;
                if(arr_insets != null) {
                    insets0 = arr_insets[Type.a(8)];
                }
                if(insets0 != null) {
                    return insets0;
                }
                Insets insets6 = this.l();
                Insets insets7 = this.x();
                int v1 = insets6.bottom;
                if(v1 > insets7.bottom) {
                    return Insets.of(0, 0, 0, v1);
                }
                if(this.g != null && !this.g.equals(Insets.NONE)) {
                    int v2 = this.g.bottom;
                    return v2 <= insets7.bottom ? Insets.NONE : Insets.of(0, 0, 0, v2);
                }
                return Insets.NONE;
            }
            case 16: {
                return this.k();
            }
            case 0x20: {
                return this.i();
            }
            case 0x40: {
                return this.m();
            }
            case 0x80: {
                WindowInsetsCompat windowInsetsCompat1 = this.f;
                DisplayCutoutCompat displayCutoutCompat0 = windowInsetsCompat1 == null ? this.f() : windowInsetsCompat1.getDisplayCutout();
                return displayCutoutCompat0 == null ? Insets.NONE : Insets.of(displayCutoutCompat0.getSafeInsetLeft(), displayCutoutCompat0.getSafeInsetTop(), displayCutoutCompat0.getSafeInsetRight(), displayCutoutCompat0.getSafeInsetBottom());
            }
            default: {
                return Insets.NONE;
            }
        }
    }

    private Insets x() {
        return this.f == null ? Insets.NONE : this.f.getStableInsets();
    }

    @Nullable
    private Insets y(@NonNull View view0) {
        if(Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if(!s1.h) {
            s1.A();
        }
        Method method0 = s1.i;
        if(method0 != null && s1.j != null && s1.k != null) {
            try {
                Object object0 = method0.invoke(view0, null);
                if(object0 == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Object object1 = s1.l.get(object0);
                Rect rect0 = (Rect)s1.k.get(object1);
                return rect0 == null ? null : Insets.of(rect0);
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
            }
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + reflectiveOperationException0.getMessage(), reflectiveOperationException0);
        }
        return null;
    }

    public boolean z(int v) {
        switch(v) {
            case 4: {
                return false;
            }
            case 1: 
            case 2: 
            case 8: 
            case 0x80: {
                return !this.w(v, false).equals(Insets.NONE);
            }
            default: {
                return true;
            }
        }
    }
}

