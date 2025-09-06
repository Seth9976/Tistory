package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R.attr;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class HarmonizedColorsOptions {
    public static class Builder {
        public int[] a;
        public HarmonizedColorAttributes b;
        public int c;

        public Builder() {
            this.a = new int[0];
            this.c = attr.colorPrimary;
        }

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int v) {
            this.c = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes0) {
            this.b = harmonizedColorAttributes0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setColorResourceIds(@ColorRes @NonNull int[] arr_v) {
            this.a = arr_v;
            return this;
        }
    }

    public final int[] a;
    public final HarmonizedColorAttributes b;
    public final int c;

    public HarmonizedColorsOptions(Builder harmonizedColorsOptions$Builder0) {
        this.a = harmonizedColorsOptions$Builder0.a;
        this.b = harmonizedColorsOptions$Builder0.b;
        this.c = harmonizedColorsOptions$Builder0.c;
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.b;
    }

    @ColorRes
    @NonNull
    public int[] getColorResourceIds() {
        return this.a;
    }
}

