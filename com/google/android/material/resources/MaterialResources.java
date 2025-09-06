package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MaterialResources {
    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.getColorStateList(context0, v1);
                return colorStateList0 == null ? typedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return typedArray0.getColorStateList(v);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context0, @NonNull TintTypedArray tintTypedArray0, @StyleableRes int v) {
        if(tintTypedArray0.hasValue(v)) {
            int v1 = tintTypedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.getColorStateList(context0, v1);
                return colorStateList0 == null ? tintTypedArray0.getColorStateList(v) : colorStateList0;
            }
        }
        return tintTypedArray0.getColorStateList(v);
    }

    public static int getDimensionPixelSize(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v, int v1) {
        TypedValue typedValue0 = new TypedValue();
        if(typedArray0.getValue(v, typedValue0) && typedValue0.type == 2) {
            TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(new int[]{typedValue0.data});
            int v2 = typedArray1.getDimensionPixelSize(0, v1);
            typedArray1.recycle();
            return v2;
        }
        return typedArray0.getDimensionPixelSize(v, v1);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            if(v1 != 0) {
                Drawable drawable0 = AppCompatResources.getDrawable(context0, v1);
                return drawable0 == null ? typedArray0.getDrawable(v) : drawable0;
            }
        }
        return typedArray0.getDrawable(v);
    }

    public static float getFontScale(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale;
    }

    @Nullable
    public static TextAppearance getTextAppearance(@NonNull Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : new TextAppearance(context0, v1);
        }
        return null;
    }

    public static int getUnscaledTextSize(@NonNull Context context0, @StyleRes int v, int v1) {
        if(v == 0) {
            return v1;
        }
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.TextAppearance);
        TypedValue typedValue0 = new TypedValue();
        boolean z = typedArray0.getValue(styleable.TextAppearance_android_textSize, typedValue0);
        typedArray0.recycle();
        if(!z) {
            return v1;
        }
        return typedValue0.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue0.data) * context0.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
    }

    public static boolean isFontScaleAtLeast1_3(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean isFontScaleAtLeast2_0(@NonNull Context context0) {
        return context0.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

