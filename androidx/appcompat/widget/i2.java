package androidx.appcompat.widget;

public final class i2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int v, int v1) {
        this.c = v;
        this.d = v1;
        this.h = true;
        if(this.g) {
            if(v1 != 0x80000000) {
                this.a = v1;
            }
            if(v != 0x80000000) {
                this.b = v;
            }
        }
        else {
            if(v != 0x80000000) {
                this.a = v;
            }
            if(v1 != 0x80000000) {
                this.b = v1;
            }
        }
    }
}

