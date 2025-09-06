package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

public class KeyCache {
    public final HashMap a;

    public KeyCache() {
        this.a = new HashMap();
    }

    public float getFloatValue(Object object0, String s, int v) {
        HashMap hashMap0 = this.a;
        if(!hashMap0.containsKey(object0)) {
            return NaNf;
        }
        HashMap hashMap1 = (HashMap)hashMap0.get(object0);
        if(hashMap1 != null && hashMap1.containsKey(s)) {
            float[] arr_f = (float[])hashMap1.get(s);
            if(arr_f == null) {
                return NaNf;
            }
            return arr_f.length <= v ? NaNf : arr_f[v];
        }
        return NaNf;
    }

    public void setFloatValue(Object object0, String s, int v, float f) {
        HashMap hashMap0 = this.a;
        if(!hashMap0.containsKey(object0)) {
            HashMap hashMap1 = new HashMap();
            float[] arr_f = new float[v + 1];
            arr_f[v] = f;
            hashMap1.put(s, arr_f);
            hashMap0.put(object0, hashMap1);
            return;
        }
        HashMap hashMap2 = (HashMap)hashMap0.get(object0);
        if(hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        if(!hashMap2.containsKey(s)) {
            float[] arr_f1 = new float[v + 1];
            arr_f1[v] = f;
            hashMap2.put(s, arr_f1);
            hashMap0.put(object0, hashMap2);
            return;
        }
        float[] arr_f2 = (float[])hashMap2.get(s);
        if(arr_f2 == null) {
            arr_f2 = new float[0];
        }
        if(arr_f2.length <= v) {
            arr_f2 = Arrays.copyOf(arr_f2, v + 1);
        }
        arr_f2[v] = f;
        hashMap2.put(s, arr_f2);
    }
}

