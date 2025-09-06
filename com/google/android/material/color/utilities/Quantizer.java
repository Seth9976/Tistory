package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP})
interface Quantizer {
    QuantizerResult quantize(int[] arg1, int arg2);
}

