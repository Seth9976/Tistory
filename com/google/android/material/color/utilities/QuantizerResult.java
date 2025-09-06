package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class QuantizerResult {
    public final Map colorToCount;

    public QuantizerResult(LinkedHashMap linkedHashMap0) {
        this.colorToCount = linkedHashMap0;
    }
}

