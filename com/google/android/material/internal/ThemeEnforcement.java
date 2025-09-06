package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialAttributes;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ThemeEnforcement {
    public static final int[] a;
    public static final int[] b;

    static {
        ThemeEnforcement.a = new int[]{attr.colorPrimary};
        ThemeEnforcement.b = new int[]{attr.colorPrimaryVariant};
    }

    public static void a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ThemeEnforcement, v, v1);
        boolean z = typedArray0.getBoolean(styleable.ThemeEnforcement_enforceMaterialTheme, false);
        typedArray0.recycle();
        if(z) {
            TypedValue typedValue0 = new TypedValue();
            if(!context0.getTheme().resolveAttribute(attr.isMaterialTheme, typedValue0, true) || typedValue0.type == 18 && typedValue0.data == 0) {
                ThemeEnforcement.checkMaterialTheme(context0);
            }
        }
        ThemeEnforcement.checkAppCompatTheme(context0);
    }

    public static void b(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1, int[] arr_v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ThemeEnforcement, v, v1);
        boolean z = false;
        if(!typedArray0.getBoolean(styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArray0.recycle();
            return;
        }
        if(arr_v1 != null && arr_v1.length != 0) {
            TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
            int v2 = 0;
            while(v2 < arr_v1.length) {
                if(typedArray1.getResourceId(arr_v1[v2], -1) == -1) {
                    typedArray1.recycle();
                    goto label_19;
                }
                ++v2;
            }
            typedArray1.recycle();
            z = true;
        }
        else if(typedArray0.getResourceId(styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
            z = true;
        }
    label_19:
        typedArray0.recycle();
        if(!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void c(Context context0, int[] arr_v, String s) {
        if(!ThemeEnforcement.d(context0, arr_v)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + s + " (or a descendant).");
        }
    }

    public static void checkAppCompatTheme(@NonNull Context context0) {
        ThemeEnforcement.c(context0, ThemeEnforcement.a, "Theme.AppCompat");
    }

    public static void checkMaterialTheme(@NonNull Context context0) {
        ThemeEnforcement.c(context0, ThemeEnforcement.b, "Theme.MaterialComponents");
    }

    public static boolean d(Context context0, int[] arr_v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
        for(int v = 0; v < arr_v.length; ++v) {
            if(!typedArray0.hasValue(v)) {
                typedArray0.recycle();
                return false;
            }
        }
        typedArray0.recycle();
        return true;
    }

    public static boolean isAppCompatTheme(@NonNull Context context0) {
        return ThemeEnforcement.d(context0, ThemeEnforcement.a);
    }

    public static boolean isMaterial3Theme(@NonNull Context context0) {
        return MaterialAttributes.resolveBoolean(context0, attr.isMaterial3Theme, false);
    }

    public static boolean isMaterialTheme(@NonNull Context context0) {
        return ThemeEnforcement.d(context0, ThemeEnforcement.b);
    }

    @NonNull
    public static TypedArray obtainStyledAttributes(@NonNull Context context0, AttributeSet attributeSet0, @NonNull @StyleableRes int[] arr_v, @AttrRes int v, @StyleRes int v1, @StyleableRes int[] arr_v1) {
        ThemeEnforcement.a(context0, attributeSet0, v, v1);
        ThemeEnforcement.b(context0, attributeSet0, arr_v, v, v1, arr_v1);
        return context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1);
    }

    public static TintTypedArray obtainTintedStyledAttributes(@NonNull Context context0, AttributeSet attributeSet0, @NonNull @StyleableRes int[] arr_v, @AttrRes int v, @StyleRes int v1, @StyleableRes int[] arr_v1) {
        ThemeEnforcement.a(context0, attributeSet0, v, v1);
        ThemeEnforcement.b(context0, attributeSet0, arr_v, v, v1, arr_v1);
        return TintTypedArray.obtainStyledAttributes(context0, attributeSet0, arr_v, v, v1);
    }
}

