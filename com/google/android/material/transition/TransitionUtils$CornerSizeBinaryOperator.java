package com.google.android.material.transition;

import androidx.annotation.NonNull;
import com.google.android.material.shape.CornerSize;

interface TransitionUtils.CornerSizeBinaryOperator {
    @NonNull
    CornerSize apply(@NonNull CornerSize arg1, @NonNull CornerSize arg2);
}

