package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class ColorContrastOptions {
    public static class Builder {
        public int a;
        public int b;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@StyleRes int v) {
            this.b = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@StyleRes int v) {
            this.a = v;
            return this;
        }
    }

    public final int a;
    public final int b;

    public ColorContrastOptions(Builder colorContrastOptions$Builder0) {
        this.a = colorContrastOptions$Builder0.a;
        this.b = colorContrastOptions$Builder0.b;
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.b;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.a;
    }
}

