package androidx.recyclerview.widget;

import java.util.Arrays;

public final class b2 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final StaggeredGridLayoutManager g;

    public b2(StaggeredGridLayoutManager staggeredGridLayoutManager0) {
        this.g = staggeredGridLayoutManager0;
        this.a();
    }

    public final void a() {
        this.a = -1;
        this.b = 0x80000000;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] arr_v = this.f;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
    }
}

