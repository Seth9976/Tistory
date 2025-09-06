package androidx.constraintlayout.core.motion.utils;

import android.util.SparseArray;
import g.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    public int a;
    public final Object b;
    public Object c;

    public g() {
        int[] arr_v = new int[101];
        this.b = arr_v;
        float[][] arr2_f = new float[101][];
        this.c = arr2_f;
        Arrays.fill(arr_v, 999);
        Arrays.fill(arr2_f, null);
        this.a = 0;
    }

    public g(int v) {
        this.b = new SparseArray(10);
        this.a = v;
    }

    public g(b b0) {
        Intrinsics.checkNotNullParameter(b0, "store");
        super();
        this.b = b0;
        this.a = -1;
        this.c = "";
    }

    public void a(int v, float[] arr_f) {
        int v3;
        float[][] arr2_f = (float[][])this.c;
        float[] arr_f1 = arr2_f[v];
        int[] arr_v = (int[])this.b;
        if(arr_f1 != null) {
            arr2_f[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.a;
                if(v1 >= v3) {
                    break;
                }
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.a = v3 - 1;
        }
        arr2_f[v] = arr_f;
        int v4 = this.a;
        this.a = v4 + 1;
        arr_v[v4] = v;
        Arrays.sort(arr_v);
    }

    public Object b() {
        Object object0 = ((b)this.b).j(((String)this.c));
        if(object0 == null) {
            throw new IllegalStateException(("Unexpected null value for non-nullable argument " + ((String)this.c)).toString());
        }
        return object0;
    }
}

