package androidx.recyclerview.widget;

public final class g2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final boolean a() {
        int v10;
        int v7;
        int v4;
        int v = this.a;
        int v1 = 2;
        if((v & 7) != 0) {
            int v2 = this.d;
            int v3 = this.b;
            if(v2 > v3) {
                v4 = 1;
            }
            else {
                v4 = v2 == v3 ? 2 : 4;
            }
            if((v4 & v) == 0) {
                return false;
            }
        }
        if((v & 0x70) != 0) {
            int v5 = this.d;
            int v6 = this.c;
            if(v5 > v6) {
                v7 = 1;
            }
            else {
                v7 = v5 == v6 ? 2 : 4;
            }
            if((v7 << 4 & v) == 0) {
                return false;
            }
        }
        if((v & 0x700) != 0) {
            int v8 = this.e;
            int v9 = this.b;
            if(v8 > v9) {
                v10 = 1;
            }
            else {
                v10 = v8 == v9 ? 2 : 4;
            }
            if((v10 << 8 & v) == 0) {
                return false;
            }
        }
        if((v & 0x7000) != 0) {
            int v11 = this.e;
            int v12 = this.c;
            if(v11 > v12) {
                return (v & 0x1000) != 0;
            }
            if(v11 != v12) {
                v1 = 4;
            }
            return (v & v1 << 12) != 0;
        }
        return true;
    }
}

