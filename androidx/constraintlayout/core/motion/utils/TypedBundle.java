package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class TypedBundle {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public TypedBundle() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = 0;
        this.d = new int[10];
        this.e = new float[10];
        this.f = 0;
        this.g = new int[5];
        this.h = new String[5];
        this.i = 0;
        this.j = new int[4];
        this.k = new boolean[4];
        this.l = 0;
    }

    public void add(int v, float f) {
        int[] arr_v = this.d;
        if(this.f >= arr_v.length) {
            this.d = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.e = Arrays.copyOf(this.e, this.e.length * 2);
        }
        int v1 = this.f;
        this.d[v1] = v;
        this.f = v1 + 1;
        this.e[v1] = f;
    }

    public void add(int v, int v1) {
        int[] arr_v = this.a;
        if(this.c >= arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.b = Arrays.copyOf(this.b, this.b.length * 2);
        }
        int v2 = this.c;
        this.a[v2] = v;
        this.c = v2 + 1;
        this.b[v2] = v1;
    }

    public void add(int v, String s) {
        int[] arr_v = this.g;
        if(this.i >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.h = (String[])Arrays.copyOf(this.h, this.h.length * 2);
        }
        int v1 = this.i;
        this.g[v1] = v;
        this.i = v1 + 1;
        this.h[v1] = s;
    }

    public void add(int v, boolean z) {
        int[] arr_v = this.j;
        if(this.l >= arr_v.length) {
            this.j = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.k = Arrays.copyOf(this.k, this.k.length * 2);
        }
        int v1 = this.l;
        this.j[v1] = v;
        this.l = v1 + 1;
        this.k[v1] = z;
    }

    public void addIfNotNull(int v, String s) {
        if(s != null) {
            this.add(v, s);
        }
    }

    public void applyDelta(TypedBundle typedBundle0) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            typedBundle0.add(this.a[v1], this.b[v1]);
        }
        for(int v2 = 0; v2 < this.f; ++v2) {
            typedBundle0.add(this.d[v2], this.e[v2]);
        }
        for(int v3 = 0; v3 < this.i; ++v3) {
            typedBundle0.add(this.g[v3], this.h[v3]);
        }
        for(int v = 0; v < this.l; ++v) {
            typedBundle0.add(this.j[v], this.k[v]);
        }
    }

    public void applyDelta(TypedValues typedValues0) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            typedValues0.setValue(this.a[v1], this.b[v1]);
        }
        for(int v2 = 0; v2 < this.f; ++v2) {
            typedValues0.setValue(this.d[v2], this.e[v2]);
        }
        for(int v3 = 0; v3 < this.i; ++v3) {
            typedValues0.setValue(this.g[v3], this.h[v3]);
        }
        for(int v = 0; v < this.l; ++v) {
            typedValues0.setValue(this.j[v], this.k[v]);
        }
    }

    public void clear() {
        this.l = 0;
        this.i = 0;
        this.f = 0;
        this.c = 0;
    }

    public int getInteger(int v) {
        for(int v1 = 0; v1 < this.c; ++v1) {
            if(this.a[v1] == v) {
                return this.b[v1];
            }
        }
        return -1;
    }
}

