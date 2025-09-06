package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class m {
    public final l a;
    public final List b;
    public final List c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public m(l l0, ArrayList arrayList0, ArrayList arrayList1) {
        this.a = l0;
        this.b = Collections.unmodifiableList(arrayList0);
        this.c = Collections.unmodifiableList(arrayList1);
        k k0 = ((l)arrayList0.get(arrayList0.size() - 1)).b();
        k k1 = l0.b();
        float f = k0.a - k1.a;
        this.f = f;
        k k2 = l0.d();
        k k3 = ((l)arrayList1.get(arrayList1.size() - 1)).d();
        float f1 = k2.a - k3.a;
        this.g = f1;
        this.d = m.b(f, arrayList0, true);
        this.e = m.b(f1, arrayList1, false);
    }

    public final l a(float f, boolean z, float f1, float f2) {
        float[] arr_f;
        List list0;
        float f5;
        float f3 = this.f + f1;
        float f4 = f2 - this.g;
        if(Float.compare(f, f3) < 0) {
            f5 = AnimationUtils.lerp(1.0f, 0.0f, f1, f3, f);
            list0 = this.b;
            arr_f = this.d;
        }
        else if(f > f4) {
            f5 = AnimationUtils.lerp(0.0f, 1.0f, f4, f2, f);
            list0 = this.c;
            arr_f = this.e;
        }
        else {
            return this.a;
        }
        if(z) {
            float[] arr_f1 = m.c(list0, f5, arr_f);
            return arr_f1[0] > 0.5f ? ((l)list0.get(((int)arr_f1[2]))) : ((l)list0.get(((int)arr_f1[1])));
        }
        float[] arr_f2 = m.c(list0, f5, arr_f);
        l l0 = (l)list0.get(((int)arr_f2[1]));
        l l1 = (l)list0.get(((int)arr_f2[2]));
        float f6 = arr_f2[0];
        if(l0.a != l1.a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list1 = l0.b;
        List list2 = l1.b;
        if(list1.size() != list2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < list1.size(); ++v) {
            k k0 = (k)list1.get(v);
            k k1 = (k)list2.get(v);
            arrayList0.add(new k(AnimationUtils.lerp(k0.a, k1.a, f6), AnimationUtils.lerp(k0.b, k1.b, f6), AnimationUtils.lerp(k0.c, k1.c, f6), AnimationUtils.lerp(k0.d, k1.d, f6), 0.0f, false));
        }
        return new l(l0.a, arrayList0, AnimationUtils.lerp(l0.c, l1.c, f6), AnimationUtils.lerp(l0.d, l1.d, f6));
    }

    public static float[] b(float f, ArrayList arrayList0, boolean z) {
        float f1;
        int v = arrayList0.size();
        float[] arr_f = new float[v];
        for(int v1 = 1; v1 < v; ++v1) {
            l l0 = (l)arrayList0.get(v1 - 1);
            l l1 = (l)arrayList0.get(v1);
            if(z) {
                k k0 = l1.b();
                k k1 = l0.b();
                f1 = k0.a - k1.a;
            }
            else {
                k k2 = l0.d();
                k k3 = l1.d();
                f1 = k2.a - k3.a;
            }
            arr_f[v1] = v1 == v - 1 ? 1.0f : arr_f[v1 - 1] + f1 / f;
        }
        return arr_f;
    }

    public static float[] c(List list0, float f, float[] arr_f) {
        int v = list0.size();
        float f1 = arr_f[0];
        int v1 = 1;
        while(v1 < v) {
            float f2 = arr_f[v1];
            if(f <= f2) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f1, f2, f), ((float)(v1 - 1)), ((float)v1)};
            }
            ++v1;
            f1 = f2;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static l d(l l0, int v, int v1, float f, int v2, int v3, float f1) {
        ArrayList arrayList0 = new ArrayList(l0.b);
        arrayList0.add(v1, ((k)arrayList0.remove(v)));
        j j0 = new j(l0.a, f1);
        for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
            k k0 = (k)arrayList0.get(v4);
            j0.b(k0.d / 2.0f + f, v4 >= v2 && v4 <= v3, k0.e, k0.c, k0.d, k0.f);
            f += k0.d;
        }
        return j0.d();
    }
}

