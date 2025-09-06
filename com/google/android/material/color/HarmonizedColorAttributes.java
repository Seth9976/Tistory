package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;

public final class HarmonizedColorAttributes {
    public final int[] a;
    public final int b;
    public static final int[] c;

    static {
        HarmonizedColorAttributes.c = new int[]{attr.colorError, attr.colorOnError, attr.colorErrorContainer, attr.colorOnErrorContainer};
    }

    public HarmonizedColorAttributes(int v, int[] arr_v) {
        if(v != 0 && arr_v.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.a = arr_v;
        this.b = v;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] arr_v) {
        return new HarmonizedColorAttributes(0, arr_v);
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] arr_v, @StyleRes int v) {
        return new HarmonizedColorAttributes(v, arr_v);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return HarmonizedColorAttributes.create(HarmonizedColorAttributes.c, style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.a;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.b;
    }
}

