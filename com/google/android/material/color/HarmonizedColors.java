package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.google.android.material.R.style;
import java.util.HashMap;

public class HarmonizedColors {
    public static HashMap a(Context context0, HarmonizedColorsOptions harmonizedColorsOptions0) {
        HashMap hashMap0 = new HashMap();
        int v = MaterialColors.getColor(context0, harmonizedColorsOptions0.getColorAttributeToHarmonizeWith(), "HarmonizedColors");
        int[] arr_v = harmonizedColorsOptions0.getColorResourceIds();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            hashMap0.put(v2, MaterialColors.harmonize(ContextCompat.getColor(context0, v2), v));
        }
        HarmonizedColorAttributes harmonizedColorAttributes0 = harmonizedColorsOptions0.getColorAttributes();
        if(harmonizedColorAttributes0 != null) {
            int[] arr_v1 = harmonizedColorAttributes0.getAttributes();
            if(arr_v1.length > 0) {
                int v3 = harmonizedColorAttributes0.getThemeOverlay();
                TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v1);
                TypedArray typedArray1 = v3 == 0 ? null : new ContextThemeWrapper(context0, v3).obtainStyledAttributes(arr_v1);
                for(int v4 = 0; v4 < typedArray0.getIndexCount(); ++v4) {
                    int v5 = (typedArray1 == null ? typedArray0 : typedArray1).getResourceId(v4, 0);
                    if(v5 != 0 && typedArray0.hasValue(v4)) {
                        int v6 = typedArray0.getType(v4);
                        if(28 <= v6 && v6 <= 0x1F) {
                            hashMap0.put(v5, MaterialColors.harmonize(typedArray0.getColor(v4, 0), v));
                        }
                    }
                }
                typedArray0.recycle();
                if(typedArray1 != null) {
                    typedArray1.recycle();
                }
            }
        }
        return hashMap0;
    }

    @NonNull
    public static void applyToContextIfAvailable(@NonNull Context context0, @NonNull HarmonizedColorsOptions harmonizedColorsOptions0) {
        HashMap hashMap0 = HarmonizedColors.a(context0, harmonizedColorsOptions0);
        int v = harmonizedColorsOptions0.b == null || harmonizedColorsOptions0.b.getThemeOverlay() == 0 ? 0 : harmonizedColorsOptions0.b.getThemeOverlay();
        if(j.b(context0, hashMap0) && v != 0) {
            ThemeUtils.applyThemeOverlay(context0, v);
        }
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean isHarmonizedColorAvailable() [...] // 潜在的解密器

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context0, @NonNull HarmonizedColorsOptions harmonizedColorsOptions0) {
        HashMap hashMap0 = HarmonizedColors.a(context0, harmonizedColorsOptions0);
        int v = style.ThemeOverlay_Material3_HarmonizedColors_Empty;
        HarmonizedColorAttributes harmonizedColorAttributes0 = harmonizedColorsOptions0.b;
        if(harmonizedColorAttributes0 != null && harmonizedColorAttributes0.getThemeOverlay() != 0) {
            v = harmonizedColorAttributes0.getThemeOverlay();
        }
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
        contextThemeWrapper0.applyOverrideConfiguration(new Configuration());
        return j.b(contextThemeWrapper0, hashMap0) ? contextThemeWrapper0 : context0;
    }
}

