package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    public static int a(int v, int v1) {
        Hct hct0 = Hct.fromInt(v);
        hct0.setTone(((double)v1));
        return hct0.toInt();
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int v, @IntRange(from = 0L, to = 0xFFL) int v1) {
        return ColorUtils.setAlphaComponent(v, Color.alpha(v) * v1 / 0xFF);
    }

    @ColorInt
    public static int getColor(@NonNull Context context0, @AttrRes int v, @ColorInt int v1) {
        Integer integer0 = MaterialColors.getColorOrNull(context0, v);
        return integer0 == null ? v1 : ((int)integer0);
    }

    @ColorInt
    public static int getColor(Context context0, @AttrRes int v, String s) {
        TypedValue typedValue0 = MaterialAttributes.resolveTypedValueOrThrow(context0, v, s);
        return typedValue0.resourceId == 0 ? typedValue0.data : ContextCompat.getColor(context0, typedValue0.resourceId);
    }

    @ColorInt
    public static int getColor(@NonNull View view0, @AttrRes int v) {
        Context context0 = view0.getContext();
        TypedValue typedValue0 = MaterialAttributes.resolveTypedValueOrThrow(view0, v);
        return typedValue0.resourceId == 0 ? typedValue0.data : ContextCompat.getColor(context0, typedValue0.resourceId);
    }

    @ColorInt
    public static int getColor(@NonNull View view0, @AttrRes int v, @ColorInt int v1) {
        return MaterialColors.getColor(view0.getContext(), v, v1);
    }

    @ColorInt
    @Nullable
    public static Integer getColorOrNull(@NonNull Context context0, @AttrRes int v) {
        TypedValue typedValue0 = MaterialAttributes.resolve(context0, v);
        if(typedValue0 != null) {
            return typedValue0.resourceId == 0 ? typedValue0.data : ContextCompat.getColor(context0, typedValue0.resourceId);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int v, boolean z) {
        return z ? new ColorRoles(MaterialColors.a(v, 40), MaterialColors.a(v, 100), MaterialColors.a(v, 90), MaterialColors.a(v, 10)) : new ColorRoles(MaterialColors.a(v, 80), MaterialColors.a(v, 20), MaterialColors.a(v, 30), MaterialColors.a(v, 90));
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context0, @ColorInt int v) {
        return MaterialColors.getColorRoles(v, MaterialAttributes.resolveBoolean(context0, attr.isLightTheme, true));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context0, @AttrRes int v, @NonNull ColorStateList colorStateList0) {
        ColorStateList colorStateList1;
        TypedValue typedValue0 = MaterialAttributes.resolve(context0, v);
        if(typedValue0 != null) {
            int v1 = typedValue0.resourceId;
            if(v1 != 0) {
                colorStateList1 = ContextCompat.getColorStateList(context0, v1);
                return colorStateList1 == null ? colorStateList0 : colorStateList1;
            }
            colorStateList1 = ColorStateList.valueOf(typedValue0.data);
            return colorStateList1 == null ? colorStateList0 : colorStateList1;
        }
        return colorStateList0;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context0, @AttrRes int v) {
        TypedValue typedValue0 = MaterialAttributes.resolve(context0, v);
        if(typedValue0 == null) {
            return null;
        }
        int v1 = typedValue0.resourceId;
        if(v1 != 0) {
            return ContextCompat.getColorStateList(context0, v1);
        }
        return typedValue0.data == 0 ? null : ColorStateList.valueOf(typedValue0.data);
    }

    @ColorInt
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerFromSeed(@NonNull Context context0, @ColorInt int v) {
        Hct hct0 = Hct.fromInt(MaterialColors.a(v, (MaterialAttributes.resolveBoolean(context0, attr.isLightTheme, true) ? 94 : 12)));
        hct0.setChroma(6.0);
        return hct0.toInt();
    }

    @ColorInt
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context0, @ColorInt int v) {
        Hct hct0 = Hct.fromInt(MaterialColors.a(v, (MaterialAttributes.resolveBoolean(context0, attr.isLightTheme, true) ? 92 : 17)));
        hct0.setChroma(6.0);
        return hct0.toInt();
    }

    @ColorInt
    public static int harmonize(@ColorInt int v, @ColorInt int v1) {
        return Blend.harmonize(v, v1);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context0, @ColorInt int v) {
        return MaterialColors.harmonize(v, MaterialColors.getColor(context0, attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int v) {
        return v != 0 && ColorUtils.calculateLuminance(v) > 0.5;
    }

    @ColorInt
    public static int layer(@ColorInt int v, @ColorInt int v1) {
        return ColorUtils.compositeColors(v1, v);
    }

    @ColorInt
    public static int layer(@ColorInt int v, @ColorInt int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        return MaterialColors.layer(v, ColorUtils.setAlphaComponent(v1, Math.round(((float)Color.alpha(v1)) * f)));
    }

    @ColorInt
    public static int layer(@NonNull View view0, @AttrRes int v, @AttrRes int v1) {
        return MaterialColors.layer(view0, v, v1, 1.0f);
    }

    @ColorInt
    public static int layer(@NonNull View view0, @AttrRes int v, @AttrRes int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        return MaterialColors.layer(MaterialColors.getColor(view0, v), MaterialColors.getColor(view0, v1), f);
    }
}

