package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class QuantizerMap implements Quantizer {
    public LinkedHashMap a;

    public Map getColorToCount() {
        return this.a;
    }

    @Override  // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] arr_v, int v) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            Integer integer0 = (Integer)linkedHashMap0.get(v2);
            linkedHashMap0.put(v2, ((int)(integer0 == null ? 1 : ((int)integer0) + 1)));
        }
        this.a = linkedHashMap0;
        return new QuantizerResult(linkedHashMap0);
    }
}

