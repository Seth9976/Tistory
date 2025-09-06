package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @FloatRange(from = 0.0, to = 1.0)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF arg1);

    @Deprecated
    void setMaskXPercentage(@FloatRange(from = 0.0, to = 1.0) float arg1);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener arg1);
}

