package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.LIBRARY})
public class ThemeUtils {
    public static final ThreadLocal a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;

    static {
        ThemeUtils.a = new ThreadLocal();
        ThemeUtils.b = new int[]{0xFEFEFF62};
        ThemeUtils.c = new int[]{0x101009C};
        ThemeUtils.d = new int[]{0x10100A7};
        ThemeUtils.e = new int[]{0x10100A0};
        ThemeUtils.f = new int[0];
        ThemeUtils.g = new int[1];
    }

    public static void checkAppCompatTheme(@NonNull View view0, @NonNull Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(styleable.AppCompatTheme);
        try {
            if(!typedArray0.hasValue(styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view0.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        }
        finally {
            typedArray0.recycle();
        }
    }

    @NonNull
    public static ColorStateList createDisabledStateList(int v, int v1) {
        int[][] arr2_v = new int[2][];
        int[] arr_v = new int[2];
        arr2_v[0] = ThemeUtils.b;
        arr_v[0] = v1;
        arr2_v[1] = ThemeUtils.f;
        arr_v[1] = v;
        return new ColorStateList(arr2_v, arr_v);
    }

    public static int getDisabledThemeAttrColor(@NonNull Context context0, int v) {
        ColorStateList colorStateList0 = ThemeUtils.getThemeAttrColorStateList(context0, v);
        if(colorStateList0 != null && colorStateList0.isStateful()) {
            int v1 = colorStateList0.getDefaultColor();
            return colorStateList0.getColorForState(ThemeUtils.b, v1);
        }
        ThreadLocal threadLocal0 = ThemeUtils.a;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        context0.getTheme().resolveAttribute(0x1010033, typedValue0, true);
        float f = typedValue0.getFloat();
        int v2 = ThemeUtils.getThemeAttrColor(context0, v);
        return ColorUtils.setAlphaComponent(v2, Math.round(((float)Color.alpha(v2)) * f));
    }

    public static int getThemeAttrColor(@NonNull Context context0, int v) {
        ThemeUtils.g[0] = v;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, null, ThemeUtils.g);
        try {
            return tintTypedArray0.getColor(0, 0);
        }
        finally {
            tintTypedArray0.recycle();
        }
    }

    @Nullable
    public static ColorStateList getThemeAttrColorStateList(@NonNull Context context0, int v) {
        ThemeUtils.g[0] = v;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(context0, null, ThemeUtils.g);
        try {
            return tintTypedArray0.getColorStateList(0);
        }
        finally {
            tintTypedArray0.recycle();
        }
    }
}

