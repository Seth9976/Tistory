package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R.id;
import androidx.core.graphics.Insets;

public abstract class g0 {
    @DoNotInline
    public static void a(@NonNull WindowInsets windowInsets0, @NonNull View view0) {
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener0 = (View.OnApplyWindowInsetsListener)view0.getTag(id.tag_window_insets_animation_callback);
        if(view$OnApplyWindowInsetsListener0 != null) {
            view$OnApplyWindowInsetsListener0.onApplyWindowInsets(view0, windowInsets0);
        }
    }

    @DoNotInline
    public static WindowInsetsCompat b(@NonNull View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull Rect rect0) {
        WindowInsets windowInsets0 = windowInsetsCompat0.toWindowInsets();
        if(windowInsets0 != null) {
            return WindowInsetsCompat.toWindowInsetsCompat(view0.computeSystemWindowInsets(windowInsets0, rect0), view0);
        }
        rect0.setEmpty();
        return windowInsetsCompat0;
    }

    @DoNotInline
    public static boolean c(@NonNull View view0, float f, float f1, boolean z) {
        return view0.dispatchNestedFling(f, f1, z);
    }

    @DoNotInline
    public static boolean d(@NonNull View view0, float f, float f1) {
        return view0.dispatchNestedPreFling(f, f1);
    }

    @DoNotInline
    public static boolean e(View view0, int v, int v1, int[] arr_v, int[] arr_v1) {
        return view0.dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @DoNotInline
    public static boolean f(View view0, int v, int v1, int v2, int v3, int[] arr_v) {
        return view0.dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @DoNotInline
    public static ColorStateList g(View view0) {
        return view0.getBackgroundTintList();
    }

    @DoNotInline
    public static PorterDuff.Mode h(View view0) {
        return view0.getBackgroundTintMode();
    }

    @DoNotInline
    public static float i(View view0) {
        return view0.getElevation();
    }

    @DoNotInline
    @Nullable
    public static WindowInsetsCompat j(@NonNull View view0) {
        if(n1.d && view0.isAttachedToWindow()) {
            View view1 = view0.getRootView();
            try {
                Object object0 = n1.a.get(view1);
                if(object0 != null) {
                    Rect rect0 = (Rect)n1.b.get(object0);
                    Rect rect1 = (Rect)n1.c.get(object0);
                    if(rect0 != null && rect1 != null) {
                        WindowInsetsCompat windowInsetsCompat0 = new Builder().setStableInsets(Insets.of(rect0)).setSystemWindowInsets(Insets.of(rect1)).build();
                        windowInsetsCompat0.a.t(windowInsetsCompat0);
                        View view2 = view0.getRootView();
                        windowInsetsCompat0.a.d(view2);
                        return windowInsetsCompat0;
                    }
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + illegalAccessException0.getMessage(), illegalAccessException0);
            }
        }
        return null;
    }

    @DoNotInline
    public static String k(View view0) {
        return view0.getTransitionName();
    }

    @DoNotInline
    public static float l(View view0) {
        return view0.getTranslationZ();
    }

    @DoNotInline
    public static float m(@NonNull View view0) {
        return view0.getZ();
    }

    @DoNotInline
    public static boolean n(View view0) {
        return view0.hasNestedScrollingParent();
    }

    @DoNotInline
    public static boolean o(View view0) {
        return view0.isImportantForAccessibility();
    }

    @DoNotInline
    public static boolean p(View view0) {
        return view0.isNestedScrollingEnabled();
    }

    @DoNotInline
    public static void q(View view0, ColorStateList colorStateList0) {
        view0.setBackgroundTintList(colorStateList0);
    }

    @DoNotInline
    public static void r(View view0, PorterDuff.Mode porterDuff$Mode0) {
        view0.setBackgroundTintMode(porterDuff$Mode0);
    }

    @DoNotInline
    public static void s(View view0, float f) {
        view0.setElevation(f);
    }

    @DoNotInline
    public static void t(View view0, boolean z) {
        view0.setNestedScrollingEnabled(z);
    }

    @DoNotInline
    public static void u(@NonNull View view0, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener0) {
        if(Build.VERSION.SDK_INT < 30) {
            view0.setTag(id.tag_on_apply_window_listener, onApplyWindowInsetsListener0);
        }
        if(onApplyWindowInsetsListener0 == null) {
            view0.setOnApplyWindowInsetsListener(((View.OnApplyWindowInsetsListener)view0.getTag(id.tag_window_insets_animation_callback)));
            return;
        }
        view0.setOnApplyWindowInsetsListener(new f0(view0, onApplyWindowInsetsListener0));
    }

    @DoNotInline
    public static void v(View view0, String s) {
        view0.setTransitionName(s);
    }

    @DoNotInline
    public static void w(View view0, float f) {
        view0.setTranslationZ(f);
    }

    @DoNotInline
    public static void x(@NonNull View view0, float f) {
        view0.setZ(f);
    }

    @DoNotInline
    public static boolean y(View view0, int v) {
        return view0.startNestedScroll(v);
    }

    @DoNotInline
    public static void z(View view0) {
        view0.stopNestedScroll();
    }
}

