package androidx.recyclerview.widget;

public final class i {
    public long a;
    public i b;

    public i() {
        this.a = 0L;
    }

    public final void a(int v) {
        if(v >= 0x40) {
            i i0 = this.b;
            if(i0 != null) {
                i0.a(v - 0x40);
            }
        }
        else {
            this.a &= ~(1L << v);
        }
    }

    public final int b(int v) {
        i i0 = this.b;
        if(i0 == null) {
            return v < 0x40 ? Long.bitCount(this.a & (1L << v) - 1L) : Long.bitCount(this.a);
        }
        if(v < 0x40) {
            return Long.bitCount(this.a & (1L << v) - 1L);
        }
        int v1 = i0.b(v - 0x40);
        return Long.bitCount(this.a) + v1;
    }

    public final void c() {
        if(this.b == null) {
            this.b = new i();
        }
    }

    public final boolean d(int v) {
        if(v >= 0x40) {
            this.c();
            return this.b.d(v - 0x40);
        }
        return (this.a & 1L << v) != 0L;
    }

    public final void e(int v, boolean z) {
        if(v >= 0x40) {
            this.c();
            this.b.e(v - 0x40, z);
            return;
        }
        boolean z1 = Long.compare(0x8000000000000000L & this.a, 0L) != 0;
        long v1 = (1L << v) - 1L;
        this.a = (this.a & ~v1) << 1 | this.a & v1;
        if(z) {
            this.h(v);
        }
        else {
            this.a(v);
        }
        if(z1 || this.b != null) {
            this.c();
            this.b.e(0, z1);
        }
    }

    public final boolean f(int v) {
        if(v >= 0x40) {
            this.c();
            return this.b.f(v - 0x40);
        }
        boolean z = Long.compare(this.a & 1L << v, 0L) != 0;
        long v1 = this.a & ~(1L << v);
        long v2 = (1L << v) - 1L;
        this.a = v1 & v2 | Long.rotateRight(~v2 & v1, 1);
        i i0 = this.b;
        if(i0 != null) {
            if(i0.d(0)) {
                this.h(0x3F);
            }
            this.b.f(0);
        }
        return z;
    }

    public final void g() {
        this.a = 0L;
        i i0 = this.b;
        if(i0 != null) {
            i0.g();
        }
    }

    public final void h(int v) {
        if(v >= 0x40) {
            this.c();
            this.b.h(v - 0x40);
            return;
        }
        this.a |= 1L << v;
    }

    // 去混淆评级： 中等(50)
    @Override
    public final String toString() [...] // 潜在的解密器
}

