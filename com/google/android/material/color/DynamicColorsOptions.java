package com.google.android.material.color;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class DynamicColorsOptions {
    public static class Builder {
        public int a;
        public Precondition b;
        public OnAppliedCallback c;
        public Bitmap d;
        public Integer e;

        public Builder() {
            this.b = DynamicColorsOptions.e;
            this.c = DynamicColorsOptions.f;
        }

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@ColorInt int v) {
            this.d = null;
            this.e = v;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setContentBasedSource(@NonNull Bitmap bitmap0) {
            this.d = bitmap0;
            this.e = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOnAppliedCallback(@NonNull OnAppliedCallback dynamicColors$OnAppliedCallback0) {
            this.c = dynamicColors$OnAppliedCallback0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPrecondition(@NonNull Precondition dynamicColors$Precondition0) {
            this.b = dynamicColors$Precondition0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setThemeOverlay(@StyleRes int v) {
            this.a = v;
            return this;
        }
    }

    public final int a;
    public final Precondition b;
    public final OnAppliedCallback c;
    public final Integer d;
    public static final n e;
    public static final o f;

    static {
        DynamicColorsOptions.e = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        DynamicColorsOptions.f = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public DynamicColorsOptions(Builder dynamicColorsOptions$Builder0) {
        this.a = dynamicColorsOptions$Builder0.a;
        this.b = dynamicColorsOptions$Builder0.b;
        this.c = dynamicColorsOptions$Builder0.c;
        Integer integer0 = dynamicColorsOptions$Builder0.e;
        if(integer0 != null) {
            this.d = integer0;
            return;
        }
        Bitmap bitmap0 = dynamicColorsOptions$Builder0.d;
        if(bitmap0 != null) {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int[] arr_v = new int[v * v1];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            Integer integer1 = (Integer)Score.score(QuantizerCelebi.quantize(arr_v, 0x80)).get(0);
            integer1.getClass();
            this.d = integer1;
        }
    }

    @Nullable
    public Integer getContentBasedSeedColor() {
        return this.d;
    }

    @NonNull
    public OnAppliedCallback getOnAppliedCallback() {
        return this.c;
    }

    @NonNull
    public Precondition getPrecondition() {
        return this.b;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.a;
    }
}

