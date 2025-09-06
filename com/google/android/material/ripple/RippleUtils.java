package com.google.android.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import c8.b;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RippleUtils {
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean USE_FRAMEWORK_RIPPLE = true;
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;

    static {
        RippleUtils.a = new int[]{0x10100A7};
        RippleUtils.b = new int[]{0x1010367, 0x101009C};
        RippleUtils.c = new int[]{0x101009C};
        RippleUtils.d = new int[]{0x1010367};
        RippleUtils.e = new int[]{0x10100A1, 0x10100A7};
        RippleUtils.f = new int[]{0x10100A1, 0x1010367, 0x101009C};
        RippleUtils.g = new int[]{0x10100A1, 0x101009C};
        RippleUtils.h = new int[]{0x10100A1, 0x1010367};
        RippleUtils.i = new int[]{0x10100A1};
        RippleUtils.j = new int[]{0x101009E, 0x10100A7};
    }

    public static int a(ColorStateList colorStateList0, int[] arr_v) {
        int v = colorStateList0 == null ? 0 : colorStateList0.getColorForState(arr_v, colorStateList0.getDefaultColor());
        return RippleUtils.USE_FRAMEWORK_RIPPLE ? ColorUtils.setAlphaComponent(v, Math.min(Color.alpha(v) * 2, 0xFF)) : v;
    }

    @NonNull
    public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList colorStateList0) {
        int[] arr_v = RippleUtils.a;
        int[] arr_v1 = RippleUtils.c;
        int[] arr_v2 = RippleUtils.e;
        int[] arr_v3 = RippleUtils.i;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            int[][] arr2_v = new int[3][];
            int[] arr_v4 = new int[3];
            arr2_v[0] = arr_v3;
            arr_v4[0] = RippleUtils.a(colorStateList0, arr_v2);
            arr2_v[1] = arr_v1;
            arr_v4[1] = RippleUtils.a(colorStateList0, arr_v1);
            arr2_v[2] = StateSet.NOTHING;
            arr_v4[2] = RippleUtils.a(colorStateList0, arr_v);
            return new ColorStateList(arr2_v, arr_v4);
        }
        int[][] arr2_v1 = new int[10][];
        int[] arr_v5 = new int[10];
        arr2_v1[0] = arr_v2;
        arr_v5[0] = RippleUtils.a(colorStateList0, arr_v2);
        arr2_v1[1] = RippleUtils.f;
        arr_v5[1] = RippleUtils.a(colorStateList0, RippleUtils.f);
        arr2_v1[2] = RippleUtils.g;
        arr_v5[2] = RippleUtils.a(colorStateList0, RippleUtils.g);
        arr2_v1[3] = RippleUtils.h;
        arr_v5[3] = RippleUtils.a(colorStateList0, RippleUtils.h);
        arr2_v1[4] = arr_v3;
        arr_v5[4] = 0;
        arr2_v1[5] = arr_v;
        arr_v5[5] = RippleUtils.a(colorStateList0, arr_v);
        arr2_v1[6] = RippleUtils.b;
        arr_v5[6] = RippleUtils.a(colorStateList0, RippleUtils.b);
        arr2_v1[7] = arr_v1;
        arr_v5[7] = RippleUtils.a(colorStateList0, arr_v1);
        arr2_v1[8] = RippleUtils.d;
        arr_v5[8] = RippleUtils.a(colorStateList0, RippleUtils.d);
        arr2_v1[9] = StateSet.NOTHING;
        arr_v5[9] = 0;
        return new ColorStateList(arr2_v1, arr_v5);
    }

    @NonNull
    @RequiresApi(21)
    public static Drawable createOvalRippleLollipop(@NonNull Context context0, @Px int v) {
        return b.b(context0, v);
    }

    @NonNull
    public static ColorStateList sanitizeRippleDrawableColor(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            if(Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList0.getDefaultColor()) == 0 && Color.alpha(colorStateList0.getColorForState(RippleUtils.j, 0)) != 0) {
                Log.w("RippleUtils", "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList0;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean shouldDrawRippleCompat(@NonNull int[] arr_v) {
        boolean z = false;
        boolean z1 = false;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == 0x101009E) {
                z = true;
            }
            else if(v1 == 0x101009C || v1 == 0x10100A7 || v1 == 0x1010367) {
                z1 = true;
            }
        }
        return z && z1;
    }
}

