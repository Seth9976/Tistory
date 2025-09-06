package com.google.android.material.transition;

import android.graphics.RectF;

interface FitModeEvaluator {
    void applyMask(RectF arg1, float arg2, g arg3);

    g evaluate(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7);

    boolean shouldMaskStartBounds(g arg1);
}

