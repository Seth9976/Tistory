package androidx.emoji2.text;

import android.util.SparseArray;
import java.util.Arrays;

public final class s {
    public int a;
    public final a0 b;
    public a0 c;
    public a0 d;
    public int e;
    public int f;
    public final boolean g;
    public final int[] h;

    public s(a0 a00, boolean z, int[] arr_v) {
        this.a = 1;
        this.b = a00;
        this.c = a00;
        this.g = z;
        this.h = arr_v;
    }

    public final int a(int v) {
        SparseArray sparseArray0 = this.c.a;
        a0 a00 = sparseArray0 == null ? null : ((a0)sparseArray0.get(v));
        int v1 = 1;
        if(this.a == 2) {
            if(a00 == null) {
                switch(v) {
                    case 0xFE0E: {
                        this.b();
                        break;
                    }
                    case 0xFE0F: {
                        v1 = 2;
                        break;
                    }
                    default: {
                        a0 a01 = this.c;
                        if(a01.b == null) {
                            this.b();
                        }
                        else if(this.f != 1) {
                            this.d = a01;
                            this.b();
                            v1 = 3;
                        }
                        else if(this.c()) {
                            this.d = this.c;
                            this.b();
                            v1 = 3;
                        }
                        else {
                            this.b();
                        }
                    }
                }
            }
            else {
                this.c = a00;
                ++this.f;
                v1 = 2;
            }
        }
        else if(a00 == null) {
            this.b();
        }
        else {
            this.a = 2;
            this.c = a00;
            this.f = 1;
            v1 = 2;
        }
        this.e = v;
        return v1;
    }

    public final void b() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean c() {
        if(this.c.b.isDefaultEmoji()) {
            return true;
        }
        if(this.e == 0xFE0F) {
            return true;
        }
        if(this.g) {
            return this.h == null ? true : Arrays.binarySearch(this.h, this.c.b.getCodepointAt(0)) < 0;
        }
        return false;
    }
}

