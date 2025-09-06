package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
interface FitModeEvaluator {
    void applyMask(RectF arg1, float arg2, d arg3);

    d evaluate(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7);

    boolean shouldMaskStartBounds(d arg1);
}

